package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.stylepet.dto.ProductDateDTO;
import com.internousdev.stylepet.util.DBConnector;

public class ProductDateDAO {

	public ProductDateDTO getProductInfo(String itemName) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ProductDateDTO productDateDTO = new ProductDateDTO();
		
		String sql = "select * from item_info_transaction where item_name=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			
			ResultSet rs = preparedStatement.executeQuery();

			if(rs.next()) {
				productDateDTO.setItemName(rs.getString("item_name"));
				productDateDTO.setItemPrice(rs.getInt("item_price"));
				productDateDTO.setImageFilePath(rs.getString("image_file_path"));
				productDateDTO.setImageFileName(rs.getString("image_file_name"));
				
				}
			} catch(Exception e) {
				
			e.printStackTrace();
		}
		try {
			
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			return productDateDTO;
	}

}
