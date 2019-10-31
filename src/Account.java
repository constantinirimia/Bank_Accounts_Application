public abstract class Account implements IRate{
   
   private String name;
   private String SSN;
   private double balance;
   
   protected String accNumber;
   protected double rate;
   
   private static int index = 10000;
   
   public Account(String name, String SSN, double initDeposit){
     this.name = name;
     this.SSN = SSN;
     balance = initDeposit;
     
     index ++;
     this.accNumber = setAccountNumber();
   
      setRate();
    
   }
   
   public abstract void setRate();
   
   private String setAccountNumber (){
      String lastTwoDigitsOfSSN = SSN.substring(SSN.length() - 2, SSN.length());
      
      int uniqueId = index;
      int randomNumber = (int) (Math.random() * Math.pow(10,3));
      return lastTwoDigitsOfSSN + uniqueId + randomNumber;
   } 
   
   public void compound(){
      double accruedInterest = balance * (rate / 100);//divided by 100 because our rate is in percentace(over 100)
      balance = balance + accruedInterest;
      System.out.println("Accrued interest: " + accruedInterest);
      printBalance();
   }
   
   public void deposit(double amount){
      balance = balance + amount;
      System.out.println("Depositing $" + amount);
      printBalance();
   }
   
   public void withdraw(double amount){
      balance = balance - amount;
      System.out.println("Withdrawing $" + amount);
      printBalance();
   }
   
   public void transfer(String toWhere, double amount){
      balance = balance - amount;
      System.out.println("Transferring $"+ amount + " to " + toWhere);
      printBalance();
   }
   
   public void printBalance(){
      System.out.println("Your balance now is: $" + balance);
   }
   
   
   public void showInfo(){
      System.out.println("Name: " + name +
                         "\nAccount number: " + accNumber +
                         "\nBalance: " + balance+
                         "\nRate: "+ rate +"%"
                         );
   }
   

}
