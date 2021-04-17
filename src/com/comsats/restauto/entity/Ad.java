package com.comsats.restauto.entity;

import java.util.ArrayList;

public class Ad {

	private Integer adId;
	private String adName;
	private String adDescription;
	private String bannerName;
	private String status;
	public ArrayList<Ad> list = new ArrayList<Ad>();

	public ArrayList<Ad> getList() {
		return list;
	}

	public void setList(ArrayList<Ad> list) {
		this.list = list;
	}

	public Ad(){
		
	}
	
	public Ad(Integer adId, String adName,String adImage,String adDescription, String adStatus){
		setAdId(adId);
		setAdName(adName);
		setBannerName(adImage);
		setAdDescription(adDescription);
		setStatus(adStatus);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Integer getAdId() {
		return adId;
	}
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdDescription() {
		return adDescription;
	}
	public void setAdDescription(String adDescription) {
		this.adDescription = adDescription;
	}
	public String getBannerName() {
		return bannerName;
	}
	public void setBannerName(String bannerName) {
		this.bannerName = bannerName;
	}
	
	
}
