class BankAccount{
    public String getAccHolderName() {
        return accHolderName;
    }

    private String accHolderName;

    public int getAccNo() {
        return accNo;
    }
    private int accNo;

    public String getAccType() {
        return accType;
    }
    private String accType;

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    private String currencyType;

    public boolean isDebitCardIssued() {
        return isDebitCardIssued;
    }

    public void setDebitCardIssued(boolean debitCardIssued) {
        isDebitCardIssued = debitCardIssued;
    }

    private  boolean isDebitCardIssued;

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    private double accBalance;

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }

    private double interestEarned;

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    private  static final float annualInterestRate= 2.5F;//...........

    public BankAccount(String accHolderName,int accNo,String accType ){
        this.accHolderName=accHolderName;
        this.accNo=accNo;
        this.accType=accType;
    }

    public void displayAccountDetails(){
        System.out.println("Account Holder Name:"+getAccHolderName());
        System.out.println("Account Number:"+getAccNo());
        System.out.println("Account Type:"+getAccType());
        System.out.println("Type:"+getCurrencyType());
        System.out.println("Is a Debit Card Issued:"+isDebitCardIssued());
        System.out.println("Account Balance:"+getAccBalance());
        System.out.println("Interest Earned:"+getInterestEarned());
    }

    public double calculateInterestEarned(double accBalance,String accType){
        if (accType.equals("Savings")){
            double interestEarned=accBalance*annualInterestRate;
            return interestEarned;
        }else {
            return 0;
    }


}
}

public class Account{
    public static void main(String[] args){
        BankAccount savings=new BankAccount("John",80801020,"savings");
        BankAccount current=new BankAccount("Peter",80811021,"current");

        savings.setAccBalance(100000);
        savings.setCurrencyType("Rupees");
        savings.setDebitCardIssued(true);

        current.setAccBalance(150000);
        current.setCurrencyType("Rupees");
        current.setDebitCardIssued(false);

        savings.setInterestEarned(savings.calculateInterestEarned(100000,"Savings"));
        current.setInterestEarned(current.calculateInterestEarned(150000,"Current"));

        savings.displayAccountDetails();
        System.out.println(".................................................................................");
        current.displayAccountDetails();



    }
}


