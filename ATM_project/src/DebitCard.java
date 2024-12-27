import java.util.*;

public class DebitCard {
static Scanner sc=new Scanner(System.in);
static  int balance=1000;
static private int pin=1234;
public static void main(String[] args ) {
		int userPin=0;
		int choice=0;
		int userAamount=0;         	
		do {
		System.out.println("Enter your Choice");
		System.out.println("1.create new Account");
		System.out.println("2.Deposite");
		System.out.println("3.widrawal");
		System.out.println("4.check balance");
		System.out.println("5.EXIT");
		choice= sc.nextInt();
		 switch(choice) {
		 case 1:
			createAccount();
	         break;     
		 case 2: 
	        deposit();
	        break;
	    case 3:
		Withdrawal() ;
		break;
     case 4:
		checkBalance();
		break;
		  }	
		}while(choice>0 && choice<5);
			System.out.println("Program is Exited...."); 	
	 } 
        public static void createAccount(){
			 String name="";
			 String phone="";
			 String address="";
			 System.out.println("Enter your Name");
	   	 sc.nextLine();
		 name=sc.nextLine();
         System.out.println("Enter Phone Number.");
        phone=sc.next();
         System.out.println("Enter Address");
         sc.nextLine();
          address=sc.nextLine();
          System.out.println("Genrate Pin");
          pin=sc.nextInt();
          System.out.println("Your  Details Set Successfully");
		}
	 
	 public static void deposit() {
		int userPin=0;
		int userAmount=0;
		System.out.println("Enter Your Pin");
		 userPin=sc.nextInt();
		if (userPin==pin) {
		 System.out.println("Enter Amount To Deposite");
		 userAmount=sc.nextInt();
		  balance = balance+userAmount ;
		  System.out.println("Deposit succesfully");
		  System.out.println(balance);
		}else {
			System.out.println("Incorrect Pin");
		}
		 } 
	 
	      public static void Withdrawal() {
			 int userAmount=0;
			 int userPin=0;
		System.out.println("Enter User Pin");
		userPin=sc.nextInt();
		if(userPin==pin) {
			System.out.println("Enter Your Amount");
		userAmount=sc.nextInt(); 
		if(balance>=userAmount) {
			System.out.println("collect your cash");
			balance=balance-userAmount;
			System.out.println("remaining balance is "+balance);	
			}else {
			System.out.println("Insufficiant Balance ");
			}
		}else {
			System.out.println("Invalid Pin");
		}
	  }public static void checkBalance() {
			 int userPin=0;
			 System.out.println("Enter pin");
			 userPin=sc.nextInt();
			 if(pin==userPin) {
			 System.out.println(" baalance is "+balance);
			 }else {
		     System.out.println("invalid pin");
	     	 }
			 
		 }
	
}

	
	

		 
