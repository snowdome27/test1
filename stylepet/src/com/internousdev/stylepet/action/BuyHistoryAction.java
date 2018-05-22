package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.BuyHistoryDAO;
import com.internousdev.stylepet.dto.BuyHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyHistoryAction extends ActionSupport implements SessionAware{
	
	private String itemName;
	private int itemPrice;
	private String imageFilePath;
	
	public Map<String,Object> session;
	public String deleteFlg;
	
	
	
	public String excecute() throws SQLException{
		
		
		String result = ERROR;
		
		BuyHistoryDAO buyHistoryDAO = new BuyHistoryDAO();
		BuyHistoryDTO buyHistoryDTO = new BuyHistoryDTO();
		
			String userName = session.get("userName").toString();
			
			buyHistoryDTO = buyHistoryDAO.getBuyHitoryInfo(userName);
		
		session.put("itemName", buyHistoryDTO.getItemName());
		session.put("imageFilePath", buyHistoryDTO.getImageFilePath());
		session.put("itemPrice",buyHistoryDTO.getItemPrice());
		
		
		result = SUCCESS;
		
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







	public String getImageFilePath() {
		return imageFilePath;
	}







	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}







	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	
	
}
