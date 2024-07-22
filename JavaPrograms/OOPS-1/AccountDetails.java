import java.util.*;
class Account {
	    private int accountId;
	    private String accountType;
	    private int balance;

	    public int getAccountId() {
	        return accountId;
	    }
	    public void setAccountId(int accountId) {
	        this.accountId = accountId;
	    }
	    public String getAccountType() {
	        return accountType;
	    }
	    public void setAccountType(String accountType) {
	        this.accountType = accountType;
	    }
	    public int getBalance() {
	        return balance;
	    }
	    public void setBalance(int balance) {
	        this.balance = balance;
	    }
	    public boolean withdraw(int amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Balance amount after withdraw: " + balance);
	            return true;
	        } 
	        else {
	            System.out.println("Sorry!!! No enough balance");
	            return false;
	        }
	    }
	}
	public class AccountDetails {
	    private static Scanner sc = new Scanner(System.in);

	    public static Account getAccountDetails() {
	        Account account = new Account();

	        System.out.print("Enter account id: ");
	        account.setAccountId(sc.nextInt());

	        sc.nextLine();
	        System.out.print("Enter account type: ");
	        account.setAccountType(sc.nextLine());

	        int balance;
	        do {
	            System.out.print("Enter balance: ");
	            balance = sc.nextInt();
	            if (balance <= 0)
	                System.out.println("Balance should be positive");
	        }
	        while (balance <= 0);
	        account.setBalance(balance);
	        return account;
	    }
	    public static int getWithdrawAmount() {
	        int amount;
	        do {
	            System.out.print("Enter amount to be withdrawn: ");
	            amount = sc.nextInt();
	            if (amount <= 0)
	                System.out.println("Amount should be positive");
	        }
	        while (amount <= 0);
	        return amount;
	    }
	    public static void main(String[] args) {
	        Account account = getAccountDetails();
	        int withdrawAmount = getWithdrawAmount();

	        account.withdraw(withdrawAmount);
	        sc.close();
	    }
	}