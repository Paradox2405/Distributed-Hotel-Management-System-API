package com.comsats.restauto.entity;

import java.util.ArrayList;

public class Category {
	public Integer catId;
	public String catName;
	public String catStatus;
	public String catImage;
	public ArrayList<Category> list = new ArrayList<Category>();
	

public Category(){
		
	}
	
	public Category(Integer catId, String catName,String catImage, String catStatus){
		setCatId(catId);
		setCatName(catName);
		setCatStatus(catStatus);
		setCatImage(catImage);
	}
	
	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public ArrayList<Category> getList() {
		return list;
	}

	public void setList(ArrayList<Category> list) {
		this.list = list;
	}
	
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatStatus() {
		return catStatus;
	}
	public void setCatStatus(String catStatus) {
		this.catStatus = catStatus;
	}

	public String getCatImage() {
		return catImage;
	}

	public void setCatImage(String catImage) {
		this.catImage = catImage;
	}


}
