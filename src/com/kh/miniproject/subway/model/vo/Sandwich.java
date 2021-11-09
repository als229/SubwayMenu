package com.kh.miniproject.subway.model.vo;

public class Sandwich {
	
	private String name;
	private int price;
	private String bread;
	private String cheese;
	private String vegetable;
	private String sauce;
	private String cookie;
	private String drink;
	
	
	public Sandwich() {
	}
	
	public Sandwich(String name, int price, String bread, String cheese, String vegetable, String sauce) {
		this.name = name;
		this.price = price;
		this.bread = bread;
		this.cheese = cheese;
		this.vegetable = vegetable;
		this.sauce = sauce;
	}
	public Sandwich(String name, int price, String bread, String cheese, String vegetable, 
			String sauce, String cookie, String drink) {
		this.name = name;
		this.price = price;
		this.bread = bread;
		this.cheese = cheese;
		this.vegetable = vegetable;
		this.sauce = sauce;
		this.cookie = cookie;
		this.drink = drink;
	}
	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public String getVegetable() {
		return vegetable;
	}
	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	@Override
	public String toString() {	
		return "TMI 드리자면 이 "+name+"은 " +bread +"빵이고, "+cheese +"가 들어갔으며 "
				+ "야채는 "+ vegetable + " 넣어드렸구요,\n 소스는 " + sauce + "입니다.\n"
						+ "가격은 " + price +"원입니다 .ㅎ";
	}
	
	

}