package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee em1 = new Employee();
		Employee em2 = new Employee(1, "홍길동", 19, 'M', "010-2222-3333", "서울 잠실");		
		Employee em3 = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "010-1111-2222", "서울 마곡");
		
		Employee[] emp = new Employee[3];
		emp[0] = em1;
		emp[1] = em2;
		emp[2] = em3;
		
		for(int i = 0; i<emp.length; i++) {
			System.out.println("emp[" +i+ "] : " + emp[i].getEmpNo()+ ", "+ emp[i].getEmpName()+ ", " + emp[i].getDept()+ ", " + emp[i].getJob()+ ", " + emp[i].getAge()+ ", " +  emp[i].getGender()+ ", " + emp[i].getSalary()+ ", " + emp[i].getBonusPoint()+ ", " + emp[i].getPhone()+ ", " + emp[i].getAddress());
		}
		
		System.out.println("==========================================");
		
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("010-5555-9999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);

		for(int i = 0; i<2; i++) {
			System.out.println("emp[" +i+ "] : " + emp[i].getEmpNo()+ ", "+ emp[i].getEmpName()+ ", " + emp[i].getDept()+ ", " + emp[i].getJob()+ ", " + emp[i].getAge()+ ", " +  emp[i].getGender()+ ", " + emp[i].getSalary()+ ", " + emp[i].getBonusPoint()+ ", " + emp[i].getPhone()+ ", " + emp[i].getAddress());
		}
		
		System.out.println("==========================================");
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i].getEmpName() + "의 연봉 : " +(emp[i].getSalary() + (int)(emp[i].getSalary() * emp[i].getBonusPoint())) * 12);
		}
		
		System.out.println("==========================================");

		int salarySum = 0;
		
		for(int i=0; i<emp.length; i++) {
			salarySum += (emp[i].getSalary() + (int)(emp[i].getSalary() * emp[i].getBonusPoint())) * 12;
			
		}
		
		System.out.println("직원들의 연봉의 평균 : " + salarySum/emp.length + "원");

		
		
		
		
		
	}

}
