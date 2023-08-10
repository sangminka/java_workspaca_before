package com.tenCo.books;

import java.util.Scanner;

import ch09.Book;

/**
 * @author 강상민 책을 관리하는 프로그램 C R U D 기능을 구현해 보자
 */
public class TenCoBooks {

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[100];
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_TITLE = "3";
		final String DELETE_ALL = "4";
		final String UPDATE = "5";
		final String END = "0";

		boolean flag = true;
		// 마지막에 저장된 인덱스 번호를 기억해 두자
		int lastIndexNumber = 0;

		// TODO 샘플 데이터 추후 삭제
		books[0] = new Book("홍길동전", "허균");
		books[1] = new Book("사피엔스", "유발하라리");
		lastIndexNumber = 2;

		while (flag) {

			System.out.println("** 메뉴 선택 **");
			System.out.println("**1. 저장 2. 전체 조회 3. 선택 조회 4. 전체삭제 5. 수정 0. 종료 **");
			System.out.println("-------------------------------------------");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(END)) {
				flag = false;
			} else if (selectedNumber.equals(SAVE)) {
				lastIndexNumber = save(sc, books, lastIndexNumber);
				// 저장하는 기능 필요

			} else if (selectedNumber.equals(SEARCH_ALL)) {

				searchAll(books);

			} else if (selectedNumber.equals(SEARCH_TITLE)) {
				searchTitle(sc, books);

			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);

			} else if (selectedNumber.equals(UPDATE)) {
				upDate(sc, books);
			} else {
				System.out.println("잘못 입력 하였습니다. 다시 입력 해주세요");
			}

		} // end of while
		System.out.println("프로그램이 종료 되었습니다.");
	}// end of main
		// 함수 저장하는 기능 static 매서드로 만들어 보기

	public static int save(Scanner scanner, Book[] books, int Index) {
		System.out.println(">> 저장하기 <<");
		System.out.println("책 제목을 입력하세요");
		String bookTitle = scanner.nextLine();
		System.out.println("저자 이름을 입력하세요");
		String bookAuthor = scanner.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		books[Index] = book;
		Index++;
		System.out.println(bookTitle + "책을 생성 했습니다");
		return Index;
	}

	// 전체 조회
	public static void searchAll(Book[] books) {
		System.out.println(">> 전체 조회 하기 <<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].showInfo();
				System.out.println("----------------------------");
			}

		}

	}

	// 선택 조회 - 책 제목으로 검색하기
	public static void searchTitle(Scanner scanner, Book[] books) {
		System.out.println(">> 선택 조회하기 <<");
		String bookTitle = scanner.nextLine();
		for (int i = 0; i < books.length; i++) { // 방어적 코드 작성
			if (books[i] != null) {
				// "책제목".equals("사용자가 입력한 값)
				if (books[i].getTitle().equals(bookTitle)) {
					// 같은책 제목이 존재 한다.
					books[i].showInfo();
					break; // 여기서는 선택 조회라 데이터를 찾았다면 굳이 모든 반복문을 동작 시킬 필요가 없다
				}
			}

		}
	}

	// 전체 삭제
	public static void deleteAll(Book[] books) {
		System.out.println(">> 전체 삭제 <<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i] = null;
			}
		}

	}

	// 수정
	public static void upDate(Scanner scanner, Book[] books) {
		System.out.println("수정");
		System.out.println("수정할 책을 검색 하세요");
		String bookTitle = scanner.nextLine();
		// 0 , 1 ... 5 
		// 4 --> 책없 
		// 5 --> 책없 
		boolean isFind = false; 
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					isFind = true; 
					System.out.println("무엇을 수정하시겠 습니까? 1번: 제목  2번 작가:");
					String upDateNumber = scanner.nextLine();
					if (upDateNumber.equals("1")) {
						System.out.println("변경할 제목을 입력해 주세요 :");

						String upDateBookTitle = scanner.nextLine();
						books[i].setTitle(upDateBookTitle);
					} else if (upDateNumber.equals("2")) {
						System.out.println("변경할 작가이름을 입력해주세요");

						String upDateAuthor = scanner.nextLine();
						books[i].setAuthor(upDateAuthor);
					}
				}
			}
		}
		if(isFind == false) {
			System.out.println("찾는 책이 없어요 ~ ");
		}
		// 

	}

}// end of class
