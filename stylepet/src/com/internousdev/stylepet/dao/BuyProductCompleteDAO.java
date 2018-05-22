package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.stylepet.util.DBConnector;
import com.internousdev.stylepet.util.DateUtil;


public class BuyProductCompleteDAO {
	
	
	
	public void buyPCD(String userName, String userAddress1, String userAddress2, String userAddress3, String userTell,String itemName, int itemPrice ,String imageFilePath
			) throws SQLException{
		
	DBConnector db = new DBConnector();
	
	Connection con = db.getConnection();
	
	DateUtil dateUtil = new DateUtil();
	
	String sql ="INSERT INTO user_buy_product_transaction (user_name,user_address1,user_address2,user_address3,user_tell,item_name,item_price,insert_date,image_file_path) VALUES(?,?, ? , ? , ? , ?, ? , ?, ?)";
	
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, userName);
		ps.setString(2, userAddress1);
		ps.setString(3, userAddress2);
		ps.setString(4, userAddress3);
		ps.setString(5, userTell);
		ps.setString(6,itemName);
		ps.setInt(7, itemPrice);
		ps.setString(8, dateUtil.getDate());
		ps.setString(9, imageFilePath);
		
		ps.execute();
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
		}		
		
	}
}

