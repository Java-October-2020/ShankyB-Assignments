import java.util.Random;

public class BankAccount {
	
	private String accountnumber;
	private double checkingbal;
	private double savingbal;	
	public static int totalaccounts;
	public static int totalcheckingaccounts;
	public static int totalsavingaccounts;
	public static int totalamount;
	
	
	
	private static Random generateAccountNumber() {
		Random accountnumber= new Random();
		return accountnumber;
	}
	
	
	public static void main(String[] args) {
		System.out.println(generateAccountNumber());
	}

}
