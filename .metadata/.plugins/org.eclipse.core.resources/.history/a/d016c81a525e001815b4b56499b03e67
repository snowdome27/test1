package com.internousdev.stylepet.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public String execute(){
		String loginId =(String)session.get("loginId");
		session.clear();
		if(loginId!=null){
			session.put("loginId", loginId);
		}
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
