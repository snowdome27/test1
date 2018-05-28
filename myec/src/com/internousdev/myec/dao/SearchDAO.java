package com.internousdev.myec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.myec.dto.BuyItemDTO;
import com.internousdev.myec.util.DBConnector;


public class SearchDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	//情報格納のためのリスト
	private List<BuyItemDTO> searchList = new ArrayList<BuyItemDTO>();

	/**
	 * 検索メソッド。検索欄に入力された検索ワードを引数にとる
	 */

	public List<BuyItemDTO> getItemInfo(String searchWord){

		String sql = "SELECT * FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				String itemName = resultSet.getString("item_name");
				String itemPrice = resultSet.getString("item_price");
				String itemCategory = resultSet.getString("item_category");

				//DBにある商品名or価格orカテゴリと検索ワードが部分一致した
				//場合は結果をsearchListに格納する

				/**
				 * macthesメソッドの引数に渡しているのが、正規表現。
				 * matchesメソッドはその文字列と引数に渡された正規表現が
				 * 合致するかどうかを調べるメソッド。
				 */
				if(itemName.matches(".*"+ searchWord + ".*") || itemPrice.matches(".*" + searchWord + ".*") || itemCategory.matches(".*" + searchWord + ".*")){

					BuyItemDTO dto = new BuyItemDTO();

					dto.setId(resultSet.getInt("id"));
					dto.setItemName(itemName);
					dto.setItemPrice(resultSet.getInt("item_price"));
					dto.setItem_stock(resultSet.getInt("item_stock"));
					dto.setItem_category(itemCategory);
					dto.setImage_file_path(resultSet.getString("image_file_path"));
					dto.setItem_description(resultSet.getString("Item_description"));

					searchList.add(dto);

				}
			}
		}catch(Exception e){
			e.printStackTrace();

		}return searchList;
	}


	//getter
	public List<BuyItemDTO> getBuyItemDTO(){
		return searchList;
	}






}
