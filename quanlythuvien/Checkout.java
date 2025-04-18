package quanlythuvien;
//người khác đang mượn và và có ngày đến hạn trả sách
public class Checkout implements BookState {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		System.out.println("Người khác đang mượn");	
	}

}
