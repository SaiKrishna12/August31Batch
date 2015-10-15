package day28;

public class Hsbc implements Bank{

	public static void main(String[] args) {
		Hsbc h=new Hsbc();
		h.debit();
		h.credit();
		h.moneyTransfer();
	}
	public void debit() {
		System.out.println("Debiting process");
	}
	public void credit() {
		System.out.println("Credite policy");
	}
	public void moneyTransfer() {
		System.out.println("Money transfer procedure");
	}

}
