package quanlythuvien;

public class MainTest {
	public static void main(String[] args) {
		BookContext bookContext = new BookContext();
		bookContext.setBookState(new Available());
		bookContext.applyState();
		
		bookContext.setBookState(new Checkout());
		bookContext.applyState();
		
		bookContext.setBookState(new OnHold());
		bookContext.applyState();
		
		bookContext.setBookState(new Returned());
		bookContext.applyState();
		
		bookContext.setBookState(new Lost());
		bookContext.applyState();
	}

}
