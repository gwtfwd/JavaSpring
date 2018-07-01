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
	public String boardListGet(Model model, Criteria cri, String search, Integer type) {
		
		if(cri == null) {
			cri = new Criteria();
		}
		
		int totalCount = 0;
		PageMaker pageMaker = new PageMaker();
		
		//ArrayList<Board> list = (ArrayList)boardMapper.getBoard();
		//ArrayList<Board> list = (ArrayList)boardMapper.getListPage(pageMaker.getCriteria());
		
		ArrayList<Board> list;
		pageMaker.setTotalCount(totalCount);
		pageMaker.setCriteria(cri);
		
		if( type == null ) {
			type = 0;
		}
		if( type == 0 ) {
			totalCount = boardMapper.getCountBoard();
			list = (ArrayList)boardMapper.getListPage(cri);
		}
		else if( type == 1 ) {
			totalCount = boardMapper.getCountBoardByTitle("%"+search+"%");
			list = (ArrayList)boardMapper.getListPageByTitle(cri, "%"+search+"%");
		}
		else if( type == 2 ) {
			totalCount = boardMapper.getCountBoardByAuthor("%"+search+"%");
			list = (ArrayList)boardMapper.getListPageByAuthor(cri, "%"+search+"%");
		}
		else {
			totalCount = boardMapper.getCountBoardByContents("%"+search+"%");
			list = (ArrayList)boardMapper.getListPageByContents(cri, "%"+search+"%");
		}
		
		pageMaker.setTotalCount(totalCount);
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("list", list);
		model.addAttribute("search", search);
		model.addAttribute("type", type);
		
		return "/board/list";
	}
	
	
	
	
	
	
	
	
}
