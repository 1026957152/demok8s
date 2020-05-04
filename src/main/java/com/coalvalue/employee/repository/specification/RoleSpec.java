package com.coalvalue.employee.repository.specification;


import com.coalvalue.employee.domain.dto.RoleDto;
import com.coalvalue.employee.domain.entity.Role;
import com.coalvalue.employee.domain.entity.UserRole;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter Xu on 01/11/2015.
 */
public class RoleSpec {

    private RoleDto roleDto;

    public RoleSpec(RoleDto roleDto) {
        this.roleDto = roleDto;
    }

    public Specification<Role> defaultSpec() {
        Specification<Role> specification = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<>();
            if (StringUtils.isNotBlank(roleDto.getRoleName())) {
                Predicate predicate =
                        cb.like(root.<String>get("roleName"), "%" + roleDto.getRoleName() + "%");
                predicateList.add(predicate);
            }
            if (StringUtils.isNotBlank(roleDto.getRoleDesc())) {
                Predicate predicate =
                        cb.like(root.<String>get("roleDesc"), "%" + roleDto.getRoleDesc() + "%");
                predicateList.add(predicate);
            }

            if (null != roleDto.getUserId()) {

                Root<UserRole> bRoot = query.from(UserRole.class);
                Predicate predicate =
                        cb.equal(root.get("id"), bRoot.get("roleId"));
                predicateList.add(predicate);


                predicate =
                        cb.equal(bRoot.<String>get("userId"), roleDto.getUserId());
                predicateList.add(predicate);


            }
            return cb.and(predicateList.toArray(new Predicate[0]));
        };
        return specification;
    }
}
