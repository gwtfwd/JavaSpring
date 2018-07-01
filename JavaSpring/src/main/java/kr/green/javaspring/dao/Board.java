package kr.green.javaspring.dao;

public class Board {

	private Integer number;
	private String title;
	private String contents;
	private String author;
	
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Board [number=" + number + ", title=" + title + ", contents=" + contents + ", author=" + author + "]";
	}
	
}
