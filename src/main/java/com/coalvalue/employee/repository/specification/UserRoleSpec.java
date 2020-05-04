package com.coalvalue.employee.repository.specification;

import com.coalvalue.employee.domain.entity.UserRole;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter Xu on 01/13/2015.
 */
public class UserRoleSpec {

    private UserRole userRole;

    public UserRoleSpec(UserRole userRole) {
        this.userRole = userRole;
    }

    public Specification<UserRole> defaultSpec() {
        Specification<UserRole> specification = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<>();
            if (userRole.getUserId() != null) {
                predicateList.add(cb.equal(root.<Integer>get("userId"), userRole.getUserId()));
            }
            if (userRole.getRoleId() != null) {
                predicateList.add(cb.equal(root.<Integer>get("roleId"), userRole.getRoleId()));
            }
            return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));
        };
        return specification;
    }
}
