package com.hw1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {

		List<Friend> list = new ArrayList<>();
		
//		list.add(new Friend("짱구"));
//		list.add(new Friend("철수"));
//		list.add(new Friend("유리"));
//		list.add(new Friend("훈이"));
//		list.add(new Friend("맹구"));
		
		//Collections.addAll();
		//Collections 라는 클래스 안 addAll() 메서드 이용하기
		Collections.addAll(list, new Friend("짱구"), 
					new Friend("철수"), 
					new Friend("유리"), 
					new Friend("훈이"), 
					new Friend("맹구")
					);
		
		//List.of() : Java 9 이상의 버전에서 사용 가능
//		List<Friend> friends = List.of(new Friend("짱구"), 
//				new Friend("철수"), 
//				new Friend("유리"), 
//				new Friend("훈이"), 
//				new Friend("맹구"));
		
		int random = (int)(Math.random()*5);
		
		Friend picked = list.get(random);
		picked.pickLeader();
		
		
		
	}

}
