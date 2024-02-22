package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.kh.collection.pack2.model.Person;

public class MapService {

	/*	Map : 특정 키워드(Key)를 입력하면,
	 * 			해당되는 상세한 값(Value) 를 얻을 수 있는 컬렉션 객체
	 * 
	 *  - K : V 형식으로 구성
	 *  
	 *  - K : V 한 쌍을 "Entry" 라고 부름
	 *  
	 *  - Key : 키워드 역할 (== 변수명)
	 *  1) 중복 X
	 *  -> 중복되는 Key 입력 시 Value 를 덮어씌움
	 *  -> Key 역할의 객체는 hashCode(), equals() 오버라이딩 필수!
	 * 	
	 * 	2) 순서 유지 X (단, LinkedHashMap 은 제외. 얘는 순서유지됨)
	 * 
	 *	* Key 만 묶어서 보면, Set 과 같은 특징을 지니고 있음.
	 *	-> Map.keySet() / Map.entrySet() 제공
	 *
	 * 
	 * - Value : 키워드에 해당하는 상세한 값
	 * 	Key 로 인해서 모든 Value가 구분됨
	 * -> Map.get(key) / Map.remove(key) 형태로 사용
	 * 
	 * */
	
	public void method1() {
		
		// HashMap 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 1. V put(K k, V v) : Map 에 추가
		// - Map 에 추가 시
		// 중복되는 key가 없으면 null
		// 중복되는 key가 있으면 이전 value 반환
		
		System.out.println( map.put(1, "에그마요") ); //null
		System.out.println( map.put(2, "로티세리바베큐") ); //null
		System.out.println( map.put(3, "스테이크앤치즈") ); //null
		System.out.println( map.put(3, "스파이시쉬림프") ); //중복되므로, 이전 value인 스테이크앤치즈가 나옴.
		
		//덮어씌워진다고 했으니, 스파이시쉬림프 가 나옴.
		System.out.println(map);
		
		System.out.println("-----------------------------");
		
		
		// 2. V get (K k) : Key 에 해당하는 Value 반환
		//					일치하는 Key가 없다면 null 반환
		
		System.out.println(map.get(1)); //에그마요
		System.out.println(map.get(2)); //로티세리바베큐
		System.out.println(map.get(3)); //스파이시쉬림프
		System.out.println(map.get(4)); //null
		
		String temp = map.get(2); //"로티세리바베큐"
		
		// 3. int size() : Map에 저장된 Entry( K : V ) 의 개수
		System.out.println("size : " + map.size());
		
		// 4. V remove(K k) : 
		// - Key 가 일치하는 Entry를 제거
		// - 만약에 일치하는 Key가 있다면 해당 Value를 반환, 없다면 null 반환
		
		
		System.out.println("remove(2) : " + map.remove(2));
		System.out.println(map); //{1=에그마요, 3=스파이시쉬림프}
		
		System.out.println("remove(5) : " + map.remove(5));
		
		// 5. void clear() : 모든 Entry 삭제
		// 6. boolean isEmpty() : 비어 있는지 확인
		
		System.out.println("clear() 전 isEmpty() : " + map.isEmpty());
		
		map.clear(); // 모든 Entry 삭제
		
		System.out.println("clear() 후 isEmpty() : " + map.isEmpty());
	}
	

	/**
	 * Map 요소(Entry) 순차 접근 하기 1
	 * - Map.keySet() 이용하기
	 * 
	 */
	public void method2() {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "서울시 강북구");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		// Map.keySet() :
		// Map에 있는 Key만 뽑아내서 Set 형태로 만들어 반환
		Set<String> set= map.keySet();
		
		System.out.println("keySet : " + set);
		
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			String a = iter.next();
//			System.out.println(a);
//		}
		
		for(String str : set) {
			System.out.println(map.get(str));
		}
	}
	
	
	/**
	 * Map 요소(Entry) 순차 접근 하기 2
	 * - Map.entrySet() 이용하기
	 *  
	 */
	public void method3() {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "서울시 강북구");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		//여기서, Entry는 java.util 패키지에 있던 것이다.
		Set<Entry<String, String>> entrySet = map.entrySet(); 
		
		// Entry.getKey() : 하나의 엔트리에서 key만 얻어오기
		// Entry.getValue() : 하나의 엔트리에서 value만 얻어오기
		for(Entry<String, String> entry : entrySet) {
			System.out.printf("key : %s , value : %s \n",entry.getKey(),entry.getValue());

			
		}
		
	}
	
	
	/**
	 *	Map 활용 하기 - DTO 대체해야 할때 쓴다.  
	 * - 서로 다른 데이터를 한 번에 묶어서 관리해야 하는 경우에 쓴다.
	 * 
	 */
	public void method4 () {
		
		// DTO/VO 이용 방법
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setGender('남');
		
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %c \n", 
				p1.getName(), p1.getAge(), p1.getGender()
				);
		
		System.out.println("-------------------------------------");
		
		Map<String, String> map = new HashMap<String, String>();
		
		//DTO 대신 Map 활용하기
		// -Key 는 무조건 String 활용하는게 Best
		// -Value 의 타입이 모두 다름
		// -> Object 를 부모 타입 참조 변수로 활용
		
		Map<String, Object> p2 = new HashMap<String, Object>();
		
		//데이터 추가
		p2.put("name", "김길순");
		p2.put("age", 22); // 22 는 int 가 아니라, Integer
		p2.put("gender", '여'); //'여' 도 char가 아니라, Character 
		
		//데이터 얻어오기
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %c \n", 
				p2.get("name"), p2.get("age"), p2.get("gender")
		);
		
		
 		
	}
	
	
	
}
