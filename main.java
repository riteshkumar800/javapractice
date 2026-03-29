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







