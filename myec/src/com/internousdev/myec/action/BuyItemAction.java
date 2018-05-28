package com.internousdev.myec.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.myec.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	private ArrayList<BuyItemDTO> buyItemDTOList = new ArrayList<>();

	//count=購入個数（複数購入の可能性があるのでList(String)型の変数）
	private List<String> count;

	private String pay;

	private String buyItemErrorMessage;

	public Map<String, Object>  session;


	/**
	 * 実行メソッド（商品一覧に載せる商品情報の取得）
	 */

	public String execute() {

		String result = SUCCESS;

		session.put("count", count);

		//LoginActionで保管したbuyItemDTOListの値を使用する
		//→"buyItemDTOList"から保管されている値をgetで取得してlistに保管

		@SuppressWarnings("unchecked")
		List<BuyItemDTO> list = (List<BuyItemDTO>) session.get("buyItemDTOList");

		/**
		 * 合計金額を計算する処理（購入数の分だけループ処理）
		 */

		for(int i=0; i<count.size(); i++){

			BuyItemDTO buyItemDTO = new BuyItemDTO();

			String buyItemName = list.get(i).getItemName();
			session.put("itemName",buyItemName);

			int buyItemPrice = list.get(i).getItemPrice();
			session.put("itemPrice",buyItemPrice);

			int buyItemId = list.get(i).getId();
			session.put("id",buyItemId);

			int item_stock = list.get(i).getItem_stock();


			String image_file_path =  list.get(i).getImage_file_path();

			String item_description = list.get(i).getItem_description();


			//countはList型変数なのでget(i)で取得してint型に変換
			int intCount = Integer.parseInt(count.get(i));
			int intPrice = list.get(i).getItemPrice();

			//購入数が0でなければ実行
			if(intCount != 0){

				//ここの"id"はbuyItemIdが入っている
				//buyItemIdは、Object型なのでint型にキャスト
				buyItemDTO.setId((int) session.get("id"));

				//ここの"itemName"はbuyItemNameが入っている
				//buyItemNameは、Object型なのでString型にキャスト
				buyItemDTO.setItemName(session.get("itemName").toString());

				buyItemDTO.setItemPrice((int) session.get("itemPrice"));

				buyItemDTO.setCount(intCount);

				buyItemDTO.setItem_stock(item_stock);

				buyItemDTO.setImage_file_path(image_file_path);

				buyItemDTO.setItem_description(item_description);

				//購入個数×金額の結果をbuyItemDTOに格納
				//"total_price"にも格納して他で使えるようにする
				buyItemDTO.setTotal_price(intCount * intPrice);
				session.put("total_price",intCount* intPrice);

				/**
				 * 合計額の計算はここで終わり
				 * 以下、支払い方法の選択処理
				 */


		String payment;

		if(pay.equals("1")) {

			payment = "現金払い";
			session.put("pay", payment);
			buyItemDTO.setPay(payment);

		} else{

			payment = "クレジットカード";
			session.put("pay", payment);
			buyItemDTO.setPay(payment);
		}

		buyItemDTOList.add(buyItemDTO);

		}

		session.put("list",buyItemDTOList);

		}//←ここで繰り返し終わり



		/**
		 * 複数購入した時の合計額を取得
		 * listにデータを格納した回数分(購入した数分）
		 * total_priceを取得して加算するループ処理
		 */

		if(buyItemDTOList.size()>1){

			int totalPrice = 0;
			for(int a = 0; a < buyItemDTOList.size(); a++){

				totalPrice = totalPrice + buyItemDTOList.get(a).getTotal_price();

			}

			System.out.println(totalPrice);
			session.put("totalPrice",totalPrice);

		}

		if(buyItemDTOList.size() ==0){
				buyItemErrorMessage = "商品を選択してください。";
				result = ERROR;
			}

		return result;

}

	public ArrayList<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(ArrayList<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	public List<String> getCount() {
		return count;
	}

	public void setCount(List<String> count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getBuyItemErrorMessage() {
		return buyItemErrorMessage;
	}

	public void setBuyItemErrorMessage(String buyItemErrorMessage) {
		this.buyItemErrorMessage = buyItemErrorMessage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

