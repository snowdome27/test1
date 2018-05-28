package com.internousdev.myec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.myec.dto.BuyItemDTO;
import com.internousdev.myec.util.DBConnector;


public class BuyItemDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	/**
	 * 商品情報取得メソッド
	 */

	public List<BuyItemDTO> getBuyItemInfo() {

		String sql = "SELECT id, item_name, item_price, item_stock, item_category, item_description, image_file_path FROM item_info_transaction";

		//DBから取得した値をBuyItemDTOの変数に格納
		//BuyItemDTOに格納した値をBuyItemDTOListに格納

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {

				BuyItemDTO dto = new BuyItemDTO();

				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getInt("item_price"));
				dto.setItem_stock(resultSet.getInt("item_stock"));
				dto.setItem_category(resultSet.getString("item_category"));
				dto.setItem_description(resultSet.getString("item_description"));
				dto.setImage_file_path(resultSet.getString("image_file_path"));

				buyItemDTOList.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return buyItemDTOList;
	}

	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}
}