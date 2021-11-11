package com.kh.miniproject.subway.model.vo;

public class Sandwich2 {
	
	// 필드부

	private String name;		// 샌드위치 종류
	private int price;			// 샌드위치 가격
	private String bread;		// 샌드위치 빵종류
	private String cheese;		// 샌드위치 치즈종류
	private String vegetable;	// 샌드위치 야채종류
	private String sauce;		// 샌드위치 소스종류
	private String cookie;		// 샌드위치 쿠키종류
	private String drink;		// 샌드위치 음료종류
	
	
	// 생성자부
	
	public Sandwich2() {		// 기본생성자
	}
	
	// 단품일 경우 매개변수 6개 받는 생성자
	public Sandwich2(String name, int price, String bread, String cheese, String vegetable, String sauce) {
		this.name = name;
		this.price = price;
		this.bread = bread;
		this.cheese = cheese;
		this.vegetable = vegetable;
		this.sauce = sauce;
	}
	
	// 세트일 경우 매개변수 8개 받는 생성자
	public Sandwich2(String name, int price, String bread, String cheese, String vegetable, 
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
	
	
	// 메소드부
	
	// 필드의 게터와 세터들
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
	public String toString() {	// 주문한 메뉴의 설명을 반환해주는 오버라이딩 메소드 (단품)
		return "TMI 드리자면 이 "+name+" 단품은 " +bread +"빵이고, "+cheese +"가 들어갔습니다.\n"
				+ "야채는 "+ vegetable + " 넣어드렸구요,\n 소스는 " + sauce + "입니다.\n"
						+ "가격은 " + price +"원입니다 .ㅎ";
	}
	
	public String toStringSet() {	// 주문한 메뉴의 설명을 반환해주는 메소드 (세트)
		return "TMI 드리자면 이 "+name+" 세트는 " +bread +"빵이고, "+cheese +"가 들어갔습니다.\n"
				+ "야채는 "+ vegetable + " 넣어드렸구요,\n소스는 " + sauce + "입니다.\n"
				+ "쿠키는 " + cookie + ", 음료는 " + drink + ", 가격은 " + price +"원입니다 .ㅎ";
	}
	
	
	

}

