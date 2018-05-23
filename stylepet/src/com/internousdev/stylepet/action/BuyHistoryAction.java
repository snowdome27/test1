package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.BuyHistoryDAO;
import com.internousdev.stylepet.dto.BuyHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyHistoryAction extends ActionSupport implements SessionAware{
//	private String userName;
	private String itemName;
	private int itemPrice;
	private String imageFilePath;
	
	public Map<String,Object> session;
	public String deleteFlg;
	
	
	
	public String execute() throws SQLException{
		String result = ERROR;
		
		BuyHistoryDAO buyHistoryDAO = new BuyHistoryDAO();
		
		ArrayList<BuyHistoryDTO> buyHistoryDTOList = new ArrayList<BuyHistoryDTO>();
	
		if(deleteFlg == null){
			String userName = session.get("userName").toString();
			
			buyHistoryDTOList = buyHistoryDAO.getBuyHitoryInfo(userName);
		
			session.put("buyHistoryDTOList", buyHistoryDTOList);
		
		}else if(deleteFlg.equals("1")){
			delete();
		}
		result = SUCCESS;
		
		return result;
	}
	
	
	
	
	
	
	
	
	public String delete() throws SQLException{
		
		BuyHistoryDAO buyHdao = new BuyHistoryDAO();
		
		String userName = session.get("userName").toString();
		
		System.out.println("test");
		
		int res = buyHdao.buyHistoryDelete(userName);
		
		System.out.println(res);
		
		String result = ERROR;
		
		if(res>0){
			/*
			 * 削除した後DBの情報をsessionに上書き
			 */
			
			BuyHistoryDAO dao = new BuyHistoryDAO();
			
			ArrayList<BuyHistoryDTO> buyHistoryDTOList = new ArrayList<BuyHistoryDTO>();
			
			buyHistoryDTOList = dao.getBuyHitoryInfo(userName);
			
			session.put("buyHistoryDTOList", buyHistoryDTOList);
			
			session.put("message", "商品履歴を削除しました");
		}else if(res==0){
			session.put("message", "商品履歴を削除出来ませんでした");
		}
		
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

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	

	

}
