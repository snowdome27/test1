package com.internousdev.stylepet.util;


import java.util.ArrayList;
import java.util.List;

import com.internousdev.stylepet.dto.PagenationDTO;
import com.internousdev.stylepet.dto.ProductDTO;

public class Pagenation {
	
	
	
	
	
	
	public ArrayList<ArrayList<ProductDTO>>pagenate_old(List<ProductDTO>productDTOList,int pageNumber){
		
		
		int erementNumber = 0;
		
		ArrayList<ArrayList<ProductDTO>>list = new ArrayList<>();
		list.add(new ArrayList<ProductDTO>());
		
		for(int page = 1; page<=productDTOList.size();page++){
			list.get(erementNumber).add(productDTOList.get(page -1));
				
			if(page % 6 == 0 && page !=0){
				erementNumber++;
				list.add(new ArrayList<ProductDTO>());
			}
		}
		System.out.println(list);
		return null;
		
	}
	
	
	
	
	
	
	public PagenationDTO initialize(List<ProductDTO>list,int pageSize){
		
		int pages = 0;
		
		int records = 0;
		
		PagenationDTO pagenationDTO = new PagenationDTO();
		
			pagenationDTO.setTotalPageSize((int)(Math.ceil(list.size()/pageSize)));
			
			pagenationDTO.setCurrentPageNo(1);
			
			pagenationDTO.setTotalRecordNo((pageSize * pagenationDTO.getCurrentPageNo()+1));
			
			pagenationDTO.setEndRecordNo(pagenationDTO.getStartRecordSize()+(pageSize -1));
			
			
		List<Integer> pageNumberList = new ArrayList<Integer>();
			
			for(int pageNumber = 1; pageNumber <= pagenationDTO.getTotalPageSize(); pageNumber++){
				
				pageNumberList.add(pageNumber);
			}
			
			
		List<ProductDTO> puroductInfoPage =new ArrayList<ProductDTO>();
			for(int pageNumberOffset= pagenationDTO.getStartRecordNo();pageNumberOffset<= pagenationDTO.getEndRecordNo();pageNumberOffset++){
				
				puroductInfoPage.add(list.get(pageNumberOffset));
				
			}
			
		pagenationDTO.setCurrentProductInfoPage(puroductInfoPage);
		
			if((pagenationDTO.getStartRecordNo()-1)<=0){
				
				pagenationDTO.setHasPreviousPage(false);
					
				}else{
					pagenationDTO.setHasPreviousPage(true);
					pagenationDTO.setNextPageNo(pagenationDTO.getCurrentPageNo()+1);
				}
		
		return pagenationDTO;
	}
	
	
	
	
	
	
	public PagenationDTO getPage(List<ProductDTO> list,int pageSize, String pageNO){
		
		int pages = 0;
		int records = 0;
		
		PagenationDTO pagenation = new PagenationDTO();
		
			pagenation.setTotalPageSize((int)(Math.ceil(list.size()/pageSize)));
			
			pagenation.setCurrentPageNo(Integer.parseInt(pageNO));
			
			pagenation.setTotalPageSize(list.size()-1);
			
			pagenation.setStartRecordNo(pageSize*(pagenation.getCurrentPageNo()-1));
			
			pagenation.setStartRecordNo((pageSize*pagenation.getCurrentPageNo()+1));
			
			pagenation.setEndRecordNo(pagenation.getStartRecordNo()+(pageSize -1));
			
			
			List<Integer> pageNumberList = new ArrayList<Integer>();
				
				for(int pageNumber = Integer.parseInt(pageNO); pageNumber<= pagenation.getTotalPageSize(); pageNumber++){
					
					for(int pageNumber1= 1; pageNumber1 <= pagenation.getTotalPageSize();pageNumber1++){
						pageNumberList.add(pageNumber1);
					}
				}
				
			
			List<ProductDTO> productInfoPage = new ArrayList<ProductDTO>();
				
				for(int pageNumberOffset = pagenation.getStartRecordNo();pageNumberOffset<=pagenation.getEndRecordNo();pageNumberOffset++){
					productInfoPage.add(list.get(pageNumberOffset));
								
				}
				
				
			pagenation.setCurrentProductInfoPage(productInfoPage);
			
				if((pagenation.getStartRecordNo()-1)<=0){
					pagenation.setHasPreviousPage(false);
				}else{
					pagenation.setHasPreviousPage(true);
					pagenation.setPreviosPageNo(pagenation.getCurrentPageNo()-1);
					
					if(pagenation.getEndRecordNo() + pageSize > pagenation.getStartRecordSize()){
						pagenation.setHasNextPage(false);
					}else{
						pagenation.setHasNextPage(true);
						pagenation.setNextPageNo(pagenation.getCurrentPageNo()+1);
					}
					
				}
				return pagenation;
	}

}