public class Tester{
 public static void main(String[] args){
  BankAccount account = new BankAccount(123412335, "Bananas");
  System.out.println("Default settings: balance = 0, accountID = 123412335, password = \"Bananas\"");
  System.out.println("accountID: "+ account.getAccountID());
  System.out.println("balance: " + account.getBalance());
  account.deposit(50);
  System.out.println("deposited 50, balance: " + account.getBalance());
  account.deposit(-50);
  System.out.println("failed, amount < 0");
  account.withdraw(50);
  System.out.println("withdrew 50, balance: " + account.getBalance());
  account.withdraw(50);
  System.out.println("failed, amount > balance");  
  account.withdraw(-50);
  System.out.println("failed, amount < 0");
  account.setPassword("Apples");
  System.out.println("changed password from Bananas to Apples");
  System.out.println("ID\tBALANCE :" + account.toString());
 }


}