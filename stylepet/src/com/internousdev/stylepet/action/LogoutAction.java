package com.internousdev.stylepet.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public String execute(){
		String userName =(String)session.get("userName");
		session.clear();
		if(userName!=null){
			session.put("userName", userName);
		}
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
