package com.okayjava.html.model;

public class Kids {
	
	private String name;
	private String username;
	private String passwd;
	private String age;
	private String gender;
	private String fam_background;
	private String ambition;

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

	public String getFamBackground(){
		return fam_background;
	}
	public void setFamBackground(String background){
		fam_background = background;
	}

	public String getAmbition(){
		return ambition;
	}
	public void setAmbition(String ambition){
		this.ambition = ambition;
	}
	
	@Override
	public String toString() {
		return "Hello " + username;
	}
	

}
