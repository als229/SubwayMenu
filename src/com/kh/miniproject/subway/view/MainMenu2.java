package com.kh.miniproject.subway.view;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.miniproject.subway.controller.SandwichController2;

public class MainMenu2 {

	private Scanner sc = new Scanner(System.in);
	private SandwichController2 sub = new SandwichController2();
	private String name = "";
	int onePrice;
	int setPrice;
	int myCoin;
	boolean set;

	public void mainMenu() {

		System.out.print("안녕하세요 서브웨이 kh점입니다~\n" 
				+ "온도체크 후 QR인증 부탁드려요 ㅎㅎ\n" 
				+ "재료 소진으로 인해 1인당 1개만 주문 가능합니다.\n"
				+ "카드 잔액을 입력하세요. > ");
		myCoin = Integer.parseInt(sc.nextLine());
		wallet(myCoin);

		System.out.println();
		System.out.println("======== 서브웨이 메뉴판 ==========");
		set = choiceMenu();
		wallet(myCoin);
		// 메뉴에 따른 금액 차감을 wallet() 호출해서 하기?

		// 빵치즈 입력받기.
		cook();

		if (set) {
			System.out.println("\n주문하신 " + name + " 세트 나왔습니다.");
			System.out.println("\n" + sub.printMenu().toStringSet());
		} else {
			System.out.println("\n주문하신 " + name + " 단품 나왔습니다.");
			System.out.println("\n" + sub.printMenu());
		}
		System.out.println("맛있게 드세요~");
		System.out.println("\n귀하의 잔액은 " + wallet(myCoin) + "￦ 남았습니다.");
		System.exit(0);

		// 세트일 경우
		// choiceRest() 호출해서 쿠키랑 음료 받기

		// 객체 만들어주기

		// 다 만든 메뉴 출력하고 잔액 알려주고 종료.

	}

	public int wallet(int myCoin) {
		// 잔액 입력받기.
		// 잔액 확인 후 4000원 이하면 나가라고 하고 종료.
		// 4000원 이상이면 계속 진행

		if (myCoin < 4000) {
			System.out.println("4000원 이하는 나가주시죠 ㅋㅋ~~zzz");
			System.exit(0);
		}

		if (!(name.equals(""))) {
			// 메뉴 종류 비교
			// 해당 메뉴 [][]값 불러와서
			// partInteger 로 바꾼다음
			// 마이너스.
			boolean mumcho = false;
			for (int i = 0; i < sub.getMenuView().length; i++) {
				if (name.equals(sub.getMenuView()[i][0])) {
					mumcho = true;
					if (set) {
						setPrice = Integer.parseInt(sub.getMenuView()[i][2]);
						myCoin -= onePrice;
					} else {
						onePrice = Integer.parseInt(sub.getMenuView()[i][1]);
						myCoin -= setPrice;
					}
				}
			}
			if (!mumcho) {
				System.out.println("너 메뉴 잘못입력함~");
				System.exit(0);

			}

		}
		if (myCoin < 0) {
			System.out.println("잔액부족이십니다. 다른 카드 줘보세요");
			mainMenu();
		}

		// 메뉴를 고르면 메뉴가격만큼 차감.
		// 잔액 부족하면 다른 카드 받기
		// 안부족하면 계속 진행
		return myCoin;
	}

	public boolean choiceMenu() {
		// 메뉴판 보여주기
		// 메뉴 입력받고
//		System.out.println(Arrays.deepToString(sub.getMenuView()));
		for (int i = 0; i < sub.getMenuView().length; i++) {
			String[] menu = sub.getMenuView()[i];
			for (int j = 0; j < menu.length; j++) {
				System.out.print(menu[j] + " ");
			}
			System.out.println();
		}

		System.out.print("메뉴를 골라주세용 > ");
		name = sc.nextLine();
		System.out.print("\n세트로 변경하려면 \"네\"입력 : ");
		String setbool = sc.nextLine();

		boolean set = false;
		if (setbool.equals("네")) {
			set = true;
		}

		return set;

	}

	public void cook() {
		// 빵치즈 / 소스
		System.out.println("\n빵을 골라주세요.");
		System.out.println(Arrays.toString(sub.getBreadView()));
		System.out.println(">> ");
		String bread = sc.nextLine();

		System.out.println("\n치즈를 골라주세요.");
		System.out.println(Arrays.toString(sub.getCheeseView()));
		System.out.print(" >> ");
		String cheese = sc.nextLine();

		System.out.println("\n소스를 골라주세요. 3가지만 받겠습니다.");
		System.out.println(Arrays.toString(sub.getSauceView()));
		String sauce = "";
		for (int i = 0; i < 3; i++) {
			System.out.print(" >> ");
			sauce += sc.nextLine();
			sauce += " ";
		}

		if (set) {// 세트일때
			System.out.println("\n쿠키를 골라주세요.");
			System.out.println(Arrays.toString(sub.getCookieView()));
			System.out.print(" >> ");
			String cookie = sc.nextLine();
			System.out.println("\n음료를 골라주세요.");
			System.out.println(Arrays.toString(sub.getDrinkView()));
			System.out.print(" >> ");
			String drink = sc.nextLine();
			sub.insertMenu(name, setPrice, bread, cheese, excludeVegetables(), sauce, cookie, drink);
		} else {
			sub.insertMenu(name, onePrice, bread, cheese, excludeVegetables(), sauce);
			
		}
		// 쿠키/ 음료 보여주고 입력받기.
		// 쿠키랑 음료는 세트일때만.

	}

	public String excludeVegetables() {
		// 입력값을 배열에 넣고
		// 입력값과 야채배열의 값이 같을 경우 null로 바꾸고
		// 나머지 값을 출력

		System.out.println("\n제외할 야채를 골라주세요. 다먹을거면 엔터를 연타하세요.");
		System.out.println(Arrays.toString(sub.getVegetableView()));
		String vegetable = null;
		for (int i = 0; i < sub.getVegetableView().length; i++) {
			System.out.print(" >> ");
			vegetable = sc.nextLine();
			for (int j = 0; j < sub.getVegetableView().length; j++) {
				if (sub.getVegetableView()[j].equals(vegetable)) {
					sub.getVegetableView()[j] = "";
				}
			}
		}
		vegetable = "";

		for (int i1 = 0; i1 < sub.getVegetableView().length; i1++) {
			if (sub.getVegetableView()[i1] != "") {
				vegetable += sub.getVegetableView()[i1];
				vegetable += " ";
			}

		}
		return vegetable;
	}

}
