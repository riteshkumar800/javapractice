import java.util.Scanner;

public class shoppingcart{
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double total;


        System.out.print("What item would u like to buy: ");
        item=scanner.nextLine();

        System.out.print("What is price of the each?: ");
        price=scanner.nextDouble();

        System.out.print("What is quantity?: ");
        quantity=scanner.nextInt();

        total=price*quantity;

        System.out.println("\nyou have bought "+ quantity+" " +item + "/s");
        System.out.println("your total is "+currency+total);

        scanner.close();




    }


}

