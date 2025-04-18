package quanlythuvien;

public class BookContext {
	private BookState bookState;

	public void setBookState(BookState bookState) {
		this.bookState = bookState;
	}

	public void applyState() {
		bookState.handleRequest();
	}
	

}
