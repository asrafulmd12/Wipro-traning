package encapsulation_practice;
class BankAccount {
        private double balance;// 1000
// transfer amt
       public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;// 1000+1000=2000
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;// 2000-1000=1000
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
 
    public double getBalance() {
      return balance;// retrieve current balance
    }
}
 
public class Bank_account {
    public static void main(String[] args) {
    	BankAccount acc = new BankAccount();
 
        acc.deposit(1000);
        acc.withdraw(2000);
        System.out.println("Balance= "+acc.getBalance());
        Student st=new Student();
        System.out.println(st.rollno);// public
        System.out.println(st.name);// private name
//     try {
//     Encapsulation_practice.Student.st.rollno;// 1010
//     }catch(Exception e)
//     {
//    	 System.out.println(e);
//     }
    }
}
 