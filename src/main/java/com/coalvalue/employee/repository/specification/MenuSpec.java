package com.coalvalue.employee.repository.specification;

import com.coalvalue.employee.domain.dto.MenuDto;
import com.coalvalue.employee.domain.entity.Menu;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;

/**
 * Created by Peter Xu on 02/05/2015.
 */
public class MenuSpec {

    private MenuDto menuDto;

    public MenuSpec(MenuDto menuDto) {
        this.menuDto = menuDto;
    }

    public Specification<Menu> queryMenuByPIDSpec() {
        Specification<Menu> specification = (root, query, cb) -> {
            Predicate predicate;
            if (menuDto.getParentId() == null) {
                predicate = cb.isNull(root.<Integer>get("parentId"));
            } else {
                predicate = cb.equal(root.<Integer>get("parentId"), menuDto.getParentId());
            }
            return predicate;
        };
        return specification;
    }
}
