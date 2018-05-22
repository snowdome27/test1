package com.internousdev.stylepet.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

	

public class AddressConfirmationAction extends ActionSupport implements SessionAware{

		
		private String loginId;
		
		private String userName;
		
		private String userAddress1;
		
		private String userAddress2;
		
		private String userAddress3;
		
		private String itemName;
		
		private int itemPrice;
		
		private int itemStock;
		
		private String imageFilePath;
		
		private String imageFileName;
		
		private String insertDate;

		public Map<String, Object> session;
		
		
		
		
		public String execute(){
			
			String result = "login"; 
			
			if(session.containsKey("userName")){
				
				result=SUCCESS;
				
			}
			System.out.println(result);
			return result;
			
		}
			
			



		
		
		
		
		public String getLoginId() {
			return loginId;
		}







		public void setLoginId(String loginId) {
			this.loginId = loginId;
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







		public int getItemStock() {
			return itemStock;
		}







		public void setItemStock(int itemStock) {
			this.itemStock = itemStock;
		}







		public String getImageFilePath() {
			return imageFilePath;
		}







		public void setImageFilePath(String imageFilePath) {
			this.imageFilePath = imageFilePath;
		}







		public String getImageFileName() {
			return imageFileName;
		}







		public void setImageFileName(String imageFileName) {
			this.imageFileName = imageFileName;
		}







		public String getInsertDate() {
			return insertDate;
		}







		public void setInsertDate(String insertDate) {
			this.insertDate = insertDate;
		}







		public Map<String, Object> getSession() {
			return session;
		}







		@Override

		public void setSession(Map<String, Object> session){
			
				this.session = session;
		}




			
			
		}

