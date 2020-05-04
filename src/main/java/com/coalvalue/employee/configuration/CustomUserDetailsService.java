package com.coalvalue.employee.configuration;

import com.coalvalue.employee.domain.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/** 
 * 用于加载用户信息 实现UserDetailsService接口，或者实现AuthenticationUserDetailsService接口 
 * @author ChengLi 
 * 
 */  
public class CustomUserDetailsService /* 
    //实现UserDetailsService接口，实现loadUserByUsername方法 
    implements UserDetailsService { 
    @Override 
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { 
        System.out.println("当前的用户名是："+username); 
        //这里我为了方便，就直接返回一个用户信息，实际当中这里修改为查询数据库或者调用服务什么的来获取用户信息 
        UserInfo userInfo = new UserInfo(); 
        userInfo.setUsername("admin"); 
        userInfo.setName("admin"); 
        Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>(); 
        AuthorityInfo authorityInfo = new AuthorityInfo("TEST"); 
        authorities.add(authorityInfo); 
        userInfo.setAuthorities(authorities); 
        return userInfo; 
    }*/  
      
      
    //实现AuthenticationUserDetailsService，实现loadUserDetails方法  
{// implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {
  
/*    @Override
    public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {  
        System.out.println("当前的用户名是："+token.getName());  
        *//*这里我为了方便，就直接返回一个用户信息，实际当中这里修改为查询数据库或者调用服务什么的来获取用户信息*//*
        User userInfo = new User();
        userInfo.setUserName("admin");
        //userInfo.setName("admin");
        Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>();  
        AuthorityInfo authorityInfo = new AuthorityInfo("TEST");  
        authorities.add(authorityInfo);  
        userInfo.setAuthorities(authorities);  
        return userInfo;  
    }*/
   // @Override
    public UserDetails loadUserDetails() throws UsernameNotFoundException {

  //      public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {
        String login =null;// token.getPrincipal().toString();
        String username = login.toLowerCase();

        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return new User(username, grantedAuthorities);
    }


  
}  