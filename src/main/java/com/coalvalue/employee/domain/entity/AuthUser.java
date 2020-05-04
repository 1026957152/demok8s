package com.coalvalue.employee.domain.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

//import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Peter Xu on 01/10/2015.
 */

public class AuthUser extends BaseDomain implements UserDetails {


    List<GrantedAuthority> authorities;


    private String userName;

    private String password;

    private String userType;

    private String emailAddress;

    private String status;

    private String mobile;

    private String signupMode;



    private String nickName;



    private Set<String> userRoles;


    private Integer resourceId;

    public AuthUser(String username, List<GrantedAuthority> grantedAuthorities) {


    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }


    private Integer companyId;

    private ArrayList<String> scene = new ArrayList<String>();

    public ArrayList<String> getScene() {
        return scene;
    }

    public void setScene(ArrayList<String> scene) {
        this.scene = scene;
    }

    private String userId;

    public AuthUser(String username) {

        this.userName = username;
    }

    public AuthUser(String username, String password, List<GrantedAuthority> authorities) {

        this.userName = username;
        this.password = password;
        this.authorities = authorities;
    }


    public boolean  OpenIdBeBinded() {
        return false;
    }



    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSignupMode() {
        return signupMode;
    }

    public void setSignupMode(String signupMode) {
        this.signupMode = signupMode;
    }

    public AuthUser() {
    }

   // public User(String username, String password, Collection<? extends GrantedAuthority> grantedAuthorities) {


    //}


    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public String getUserName() {
        return userName;
    }



    public String getUserType() {
        return userType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setStatus(String status) {
        this.status = status;
    }

/*
    public UserSetting getUserSetting() {
        return userSetting;
    }

    public void setUserSetting(UserSetting userSetting) {
        this.userSetting = userSetting;
    }
*/

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public void setUserRoles(Set<String> userRoles) {
        this.userRoles = userRoles;
    }

    public Set<String> getUserRoles() {
        return userRoles;
    }

    public boolean isAdmin() {
        return getId() == 1;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        if(authorities != null){
            for(GrantedAuthority grantedAuthority : this.authorities) {
                System.out.println("-----------------------------------user get authorities:" + grantedAuthority.getAuthority().toString());
            }

            return authorities;
        }else {
            return null;
        }

    }

    @Override
    public String getPassword() {

        System.out.println("-----------------------------------user get authorities");

        return password;
    }

    @Override
    public String getUsername() {
        System.out.println("-----------------------------------user get getUsername" + userName);

        return userName;
    }






    @Transient
    private long expires;





    private boolean accountExpired;


    private boolean accountLocked;


    private boolean credentialsExpired;


    private boolean accountEnabled;


    private String newPassword;



      private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

//   @Override
   // @JsonIgnore
   // public Set<UserAuthority> getAuthorities() {
     //   return authorities;
   // }

    // Use Roles as external API
/*    public Set<UserRole> getRoles() {
        Set<UserRole> roles = EnumSet.noneOf(UserRole.class);
        if (authorities != null) {
            for (UserAuthority authority : authorities) {
                roles.add(UserRole.valueOf(authority));
            }
        }
        return roles;
    }*/
/*
    public void setRoles(Set<UserRole> roles) {
        for (UserRole role : roles) {
            grantRole(role);
        }
    }


    public void grantRole(UserRole role) {
        if (authorities == null) {
            authorities = new HashSet<UserAuthority>();
        }
        authorities.add(role.asAuthorityFor(this));
    }

    public void revokeRole(UserRole role) {
        if (authorities != null) {
            authorities.remove(role.asAuthorityFor(this));
        }
    }

    public boolean hasRole(UserRole role) {
        return authorities.contains(role.asAuthorityFor(this));
    }
*/

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        System.out.println("-----------------------------------user get isAccountNonExpired");
        return !accountExpired;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        System.out.println("-----------------------------------user get isAccountNonLocked");

        return !accountLocked;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        System.out.println("-----------------------------------user get isCredentialsNonExpired");

        return !credentialsExpired;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        System.out.println("-----------------------------------user get isEnabled");

        return !accountEnabled;
    }

    public long getExpires() {
        return expires;
    }

    public void setExpires(long expires) {
        this.expires = expires;
    }





    @JsonIgnore
    public boolean isOrganization() {
        System.out.println("-----------------------------------user get isAccountNonExpired");
        return company != null;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }


    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }




    private boolean isWeixinBinded;


    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }
}
