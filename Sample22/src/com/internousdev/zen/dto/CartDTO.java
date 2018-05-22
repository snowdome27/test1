package com.internousdev.zen.dto;

public class CartDTO {

	//product_infoテーブルからの情報一覧
	private int id;
	private int product_id;
	private String product_name;
	private String product_name_kana;
	private String product_description;
	private int category_id;
	private int price;
	private int stock;
	private String image_file_path;
	private String image_file_name;
	private String release_date;
	private String release_company;
	private String regist_date;
	private int product_total_price;

	//cart_infoテーブルからの情報一覧
	private String user_id;
	private int product_count;

	//ゲッター＆セッター
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_name_kana() {
		return product_name_kana;
	}
	public void setProduct_name_kana(String product_name_kana) {
		this.product_name_kana = product_name_kana;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImage_file_path() {
		return image_file_path;
	}
	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}
	public String getImage_file_name() {
		return image_file_name;
	}
	public void setImage_file_name(String image_file_name) {
		this.image_file_name = image_file_name;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getRelease_company() {
		return release_company;
	}
	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}
	public String getRegist_date() {
		return regist_date;
	}
	public void setRegist_date(String regist_date) {
		this.regist_date = regist_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public int getProduct_total_price() {
		return product_total_price;
	}
	public void setProduct_total_price(int product_total_price) {
		this.product_total_price = product_total_price;
	}
}
