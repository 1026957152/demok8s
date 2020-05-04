package com.coalvalue.employee.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by silence yuan on 2015/6/29.
 */


@Controller
@RequestMapping("/usercenter/company")
public class CompanyController extends BaseController {



    @Autowired
    public RestTemplate restTemplate;



        private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView coalDemandIndex(){
        return new ModelAndView("/user_center/company/company_index");
    }



    // add by zhaoyuan 29/06/2015
    @RequestMapping(value = "/ispublic", method = RequestMethod.POST)
    @ResponseBody

    //目前是错误的。
    public Map changeCompanyIsPublic(@RequestParam("companyId") Integer companyId){
        // truckDto.setCompanyId(getCurrentUserId(session));
        logger.debug("ispublic:");

        return null;//companyService.changeCompanyIsPublic(companyId);
   //     Company company = companyService.queryCompanyById(1);
  //      if(company.getIsPublic() == CommonConstant.COMPANY_ISNOT_PUBLIC) {

   //         companyService.updateCompanyByIsPublic(1, CommonConstant.COMPANY_IS_PUBLIC);

    //    } else {
   //         companyService.updateCompanyByIsPublic(1, CommonConstant.COMPANY_ISNOT_PUBLIC);

    //    }


    }

    public Map verifyCompanyIsPublic(@RequestParam("companyId") Integer companyId){

        logger.debug("ispublic:");
        return null;//companyService.verifyCompanyIsPublic(companyId);


    }

    public Map licenceBrand(@RequestParam("companyId") Integer companyId){

        logger.debug("授权品牌公司");
        return null;// companyService.licenceBrand(companyId);


    }





}
