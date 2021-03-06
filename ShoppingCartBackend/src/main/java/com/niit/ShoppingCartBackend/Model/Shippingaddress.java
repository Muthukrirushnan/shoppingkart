package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Table(name = "Shippingaddress")
@Entity
@Component
public class Shippingaddress {
	
	
@Id
@Column(name = "shippingId")
@GeneratedValue
private String shippingId;

private String userId;

private String userName;

private String mobileNumber;

private String userMailId;

private String userAddress;

private String userCityCode;

public String getShippingId() {
	return shippingId;
}

public void setShippingId(String shippingId) {
	this.shippingId = shippingId;
}



public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getUserMailId() {
	return userMailId;
}

public void setUserMailId(String userMailId) {
	this.userMailId = userMailId;
}

public String getUserAddress() {
	return userAddress;
}

public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}

public String getUserCityCode() {
	return userCityCode;
}

public void setUserCityCode(String userCityCode) {
	this.userCityCode = userCityCode;
}
	
}