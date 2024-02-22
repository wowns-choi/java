package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.Person;

public class SetService {
	
	/* Set(집합, 주머니)
	 *  - 기본적으로 순서를 유지하지 않음
	 *    (index 없음! -> 인덱스를 이용하는 get() 메서드가 없음
	 * 
	 * - 중복 데이터를 저장하지 않는다. (같은 객체가 들어오면 덮어쓰기)
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 1. HashSet (대표) : 처리 속도가 빠른 Set
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 3. TreeSet : 자동 정렬이 되는 Set
	 * 
	 * 
	 * 
	 * */
	
	
	
	/**
	 * HashSet 사용법!
	 *  - 사용 조건 1 : Set에 담길 객체를 생산해내는 클래스에 equals() 메서드가 오버라이딩 되어 있어야 함.
	 *  - 사용 조건 2 : Set에 담길 객체를 생산해내는 클래스에 hashCode() 메서드가 오버라이딩 되어 있어야 함.
	 *  
	 *  -> String, Integer 등 자바에서 제공하는 객체는
	 *  모두 equals(), hashCode() 오버라이딩이 되어있는 상태 !!!
	 */
	public void method1() {
		// HashSet 객체 생성
		Set<String> set = new HashSet<String>(); // 다형성 - 업캐스팅
		//Set<String> set = new LinkedHashSet<String>(); 
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의 민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set); // 호출했더니, 넣은 순서대로 꺼내진 게 아니라,
								// 뒤죽박죽 섞여 있음.
		//즉, HashSet 은 순서 유지를 하지 않는다는 것을 확인할 수 있다.
		
		//중복 저장 시도 해보자.
		set.add("배달의 민족");
		set.add("배달의 민족");
		set.add("배달의 민족");
		set.add("배달의 민족");
		set.add("배달의 민족");
		
		System.out.println(set); // 중복저장 안되고, 계속 덮어씌워진 거임.
								//chat gpt 에 따르면, 덮어씌워지는 것이 아니라, 
								// 기존의 것이 유지되고 새로운 것이 들어오지 못한다고 함.
		
		// null : 참조하는 객체가 없음
		// null도 중복이 안되는지 확인해보자.
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set); // 중복 안되네.
		
		// 2. int size() : Set 에 저장된 객체(참조변수)의 수 반환
		System.out.println("set.size() : " + set.size());
		
		// 3. boolean remove(E e) :
		// 전달받은 매개변수 e를 Set 에서 제거
		// 제거 성공 true, 없으면 false
		System.out.println(set.remove("배달의 민족")); //true
		System.out.println(set.remove("유플러스")); //false
		System.out.println(set);
		
		// 4. boolean contains(E e) :
		// 전달받은 e가 Set에 포함되어 있으면 true, 없으면 false
		System.out.println("직방 있는지 확인 : " +set.contains("직방"));
		System.out.println("배달의 민족 있는지 확인 : " + set.contains("배달의 민족"));
		
		// 5. void clear() : Set 에 저장된 내용을 모두 삭제
		set.clear();
		System.out.println(set); //[] 이렇게 비워져 있더라.
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println(set.isEmpty()); //true
		
	}
	
	/**
	 * Set 에 저장된 요소(객체)를 꺼내는 방법
	 * 1. Iterator(반복자) 이용
	 * 2. List 로 변환
	 * 3. 향상된 for문 이용 
	 */
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("포카칩");
		
		// 1. Iterator(반복자) 
		// - 컬렉션 객체에 저장된 요소를 
		// 하나씩 순차 접근하는 객체
		
		//Iterator Set.iterator() :
		// - 현재 Set을 순차 접근할 수 있는 Iterator 객체 반환
		Iterator<String> iter = set.iterator();
		
		// boolean Iterator.hasNext() :
		// 다음 순차 접근할 요소가 있으면 true, 없으면 false
		while(iter.hasNext()) {
			// 다음 요소가 있으면 반복, 없으면 멈춤
			
			// E Iterator.next() : 다음 요소를 꺼내와 반환
			String temp = iter.next(); //iter.next() 를 안해주면, 무한 반복문 돌더라.
			System.out.println(temp);
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Set -> List로 변환");
		
		//Set 에 저장된 객체를 이용해서 List를 생성
		List<String> list = new ArrayList<String>(set);
		
		//일반 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("향상된 for문");		
		for(String snack  : set){
			System.out.println(snack);
		}		
	}
	
	/**
	 * 직접 만든 클래스(Person)를 이용해 만든 객체를
	 * Set 에 저장(중복 제거 확인)
	 */
	public void method3() {
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여');
		
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);		
		personSet.add(p2);		
		personSet.add(p3);		
		personSet.add(p4);		
		
		System.out.println("------------------------");
		for(Person p : personSet) {
			System.out.println(p);
		}
		// 왜 중복된 값이 들어가 있게 되었을까?
		// String, Integer 등 자바에서 제공하는 객체는
		//  모두 equals(), hashCode() 오버라이딩이 되어있는 상태 였는데,
		// Person 클래스에서는 equals() hashCode() 오버라이딩이 안되어있는 상태.
		
		System.out.println("------------------------");
		//hashCode() : 어떤식으로 나올까?
		System.out.println("p1.hashCode() : "+p1.hashCode()); //55605822
		System.out.println("p1.hashCode() : "+p1.hashCode()); //55605822
		System.out.println("p2.hashCode() : "+p2.hashCode()); //55605822
		System.out.println("p2.hashCode() : "+p2.hashCode()); //55605822
		System.out.println("p3.hashCode() : "+p3.hashCode()); //55610627

		//A.equals(B) : A와 B가 가지고있는 필드값이 같다면 true
		System.out.println( p1.equals(p2) );
		System.out.println( p1.equals(p3) );
		
		// **************************************************************
		// Hash 라는 단어가 포함된 컬렉션 이용 시
		// hashCode(), equals() 오버라이딩 필수적으로 진행해야한다!!!!!!!!
		// **************************************************************
	}
	
	/**
	 *	TreeSet : 이진 트리 구조를 이용해 객체를 저장하는 Set
	 * 	-> 기본 오름차순 정렬
	 * 	* 전제조건 : 저장되는 객체는 Comparable 인터페이스 implements 필수!
	 *  -> Integer 는  Comparable implements 가 되어있음.
	 */
	public void method4() {
		
		// 난수 생성
		// 1) Math.random()
		// 2) Random.nextInt()
	
		Random random = new Random();
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		//lotto 에 저장된 값이 6개 미만이면 반복
		// == 6개면 멈춤
		
		while(lotto.size() < 6) {
			// random.nextInt(45) : 0 <= x < 45 난수
			// random.nextInt(45) + 1 : 1 <= x < 46 난수
			lotto.add(random.nextInt(45) + 1);
			// set 자료구조이기 때문에, 중복된 값이 올 리 없다.
			// 또한, TreeSet 을 이용했기 때문에, 오름차순 자동정렬 됨. 
		}
		System.out.println(lotto);
	}
	
	/**
	 * 로또 번호 생성기
	 * 금액을 입력 받아 (천원 단위)
	 * 1000원 당 1회씩 번호를 생성해서 List에 저장한 후
	 * 생성 종료 시 한번에 출력
	 * 
	 * <pre>
	 * 	금액 입력 : 3000
	 * 
	 * 	1회 : [11, 20, 34, 35, 42, 43]
	 * 	2회 : [1, 12, 22, 33, 35, 44]
	 * 	3회 : [5, 6, 24, 43, 44, 45]
	 * 중복 X 자동 오름차순
	 * </pre>
	 * 
	 */
	public void lottoNumberGenerator() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력 : ");
		int price = sc.nextInt();
		int count = price / 1000;
		
		Random random = new Random();
		
		List<Set<Integer>> myList = new ArrayList<>();
		
		
		for(int k=0; k<count; k++) {
			Set<Integer> set = new TreeSet<>();
			while(set.size() <6) {
				set.add(random.nextInt(45) + 1);
			}
			myList.add(set);
		}		
		
		for(int j=0; j<myList.size(); j++) {
			System.out.println(myList.get(j));
		}
		
	}
	
	
	
}
