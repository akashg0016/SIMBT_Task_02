package project.atm;

public interface AtmOperationInterf {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount );
    public  void viewTranscationHistory();
    public void transferAmount(double transferAmount);
}