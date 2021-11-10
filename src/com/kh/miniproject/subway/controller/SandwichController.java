package com.kh.miniproject.subway.controller;

import com.kh.miniproject.subway.model.vo.Sandwich;

public class SandwichController {
	
	private Sandwich sub = new Sandwich();   // Sandwich 객체를 만들어서 sub로 변수선언해 줬습니다.
	
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

}
