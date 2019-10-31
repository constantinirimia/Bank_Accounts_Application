public class Checking extends Account{

   private int debitCardNumber;
   private int PIN;
   
   
   public Checking(String name, String SSN, double initDeposit){
      super(name, SSN, initDeposit);
      accNumber = "2" + accNumber;
      setDebitCard();
   } 
   
   @Override
   public void setRate(){
      rate = getRate() * 0.15;
   }
   
   private void setDebitCard(){
      debitCardNumber = (int) (Math.random() * Math.pow(10,12));
      PIN  = (int) (Math.random() * Math.pow(10,4));
   }
   
   public void showInfo(){
     System.out.println("Account Type: Checking");

      super.showInfo();
      System.out.println("Checking account details: " +
                        "\n Debit Card Number: " + debitCardNumber +
                        "\n PIN: " + PIN 
                          );
   }  


}
