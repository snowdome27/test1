package com.internousdev.stylepet.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.ProductDateDAO;
import com.internousdev.stylepet.dto.ProductDateDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ProductDateAction extends ActionSupport implements SessionAware{
	
private String itemName;
	
	private int itemPrice;
	
	private int itemStock; 
	
	private String imageFilePath;
	
	private String imageFileName;
	
	private String insertDate;
	
	private String updateDate;
	
	public Map<String,Object> session;
	
	
	public String execute(){
		
		String result = ERROR;
		
		System.out.println(itemName);
		
		// 画像、名前、値段
		ProductDateDAO productDateDAO = new ProductDateDAO();
		ProductDateDTO productDateDTO = new ProductDateDTO();
		
		productDateDTO = productDateDAO.getProductInfo(itemName);
		System.out.println(imageFilePath);
		imageFilePath = productDateDTO.getImageFilePath();
		itemPrice = productDateDTO.getItemPrice();
		
//		session.put("productDateDTO", productDateDTO);
		session.put("itemName", itemName);
		session.put("imageFilePath", imageFilePath);
		session.put("itemPrice", itemPrice);
		
		
		
		
		
		result=SUCCESS;
		return result;
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




	public String getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}



	public Map<String, Object> getSession() {
		return session;
	}




	@Override

	public void setSession(Map<String, Object> session){
		
			this.session = session;
	}
	

}
