package quanlythuvien;

public class Available implements BookState {

	@Override
	public void handleRequest() {
		System.out.println("Book is available");
	}
}
