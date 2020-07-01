package com.model;

public class UserInfo {
	private String name;
	private String typeOfLock;
	private String speedOfAccess;
	private String security;
	public Object addFileUser;	
	
	
	
	public UserInfo(String name, String typeOfLock, String speedOfAccess, String security) {
		super();
		this.name = name;
		this.typeOfLock = typeOfLock;
		this.speedOfAccess = speedOfAccess;
		this.security = security;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeOfLock() {
		return typeOfLock;
	}
	public void setTypeOfLock(String typeOfLock) {
		this.typeOfLock = typeOfLock;
	}
	public String getSpeedOfAccess() {
		return speedOfAccess;
	}
	public void setSpeedOfAccess(String speedOfAccess) {
		this.speedOfAccess = speedOfAccess;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", typeOfLock=" + typeOfLock + ", speedOfAccess=" + speedOfAccess
				+ ", security=" + security + "]";
	}
	

}
