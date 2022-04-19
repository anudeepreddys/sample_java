import java.util.Date;

public class Account {
    // Declaration of variables
    private  int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    //default constructor
    Account(){
        this.dateCreated = new Date();
    }
    //constructor with arguments, Parameterized constructor
    Account(int id, double initial_balance){
        this.dateCreated = new Date();
        this.id = id;
        this.balance = initial_balance;
    }
    // Getter methods
    int getId(){
        return this.id;
    }
    // Setter methods
    void setId(int newId){
        this.id = newId;
    }
    double getBalance(){
        return this.balance;
    }
    void setBalance(double newBalance){
        this.balance = newBalance;
    }
    double getAnnualInterestRate(){
        return annualInterestRate;
    }
    void setAnnualInterestRate(double newRate){
        annualInterestRate = newRate;
    }
    Date getDateCreated(){
        return this.dateCreated;
    }
    double getMonthlyInterestRate(){
        return (annualInterestRate/12)/100;
    }
    double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    // Calculation of balance after withdrawal
    void withdraw(double amt){
        double b = getBalance();
        b-=amt;
        setBalance(b);
    }
    // Calculation of balance after deposit
    void deposit(double amt){
        double b = getBalance();
        b+=amt;
        setBalance(b);
    }
    public static void main(String []args){
        // Creation of class object
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        System.out.println("Balance:$"+a.getBalance()+"  Monthly Interest:$"+ a.getMonthlyInterest()+"  Date of creation:"+ a.getDateCreated());
        a.withdraw(2500);
        System.out.println("Withdrawing $2500");
        System.out.println("Balance:$"+a.getBalance()+"  Monthly Interest:$"+ a.getMonthlyInterest()+"  Date of creation:"+ a.getDateCreated());
        a.deposit(3000);
        System.out.println("Depositing $3000");
        System.out.println("Balance:$"+a.getBalance()+"  Monthly Interest:$"+ a.getMonthlyInterest()+"  Date of creation:"+ a.getDateCreated());
    }


}