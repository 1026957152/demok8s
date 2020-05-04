package com.coalvalue.employee.repository.specification;

import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.dto.CompanyDto;
import com.coalvalue.employee.domain.entity.Company;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 赵源 on 3/15/2015.
 */
public class CompanySpec {

    private CompanyDto companyDto;

    public CompanySpec() {
    }

    public CompanySpec(CompanyDto companyDto){
        this.companyDto = companyDto;
    }

    public Specification<Company> defaultSpec() {

        // 用于添加关注， 移动端搜索公司，
        Specification<Company> specification = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<Predicate>();
            if (StringUtils.isNotBlank(companyDto.getCompanyName())) {
                Predicate predicate =
                        cb.like(root.<String>get("companyName"), "%" + companyDto.getCompanyName() + "%");
                predicateList.add(predicate);
            }


            // 主要运用，选择发送信息到不同类型的公司
            if (StringUtils.isNotBlank(companyDto.getCompanyType())) {
                Predicate predicate =
                        cb.equal(root.<String>get("companyType"), companyDto.getCompanyType());
                predicateList.add(predicate);
            }


            // 判断公司，是否提交审核， 是否是审核未 品牌合作公司。
            if (StringUtils.isNotBlank(companyDto.getStatus())) {
                Predicate predicate =
                        cb.equal(root.<String>get("status"),  companyDto.getStatus() );
                predicateList.add(predicate);
            }

            if (StringUtils.isNotBlank(companyDto.getIsPublic()) ){
                Predicate predicate =
                        cb.like(root.<String>get("isPublic"), "%" + companyDto.getLocation() + "%");
                predicateList.add(predicate);
            }

            if (StringUtils.isNotBlank(companyDto.getLocation())) {
                Predicate predicate =
                        cb.like(root.<String>get("location"), "%" + companyDto.getIsPublic() + "%");
                predicateList.add(predicate);
            }



            return cb.and(predicateList.toArray(new Predicate[0]));
        };
        return specification;
    }
    public Specification<Company> companyNameNotNullSpec() {
        Specification<Company> specification = (root, query, cb) -> {
            return cb.isNotNull(root.<String>get("companyName"));
        };
        return specification;
    }

    public static Specification<Company> brandCompanyWithoutWarehouseSpec() {
        Specification<Company> specification = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<Predicate>();

                Predicate predicate =
                        cb.equal(root.<String>get("brand"), true);
                predicateList.add(predicate);


             predicate =
                        cb.equal(root.<String>get("open"), true);
                predicateList.add(predicate);


            predicate = cb.notEqual(root.<String>get("companyType"), CommonConstant.COMPANY_TYPE_WAREHOUSE);
            predicateList.add(predicate);
            predicate = cb.notEqual(root.<String>get("companyType"), CommonConstant.COMPANY_TYPE_LOGISTICS);
            predicateList.add(predicate);

            return  cb.and(predicateList.toArray(new Predicate[0]));
        };
        return specification;
    }



    //Add by zhaoyuan 30/06/2015
    public static Specification<Company> companyIsPublicSpec() {
        Specification<Company> specification = (root, query, cb) -> {
            return cb.equal(root.<Boolean>get("open"), true);
        };
        return specification;
    }


    public static Specification<Company> logisicsCompanieSpec() {
        Specification<Company> specification = (root, query, cb) -> {
            return cb.equal(root.<String>get("companyType"), CommonConstant.COMPANY_TYPE_LOGISTICS);
        };
        return specification;
    }



}
