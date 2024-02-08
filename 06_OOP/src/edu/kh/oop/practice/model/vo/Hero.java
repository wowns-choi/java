package edu.kh.oop.practice.model.vo;

public class Hero {

	//필드 == 멤버 변수
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
	
	
	
	
	public void attack (int exp) {
		
		System.out.println(this.nickName + "은/는 공격을 했다.");
		this.exp += exp;
		if(this.exp>500) {
			this.exp -= 500;
			this.level += 1;
			System.out.println("레벨이 올랐습니다. 현재 레벨 :" + this.level);
		}
		
	}
	
	public void magicJump() {
		
		if(this.mp>=10) {
			System.out.println(this.nickName + "의 점프!");
			this.mp -= 10;
		} else if(this.mp <10) {
			System.out.println("mp가 부족해 더 이상 매직 점프를 할 수 없어요!");
		}

	}
	
	
	
	
	
	//getter , setter
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nuckName) {
		this.nickName = nuckName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}
