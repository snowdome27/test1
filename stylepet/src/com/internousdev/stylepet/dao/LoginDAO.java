package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.stylepet.dto.LoginDTO;
import com.internousdev.stylepet.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginId,String loginPass){

		String sql="SELECT*FROM login_user_transaction where login_id = ? AND login_pass =?";

		try {

			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, loginPass);

			ResultSet resultSet = preparedStatement.executeQuery();

				if(resultSet.next()) {
						loginDTO.setLoginId(resultSet.getString("login_id"));
						loginDTO.setLoginPassword(resultSet.getString("login_pass"));
						loginDTO.setUserName(resultSet.getString("user_name"));
						loginDTO.setUserAddress1(resultSet.getString("user_address1"));
						loginDTO.setUserAddress2(resultSet.getString("user_address2"));
						loginDTO.setUserAddress3(resultSet.getString("user_address3"));
						loginDTO.setUserSex(resultSet.getString("user_sex"));
						loginDTO.setUserTell(resultSet.getString("user_tell"));

				if(!(resultSet.getString("login_id").equals(null))) {
						loginDTO.setLoginFlg(true);
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
		}
			return loginDTO;

	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
		}
	}


