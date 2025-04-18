package Strategy;

public class TestMain {
	public static void main(String[] args) {
		TimDuongContext timDuongContext = new TimDuongContext();
		timDuongContext.setDichuyen(new XeMay());
		timDuongContext.timDuong("Hà Nội", "TP.HCM");
	}

}
