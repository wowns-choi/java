package edu.kh.array.practice.run;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	public void practice1() {
		int[] arr = new int[9];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int sum =0;
		for(int k=0; k<arr.length; k++) {
			sum += arr[k];
		}
		System.out.println(sum);
		
	}

	public void practice2() {
		int[] arr = new int[9];
		
		int nine = 9;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = nine-i;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int k=0; k<arr.length; k++) {
			if(k%2==0) {
				System.out.println(arr[k]);
			}
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 크기 몇 개로 할까?");
		int arrSize = sc.nextInt();
		
		int[] arr = new int[arrSize];
		
		for(int i=1; i<=arr.length; i++) {
			arr[i-1] = i;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public void practice4() {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<5; i++) {
			System.out.println("정수를 입력해주세요");
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("배열에 요소 중 어떤 정수가 있는지 검색하시겠어요?");
		int findInt= sc.nextInt();
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(findInt == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
		}
		if(flag==false) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		String inputString = sc.next();
		char[] ch = new char[inputString.length()];
		for(int i=0; i<ch.length; i++) {
			ch[i] = inputString.charAt(i);
		}
		
		System.out.println(Arrays.toString(ch));
		
		System.out.println("입력하신 문자열에서 찾을 문자를 적어주세요");
		String inputChar= sc.next();
		char inputCh = inputChar.charAt(0);
		
		int sum = 0;
		
		String index = "";
		
		for(int k=0; k<ch.length; k++) {
			if(ch[k] == inputCh) {
				sum++;
				index = index + (char)k;
			}
		}
		
		
		int[] arr = new int[index.length()];
		
		for(int j=0; j<index.length(); j++) {
			arr[j] = index.charAt(j);
		}
		
		String indexPosition = "";
		
		for(int q=0; q<arr.length; q++) {
			indexPosition += arr[q] + "  ";
		}
		
		
		System.out.println("application에" + inputCh + "가 존재하는 위치(인덱스) : " + indexPosition);		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 길이를 몇으로 할까요?");
		int arrLength = sc.nextInt();
		
		int[] arr = new int[arrLength];
		
		for(int i =0; i<arrLength; i++) {
			System.out.println("배열" + i + "번째 인덱스에 넣을 값 :");
			int inputValue = sc.nextInt();
			arr[i] = inputValue;
		}
		
		int sum = 0;
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k] + "  ");
			sum += arr[k];
		}
		System.out.println();
		
		System.out.println("총합 : " + sum);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호(-포함) 를 입력해주세요");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		//7번째인덱스 까지 보여. 8번째인덱스부터 안보여.
		//
		for(int k=8; k<ch.length; k++) {
			ch[k] = '*';
		}
		
		String aaa = "";
		
		for(int j=0; j<ch.length; j++) {
			aaa+= ch[j];
		}
		
		System.out.println(aaa);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("3 이상인 홀수를 입력해주세요");
		int inputNum = sc.nextInt();
		
		
		while(inputNum<3 ||inputNum%2==0) {
				System.out.println("3 이상 홀수 몰라요? 다시 입력해주세요");
				inputNum = sc.nextInt();			
		}
		
		
		//inputNum 에는 무조건 홀수가 온다는 거야. 
		
		int half = inputNum/2; //half 는 4
		int endNum = half +1; 
		
		
		for(int i=1; i<=endNum; i++) {
			System.out.print(i + " ");
		}
		for(int k=endNum; k>1; k--) {
			System.out.print(k-1 + " ");
		}
		
		//12345 4321
	}
	
	public void practice9() {
	
		int[] arr = new int[10];
		

		
		for(int i=0; i<arr.length; i++) {
			int randomNum = (int)(Math.random()*10 +1);
			arr[i] = randomNum;
		}
		
		String str = "";
		
		for(int k=0; k<arr.length; k++) {
			str += arr[k] + "  ";
		}
		System.out.print("발생한 난수 : " + str);		
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int randomNum = (int)(Math.random()*10 +1);
			arr[i] = randomNum;
		}
		
		String str = "";
		
		for(int k=0; k<arr.length; k++) {
			str += arr[k] + "  ";
		}
		System.out.print("발생한 난수 : " + str);
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >max) {
				max = arr[i];
			}
		}
		
		for(int k=0; k<arr.length; k++) {
			if(arr[k] < min) {
				min = arr[k];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);
		
	}
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		

		
		for(int i=0; i<arr.length; i++) {
			int randomNum = (int)(Math.random()*10 +1);
			arr[i] = randomNum;
			for(int k=0; k<i; k++) {
				if (arr[k] == randomNum) {
					i--;
				}
			}
		}
		
		String str = "";
		
		for(int k=0; k<arr.length; k++) {
			str += arr[k] + "  ";
		}
		System.out.print("발생한 난수 : " + str);	
		
		
		
	}
	
	public void practice12() {
		int[] arr = new int[6];
		

		
		for(int i=0; i<arr.length; i++) {
			int randomNum = (int)(Math.random()*45 +1);
			arr[i] = randomNum;
			for(int k=0; k<i; k++) {
				if (arr[k] == randomNum) {
					i--;
				}
			}
		}
		
		String str = "";
		
		for(int k=0; k<arr.length; k++) {
			str += arr[k] + "  ";
		}
		System.out.print("로또번호 : " + str);			
		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 : " );
		String str = sc.next();

		char[] arr = new char[str.length()];
		
		
		for(int k=0; k<str.length(); k++) {
			arr[k] += str.charAt(k);
		}
		System.out.println("여기야여기" + Arrays.toString(arr));
		

	
		
		
		
		
		
		
	}
	
	
	
}
