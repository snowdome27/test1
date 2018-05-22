package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginId;

	private String loginPassword;

	private String userName;
	
	private String userAddress;
	
	private String userAddress1;
	
	private String userAddress2;
	
	private String userAddress3;
	
	private String userSex;
	
	private String userTell;
	
	private String insertDate;

	public Map<String,Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {

		userCreateCompleteDAO.createUser(session.get("loginId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				session.get("userAddress").toString(),
				session.get("userAddress1").toString(),
				session.get("userAddress2").toString(),
				session.get("userAddress3").toString(),
				session.get("userSex").toString(),
				session.get("userTell").toString());

		String result = SUCCESS;

		return result ;
	}

	

	public String getLoginId() {
		return loginId;
	}



	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}



	public String getLoginPassword() {
		return loginPassword;
	}



	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserAddress() {
		return userAddress;
	}



	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}



	public String getUserAddress1() {
		return userAddress1;
	}



	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}



	public String getUserAddress2() {
		return userAddress2;
	}



	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}



	public String getUserAddress3() {
		return userAddress3;
	}



	public void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
	}



	public String getUserSex() {
		return userSex;
	}



	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}



	public String getUserTell() {
		return userTell;
	}



	public void setUserTell(String userTell) {
		this.userTell = userTell;
	}



	public String getInsertDate() {
		return insertDate;
	}



	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}



	public UserCreateCompleteDAO getUserCreateCompleteDAO() {
		return userCreateCompleteDAO;
	}



	public void setUserCreateCompleteDAO(UserCreateCompleteDAO userCreateCompleteDAO) {
		this.userCreateCompleteDAO = userCreateCompleteDAO;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
