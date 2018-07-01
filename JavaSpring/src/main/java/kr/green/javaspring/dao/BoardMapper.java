package kr.green.javaspring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.green.javaspring.pagination.Criteria;

public interface BoardMapper {

	public List<Board> getBoard();
	
	// ������ ������ �̿��ؼ� �Խ����� ���� ����Ʈ�� �������� �޼ҵ�
	public List<Board> getListPage(@Param("cri") Criteria cri);
	public int getCountBoard();
	
	
	// �˻�
	public Integer getCountBoardByTitle(@Param("search") String search);
	public List<Board> getListPageByTitle(@Param("cri") Criteria cri, @Param("search") String search);

	public Integer getCountBoardByAuthor(@Param("search") String search);
	public List<Board> getListPageByAuthor(@Param("cri") Criteria cri, @Param("search") String search);
	
	public Integer getCountBoardByContents(@Param("search") String search);
	public List<Board> getListPageByContents(@Param("cri") Criteria cri, @Param("search") String search);
	
}





