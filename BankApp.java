import java.util.LinkedList;
import java.util.List;

public class BankApp{
   public static void main(String[] args){
   
      List<Account> accounts = new LinkedList<Account>();
   
      String file = "/Users/user/Downloads/NewBankAccounts.csv";
      
      List<String[]> newAccountMembers = utilities.CSV.read(file);
      
      for(String[] acountHolders : newAccountMembers ){
         System.out.println("New account");
         String name = acountHolders[0];
         String SSN = acountHolders[1];
         String accountType = acountHolders[2];
         double initDeposit = Double.parseDouble(acountHolders[3]);
         
         if(accountType.equals("Savings")){
            accounts.add(new Savings(name, SSN, initDeposit));
         }
         else if(accountType.equals("Checking")){
            accounts.add(new Checking(name, SSN, initDeposit));
         }
         else{
            System.out.println("Error in reading");
         }
      }
      
      for(Account account : accounts) {
         System.out.println();
         account.showInfo();
      }
   }
}