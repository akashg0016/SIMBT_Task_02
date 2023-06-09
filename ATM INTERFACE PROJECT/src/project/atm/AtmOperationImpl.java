package project.atm;
import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
    	
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance to withdraw !!");
            }
    }
    
    
    @Override
    public void transferAmount(double transferAmount) {
    	
            if (transferAmount <= atm.getBalance()) {
                ministmt.put(transferAmount, " Amount transfered");
                System.out.println("Amount: " + transferAmount + "from your account ");
                atm.setBalance(atm.getBalance() - transferAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance to transfer!!");
            }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewTranscationHistory() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}
//public class AtmOperationImpl {
//
//}
