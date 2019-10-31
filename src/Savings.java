public class Savings extends Account{

   private int safetyDepositBoxID;
   private int safetyDepositBoxKey;
   
   public Savings(String name, String SSN, double initDeposit){
      super(name, SSN, initDeposit);
      accNumber = "1" + accNumber;
      setSafetyDepositBox();
   }
   
    @Override
     public void setRate(){
      rate = getRate() - 0.25;
   }
   
   private void setSafetyDepositBox(){
      safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
      
      safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
      System.out.println("ID"+safetyDepositBoxID);
   }
   
   
   
    public void showInfo(){
      System.out.println("Account Type: Savings");

      super.showInfo();
      
      System.out.println("Saving account details: " +
                        "\n Safety deposit box number is: " + safetyDepositBoxID +
                        "\n Safety deposit box PIN is: " + safetyDepositBoxKey 
                       // +"\nRate: " + rate + "%"
                        ); 
   } 
   
  

}
