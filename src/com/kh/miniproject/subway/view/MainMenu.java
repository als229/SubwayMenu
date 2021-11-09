package com.kh.miniproject.subway.view;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.miniproject.subway.controller.SandwichController;

public class MainMenu {

	private Scanner sc = new Scanner(System.in);
	private SandwichController sub = new SandwichController();

	private String[] menuView = { "햄 : 4800/6600", "아보카도 섭도그 : 5900/7900", "풀드포크 : 6000/7700", "쉬림프 : 5900/8100",
			"에그마요 4300/6000" };
	private String[] breadView = { "화이트", "위트", "플랫브레드", "파마산오레가노", "허니오트", "하티" };
	private String[] cheeseView = { "아메리칸치즈", "슈레드치즈", "모짜렐라치즈" };
	private String[] vegetableView = { "양상추", "토마토", "오이", "피망", "양파", "피클", "올리브", "할라피뇨" };
	private String[] sauceView = { "마요네즈", "스위트어니언", "스위트칠리", "허니머스타드", "핫칠리", "랜치", "사우스웨스트치폴레", "홀스래디쉬", "올리브오일",
			"후추", "레드와인식초", "소금", "스모크바비큐" };
//	String[] topingView = {"에그마요 : 1600", "페퍼로니 : 900" , "베이컨 : 900", "아보카도 : 1300",
//							"오믈렛 : 1200", "미트추가 : 1800"};
	private String[] drinkView = { "코카콜라", "코카콜라제로", "스프라이트", "닥터페퍼" };
	private String[] cookieView = { "초코칩", "라즈베리", "오트밀레이즌", "화이트마카다미아", "더블초코칩" };

	public void mainMenu() {

		System.out.println("안녕하세요 서브웨이 kh점입니다~");
		System.out.println("온도체크 후 QR인증 부탁드려요 ㅎㅎ\n");
		System.out.println("재료 소진으로 인해 1인당 1개만 주문 가능합니다.");
		System.out.print("카드 잔액을 입력하세요. : ");
		int myCoin = Integer.parseInt(sc.nextLine());
		int menuPrice = 0;
		System.out.println();
		if (myCoin < 4000) {
			System.out.println("4000원 이하는 나가주시죠 ㅋㅋ~~zzz");
			return;
		} else {
			System.out.println("귀하의 잔액은 " + myCoin + "￦ 입니다");
		}
		Outer: while (true) {
			System.out.println();
			System.out.println("======== 서브웨이 메뉴판 ==========");
			System.out.println();
			System.out.println(Arrays.toString(menuView) + "\n");
			System.out.print("메뉴를 골라주세용 > ");
			String name = sc.nextLine();

			System.out.print("\n세트로 변경하려면 \"네\"입력 : ");
			String setbool = sc.nextLine();
			System.out.println();
			boolean set = false;
			if (setbool.equals("네")) {
				set = true;
			}

			switch (name) {
			case "햄":
				if (set) {
					menuPrice = 6600;
					myCoin -= menuPrice;
				} else {
					menuPrice = 4800;
					myCoin -= menuPrice;
				}
				break;
			case "아보카도 섭도그":
				if (set) {
					menuPrice = 7900;
					myCoin -= menuPrice;
				} else {
					menuPrice = 5900;
					myCoin -= menuPrice;
				}
				break;
			case "풀드포크":
				if (set) {
					menuPrice = 7700;
					myCoin -= menuPrice;
				} else {
					menuPrice = 6000;
					myCoin -= menuPrice;
				}
				break;
			case "쉬림프":
				if (set) {
					menuPrice = 8100;
					myCoin -= menuPrice;
				} else {
					menuPrice = 5900;
					myCoin -= menuPrice;
				}
				break;
			case "에그마요":
				if (set) {
					menuPrice = 6000;
					myCoin -= menuPrice;
				} else {
					menuPrice = 4300;
					myCoin -= menuPrice;
				}
				break;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				System.out.println("잔액 입력부터 다시 하세요.");
				continue;
			}

			if (myCoin < 0) {
				System.out.println("잔액부족이십니다. 다른 카드 줘보세요");
				mainMenu();
			}

			while (true) {

				System.out.println("\n빵을 골라주세요.");
				System.out.println(Arrays.toString(breadView));
				System.out.print(" >> ");
				String bread = sc.nextLine();


				System.out.println("\n치즈를 골라주세요.");
				System.out.println(Arrays.toString(cheeseView));
				System.out.print(" >> ");
				String cheese = sc.nextLine();

				System.out.println("\n제외할 야채를 골라주세요. 다먹을거면 엔터를 연타하세요. 그리고 순서대로 입력 안하면 아무것도 안줌.");
				System.out.println(Arrays.toString(vegetableView));
				String vegetable = null;
				int count = 0;
				for (int i = 0; i < vegetableView.length; i++) {
					System.out.print(" >> ");
					vegetable = sc.nextLine();
					if (vegetableView[i].equals(vegetable)) {
						vegetableView[i] = "";
						count++;
					}

				}

				vegetable = "";
				String[] realvegetable = new String[vegetableView.length - count];
				for (int i = 0; i < vegetableView.length; i++) {

					for (int j = 0; j < realvegetable.length; j++) {
						if (vegetableView[i] != "") {
							realvegetable[j] = vegetableView[i];
							vegetable += realvegetable[j];
							vegetable += " ";
							break;
						}

					}
				}

				System.out.println("\n소스를 골라주세요. 3가지만 받겠습니다.");
				System.out.println(Arrays.toString(sauceView));
				String sauce = "";
				for (int i = 0; i < 3; i++) {
					System.out.print(" >> ");
					sauce += sc.nextLine();
					sauce += " ";
				}

				if (set) {
					System.out.println("\n쿠키를 골라주세요.");
					System.out.println(Arrays.toString(cookieView));
					System.out.print(" >> ");
					String cookie = sc.nextLine();
					System.out.println("\n음료를 골라주세요.");
					System.out.println(Arrays.toString(drinkView));
					System.out.print(" >> ");
					String drink = sc.nextLine();
					sub.insertMenu(name, menuPrice, bread, cheese, vegetable, sauce, cookie, drink);
					System.out.println("\n주문하신 " + name + "세트 나왔습니다.");
					System.out.println("\n" + sub.printMenu() + "\n쿠키는 " + cookie + ", 음료는 " + drink + "입니다.");
					break Outer;

				} else {

					System.out.println("\n주문하신 " + name + "단품 나왔습니다.");
					sub.insertMenu(name, menuPrice, bread, cheese, vegetable, sauce);
					System.out.println("\n" + sub.printMenu());
					break Outer;
				}

			}

		}
		System.out.println("맛있게 드세요~");
		System.out.println("\n귀하의 잔액은 " + myCoin + "￦ 남았습니다.");
		System.exit(0);
	}
}
