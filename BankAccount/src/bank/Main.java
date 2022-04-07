package bank;

public class Main {

	public static void main(String[] args) {
		
		PersonDetails p=new PersonDetails();
		p=GetAccountDetails.getAccount();
		int c=GetAccountDetails.getWithdrawAmount();
		p.withdraw(c);
	}
}
