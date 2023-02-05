package com.okayjava.html.model;

public class Volunteer {
	
	private String name;
	private String username;
	private String passwd;
	private String age;
	private String gender;
	private String interest;
	private String major;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterest(){
		return interest;
	}
    public void setInterest(String interest){
		this.interest = interest;
	}
	public String getMajor(){
		return major;
	}
    public void setMajor(String major){
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "Hello " + username;
	}
	

}
