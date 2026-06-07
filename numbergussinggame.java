import java.util.Scanner;
import java.util.Random;


public class numbergussinggame {

    public static void main(String[] args){

    Random random=new Random();
    Scanner scanner=new Scanner(System.in);

    int guess;
    int min=1;
    int max=100;
    int attempts=0;
    int randomNumber=random.nextInt(min,max+1);

    System.out.println("Nimber gussing game: ");


    System.out.printf("guess the number between %d-%d\n", min, max);

    do{
        System.out.println("Enter the guessed number: ");
        guess=scanner.nextInt();
        attempts++;

        if(guess<randomNumber) System.out.println("Entered number is too low: ");
        else if(guess>randomNumber) System.out.println("Entered number is too high: ");
        else {
            System.out.println("CORRECT!the number was " + randomNumber);
            System.out.println("# Number of attempts: " + attempts);
        }

    }while(guess!=randomNumber);
    scanner.close();






    }
    
}
