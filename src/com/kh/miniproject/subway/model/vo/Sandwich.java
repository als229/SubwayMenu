package com.kh.miniproject.subway.model.vo;

public class Sandwich {  // 입력자가 입력한 값을 저장할 Sandwich 클래스 생성
	
	private String name;   // 입력값들을 필드에 private 로 변수 선언
	private int price;
	private String bread;
	private String cheese;
	private String vegetable;
	private String sauce;
	private String cookie;
	private String drink;
	
	
	public Sandwich() {   // 매개변수가 있는 생성자를 사용 할 것이기 때문에 기본생성자는 필수로 만들어줬습니다.
	}
	
	public Sandwich(String name, int price, String bread, String cheese, String vegetable, String sauce) {
		this.name = name;                // 단품세트를 받았을때 저장할 drink와 cookie 가 없는 생성자를 생성해줬습니다.
		this.price = price;
		this.bread = bread;
		this.cheese = cheese;
		this.vegetable = vegetable;
		this.sauce = sauce;
	}
	public Sandwich(String name, int price, String bread, String cheese, String vegetable, 
			String sauce, String cookie, String drink) { // 세트메뉴를 받았을때 사용할 생성자를 오버로딩으로 cookie와 drink가 있는 생성자를 생성해 줬습니다.
		this.name = name;
		this.price = price;
		this.bread = bread;
		this.cheese = cheese;
		this.vegetable = vegetable;
		this.sauce = sauce;
		this.cookie = cookie;
		this.drink = drink;
	}
	
	// get, set 메서드들을 만들어 줬습니다.
	
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
	public String toString() {	// toString 했을때 고객에게 보여줄 내용틀을 적어줬습니다.
		return "TMI 드리자면 이 "+name+"은 " +bread +"빵이고, "+cheese +"가 들어갔으며 "
				+ "야채는 "+ vegetable + " 넣어드렸구요,\n 소스는 " + sauce + "입니다.\n"
						+ "가격은 " + price +"원입니다 .ㅎ";
	}
	
	

}