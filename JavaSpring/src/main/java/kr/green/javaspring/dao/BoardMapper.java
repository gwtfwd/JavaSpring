package kr.green.javaspring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.green.javaspring.pagination.Criteria;

public interface BoardMapper {

	public List<Board> getBoard();
	
	// ������ ������ �̿��ؼ� �Խ����� ���� ����Ʈ�� �������� �޼ҵ�
	public List<Board> getListPage(@Param("cri") Criteria cri);
	public int getCountBoard();
	
	
	
	
}





