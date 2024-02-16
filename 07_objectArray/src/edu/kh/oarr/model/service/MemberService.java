package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	// 속성 
	private Scanner sc = new Scanner(System.in);
	
	//Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	//현재 로그인한 회원의 정보를 저장할 변수 선언
	Member loginMember = null;
	
	public MemberService() {
		//기본 생성자
		//memberArr 배열 0, 1, 2 인덱스를 초기화 해놓겠다.
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "계보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
	
	}
	
	// 기능
	
	//메뉴 출력용 메서드
	public void displayMenu() {
		int menuNum = 0; //메뉴 선택용 변수
		
		// 무조건 한번은 반복
		do {
			System.out.println("=====회원 정보 관리 프로그램 v2=====");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용 
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); 
			break;
			case 2 : System.out.println(login()); 
			break;
			case 3 : System.out.println(findMember());
			break;
			case 4 :  System.out.println( updateMember());
			break;
			case 5 :  
			break;
			case 0 : System.out.println("프로그램 종료.."); 
			break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요!");
			}
		} while(menuNum != 0);
	}
	
	
	// memberArr 의 비어있는 인덱스 번호를 반환하는 메서드
	// 단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		
		//memberArr 배열을 0 인덱스부터 끝까지 접근해서
		//참조하는 값이 null 인 경우의 인덱스를 반환
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] == null) {
				return i; // 현재 메서드를 종료하고 호출한곳으로 i 값을 가지고 돌아감
			}
		}
		//for 문을 수행했지만 return 이 되지 않은 경우 해당위치 코드가 수행된다.
		// -> for문에서 return이 되지 않았다 == 배열에 빈칸이 없다
		return -1;
	}
	
	//회원가입 메서드
	public String signUp() {
		System.out.println("\n==========회원 가입============");
		
		//객체배열 memberArr에 가입한 회원 정보를 저장할 예정
		//-> 새로운 회원 정보를 저장할 공간이 있는지 확인하고
		//	빈 공간의 인덱스 번호를 얻어오기
		
		int index = emptyIndex(); //memberArr 배열에서 비어있는 인덱스 반환받음 (없다면 -1 반환)
		if(index == -1) {
			return "회원 가입 불가(인원 수 초과)";
		}
		
		System.out.print("아이디 : ");
		String memberId = sc.next();

		System.out.print("비밀번호 :");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		 System.out.println("지역 : ");
		 String region =sc.next();
		 
		 //비밀번호와 비밀번호 확인이 일치하는지 확인
		 if(memberPw.equals(memberPw2)) {
			 //Member 객체 생성해서 할당된 주소를 memberArr의 비어있는 인덱스에 대입
			 Member member = new Member(memberId, memberPw, memberName, memberAge, region);
			 memberArr[index] = member;
			 return "회원가입 성공!";
		 }else {
			 return "회원가입 실패!(비밀번호 불일치)";
		 }
	
		 
	
	}
	
	public String login() {
		System.out.println("=======로그인=========");
		System.out.println("아이디 입력 : ");
		String memberId = sc.next();
		System.out.println("비밀번호 입력");
		String memberPw = sc.next();
		
		//1) memberArr 배열 내 요소를 순서대로 접근하여 null 이 아닌지 확인
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] != null) {
				//회원정보가 있을 경우
				
				// 2) 회원정보 (memberArr[i]) 의 아이디, 비밀번호와
				// 입력받은 아이디(memberId) 비밀번호(memberPw) 가 같은지 확인
				if(memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {
					
					//3) 로그인 회원 정보 객체를 참조하는 변수 loginMember에
					//현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
					loginMember = memberArr[i];
					break; // 더 이상 같은 아이디, 비밀번호가 없을 뿐만 아니라, 
							//입력받은 회원이 존재한다는 것을 체크했기 때문에 더 이상
							//for문을 돌 필요가 없어서 for문을 종료
				}
			}
		}
		
		//4) 로그인 성공/실패 여부에 따라 결과 값 반환
		if(loginMember == null) {
			//로그인 실패
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		} else {
			//로그인 성공
			return loginMember.getMemberName() + "님 환영합니다!";
		}


	}
	
	//회원 검색(지역) 메서드
	public void searchRegion() {
		
		System.out.println("\n==========회원 검색(지역) =============");
		System.out.println("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		boolean flag = true;	//검색 결과 신호용 변수
		// 1) memberArr 배열의 모든 요소 순차 접근
		for(int i = 0; i<memberArr.length; i++) {
			// 2) memberArr[i] 요소가 null 인 경우 반복 종료
			if(memberArr[i] == null) {
				break;
			}
			
			//3)memberArr[i] 요소에 저장된 지역(region) 이 
			//입력받은 지역(inputRegion) 과 같을 경우 회원의 아이디, 이름을 출력
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s \n", memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false;
			}
		}
		if(flag==true) {
			System.out.println("일치하는 검색 결과가 없습니다.");
		}
	}
	
	public String findMember() {
		System.out.println("찾고자 하는 아이디를 입력해주세요");
		String id = sc.next();
		
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		
		boolean flag = false;
		String str = "";
		
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i].getMemberId().equals(id)&& memberArr[i].getMemberPw().equals(pw)) {
				flag = true;
				return str += "찾은 아이디 비밀번호 : 아이디 는" +memberArr[i].getMemberId() + "비밀번호 는" + memberArr[i].getMemberPw();
				
			}			
		}
		
		if(flag==false) {
			return "아이디 혹은 비밀번호가 틀렸습니다";
		} else {
			return str;
		}

		
	}
	

	public String updateMember() {
		
		System.out.println("수정하고자 하는 아이디를 입력해주세요");
		String id = sc.next();

		int wantUpdateIndex = 0;
		
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] !=null) {
				if(id.equals(memberArr[i].getMemberId())){
					wantUpdateIndex = i;
				} 
			}
		}
		
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		
		if(!memberArr[wantUpdateIndex].getMemberPw().equals(pw)) {
			return "비밀번호를 틀려서 수정할 수 없습니다.";
		}
		
		System.out.println("어떤 걸 수정하시겠어요? 1 2 3 4 5 중 하나를 입력해주세요");
		System.out.println("1. 아이디");
		System.out.println("2. 비밀번호");
		System.out.println("3. 이름");
		System.out.println("4. 나이");
		System.out.println("5. 지역");
		
		int what = sc.nextInt();
		
		String changeHow = "";
		int changeHowAge = 0;
		
		if(what != 4) {
			System.out.println("어떻게 바꾸시겠어요?");
			changeHow = sc.next();
		} else {
			System.out.println("어떻게 바꾸시겠어요?");
			changeHowAge = sc.nextInt();
		}
				
		switch(what) {
		case 1 : memberArr[wantUpdateIndex].setMemberId(changeHow);
		break;
		case 2 : memberArr[wantUpdateIndex].setMemberPw(changeHow);
		break;
		case 3 : memberArr[wantUpdateIndex].setMemberName(changeHow);
		break;
		case 4 : memberArr[wantUpdateIndex].setMemberAge(changeHowAge);
		break;
		case 5 : memberArr[wantUpdateIndex].setRegion(changeHow);
		break;		
		}
		
		switch(what) {
		case 1 : 	return memberArr[wantUpdateIndex].getMemberId() + "의 아이디가 " + changeHow + "로 변경되었습니다";
		case 2 : 	return memberArr[wantUpdateIndex].getMemberId() + "의 비밀번호가 " + changeHow + "로 변경되었습니다";
		case 3 : 	return memberArr[wantUpdateIndex].getMemberId() + "의 이름이 " + changeHow + "로 변경되었습니다";
		case 4 : 	return memberArr[wantUpdateIndex].getMemberId() + "의 나이가 " + changeHowAge + "로 변경되었습니다";
		case 5 : 	return memberArr[wantUpdateIndex].getMemberId() + "의 지역이 " + changeHow + "로 변경되었습니다";
		default : return "시스템 오류";
		}
			
		
		
		
		
		
	}
	
	
	
		
}
	
	
	
	
