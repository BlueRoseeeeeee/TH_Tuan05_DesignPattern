package Strategy;

public class TimDuongContext {
	private DiChuyen dichuyen;

	public DiChuyen getDichuyen() {
		return dichuyen;
	}

	public void setDichuyen(DiChuyen dichuyen) {
		this.dichuyen = dichuyen;
	}

	public void timDuong(String diemdi, String den) {
		dichuyen.diChuyen(diemdi, den);
	}

}
