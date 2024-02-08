package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void method1() {
		Hero hero = new Hero();
		hero.setNickName("최재준");
		hero.setJob("전사");
		hero.setHp(100);
		hero.setMp(30);
		hero.setExp(0);
		
		
		System.out.println("사냥 전 hero 의 레벨 :" + hero.getLevel());
		
		hero.attack(300);
		System.out.println("경험치 = " + hero.getExp());

		hero.attack(300);
		System.out.println("경험치 = " + hero.getExp());
		
		System.out.println("hero 의 레벨 :" + hero.getLevel());
		
		System.out.println("==============================");
		
		hero.magicJump();
		System.out.println(hero.getMp());

		hero.magicJump();
		System.out.println(hero.getMp());
		
		hero.magicJump();
		System.out.println(hero.getMp());

		hero.magicJump();
		System.out.println(hero.getMp());
		
		
	}

}
