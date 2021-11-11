package com.kh.miniproject.subway.controller;

import java.util.Scanner;

import com.kh.miniproject.subway.model.vo.Sandwich;

public class SandwichController {
	
	
		private Scanner sc = new Scanner(System.in); // Scanner 를 사용하기 위해 객체생성
		private String[] menuView = { "햄 : 4800/6600", "아보카도 섭도그 : 5900/7900", "풀드포크 : 6000/7700", "쉬림프 : 5900/8100",        
				"에그마요 4300/6000" };
		private String[] breadView = { "화이트", "위트", "플랫브레드", "파마산오레가노", "허니오트", "하티" };
		private String[] cheeseView = { "아메리칸치즈", "슈레드치즈", "모짜렐라치즈" };
		private String[] vegetableView = { "양상추", "토마토", "오이", "피망", "양파", "피클", "올리브", "할라피뇨" };
		private String[] sauceView = { "마요네즈", "스위트어니언", "스위트칠리", "허니머스타드", "핫칠리", "랜치", "사우스웨스트치폴레", "홀스래디쉬", "올리브오일",
				"후추", "레드와인식초", "소금", "스모크바비큐" };
		private String[] drinkView = { "코카콜라", "코카콜라제로", "스프라이트", "닥터페퍼" };
		private String[] cookieView = { "초코칩", "라즈베리", "오트밀레이즌", "화이트마카다미아", "더블초코칩" };
		
	
	
	
	
	private Sandwich sub = new Sandwich();   // Sandwich 객체를 만들어서 sub로 변수선언해 줬습니다.
	
	
	
	
	
	
	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String[] getMenuView() {
		return menuView;
	}

	public void setMenuView(String[] menuView) {
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


	public void setSub(Sandwich sub) {
		this.sub = sub;
	}

	public void insertMenu(String name, int price, String bread, String cheese, String vegetable, 
			String sauce) {  // insertMenu 를 호출하고 매개변수에 값을 입력하면 
							// Sandwich 타입의 변수 sub에 바로 저장하면서 초기화하여 저장하게 해줬습니다.
		sub = new Sandwich(name, price, bread, cheese, vegetable, sauce);
	}
	
	public void insertMenu(String name, int price, String bread, String cheese, String vegetable, 
			String sauce, String cookie, String drink) {  // 세트 메뉴를 받았을때 사용할 insertMenu를 오버로딩으로 생성해 줬습니다.
 			
		sub = new Sandwich(name, price, bread, cheese, vegetable, sauce, cookie, drink);
	}
	
	public Sandwich printMenu() {
		return sub;  // printMenu 메서드를 호출하면 초기화된 Sandwich 객체가 저장된 sub 변수를 반환해 줍니다.
	}

	
	public void choiceMnue() {
		
	}
	
	
	
	
}
