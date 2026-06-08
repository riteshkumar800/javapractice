import java.util.Scanner;

public class bankingprogram {
    static Scanner scanner=new Scanner(System.in);
     static boolean isRunning=true;

    public static void main(String[] args){



        double balance=0;
        int choice;
        while(isRunning){
       

        System.out.println("Enter Your Choice (1-4) ");
        System.out.println("1: Show Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");

        choice=scanner.nextInt();

        switch(choice){
            case 1 ->Showbalance(balance);
            case 2 ->balance +=deposit(); 
            case 3 ->balance-=withdraw(balance);
            case 4 ->Exit();
            default -> System.out.println("Invalid Choice");

        }
    }


    }

    static void Showbalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }

    static double deposit(){
        int amount=0;
        System.out.println("Enter the amount to be deposit: ");
        amount=scanner.nextInt();

        if(amount<0) {
            System.out.println("amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        int amount=0;
        System.out.println("Enter the amount to be withdraw");
        amount=scanner.nextInt();
        if(amount>balance){
            System.out.println("Insufficient amount");
            return 0;

        }
        else {
            return amount;
        }

    }

    static void Exit(){
        System.out.println("Thank u Have a Nice Day!");
                     isRunning=false;
    }


     
}
