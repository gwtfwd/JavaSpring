package kr.green.javaspring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.green.javaspring.dao.Board;
import kr.green.javaspring.dao.BoardMapper;
import kr.green.javaspring.pagination.Criteria;
import kr.green.javaspring.pagination.PageMaker;

@Controller

@RequestMapping(value="/board/*")

public class BoardController {

	@Autowired
	BoardMapper boardMapper;
	
	@RequestMapping(value = "list")
	public String boardListGet(Model model, Criteria cri) {
		
		int totalCount = boardMapper.getCountBoard();
		PageMaker pageMaker = new PageMaker();
		
		//ArrayList<Board> list = (ArrayList)boardMapper.getBoard();
		
		ArrayList<Board> list = (ArrayList)boardMapper.getListPage(pageMaker.getCriteria());
		pageMaker.setTotalCount(totalCount);
		pageMaker.setCriteria(cri);
		
		pageMaker.setTotalCount(totalCount);
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("list", list);
		
		return "/board/list";
	}
	
	
	
	
	
	
	
	
}
