package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.stylepet.dto.BuyProductDTO;
import com.internousdev.stylepet.util.DBConnector;
import java.sql.PreparedStatement;

public class BuyProductDAO {
	
	public ArrayList<BuyProductDTO> getProductInfo() throws SQLException{
		
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		ArrayList<BuyProductDTO> buyProductDTO = new ArrayList<BuyProductDTO>();
		
		String sql = "SELECT * FROM login_user_transaction";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				BuyProductDTO bpDTO = new BuyProductDTO();
				
				bpDTO.setLoginId(rs.getString("login_id"));
				bpDTO.setUserName(rs.getString("user_name"));
				bpDTO.setUserAddress1(rs.getString("user_address1"));
				bpDTO.setUserAddress2(rs.getString("user_address2"));
				bpDTO.setUserAddress3(rs.getString("user_address3"));
				bpDTO.setUserTell(rs.getString("user_tell"));
				
				buyProductDTO.add(bpDTO);
							
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return buyProductDTO;
	}
	

}

