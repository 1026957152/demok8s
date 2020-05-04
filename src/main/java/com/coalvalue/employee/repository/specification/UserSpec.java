package com.coalvalue.employee.repository.specification;

import com.coalvalue.employee.domain.dto.UserDto;
import com.coalvalue.employee.domain.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by zohu on 1/29/2015.
 */
public class UserSpec {

    private UserDto userDto;


    public UserSpec() {
    }

    public UserSpec(UserDto userDto){
        this.userDto = userDto;
    }

    public Specification<User> defaultSpec() {
        Specification<User> specification = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<Predicate>();
            if (StringUtils.isNotBlank(userDto.getUserName())) {
                Predicate predicate =
                        cb.like(root.<String>get("userName"), "%" + userDto.getUserName() + "%");
                predicateList.add(predicate);
            }
            if (StringUtils.isNotBlank(userDto.getEmailAddress())) {
                Predicate predicate =
                        cb.like(root.<String>get("emailAddress"), "%" + userDto.getEmailAddress() + "%");
                predicateList.add(predicate);
            }
            return cb.and(predicateList.toArray(new Predicate[0]));
        };
        return specification;
    }

}
