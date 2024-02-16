package edu.kh.oarr.model.vo;

public class Member {
	
	//속성(필드 == 멤버변수) 
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; //지역 (서울, 경기, 충북 .. )
	
	//기능( 메서드 + 생성자 )
	//생성자
	//기본생성자, 매개변수 생성자
	//생성자 만드는 규칙
	//1. 생성자 이름은 클래스명과 같다.
	//2. 반환형이 없다. 
	// ** 기본생성자는 컴파일러가 자동으로 생성을 해주는데, 
	// 생성자가 하나라도 있으면, 자동생성 안해줌
	// -> 매개변수 생성자가 있다면, 기본생성자 직접 작성 해주셔야 합니다!!!! **
	public Member() {
		
	}
	// 오버로딩 : 매개변수의 타입, 순서, 개수가 달라야 한다!
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
		
	}
	
	
	
	
	
	//메서드
	
	
	
	//getter setter. 어디서든 다 접근 가능하도록 public 으로 만듦.
	public String getMemberId() {
		// 반환형 : String 자료형을 돌려보내겠다.
		return memberId; //매개변수가 없어서 중복된 이름의 memberId가 없기 때문에 
						//memberId라고만 써도 가능!
	}
	// 반환형 : void 반환값이 없다. 
	public void setMemberId(String memberId) {
		//setter : 세팅하는 역할. 무엇을 세팅할지 전달받아온 아이가 매개변수다.
		this.memberId = memberId;
		
		//반환형이 void 일 때, return 을 명시하지 않아도 되는이유는, 
		//컴파일러가 자동으로 추가해주기 때문이지, 
		//안써도 되는게 아니다
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
	
}