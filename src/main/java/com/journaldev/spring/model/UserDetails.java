/*
 * developed by sintu
 */

package com.journaldev.spring.model;

import java.util.ArrayList;
import java.util.Date;


public class UserDetails {
	
	public long mob;
	public ArrayList<String> skill = new ArrayList<String>();
	public String hobby;
	public Date dob;
    public String name;
    public Address userDetailAddress;
    public String loginName;
    
	
    public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public Address getUserDetailAddress() {
		return userDetailAddress;
	}
	public void setUserDetailAddress(Address userDetailAddress) {
		this.userDetailAddress = userDetailAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public ArrayList<String> getSkill() {
		return skill;
	}
	public void setSkill(ArrayList<String> skill) {
		this.skill = skill;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
