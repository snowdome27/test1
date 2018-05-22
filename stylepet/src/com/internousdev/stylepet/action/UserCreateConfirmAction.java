package com.internousdev.stylepet.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.UserCreateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;


public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginId;

	private String checkLoginId;

	private String loginPassword;

	private String checkPassword;

	private String userName;

	private String userAddress1;

	private String userAddress2;

	private String userAddress3;

	private String userSex;

	private String userTell;

	public Map<String,Object> session;

	private String errorMassage;

	public String execute() {

		String result = SUCCESS;


		if(!(loginId.equals("")) && !(loginPassword.equals("")) && !(userName.equals(""))
				&& !(userAddress1.equals("")) && !(userAddress2.equals("")) && !(userAddress3.equals(""))
				&& !(userTell.equals(""))) {

			if(loginId.equals(checkLoginId) && loginPassword.equals(checkPassword)){

				UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();
				boolean checkId = userCreateConfirmDAO.getUserInfo(loginId, loginPassword);

				if(checkId){
					session.put("loginId", loginId);
					session.put("loginPassword", loginPassword);
					session.put("userName", userName);
					session.put("userAddress", userAddress1 + userAddress2 + userAddress3);
					session.put("userAddress1", userAddress1);
					session.put("userAddress2", userAddress2);
					session.put("userAddress3", userAddress3);
					session.put("userSex", userSex);
					session.put("userTell", userTell);
				}else{
					setErrorMassage("同じIDまたはパスワードが存在します。");
					result = ERROR;
				}

			}else{
				setErrorMassage("ID又はパスワードが違います。");
				result = ERROR;
			}

		} else {

			setErrorMassage("未入力の項目があります。");
			result = ERROR;
		}

		return result;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getCheckLoginId() {
		return checkLoginId;
	}

	public void setCheckLoginId(String checkLoginId) {
		this.checkLoginId = checkLoginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


	public String getCheckPassword() {
		return checkPassword;
	}

	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
