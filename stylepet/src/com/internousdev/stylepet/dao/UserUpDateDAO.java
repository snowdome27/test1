package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.stylepet.dto.UserUpDateDTO;
import com.internousdev.stylepet.util.DBConnector;


public class UserUpDateDAO {
	
	public UserUpDateDTO getUserUpDate(String loginId,String loginPass) throws SQLException{
		
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		UserUpDateDTO updateDTO = new UserUpDateDTO();
		
		String sql = "UPDETE * FROM login_user_transaction WHERE login_id = ? AND login_pass";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, loginId);
			ps.setString(2, loginPass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				updateDTO.setLoginId(rs.getString("login_id"));
				updateDTO.setLoginPass(rs.getString("login_pass"));
				updateDTO.setUserName(rs.getString("user_name"));
				updateDTO.setUserAddress(rs.getString("user_address"));
				updateDTO.setUserAddress1(rs.getString("user_address1"));
				updateDTO.setUserAddress2(rs.getString("user_address2"));
				updateDTO.setUserAddress3(rs.getString("user_address3"));
				updateDTO.setUserSex(rs.getString("user_sex"));
				updateDTO.setUserTell(rs.getString("user_tell"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return updateDTO;		
		
	}

}
