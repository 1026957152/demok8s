package com.example.dm.web;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service
public class HistoryServiceImpl extends BaseController {

    protected transient Logger logger = LoggerFactory.getLogger(getClass());
    // @PersistenceContext
    protected EntityManager em;

    protected DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMM");
    DateTimeFormatter df_never = DateTimeFormatter.ofPattern("yyyy-MM-dd");



    public void makeAuthUser(ModelAndView modelAndView , Authentication authentication)  {
        if(authentication!= null && authentication.isAuthenticated()){
            modelAndView.addObject("isAuthenticated",true);
            org.springframework.security.core.userdetails.User    user =(org.springframework.security.core.userdetails.User)authentication.getPrincipal();
           modelAndView.addObject("authUser",user);
        }else{
            modelAndView.addObject("isAuthenticated",false);
        }

    }


}
