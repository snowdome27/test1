package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.stylepet.dto.BuyHistoryDTO;
import com.internousdev.stylepet.util.DBConnector;

public class BuyHistoryDAO {
	
	public ArrayList<BuyHistoryDTO> getBuyHitoryInfo(String userName){
		
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		
		ArrayList<BuyHistoryDTO> buy = new ArrayList<BuyHistoryDTO>();
		
		String sql = "SELECT * FROM user_buy_product_transaction where user_name =?";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				BuyHistoryDTO buyH = new BuyHistoryDTO();
				
				buyH.setUserName(rs.getString("user_name"));
				buyH.setUserAddress1(rs.getString("user_address1"));
				buyH.setUserAddress2(rs.getString("user_address2"));
				buyH.setUserAddress3(rs.getString("user_address3"));
				buyH.setUserTell(rs.getString("user_tell"));
				buyH.setItemName(rs.getString("item_name"));
				buyH.setItemPrice(rs.getInt("item_price"));
				buyH.setImageFilePath(rs.getString("image_file_path"));
				buyH.setInsertDate(rs.getString("insert_date"));
				
				buy.add(buyH);
							
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
	return buy ;
	}
	
	
	
	
	
	public int buyHistoryDelete(String userName) throws SQLException{
		
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql = "DELETE FROM user_buy_product_transaction WHERE user_name=?";
		
		PreparedStatement ps;
		
		int result = 0;
			try{
				ps  = con.prepareStatement(sql);
				ps.setString(1, userName);
				
				result = ps.executeUpdate();
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}finally{
				
				con.close();
			}
		return result;
		
	}

}
