package com.example.dm.pojo;

import java.io.Serializable;
import java.util.Date;

public class User_backup implements Serializable {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Integer id;
/*    @NotEmpty
    @Column(nullable = false, unique = true)*/
    private String username;
   // @NotEmpty
    private String password;
    private Date dateCreated;
    private String departmentId;
    private String departmentName;
    private String name;

    /*    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinTable(name = "user_authority",
                joinColumns = { @JoinColumn(name = "user_id") },
                inverseJoinColumns = { @JoinColumn(name = "authority_id") })*/
/*    private Set<Authority> authorities = new HashSet<>();*/
    public User_backup() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // getters and setters
}