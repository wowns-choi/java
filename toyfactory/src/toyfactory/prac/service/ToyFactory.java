package toyfactory.prac.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;

import toyfactory.prac.dto.Toy;

public class ToyFactory {
	
	Scanner sc = new Scanner(System.in);
	
	Map<Integer, String> ingredientMap = new HashMap<>();
	
	Set<Toy> toyCollection = new HashSet<Toy>(); 
	
	
	
	
	//생성자
	public ToyFactory() {
		this.ingredientMap.put(1, "면직물");
		this.ingredientMap.put(2, "플라스틱");
		this.ingredientMap.put(3, "유리");
		this.ingredientMap.put(4, "고무");
		
	}
	
	int autoIncrement = 5;
	
	public void factoryRun () {
		
		int stopBtn = -1;
		
		do {
			
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("8. 공장 문 닫기");
			System.out.println("9. 모든 재료 보여주기");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : selectAllToys(); break;
			case 2 : makeNewToy(); break;
			case 3 : removeToy(); break;
			case 4 : selectAllToysByMakeDate(); break;
			case 5 : selectAllToysByAvailalbeAge(); break;
			case 6 : ingredientAdd(); break;
			case 7 : ingredientRemove(); break;
			case 8 : stopBtn = 0; break;
			case 9 : showIngredient(); break;
			default : System.out.println("1 ~ 8 까지의 숫자를 입력하셔야 합니다. ");
			
			}
			
		}while(stopBtn != 0);
		
	}
	
	public void selectAllToys () {
		for(Toy toy : toyCollection) {
			System.out.println(toy);
		}
	
	}
	public void makeNewToy() {
		System.out.println("<< 새로운 장난감 추가>>");
		System.out.println("장난감 이름");
		String toyName = sc.next();
		System.out.println("사용 가능 연령 : ");
		int availableAge = sc.nextInt();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		System.out.println("색상 : ");
		String color = sc.next();
		System.out.println("제조일(YYYYMMDD 형식으로 입력)");
		int makeDate= sc.nextInt();
		
		Toy toy = new Toy(toyName, availableAge, price, color, makeDate);
		
		while(true) {
			System.out.println("섞을 재료의 번호를 입력하세요 (종료하려면 'q' 를 입력하세요)");
			for(int i=0; i<ingredientMap.size(); i++) {
				System.out.println((i + 1) + "번 : " + ingredientMap.get(i+1) );
			}
			System.out.println("선택 : ");
			String choice = sc.next();
			if(choice.toUpperCase().charAt(0) == 'Q') {
				break;
			} else {
				int choiceInt	= Integer.parseInt(choice);				
				if(toy.getIngredient().contains(ingredientMap.get(choiceInt))) {
					System.out.println("이미 포함되어 있는 재료입니다 ㅡㅡ ");
				}
				toy.getIngredient().add(ingredientMap.get(choiceInt));
			}
		}
		toyCollection.add(toy);
	}
	
	public void removeToy() {
		System.out.println("삭제할 장난감의 이름을 입력하세요");
		String deleteToy = sc.next();
		boolean flag = false;
		for(Toy toy : toyCollection) {
			if(toy.getToyName().equals(deleteToy)) {
				toyCollection.remove(toy);
				System.out.println(toy.getToyName() + "을 깨부숨.");
				flag=true;
			}
		}
		
		if(flag==false) {
			System.out.println("그런 장난감 없는데요?");
		}
		
	}
	public void selectAllToysByMakeDate() {
		Comparator<Toy> ss= Comparator.comparing(Toy::getMakeDate);
		
		List<Toy> toyCollectionList = new ArrayList<>();
		
		for(Toy toy : toyCollection) {
			toyCollectionList.add(toy);
		}
		
		Collections.sort(toyCollectionList, ss);
		
		for(Toy toy : toyCollectionList) {
			System.out.println(toy);
		}			
		
	}
	
	public void selectAllToysByAvailalbeAge() {
		Comparator<Toy> ss= Comparator.comparing(Toy::getAvailableAge);
		
		List<Toy> toyCollectionList = new ArrayList<>();
		
		for(Toy toy : toyCollection) {
			toyCollectionList.add(toy);
		}
		
		Collections.sort(toyCollectionList, ss);
		
		//지금 toyCollectionList 에는 뭐가 들어있음?
		//available 필드를 기준으로 오름차순. Toy객  체가 들어있음.
		
		System.out.println("연령별로 사용 가능한 장난감");
		
		List<Toy> toyList = new ArrayList<>();
		toyList.add(toyCollectionList.get(0));
		
		int count = 0;
		
		for(Toy toy : toyCollectionList) {
			if(toy.getAvailableAge() == toyList.get(0).getAvailableAge()) {
				toyList.add(toy);
			} else {
				if(count == 0) {
					toyList.remove(0);
				}
				//출력
				System.out.println("[연령 :" + toyList.get(0).getAvailableAge() + "]");
				for(int i=0; i<toyList.size(); i++) {
					System.out.print(i + 1);
					System.out.println(toyList.get(i));
				}
				
				count = count + 1;
				
				//List 모든 요소 삭제
				toyList.clear();
				// toyList에 넣기
				toyList.add(toy);
			}
			
		}
		System.out.println("[연령 :" + toyList.get(0).getAvailableAge() + "]");
		for(int i=0; i<toyList.size(); i++) {
			System.out.print(i + 1);
			System.out.println(toyList.get(i));
		}
		
		
	}
	
	
//	Map<Integer, String> ingredientMap = new HashMap<>();
	public void ingredientAdd() {
		System.out.println("--현재 등록된 재료--");
		for(int i =0; i<ingredientMap.size(); i++) {
			System.out.println((i+1) + " : " + ingredientMap.get(i+1));
		}
		
		System.out.println("-------------------------");
		
		System.out.println("재료 고유번호(Key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.println("재료명 입력 : ");
		String ingredientName = sc.next();
		
		Set<Entry<Integer, String>> entrySet = ingredientMap.entrySet(); 
		
		boolean flag2 = false;
		
		
		for(Entry<Integer, String> entry : entrySet) {
			if(entry.getKey() == key) {
				flag2 = true;
				System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
				System.out.println("덮어쓰시겟습니까? (Y/N)");
				char yesOrNo= sc.next().toUpperCase().charAt(0);
				if(yesOrNo=='Y') {
					ingredientMap.put(key, ingredientName);
					System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
					return;
				} else if(yesOrNo =='N') {
					System.out.println("취소하셨습니다.");
					return;
				}
				
			} 
		}
		
		if(flag2 == false) {
			ingredientMap.put(key, ingredientName);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
		
		
	}
	
	
	public void ingredientRemove() {
		System.out.println("--현재 등록된 재료--");
		for(int i =0; i<ingredientMap.size(); i++) {
			System.out.println((i+1) + " : " + ingredientMap.get(i+1));
		}
		System.out.println("------------------------------------");
		
		System.out.println("삭제할 재료명 입력");
		String ingredientName = sc.next();
		
		Set<Entry<Integer, String>> entrySet = ingredientMap.entrySet(); 
		
		boolean flag = false;
		
		for(Entry<Integer, String> entry : entrySet) {
			if(entry.getValue().equals(ingredientName)) {
				flag = true;
				System.out.println("재료 '" +ingredientName + "' 가 성공적으로 제거되었습니다." );
				ingredientMap.remove(entry.getKey());
			}
		}
		
		if(flag == false) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
		
	
		
		
	}
	
	public void showIngredient() {
		Set<Entry<Integer, String>> entrySet = ingredientMap.entrySet(); 
		
		for(Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getValue());
		}
		
		
	}
	
	
}
