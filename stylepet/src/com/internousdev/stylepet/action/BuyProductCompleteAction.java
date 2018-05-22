package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.BuyProductCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class BuyProductCompleteAction extends ActionSupport implements SessionAware{
	
	private Map<String, Object> session;
	
	private String userName;
	private String userAddress1;
	private String userAddress2;
	private String userAddress3;
	private String userTell;
	
	private String itemName;
	private int itemPrice;
	private String imageFilePath;
	
	
	public String execute() throws SQLException{
		
		String result = ERROR;
		
		
		BuyProductCompleteDAO dao = new BuyProductCompleteDAO();

		
		dao.buyPCD(session.get("userName").toString(), 
				session.get("userAddress1").toString(), 
				session.get("userAddress2").toString(),
				session.get("userAddress3").toString(), 
				session.get("userTell").toString(), 
				session.get("itemName").toString(), 
				Integer.parseInt(session.get("itemPrice").toString()), 
				session.get("imageFilePath").toString()
				);
		
			result = SUCCESS;
		
		return result;
		
		
		
	}

	
	
	
	
	
	
	
	public String getImageFilePath() {
		return imageFilePath;
	}








	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
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




	public String getUserTell() {
		return userTell;
	}




	public void setUserTell(String userTell) {
		this.userTell = userTell;
	}




	public String getItemName() {
		return itemName;
	}




	public void setItemName(String itemName) {
		this.itemName = itemName;
	}




	public int getItemPrice() {
		return itemPrice;
	}




	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}




	public Map<String, Object> getSession() {
		return session;
	}




	@Override

	public void setSession(Map<String, Object> session){
		
			this.session = session;
	}
	
}
