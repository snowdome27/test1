package com.internousdev.myec.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.myec.dao.SearchDAO;
import com.internousdev.myec.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport implements SessionAware{

	//検索ワード
	private String searchWord;

	//検索結果の表示メッセージ
	private String searchMessage;

	public Map<String,Object> session;

	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	private SearchDAO searchDAO = new SearchDAO();


	/**
	 * 実行メソッド
	 */

	@SuppressWarnings("unchecked")
	public String execute(){

		String result;

		//①ログイン済
		if(session.containsKey("id")){

		//検索欄に文字が入っていない時はerrorを返す
		if(searchWord.equals("")){

			result = ERROR;
			buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");
			setSearchMessage("該当する商品は見つかりませんでした。");

		}else{

			//ワードを入力した時
			//検索結果をbuyItemDTOListに格納
			buyItemDTOList = searchDAO.getItemInfo(searchWord);

			//検索結果があった時の処理
			//検索結果の数をString型に変換して表示
			if(buyItemDTOList.size() > 0){

				session.put("buyItemDTOList", buyItemDTOList);

				int a = buyItemDTOList.size();

				String number = Integer.toString(a);

				setSearchMessage(number + "件の商品が見つかりました。");

				result = SUCCESS;

			//検索結果が見つからなかった時の処理
			}else{

				result = ERROR;

				buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");

				setSearchMessage("該当する商品は見つかりませんでした。");

			}
		}


		//②管理者IDを持っている時
		if(session.containsKey("masterId")){

			//検索欄に文字が入っていない時はerrorを返す
			if(searchWord.equals("")){

				result = ERROR;

				buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");

				setSearchMessage("該当する商品は見つかりませんでした。");

			}else{

				//ワードを入力した時
				//検索結果をbuyItemDTOListに格納
				buyItemDTOList = searchDAO.getItemInfo(searchWord);

				//検索結果があった時の処理
				//検索結果の数をString型に変換して表示
				if(buyItemDTOList.size() > 0){

					session.put("buyItemDTOList", buyItemDTOList);

					int a = buyItemDTOList.size();

					String number = Integer.toString(a);

					setSearchMessage(number + "件の商品が見つかりました。");

					result = SUCCESS;

				//検索結果が見つからなかった時の処理
				}else{

					result = ERROR;

					buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");

					setSearchMessage("該当する商品は見つかりませんでした。");

				}
			}
		}

		}else{
			//③ログインしていない時

			//検索欄に文字が入っていない時はerrorを返す
			if(searchWord.equals("")){

				result = "logoffError";

				buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");

				setSearchMessage("該当する商品は見つかりませんでした。");

			}else{

				//ワードを入力した時
				//検索結果をbuyItemDTOListに格納
				buyItemDTOList = searchDAO.getItemInfo(searchWord);

				//検索結果があった時の処理
				//検索結果の数をString型に変換して表示
				if(buyItemDTOList.size() > 0){

					session.put("buyItemDTOList", buyItemDTOList);

					int a = buyItemDTOList.size();

					String number = Integer.toString(a);

					setSearchMessage(number + "件の商品が見つかりました。");

					result = "logoffSuccess";

				//検索結果が見つからなかった時の処理
				}else{

					result = "logoffError";

					buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");

					setSearchMessage("該当する商品は見つかりませんでした。");

				}
			}
		}

		session.put("list",  buyItemDTOList);

		return result;
	}


	public String getSearchWord() {
		return searchWord;
	}


	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}


	public String getSearchMessage() {
		return searchMessage;
	}


	public void setSearchMessage(String searchMessage) {
		this.searchMessage = searchMessage;
	}


	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}


	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}


}
