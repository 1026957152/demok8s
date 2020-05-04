package com.coalvalue.employee.configuration;

import com.coalvalue.employee.domain.entity.Person;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.repository.PersonRepository;
import com.coalvalue.employee.repository.UserRepository;
import com.coalvalue.employee.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private PersonRepository personRepository;


    @Autowired
    private PermissionService permissionService;


    @Override
    public Authentication authenticate(Authentication auth)
      throws AuthenticationException {
        String username = auth.getName();
        String password = auth.getCredentials()
            .toString();

        User user= userRepository.findByEmailAddress(username);



        if(user == null && username.startsWith("U")){
            user = userRepository.findByUserId(username);
        }

        if(user == null && isMobileNO(username)){
            List<User> users = userRepository.findByMobile(username);
        }

        if(user == null){
            user = userRepository.findByUserName(username);
        }


        if (user == null) {
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
    if(user != null){


        Person person = personRepository.findByUserId(user.getUuid());
        user.setCompanyId(person != null?person.getCompanyId():null);
        user.setPerson(person);


     //   user.setCompany(companyService.getCompanyByUser(user));

        Set<String> userRoles = permissionService.queryUserRoles(user.getId());
       /// logger.debug("8**************************************************8 we are in UserDetailsService  userName is:" + user.toString());


        List<GrantedAuthority> authorities = buildUserAuthority(userRoles);



        user.setNickName(person.getNickName());


        user.setUserName(user.getUserId());
        user.setUserRoles(userRoles);

        user.setAuthorities(authorities);




        System.out.println("成功 成功 成功 成功 成功 成功"+ user.toString());


            return new UsernamePasswordAuthenticationToken(user, password,  buildUserAuthority(user.getUserRoles()));
      //  return new UsernamePasswordAuthenticationToken(user, password, Collections.emptyList());

        } else {
            throw new
                    BadCredentialsException("External system authentication failed");
        }
    }
 
    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(UsernamePasswordAuthenticationToken.class);
    }













    private Collection<? extends GrantedAuthority> getGrantedAuthorities(String
                                                                                 username) {
        Collection<? extends GrantedAuthority> authorities = null;

/*     if (username.equals("John")) {
            authorities = asList(() -> "ROLE_ADMIN", () -> "ROLE_BASIC");
        } else {
            authorities = asList(() -> "ROLE_BASIC");
        }*/

        return authorities;
    }

    private List<GrantedAuthority> buildUserAuthority(Set<String> userRoles) {
        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
        // Build user's authorities
        for (String userRole : userRoles) {
            setAuths.add(new SimpleGrantedAuthority(userRole));
        }
        return new ArrayList<GrantedAuthority>(setAuths);
    }

    /**
     * 验证手机号码
     * @param mobiles
     * @return  [0-9]{5,9}
     */
    public static boolean isMobileNO(String mobiles){
        boolean flag = false;
        try{
            Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
            Matcher m = p.matcher(mobiles);
            flag = m.matches();
        }catch(Exception e){
            flag = false;
        }
        return flag;
    }

}