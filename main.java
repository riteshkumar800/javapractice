// public class main{


//     public static void main(String[] args){

//         // System.out.print("I LIKE PIZZA!");
//         // System.out.print("its really good");


//         System.out.println("I LIKE PIZZA!"); //ln for next line, or System.out.print("I LIKE PIZZA!\n"); also works
//         System.out.println("its really good");
//         System.out.print("its yummy!\n");
//         System.out.print("Buy me pizza!");
//     }
    


// }


// public class main{

//     public static void main(String[] args){
        


//         // INT

//          int age=30;
//          int year=2026;
//          int quantity=3;
//          System.out.println("The year is " + year);

//         //  DOUBLE
         

//          double price=19;
//          double gpa=6.7;
//          double temperatur=12.5;

//          System.out.println("$" + price);




//         //  CHAR

//         char grade='A';
//         char symbol='!';
//         char currency='$';

//         System.out.println(symbol);




//         // BOOLEAN
//         boolean isstudent=true;
//         boolean forSale=false;
//         boolean isOnline=true;

//         System.out.println(forSale);


//         if(isstudent){
//             System.out.println("you are a student");
//         }
//         else{
//             System.out.println("You are not a student");
//         }


//         String name="Riitesh";
//         String food="pizza";
//         String car="Mustang";
//         String color="red";

//         System.out.println("Hello "+ name);
//         System.out.println("you are  "+ age + "years old");
//         System.out.println("Your gpa is "+ gpa);



//         System.out.println("your choice is a "+ color+" "+year+ " "+car+" ");
        

//         if(forSale){
//             System.out.println("There is "+ car+" for sale");

//         }
//         else{
//             System.out.println("The "+ car +" is out of sale");
//         }


//         //

//     }
// }

// #############################################################################################################################
// ##INPUT

// import java.util.Scanner;

// public class main{

//     public static void main(String[] args){

//         Scanner scanner= new Scanner(System.in);

//         // System.out.println("Enter your name: ");
//         System.out.print("Enter your name: ");
//         String name=scanner.nextLine();
//         // String name=scanner.next();

//        System.out.print("Enter you Age: ");
//        int age=scanner.nextInt();


//        System.out.print("Enter your gpa: ");
//        double gpa=scanner.nextDouble();

//        System.out.print("Are you a Studend? (true/false): ");
//        boolean isStudent=scanner.nextBoolean();

        
//         System.out.println("Hello "+ name);
//         System.out.println("You are "+ age + " years old");
//         System.out.println("Your gpa is: "+gpa);
//         System.out.println("isStudent: "+ isStudent);


//         if(isStudent){
//             System.out.println("You are enrolled as a Student");
//         }
//         else{
//             System.out.println("You are not enrolled");
//         }


//         scanner.close();

//     }

// }

// #############################################################################################################################

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args){
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age=scanner.nextInt();

//         scanner.nextLine(); // THIS LINE IS VERY IMPORTANT AS \n WILL BE TAKEN AS INPUT FOR THE NEXT INPUT TAKING AUTOMATICALLY, TRY IT

//         System.out.print("Enter your favourite color: ");
//         String color=scanner.nextLine();

//         System.out.print("you are "+ age + "years old");
//         System.out.print("Your favourite color is: "+ color);




//     }
// }


// #############################################################################################################################
// import java.util.Scanner;

// public class main{
//     public static void main(String[] args){
//         Scanner scanner=new Scanner(System.in);

//         double width=0;
//         double height=0;
//         double area=0;

//         System.out.print("Enter the width: ");
//         width=scanner.nextDouble();

//         System.out.print("Enter the height: ");
//         height=scanner.nextDouble();

//         area=width*height;

//         System.out.print("Area is "+area+"cm2");

//         scanner.close();

        
//     }
// }

// #############################################################################################################################

// MAD LIBS GAME    
// import java.util.Scanner;

// public class main{
//     public static void main(String[] args){
//         Scanner scanner=new Scanner(System.in);

//         String adjective1;
//         String noun1;
//         String adjective2;
//         String verb1;
//         String adjective3;

//         System.out.print("Enter an adjective (description): ");
//         adjective1=scanner.nextLine();
//         System.out.print("Enter a noun (animal or person): ");
//         noun1=scanner.nextLine();
//         System.out.print("Enter an adjective (description): ");
//         adjective2=scanner.nextLine();
//         System.out.print("Enter an adjective (description): ");
//         verb1=scanner.nextLine();
//         System.out.print("Enter an adjective (description): ");
//         adjective3=scanner.nextLine();


//         System.out.println("Today i went to a "+ adjective1 + " zoo");
//         System.out.println("in an exbhit i saw a "+ noun1 + " .");
//         System.out.println( noun1 +"was "+ adjective2 + " and" + verb1+" !");
//         System.out.println("i was "+ adjective3 + " !");

//     }
// }

// SEE FILE SHOPPINGCART

// #############################################################################################################################
// RANDOM
// import java.util.Random;
// public class main{
//     public static void main(String[] args){

//         Random random = new Random();


//         int number1;
//         int number2;
//         int number3;
//         double number;
//         number=random.nextDouble();
//         boolean isHeads;
//         isHeads=random.nextBoolean();
        

//         number1=random.nextInt();
//         number2=random.nextInt(1,101);
//         number3=random.nextInt(1,101);

//         System.out.println(number1);
//         System.out.println(number2);
//         System.out.println(number3);
//         System.out.println(number);
//         System.out.println(isHeads);

//         if(isHeads){
//             System.out.println("HEADS");
//         }
//         else{
//             System.out.println("Tails");
//         }

        


//     }
// };


// #############################################################################################################################
// Hypteneous
// import java.util.Scanner;
// public class main{
//     public static void main(String[] args){

//         Scanner scanner=new Scanner(System.in);

//         // double a;
//         // double b;
//         // double c;

//         // System.out.print("Enter the length of side A: ");
//         // a=scanner.nextDouble();

//         // System.out.print("Enter the side B: ");
//         // b=scanner.nextDouble();

//         // c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

//         // System.out.println("The hypotenous side(c) is: "+c+"cm");



//         double r;
//         double c;
//         double a;
//         double v;

//         System.out.print("Enter the radius: ");
//         r=scanner.nextDouble();

//         c=2*Math.PI*r;
//         a=Math.PI*Math.pow(r,2);
//         v=(4.0/3.0)*Math.PI*Math.pow(r,3);


//         System.out.printf("The circumference is: %.1fcm\n", c);
//         System.out.printf("The area is: %.1fcm\n", a);
//         System.out.printf("The volume is: %.1fcm\n", v);

//         scanner.close();







//     }
// }

// #############################################################################################################################
// SPECIFIERS

import java.util.Scanner;
public class main{
    public static void main(String[] args){


        String name="Spongebob";
        char fl='s';
        int age=30;
        double height=60.5;
        boolean isEmployed=true;


        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with a %c\n", fl);
        System.out.printf("you are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name ,age);

        double price1=9.99;
        double price2=1000000.15;
        double price3=-54.01;

        System.out.printf("%.3f\n", price1);
        System.out.printf("%.4f\n", price2);
        System.out.printf("%.1f\n",price3);



        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n",price3);



        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.2f\n",price3);


        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n",price3);






    }
}






