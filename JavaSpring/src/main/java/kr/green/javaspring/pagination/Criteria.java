package kr.green.javaspring.pagination;

public class Criteria {

	private int page;			// 현재페이지
	private	int perPageNum;		// 한 페이지 당 컨텐츠개수
	
	public Criteria() {			// Criteria 디폴트 생성자 : 현재페이지를 1로, 한 페이지당 게시글 수 10개
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
		//현재 페이지 번호를 음수로 설정하려 할 때

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
