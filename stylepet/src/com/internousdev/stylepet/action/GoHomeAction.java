package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.ProductDAO;
import com.internousdev.stylepet.dto.PagenationDTO;
import com.internousdev.stylepet.dto.ProductDTO;
import com.internousdev.stylepet.util.Pagenation;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport implements SessionAware{
	
	private String itemName;
	private String itemPrice;
	private int itemStock;
	private String imageFilePath;
	private String imageFileName;
	
	
	public Map<String,Object> session;
	
	
	public String execute() throws SQLException{
		
		ProductDAO productDAO = new ProductDAO();
		ArrayList<ProductDTO> productDTOList = productDAO.getProductInfo(); 
		
		Pagenation pagenation = new Pagenation();
		
		PagenationDTO pagenationDTO = pagenation.initialize(productDTOList, 8);
		
		String result = ERROR;
		
		session.put("pagenationDTO", pagenationDTO);
		session.put("totalPageSize", pagenationDTO.getTotalPageSize());
		session.put("currentPageNo", pagenationDTO.getCurrentPageNo());
		session.put("totalRecordSize", pagenationDTO.getTotalPageSize());
		session.put("startRecordNo", pagenationDTO.getStartRecordNo());
		session.put("endRecordNo", pagenationDTO.getEndRecordNo());
		session.put("pageNumberList", pagenationDTO.getPageNumberList());
		session.put("productDTOList", pagenationDTO.getCurrentProductInfoPage());
		session.put("hasNextPage", pagenationDTO.isHasNextPage());
		session.put("hasPreviousPage", pagenationDTO.isHasPreviousPage());
		session.put("nextPageNo", pagenationDTO.getNextPageNo());
		session.put("previousPageNo", pagenationDTO.getPreviosPageNo());
		
		result = SUCCESS;
		
		
		return result;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(String itemPrice) {
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


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
	
	
	
	
	
	

}
