package com.internousdev.stylepet.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.stylepet.dao.ProductDAO;
import com.internousdev.stylepet.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;


public class GoHomeAction extends ActionSupport implements SessionAware {


	public Map<String, Object> session;


	public String execute() throws SQLException{
		
		ProductDAO productDAO= new ProductDAO();
		ProductDTO productDTO= new ProductDTO();
		
		List<ProductDTO> ptList = new ArrayList<ProductDTO>();
		
		ptList= productDAO.getProductInfo();
		
		ptList.add(productDTO);
		

			return SUCCESS;

		}

	public Map<String, Object> getSession() {

		return this.session;
	}


	@Override

	public void setSession(Map<String, Object> session) {

		this.session = session;
	}
}