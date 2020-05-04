package com.coalvalue.employee.repository.specification;

import com.coalvalue.employee.domain.dto.MenuBtnGroupDto;
import com.coalvalue.employee.domain.entity.MenuBtnGroup;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter Xu on 02/06/2015.
 */
public class MenuBtnGroupSpec {

    private MenuBtnGroupDto menuBtnGroupDto;

    public MenuBtnGroupSpec(MenuBtnGroupDto menuBtnGroupDto) {
        this.menuBtnGroupDto = menuBtnGroupDto;
    }

    public Specification<MenuBtnGroup> queryByGroupIdSpec() {
        Specification<MenuBtnGroup> specification = (root, query, cb) -> {
            Predicate predicate;
            if (menuBtnGroupDto.getGroupId() == null) {
                predicate = cb.isNull(root.<Integer>get("groupId"));
            } else {
                predicate = cb.equal(root.<Integer>get("groupId"), menuBtnGroupDto.getGroupId());
            }
            return predicate;
        };
        return specification;
    }

    public Specification<MenuBtnGroup> queryByResourceSpec() {
        Specification<MenuBtnGroup> specification = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<>();
            if (StringUtils.isNotBlank(menuBtnGroupDto.getResourceType())) {
                Predicate predicate =
                        cb.equal(root.<String>get("resourceType"), menuBtnGroupDto.getResourceType());
                predicateList.add(predicate);
            }
            if (menuBtnGroupDto.getResourceId() != null) {
                Predicate predicate =
                        cb.equal(root.<Integer>get("resourceId"), menuBtnGroupDto.getResourceId());
                predicateList.add(predicate);
            }
            if (menuBtnGroupDto.getGroupId() != null) {
                Predicate predicate =
                        cb.equal(root.<Integer>get("groupId"), menuBtnGroupDto.getGroupId());
                predicateList.add(predicate);
            }
            return cb.and(predicateList.toArray(new Predicate[0]));
        };
        return specification;
    }
}
