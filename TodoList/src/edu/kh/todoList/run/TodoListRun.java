package edu.kh.todoList.run;

import edu.kh.todoList.view.TodoListView;

public class TodoListRun {

	public static void main(String[] args) {
		
		System.out.println("============프로그램 실행=============");
		
		// 프로젝트 흐름
		// Run <-> View <-> Service <-> DAO(Data Access Object) <-> File
		
		TodoListView view = new TodoListView(); // 기본 생성자
		
		view.startView();
		
		
	}

}
