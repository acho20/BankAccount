public class BankAccount{
 private double balance;
 private int accountID;
 private String password;
 
 public BankAccount(int accID, String pwd){
  balance = 0;
  accountID = accID;
  password = pwd;
 }	

 public double getBalance(){
  return balance;
 }
 
 public int getAccountID(){
  return accountID;
 }

 public void setPassword(String newPass){
  password = newPass;
 }

 public boolean deposit(double amount){
  if (amount < 0){
   return false;
  }else{
   balance += amount;
   return true; 
  }
 }

 public boolean withdraw(double amount){
  if (amount < 0 || amount > balance){
   return false;
  }else{
   balance -= amount;
   return true;
  }
 }

 public String toString(){
  return "#" + accountID + "\t" + "$" + balance;
 }

 private boolean authenticate(String password){
  return (this.password.equals(password));
 }

 public boolean transferTo(BankAccount other, double amount, String password){
  if (amount < 0 || getBalance() < amount){
   return false;
  }else{
   other.deposit(amount);
   withdraw(amount);
   return true;
  }
 }

}