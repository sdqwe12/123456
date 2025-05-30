package miniproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) {

		final String RESET = "\u001B[0m";
		final String FONT_RED = "\u001B[31m";
		final String FONT_GREEN = "\u001B[32m";
		final String FONT_BLUE = "\u001B[34m";
		final String BACKGROUND_BLACK = "\u001B[40m";
		final String BACKGROUND_WHITE = "\u001B[47m";

		Scanner sc = new Scanner(System.in);
		DB db = new DB();
		WordGame wg = new WordGame();
		User cu = new User();

		System.out.println("  _   _   U _____ u    _         _         U  ___ u \r\n"
				+ " |'| |'|  \\| ___\"|/   |\"|       |\"|         \\/\"_ \\/ \r\n"
				+ "/| |_| |\\  |  _|\"   U | | u   U | | u       | | | | \r\n"
				+ "U|  _  |u  | |___    \\| |/__   \\| |/__  .-,_| |_| | \r\n"
				+ " |_| |_|   |_____|    |_____|   |_____|  \\_)-\\___/  \r\n"
				+ " //   \\\\   <<   >>    //  \\\\    //  \\\\        \\\\    \r\n"
				+ "(_\") (\"_) (__) (__)  (_\")(\"_)  (_\")(\"_)      (__)   ");
		System.out.println();
		loop: while (true) {
			// 대분류
			System.out.println(BACKGROUND_WHITE + FONT_GREEN + "    [ 메뉴를 선택해주세요 ]    " + RESET);
			System.out.println(" 1.로그인 | 2.회원가입 | 0.종료");
			int mainCategory = sc.nextInt();
			switch (mainCategory) {
			case 0:
				System.out.println(
						BACKGROUND_WHITE + FONT_RED + "=================[ 프로그램을 종료합니다. ]=================" + RESET);
				break loop;
			case 1:
				// 로그인
				System.out.println(BACKGROUND_WHITE + FONT_GREEN + "         [ LOGIN ]         " + RESET);
				cu.login();

				// DB에 id가 존재하지 않을 시 "존재하지않는 아이디" 출력
				// user.setId(id) user.serPw(pw)

				// 1.DB에 id가 존재할 시 여기로
				// 1-1.pw가 틀렸을 때 로그인으로 리턴

				// 1-2.성공적으로 로그인 되었을 때
				System.out.println("  ____       _____       _         ____       _____   \r\n"
						+ " / __\"| u   |_ \" _|  U  /\"\\  u  U |  _\"\\ u   |_ \" _|  \r\n"
						+ "<\\___ \\/      | |     \\/ _ \\/    \\| |_) |/     | |    \r\n"
						+ " u___) |     /| |\\    / ___ \\     |  _ <      /| |\\   \r\n"
						+ " |____/>>   u |_|U   /_/   \\_\\    |_| \\_\\    u |_|U   \r\n"
						+ "  )(  (__)  _// \\\\_   \\\\    >>    //   \\\\_   _// \\\\_  \r\n"
						+ " (__)      (__) (__) (__)  (__)  (__)  (__) (__) (__) ");
				System.out.println(
						BACKGROUND_WHITE + FONT_GREEN + "                      로그인 성공!                       " + RESET);
				System.out.println(
						BACKGROUND_WHITE + FONT_BLUE + "==================[ OO님 환영합니다. ]===================" + RESET);
				mLoop: while (true) {
					// 단어맞추기 랭킹 방명록 로그아웃 회원탈퇴 종료
					System.out.println(" ------------------[ 메뉴를 선택해주세요 ]------------------ ");
					System.out.println("1.단어맞추기 | 2.랭킹 | 3.방명록 | 8.로그아웃 | 9.탈퇴 |  0.종료");
					System.out.println(" ------------------------------------------------------ ");
					int middleCategory = sc.nextInt();
					switch (middleCategory) {
					case 1:
						// 단어맞추기 기능(소분류 넣어야 함)
						System.out.println(BACKGROUND_WHITE + FONT_BLUE
								+ "                       단어맞추기                      " + RESET);
						System.out.println(" -----------------[ 메뉴를 선택해주세요 ]--------------- ");
						System.out.println("1.색상 | 2.동물 | 3.음식 | 8.로그아웃 | 9.이전메뉴 | 0.종료");
						System.out.println(" --------------------------------------------------- ");

						int gameCategory = sc.nextInt(); // 메뉴 번호 입력받기
						switch (gameCategory) { // 입력받은 값으로 기능 굴리기
						case 1: // 색상
							wg.color();
							break;
						case 2: // 동물
							wg.animal();
							break;
						case 3: // 음식
							wg.food();
							break;
						case 8: // 로그아웃
							System.out.println(BACKGROUND_WHITE + FONT_GREEN + "      [ 로그아웃 완료! ]     " + RESET);
							break mLoop;
						case 9:
							// 이전메뉴
							System.out.println(BACKGROUND_WHITE + FONT_GREEN
									+ "=================[ 이전메뉴로 돌아갑니다. ]=================" + RESET);
							break;
						case 0:
							// 종료
							System.out.println(BACKGROUND_WHITE + FONT_RED
									+ "=================[ 프로그램을 종료합니다. ]=================" + RESET);
							break loop;
						default:
							System.out.println(BACKGROUND_BLACK + FONT_RED + "메뉴 외의 번호를 입력하셨습니다. 다시 입력해주세요!" + RESET);
						}
						;

						break;
					case 2:
						// 랭킹 기능
						System.out.println(BACKGROUND_WHITE + FONT_GREEN + "               랭킹             " + RESET);
						System.out.println(" -----[ 메뉴를 선택해주세요 ]-----");
						System.out.println("    1.목록조회   |   9.이전메뉴   ");
						System.out.println(" ----------------------------");
						int rankCategory = sc.nextInt();
						switch (rankCategory) {
						case 1: // 목록조회
							db.rankList();
						case 9:
							System.out.println(BACKGROUND_WHITE + FONT_GREEN
									+ "=================[ 이전메뉴로 돌아갑니다. ]=================" + RESET);
							break;
						default:
							System.out.println(BACKGROUND_BLACK + FONT_RED + "메뉴 외의 번호를 입력하셨습니다. 다시 입력해주세요!" + RESET);
						}
						break;
					case 3:
						// 방명록 기능(소분류 넣어야 함)
						System.out.println(BACKGROUND_WHITE + FONT_GREEN
								+ "                        방 명 록                        " + RESET);
						System.out.println(" -----------------[ 메뉴를 선택해주세요 ]------------------");
						System.out.println("1.목록조회 | 2.등록 | 3.삭제 | 8.로그아웃 | 9.이전메뉴 | 0.종료");
						System.out.println(" ------------------------------------------------------");
						int boardCategory = sc.nextInt();
						switch (boardCategory) {
						case 1: // 목록조회
							db.boardList();
							break;
						case 2: // 글 등록
							System.out.println("코멘트를 입력해주세요.");
							String com = sc.next();
							db.comInsert(com, cu.id);
							break;
						case 3: // 글 삭제
							List<String> comList = new ArrayList<String>();
							comList = db.myBoardList2(cu.id);

							if (comList.size() > 0) {
								System.out.println("내가 작성한 글");
								db.myBoardList1(cu.id);
								System.out.println("삭제할 글번호를 입력해주세요.");
								String comNum = sc.next();
								for (int i = 0; i < comList.size(); i++) {
									if (comList.get(i).equals(comNum)) {
										db.myBoardDel(comNum);
										System.out.println("삭제 완료");
										break;
									}
									else if (!comList.get(i).equals(comNum)){
										System.out.println("입력하신 글번호가 없습니다.");
									}
								}
								
							}

							else {
								System.out.println("작성하신 글이 없습니다.");
							}

							break;
						case 8: // 로그아웃
							cu.id = "";
							cu.password = "";
							System.out.println(
									BACKGROUND_WHITE + FONT_BLUE + "           [ 로그아웃 완료! ]          " + RESET);
							break mLoop;
						case 9: // 이전메뉴
							System.out.println(BACKGROUND_WHITE + FONT_GREEN
									+ "=================[ 이전메뉴로 돌아갑니다. ]=================" + RESET);
							break;
						case 0: // 종료
							System.out.println(BACKGROUND_WHITE + FONT_RED
									+ "=================[ 프로그램을 종료합니다. ]=================" + RESET);
							break loop;
						default:
							System.out.println(BACKGROUND_BLACK + FONT_RED + "메뉴 외의 번호를 입력하셨습니다. 다시 입력해주세요!" + RESET);
						}
						;

						break;
					case 8:
						System.out.println(BACKGROUND_WHITE + FONT_BLUE + "           [ 로그아웃 완료! ]          " + RESET);
						break mLoop;
					case 9: // 탈퇴 시스템
						System.out.println(BACKGROUND_WHITE + FONT_GREEN
								+ "               이대로 탈퇴를 이어가시겠습니까?                " + RESET);
						System.out.println("                     1.YES | 2.NO                      ");
						int userCategory = sc.nextInt();
						switch (userCategory) {
						case 1:
							int random = (int) (Math.random() * 555) + 1;

							System.out.println("비밀번호를 입력해주세요.");
							String pwCheck = sc.next();

							// 현재 유저의 비밀번호와 입력한 비밀번호가 다를 경우 리턴시키기
							if (pwCheck.equals(cu.password)) {
								System.out.println("탈퇴 진행을 위해 번호를 입력해주세요.");
								System.out.println("입력하기 >> [  " + random + "  ]");
								int randomNumberCheck = sc.nextInt();

								if (randomNumberCheck != random) {
									int randomDouble = (int) (Math.random() * 555) + 1;
									System.out.println("틀렸습니다! 번호를 재입력 해주세요.");
									System.out.println("입력하기 >> [  " + randomDouble + "  ]");
									int randomNumberDoubleCheck = sc.nextInt();

									if (randomNumberDoubleCheck != randomDouble) {
										System.out.println(
												BACKGROUND_BLACK + FONT_RED + "입력값이 올바르지 않습니다. 메뉴로 돌아갑니다" + RESET);
										break;
									} else {
										cu.secession();
										System.out.println(BACKGROUND_WHITE + FONT_GREEN
												+ "                탈퇴완료! 처음으로 돌아갑니다.                " + RESET);
										break mLoop;
									}
									// 여기에 뭘 넣어야 바로 random 쪽으로 갈까?
								} else {
									cu.secession();
									System.out.println(BACKGROUND_WHITE + FONT_GREEN
											+ "                탈퇴완료! 처음으로 돌아갑니다.                " + RESET);
									break mLoop;
								}
							} else {
								System.out.println("입력하신 비밀번호와 정보가 일치하지 않습니다.");
								continue mLoop;
							}
						case 2:
							System.out.println(BACKGROUND_WHITE + FONT_GREEN
									+ "=================[ 이전메뉴로 돌아갑니다. ]=================" + RESET);
							break;
						default:
							System.out.println(BACKGROUND_BLACK + FONT_RED + "메뉴 외의 번호를 입력하셨습니다. 다시 입력해주세요!" + RESET);
						}
						break;
					case 0:
						System.out.println(BACKGROUND_WHITE + FONT_RED
								+ "=================[ 프로그램을 종료합니다. ]=================" + RESET);
						break loop;
					default:
						System.out.println(BACKGROUND_BLACK + FONT_RED + "메뉴 외의 번호를 입력하셨습니다. 다시 입력해주세요!" + RESET);
					}

				}
				break;
			case 2: // 회원가입
				cu.createUser();
				break;
			default:
				System.out.println(BACKGROUND_BLACK + FONT_RED + "메뉴 외의 번호를 입력하셨습니다. 다시 입력해주세요!" + RESET);
			}

		}
		;
	}
}