package com.coalvalue.employee.repository.specification;

import com.coalvalue.employee.domain.dto.ButtonDto;
import com.coalvalue.employee.domain.entity.Button;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;

/**
 * Created by Peter Xu on 02/05/2015.
 */
public class ButtonSpec {

    private ButtonDto buttonDto;

    public ButtonSpec(ButtonDto buttonDto) {
        this.buttonDto = buttonDto;
    }

    public Specification<Button> queryBtnByMenuSpec() {
        Specification<Button> specification = (root, query, cb) -> {
            Predicate predicate;
            if (buttonDto.getMenuId() == null) {
                predicate = cb.isNull(root.<Integer>get("menuId"));
            } else {
                predicate = cb.equal(root.<Integer>get("menuId"), buttonDto.getMenuId());
            }
            return predicate;
        };
        return specification;
    }
}
