package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.stylepet.dto.UserUpDateCompleteDTO;
import com.internousdev.stylepet.util.DBConnector;
import com.internousdev.stylepet.util.DateUtil;


public class UserUpDateCompleteDAO {
	
	public boolean userUpdateInfo(String login_id, String login_pass, String user_name, String user_address, String user_sex, String user_tell, String user_mail, String defaultLoginId) throws SQLException{
		
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;
		DateUtil dateUtil = new DateUtil();
		
		UserUpDateCompleteDTO updateDTO = new UserUpDateCompleteDTO();
		
		String sql = "UPDATE login_user_transaction SET login_id=?,login_pass =?, user_name=?, user_address =?, user_sex=?, user_tell=?, user_mail=?, update_date =? WHERE id=?";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, login_id);
			ps.setString(2, login_pass);
			ps.setString(3, user_name);
			ps.setString(4, user_address);
			ps.setString(5, user_sex);
			ps.setString(6, user_tell);
			ps.setString(7, user_mail);
			ps.setString(8, dateUtil.getDate());
			ps.setString(9, defaultLoginId);

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
		return result;		
		
	}

}