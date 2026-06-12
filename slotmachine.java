import java.util.Scanner;
import java.util.Random;


public class slotmachine {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();



        int balance=100;
        int bet;
        int payout;
        String[] row;

        System.out.println("**********Welcome to Slot game***********");

        while(balance>0){
            System.out.println("Current balance: $" + balance);
            System.out.println("enter your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet>balance){
                System.out.println("INSUFFICIENT FUNDS");

            }
            else if(bet<=0){
                System.out.println("bet amount cannot be less than 0");

            }
            else {
                balance-=bet;
                System.out.println("$" + balance);
            }

            System.out.println("Spinning.......");
            row = spinRow();
            printRow(row);
            payout =getpayout(row, bet);
            if(payout>0){
                 System.out.println("your earnong id: $" + payout);
                 balance+=payout;
            // System.out.println("your total balance: $" + balance);

            }
            else {
                System.out.println("YOU LOOSE");
            }
            // System.out.println("your earnong id: $" + payout);
            // System.out.println("your total balance: $" + balance+ payout);
            System.out.println("Do you want to play again? (Y/N): ");
            if(scanner.nextLine().toUpperCase().equals("N")) break;




        }
         System.out.println("your total balance: $" + balance);

        // static String[] spinRow(){
        //     String[] symbols={"🍒", "🥭", "❤️", "🍀", "✨"};
        //     String[] row=new String[3];
        //     Random random=new Random();

        //     for(int i=0;i<3;i++){
        //         row[i]=symbols[random.nextInt(symbols.length)];
        //     }
        //     return String[0];
        // }

    }
     static String[] spinRow(){
            String[] symbols={"🍒", "🥭", "❤️", "🍀", "✨"};
            String[] row=new String[3];
            Random random=new Random();

            for(int i=0;i<3;i++){
                row[i]=symbols[random.nextInt(symbols.length)];
            }
            return row;
        }

        static void printRow(String[] row){
            System.out.println("*********************");
            System.out.println(" " + String.join("|", row));
            System.out.println("*********************");

        }

        static int getpayout(String[] row, int bet){

            if(row[0].equals(row[1]) && row[1].equals(row[2])){
                return switch(row[0]){
                    case "🍒" -> bet*4;
                    case "🥭" -> bet*5;
                    case "❤️" -> bet*10;
                    case "🍀" -> bet*2;
                    case "✨" -> bet*3;
                    default -> 0;


                };
            }
            return 0;
        }
    
}
