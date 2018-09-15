package com.companyname.javasampletest;

public class Users {
	Integer id;
	String FirstName;
	String LastName;
	String age;
	String gender;
	
	public Users(Integer id, String FirstName, String LastName, String age, String gender) {
		
		super();
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.age = age;
		this.gender=gender;
		
	}
	public Integer getId() {
		return id;		
	}
	public String getFirstName() {
		return FirstName;
	}
    public String getLastName() {
    	return LastName;
    }
    public String getAge() {
    	return age;
    }
    public String getgender() {
    	return gender;
    	
    }
	

}
