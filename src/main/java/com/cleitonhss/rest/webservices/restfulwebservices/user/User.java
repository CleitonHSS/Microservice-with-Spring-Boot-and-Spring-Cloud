package com.cleitonhss.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private Date birthDate;

    protected User(){

    }

    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    
	public void setId(Integer id) {
        this.id = id;
	}

	public Integer getId() {
		return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
	}

	public String getName() {
		return this.name;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}
}