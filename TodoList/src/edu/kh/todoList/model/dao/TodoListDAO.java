package edu.kh.todoList.model.dao;

import java.util.List;

import edu.kh.todoList.model.dto.Todo;

// DAO(Data Access Object) :
// 데이터가 저장된 파일/DB/외부 장치에 접근하는 역할을 하는 객체

public interface TodoListDAO {

	
	/**
	 * 할 일 목록 반환 DAO
	 * @return todoList
	 */
	List<Todo> todoListFullView();

}
