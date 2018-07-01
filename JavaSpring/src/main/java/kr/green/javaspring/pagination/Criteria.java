package kr.green.javaspring.pagination;

public class Criteria {

	private int page;			// ����������
	private	int perPageNum;		// �� ������ �� ����������
	
	public Criteria() {			// Criteria ����Ʈ ������ : ������������ 1��, �� �������� �Խñ� �� 10��
		this.page = 1;
		this.perPageNum = 5;	
	}
	public Criteria(int page, int perPageNum) {
		this.page = page;
		this.perPageNum = perPageNum;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		//���� ������ ��ȣ�� ������ �����Ϸ� �� ��

		if(page <= 0) {
			this.page = 1;
		}
		else
			this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		
		if(perPageNum <=0 || perPageNum > 100) {
			this.perPageNum = 10;
		}
		else
			this.perPageNum = perPageNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
	public int getPageStart() {
		
		return (page-1)*perPageNum;
	}
	
	
}
