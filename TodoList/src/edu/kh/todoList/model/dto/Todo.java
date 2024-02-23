package edu.kh.todoList.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

// DTO (Data Transfer Object) : 관련된 값의 묶음. 값 전달 역할을 함. 
// == VO (Value Object) 
public class Todo implements Serializable{ //스트림 입출력을 위한 직렬화를 위해서, Serializable 인터페이스를 implements
	
	private String title; // 할 일 제목 ex) 장보기
	private String detail; // 상세 내용 ex) 6시에 이마트가서 장보기
	private boolean complete; // 완료 여부
	private LocalDateTime regDate; // 등록 날짜
	
	// java.time 패키지
	// LocalDateTime : 날짜, 시간을 나타내는 클래스
	// LocalDateTime.now(); : 현재 시간 반환
	
	public Todo() {
		super();
	}
	
	public Todo(String title, String detail, boolean complete, LocalDateTime regDate) {
		super();
		this.title = title;
		this.detail = detail;
		this.complete = complete;
		this.regDate = regDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Todo [title=" + title + ", detail=" + detail + ", complete=" + complete + ", regDate=" + regDate + "]";
	}


	
	
	
	
	
	
	
	
}
