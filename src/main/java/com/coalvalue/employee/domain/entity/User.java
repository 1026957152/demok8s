package com.coalvalue.employee.domain.entity;



import com.coalvalue.employee.enumType.UserRolesEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

//import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Table(name = "user")
public class User extends BaseDomain implements UserDetails {

    @Transient
    List<GrantedAuthority> authorities;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USER_TYPE")
    private String userType;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "signup_mode")
    private String signupMode;





    @Transient
    private String nickName;




    @Transient
    private Set<String> userRoles;


    @Transient
    private Integer resourceId;

    public User(String username, List<GrantedAuthority> grantedAuthorities) {


    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    @Transient
    private Integer companyId;
    @Transient
    private ArrayList<String> scene = new ArrayList<String>();

    public ArrayList<String> getScene() {
        return scene;
    }

    public void setScene(ArrayList<String> scene) {
        this.scene = scene;
    }

    @NotNull
    private String userId;

    public User(String username) {

        this.userName = username;
    }

    public User(String username, String password, List<GrantedAuthority> authorities) {

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

    public User() {
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

    public boolean containRole(UserRolesEnum rolesEnum) {
        return userRoles.contains(rolesEnum.getText());
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





    //@NotNull
    @Transient
    private boolean accountExpired;

   // @NotNull
    @Transient
    private boolean accountLocked;

   // @NotNull
    @Transient
    private boolean credentialsExpired;

   // @NotNull
    @Transient
    private boolean accountEnabled;

  //  @Transient
    @Transient
    private String newPassword;



  //  @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER, orphanRemoval = true)
   // private Set<UserAuthority> authorities;

     // @OneToOne(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
      @Transient
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

    @Transient
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }



    @Transient
    private boolean isWeixinBinded;


    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }
}
