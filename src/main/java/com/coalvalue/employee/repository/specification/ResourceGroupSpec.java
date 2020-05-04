package com.coalvalue.employee.repository.specification;

import com.coalvalue.employee.domain.dto.ResourceGroupDto;
import com.coalvalue.employee.domain.entity.ResourceGroup;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter Xu on 02/01/2015.
 */
public class ResourceGroupSpec {

    private ResourceGroupDto resourceGroupDto;

    public ResourceGroupSpec(ResourceGroupDto resourceGroupDto) {
        this.resourceGroupDto = resourceGroupDto;
    }

    public Specification<ResourceGroup> defaultSpec() {
        Specification<ResourceGroup> specification = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<>();
            if (StringUtils.isNotBlank(resourceGroupDto.getGroupName())) {
                Predicate predicate =
                        cb.like(root.<String>get("groupName"), "%" + resourceGroupDto.getGroupName() + "%");
                predicateList.add(predicate);
            }
            if (StringUtils.isNotBlank(resourceGroupDto.getGroupDesc())) {
                Predicate predicate =
                        cb.like(root.<String>get("groupDesc"), "%" + resourceGroupDto.getGroupDesc() + "%");
                predicateList.add(predicate);
            }
            return cb.and(predicateList.toArray(new Predicate[0]));
        };
        return specification;
    }
}
