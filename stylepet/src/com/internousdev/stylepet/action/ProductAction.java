package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.ProductDAO;
import com.internousdev.stylepet.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;


	
public class ProductAction extends ActionSupport implements SessionAware{
		
private String itemName;
	
	private String itemFilePath;
	
	private String itemPrice;
	
	private String itemFileName;
	
	private String insertDate;
	
	private String updateDate;
		
		public Map<String, Object> session;
		
		private ProductDAO productDAO = new ProductDAO();
		private ProductDTO productDTO = new ProductDTO();
		
		
		
		public String execute() throws SQLException{
			
	List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
			
			
			productDTOList = productDAO.getProductInfo();
			
			session.put("ProductDTOList", productDTOList);
			
			return SUCCESS;
		}
			
		
		
		

		public String getItemName() {
			return itemName;
		}





		public void setItemName(String itemName) {
			this.itemName = itemName;
		}





		public String getItemFilePath() {
			return itemFilePath;
		}





		public void setItemFilePath(String itemFilePath) {
			this.itemFilePath = itemFilePath;
		}





		public String getItemPrice() {
			return itemPrice;
		}





		public void setItemPrice(String itemPrice) {
			this.itemPrice = itemPrice;
		}





		public String getItemFileName() {
			return itemFileName;
		}





		public void setItemFileName(String itemFileName) {
			this.itemFileName = itemFileName;
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





		public ProductDAO getProductDAO() {
			return productDAO;
		}





		public void setProductDAO(ProductDAO productDAO) {
			this.productDAO = productDAO;
		}





		public ProductDTO getProductDTO() {
			return productDTO;
		}





		public void setProductDTO(ProductDTO productDTO) {
			this.productDTO = productDTO;
		}





		@Override

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

	}


