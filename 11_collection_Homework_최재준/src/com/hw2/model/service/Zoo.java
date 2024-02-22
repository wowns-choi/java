package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	
	private List<Animal> animals = new ArrayList<Animal>();
	
	public void addAnimal(Animal animal) {
		animals.add(animal);		
	}
	
	public void showAnimals() {
		for(Animal animal : animals) {
			animal.sound();
		}
	}
	
	public void displayMenu() {
		
		int check = 10;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("******* KH 동물원 *******");
			System.out.println("원하는 작업을 선택하세요");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			
			int input = sc.nextInt();
			
			switch(input) {
			case 1 : 
				for(Animal animal : animals) {
					animal.sound();
				}
				break;
			case 2 : System.out.println("프로그램을 종료합니다");
					check = 0;
					break;
			}

		}while(check != 0);
		
		
		
		
		
	}
	
	//기본 생성자
	public Zoo() {
		super();
	}
	
	//getter setter

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	

}
