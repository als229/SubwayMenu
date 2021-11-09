package com.kh.miniproject.subway.controller;

import com.kh.miniproject.subway.model.vo.Sandwich;

public class SandwichController {
	
	private Sandwich sub = new Sandwich();
	
	public void insertMenu(String name, int price, String bread, String cheese, String vegetable, 
			String sauce) {
		
		sub = new Sandwich(name, price, bread, cheese, vegetable, sauce);
	}
	
	public void insertMenu(String name, int price, String bread, String cheese, String vegetable, 
			String sauce, String cookie, String drink) {
		
		sub = new Sandwich(name, price, bread, cheese, vegetable, sauce, cookie, drink);
	}
	
	public Sandwich printMenu() {
		return sub;
	}

}
