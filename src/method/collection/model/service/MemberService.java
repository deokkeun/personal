package method.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import method.collection.model.vo.Member;

public class MemberService {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Member> memberList = new ArrayList<Member>();
	
	static int count = 0;
	
	
	public MemberService() {
		memberList.add(new Member());
		System.out.println(memberList.get(0));
	}

	
	public void displayMenu() {
		
		int input = 0;
		do {
			
			System.out.println(" - 회원 관리 프로그램 - ");
			System.out.println("1. 회원 정보 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호 입력 : ");
			
			try {
				
				input = sc.nextInt();
				sc.nextLine();
				
				switch(input) {
				case 1: System.out.println(addMember()); break;
				case 2: selectAll(); break;
				case 3: System.out.println(updateMember());break;
				case 4: System.out.println(removeMember());break;
				case 5: searchName1(); break;
				case 6: searchName2(); break;
				case 0: System.out.println("프로그램을 종료합니다."); break;
				default : System.out.println("메뉴에 있는 번호만 입력해주세요!");
				}
			
			} catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				sc.nextLine();  // 입력버퍼에 남아있는 잘못 입력된 문자열 제거 필수!!
				input = -1;
			}
			
		} while(input != 0);
		
		
		
		
	}
	
	
	public String addMember() throws InputMismatchException {
			
			System.out.println("\n - 회원 정보 등록 - V1 - ");
			
			
			System.out.print("아이디 : ");
			String userId = sc.next();
			
			System.out.print("비밀번호 : ");
			String userPw = sc.next();
			
			System.out.print("비밀번호 재확인 : ");
			String userPw2 = sc.next();
			
			System.out.print("이름 : ");
			String userName = sc.next();
	
			System.out.print("성별(남/여): ");
			char gender = sc.next().charAt(0);
			
			System.out.print("핸드폰 번호 : ");
			int phoneNum = sc.nextInt();
			sc.nextLine();
			
			System.out.print("이메일 : ");
			String email = sc.next();

			
			if(userPw.equals(userPw2) && memberList.add(new Member(userId, userPw, userPw2, userName, gender, phoneNum, email))) {
				count++;
				return count + "번째로 " + userName + "님의 회원 정보가 등록되었습니다.";
			} else {
				return userName + "님의 비밀번호가 일치하지 않습니다.";
			}
	
	}
	
	
	public void selectAll() {
		
		System.out.println("학생 정보를 조회합니다.");
		if(memberList.isEmpty()) {
			System.out.println("\n회원 정보가 없습니다.\n");
			return;
		}
		
		int num = 0;
		for(Member str : memberList) {
			System.out.println(num + "번째 " + str);
			num++;
		}
		
		
	}
	
	public String updateMember() {
		
		System.out.println("\n - 회원 정보 수정 - ");
		System.out.print("변경할 회원의 인덱스 번호 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.print("아이디 : ");
		String userId = sc.next();
		
		System.out.print("비밀번호 : ");
		String userPw = sc.next();
		
		System.out.print("비밀번호 재확인 : ");
		String userPw2 = sc.next();
		
		System.out.print("이름 : ");
		String userName = sc.next();

		System.out.print("성별(남/여): ");
		char gender = sc.next().charAt(0);
		
		System.out.print("핸드폰 번호 : ");
		int phoneNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		
		
		
		return "";
		
	}
	
	public String removeMember() {
		return "";
		
		
	}
	
	public void searchName1() {
		
		
		
	}
	
	public void searchName2() {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
