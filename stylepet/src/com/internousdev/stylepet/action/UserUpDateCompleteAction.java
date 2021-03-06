package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.UserCreateConfirmDAO;
import com.internousdev.stylepet.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpDateCompleteAction extends ActionSupport implements SessionAware {

	private String loginId;

	private String checkLoginId;

	private String loginPass;

	private String checkPass;

	private String userName;
	
	private String userAddress;

	private String userAddress1;

	private String userAddress2;

	private String userAddress3;

	private String userSex;

	private String userTell;

	public Map<String,Object> session;

	private String errorMassage;

	private LoginDTO loginDTO = new LoginDTO();

	private UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();

	
	public String execute() throws SQLException{
		
		
		String result = SUCCESS;

		boolean dateCheck = false;

		if(!(loginId.length() == 0) && !(loginPass.length() == 0) && !(userName.length() == 0)
				&& !(userAddress1.length() == 0) && !(userAddress2.length() == 0) && !(userAddress3.length() == 0)
				&& !(userTell.length() == 0)){
			if(loginId.equals(checkLoginId) && loginPass.equals(checkPass)){

				String defaultLoginId = ((LoginDTO) session.get("loginId")).getLoginId();
				String defaultPassword=((LoginDTO) session.get("loginPass")).getLoginPassword();
				
				
				session.put("defaultLoginId", defaultLoginId);

				if( defaultLoginId.equals(loginId) || defaultPassword.equals(loginPass)){

		
					if(defaultLoginId.equals(loginId)){

						dateCheck = true;

					}else{
					
						dateCheck = userCreateConfirmDAO.getUserInfo(loginId, loginPass);
					}
				}else{

					dateCheck = userCreateConfirmDAO.getUserInfo(loginId, loginPass);
				}

				if(dateCheck){
					System.out.println(loginId);
					System.out.println(defaultLoginId);
					session.put("loginId", loginId);
					session.put("loginPass", loginPass);
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
		}else{
			setErrorMassage("未入力の項目があります。");
			result = ERROR;
		}
		return result;
	}



	
	


	public String getUserAddress() {
		return userAddress;
	}







	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
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







	public String getLoginPass() {
		return loginPass;
	}







	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}







	public String getCheckPass() {
		return checkPass;
	}







	public void setCheckPass(String checkPass) {
		this.checkPass = checkPass;
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







	public LoginDTO getLoginDTO() {
		return loginDTO;
	}







	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}







	public UserCreateConfirmDAO getUserCreateConfirmDAO() {
		return userCreateConfirmDAO;
	}







	public void setUserCreateConfirmDAO(UserCreateConfirmDAO userCreateConfirmDAO) {
		this.userCreateConfirmDAO = userCreateConfirmDAO;
	}







	public Map<String, Object> getSession() {
		return session;
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
