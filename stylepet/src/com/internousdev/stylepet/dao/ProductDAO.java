package com.internousdev.stylepet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.stylepet.dto.ProductDTO;
import com.internousdev.stylepet.util.DBConnector;

public class ProductDAO {


	public ArrayList<ProductDTO> getProductInfo()throws SQLException{
		
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();
			
			ArrayList<ProductDTO> product = new ArrayList<ProductDTO>();

			String sql = "select * from item_info_transaction";
			
			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					ProductDTO productDTO = new ProductDTO();

					productDTO.setItemName(rs.getString("item_name"));
					productDTO.setItemPrice(rs.getInt("item_price"));
					productDTO.setItemStock(rs.getInt("item_stock"));
					productDTO.setImageFilePath(rs.getString("image_file_path"));
					productDTO.setImageFileName(rs.getString("image_file_name"));
					productDTO.setInsertDate(rs.getString("insert_date"));
					productDTO.setUpdateDate(rs.getString("update_date"));
					
					product.add(productDTO);
				}
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}finally{
				
				con.close();
			}
			return product;
		}
	}
