package com.saeyan.controller;

import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.BoardCheckPassAction;
import com.saeyan.controller.action.BoardCheckPassFormAction;
import com.saeyan.controller.action.BoardListAction;
import com.saeyan.controller.action.BoardUpdateAction;
import com.saeyan.controller.action.BoardUpdateFormAction;
import com.saeyan.controller.action.BoardViewAction;
import com.saeyan.controller.action.BoardWriteAction;
import com.saeyan.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		//싱글톤페턴
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("board_list")) {
			//리스트를 보여주세요(forward강제페이지이동)
			action = new BoardListAction();
		}else if(command.equals("board_write_form")) {
			//등록폼를 보여주세요(forward강제페이지이동)
			action = new BoardWriteFormAction();
		}else if(command.equals("board_write")) {
			//DB에 정보를 저장합니다.
			action = new BoardWriteAction();
		}else if(command.equals("board_view")) {
			//하나의 정보를 확인합니다.
			action = new BoardViewAction();
		}else if(command.equals("board_check_pass_form")) {
			//하나의 정보를 확인합니다.
			action = new BoardCheckPassFormAction();
		}else if(command.equals("board_check_pass")) {
			//하나의 정보를 확인합니다.
			action = new BoardCheckPassAction();
		}else if(command.equals("board_update_form")) {
			//하나의 정보를 확인합니다.
			action = new BoardUpdateFormAction();
		}else if(command.equals("board_update")) {
			//하나의 정보를 확인합니다.
			action = new BoardUpdateAction();
		}
		return action;
	}
}
