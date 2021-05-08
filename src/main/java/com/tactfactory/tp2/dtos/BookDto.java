package com.tactfactory.tp2.dtos;

public class BookDto {

	private String title;
	private int NbPage;
	private float Price;
	
	private Long userId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNbPage() {
		return NbPage;
	}

	public void setNbPage(int nbPage) {
		NbPage = nbPage;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
