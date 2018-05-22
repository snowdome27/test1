package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.stylepet.dto.BuyHistoryDTO;
import com.internousdev.stylepet.util.DBConnector;

public class BuyHistoryDAO {
	
	public BuyHistoryDTO getBuyHitoryInfo(String userName){
		
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		BuyHistoryDTO buyH = new BuyHistoryDTO();
		
		String sql = "SELECT * FROM user_buy_product_transaction login_id = ? AND login_pass = ? AND user_name =?";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				buyH.setLoginId(rs.getString("login_id"));
				buyH.setLoginPass(rs.getString("login_pass"));
				buyH.setUserName(rs.getString("user_name"));
				buyH.setUserAddress1(rs.getString("user_address1"));
				buyH.setUserAddress2(rs.getString("user_address2"));
				buyH.setUserAddress3(rs.getString("user_address3"));
				buyH.setUserTell(rs.getString("user_tell"));
				buyH.setItemName(rs.getString("item_name"));
				buyH.setItemPrice(rs.getInt("item_price"));
				buyH.setImageFilePath(rs.getString("image_file_path"));
				buyH.setInsertDate(rs.getString("insert_date"));
							
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
	}finally{
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return buyH;
	}

}
