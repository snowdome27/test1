package com.internousdev.stylepet.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserConfirmAction extends ActionSupport implements SessionAware{
	
	private String loginId;
	private String loginPass;
	
	public Map<String,Object> session;
	
	public String execute() throws SQLException{
			
		 String result=SUCCESS;
		
		return result;
	}

	
	
	
	
	
	
	public String getLoginId() {
		return loginId;
	}







	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}







	public String getLoginPass() {
		return loginPass;
	}







	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}







	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	
	
	

}
