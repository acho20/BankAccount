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
}