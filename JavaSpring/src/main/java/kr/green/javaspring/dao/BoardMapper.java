package kr.green.javaspring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.green.javaspring.pagination.Criteria;

public interface BoardMapper {

	public List<Board> getBoard();
	
	// 페이지 정보를 이용해서 게시판의 글의 리스트를 가져오는 메소드
	public List<Board> getListPage(@Param("cri") Criteria cri);
	public int getCountBoard();
	
	
	// 검색
	public Integer getCountBoardByTitle(@Param("search") String search);
	public List<Board> getListPageByTitle(@Param("cri") Criteria cri, @Param("search") String search);

	public Integer getCountBoardByAuthor(@Param("search") String search);
	public List<Board> getListPageByAuthor(@Param("cri") Criteria cri, @Param("search") String search);
	
	public Integer getCountBoardByContents(@Param("search") String search);
	public List<Board> getListPageByContents(@Param("cri") Criteria cri, @Param("search") String search);
	
}





