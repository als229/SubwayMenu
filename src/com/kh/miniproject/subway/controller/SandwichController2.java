package com.kh.miniproject.subway.controller;

import com.kh.miniproject.subway.model.vo.Sandwich2;

public class SandwichController2 {	// 메뉴의 세부 종류들을 갖고 있고 반환 및 객체 생성을 하는 controller
	
	//필드부
	
	// 메뉴 종류 다차원배열
	private String[][] menuView = { {"햄", "4800", "6600"}, {"아보카도 섭도그", "5900", "7900"},
			{"폴드포크", "6000", "7700"}, {"쉬림프", "5900", "8100"}, {"에그마요", "4300", "6000"} };
	// 빵 종류 배열
	private String[] breadView = {"화이트",  "위트", "플랫브레드", "파마산 오레가노", "허니오트", "하티"};
	// 치즈 종류 배열
	private String[] cheeseView = {"아메리칸치즈", "슈레드치즈", "모짜렐라치즈"};
	// 야채 종류 배열
	private String[] vegetableView = { "양상추", "토마토", "오이", "피망", "양파", "피클", "올리브", "할라피뇨"};
	// 소스 종류 배열
	private String[] sauceView = {"마요네즈", "스위트어니언","스위트칠리","허니머스타드","핫칠리","랜치","사우스웨스트치폴레"
									,"홀스래디쉬", "올리브오일","후추","레드와인식초","소금","스모크바비큐"};
	// 쿠키 종류 배열
	private String[] cookieView = {"초코칩", "라즈베리", "오트밀레이즌","화이트마카다미아","더블초코칩"};
	// 음료 종류 배열
	private String[] drinkView = {"코카콜라","코카콜라제로", "스프라이트", "닥터페퍼"};
	// Sandwich2 타입 인스턴스 sub 생성
	private Sandwich2 sub = new Sandwich2();

	
	// 메소드부
	
	// 단품 메뉴의 정보를 입력받아 Sand
	public void insertMenu(String name, int price, String bread, String cheese,
			String vegetable, String sauce) {
		sub = new Sandwich2(name, price, bread, cheese, vegetable, sauce);
	}

	public void insertMenu(String name, int price, String bread, String cheese, String vegetable, String sauce,
			String cookie, String drink) {

		sub = new Sandwich2(name, price, bread, cheese, vegetable, sauce, cookie, drink);
	}

	public String[][] getMenuView() {
		return menuView;
	}

	public void setMenuView(String[][] menuView) {
		this.menuView = menuView;
	}

	public String[] getBreadView() {
		return breadView;
	}

	public void setBreadView(String[] breadView) {
		this.breadView = breadView;
	}

	public String[] getCheeseView() {
		return cheeseView;
	}

	public void setCheeseView(String[] cheeseView) {
		this.cheeseView = cheeseView;
	}

	public String[] getVegetableView() {
		return vegetableView;
	}

	public void setVegetableView(String[] vegetableView) {
		this.vegetableView = vegetableView;
	}

	public String[] getSauceView() {
		return sauceView;
	}

	public void setSauceView(String[] sauceView) {
		this.sauceView = sauceView;
	}

	public String[] getDrinkView() {
		return drinkView;
	}

	public void setDrinkView(String[] drinkView) {
		this.drinkView = drinkView;
	}

	public String[] getCookieView() {
		return cookieView;
	}

	public void setCookieView(String[] cookieView) {
		this.cookieView = cookieView;
	}

	public Sandwich2 getSub() {
		return sub;
	}

	public void setSub(Sandwich2 sub) {
		this.sub = sub;
	}

	public Sandwich2 printMenu() {
		return sub;
	}
}

