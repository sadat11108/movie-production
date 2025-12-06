package com.example.movieproductionhouse;

public class CreateAccount {
    private String name,email,password;
    private Integer id,phoneNo;

    public CreateAccount(String name, String email, String password, Integer id, Integer phoneNo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "CreateAccount{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
