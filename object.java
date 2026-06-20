import java.util.Timer;
import java.util.TimerTask;


public class object {
    public static void main(String[] args){


        // Car car = new Car();
        
        // car.isRunning=true;
        // System.out.println(car.make);
        // System.out.println(car.isRunning);

        // car.start();

        // Student s1=new Student("spongebob", 40 ,4.2);
        // Student s2=new Student("hathodi", 100,0.02);

        // System.out.println(s1.isEnrolled);
        // System.out.println(s1.gpa);
        // System.out.println(s2.name);
        // String username;
        // String email;
        // int age;

        // User u1=new User();
        // User u2=new User("ritesh");
        // User u3=new User("ritesh", "gfds@gmail.com");
        // User u4=new User("ritesh", "gfsd@gmail.com",22);

        // System.out.println(u3.email);

        // Car car1= new Car("mustang", "white" );
        // Car car2= new Car("lambo", "black");
        // Car car3=new Car("dodge", "black");

        // Car[] car= {car1, car2, car3};

        // for(int i=0;i<3;i++){
        //     car[i].drive();
        // }

        // Dog d1=new Dog();

        // System.out.println(d1.isAlive);

        // Student s1=new Student("kyojuro", "Rengoku", 8.72);
        // s1.showName();

        //  Car car1= new Car("mustang", "white", 2026, "xyz" );
        //  System.out.println(car1);

        // Cat cat =new Cat();
        // Dog dog=new Dog();
        // Fish fish=new Fish();

        // cat.move();
        // dog.move();
        // fish.move();

       // Shape shape =new Shape(); //not allowed
    //    Circle circle= new Circle(5);
    //    System.out.println(circle.area());
    // //    System.out.println(circle.);
    // circle.display();

    // Rabbit rabbit = new Rabbit();
    // hawk hawk =new hawk();
    // rabbit.flee();
    // hawk.hunt();

    // Fish fish = new Fish();
    // fish.flee();
    // fish.hunt();

    // Car car =new Car("dodge" , "black", 10000);
    // car.setColor("Blue");
    // car.setPrice(10000);

    // System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    // Book b1=new Book("sdfghjkg", 546);
    // Book b2=new Book("ertyuiop", 984);
    // Book b3=new Book("mnbgfew", 964);

    // Book[] books = {b1,b2,b3};

    // System.out.println(b3.displayInfo());

    // Library library= new Library("NYC public Library ", 1897 , books); //remove library books will still be there
    // library.displayInfo();

    // Dog d1=new Dog();
    // d1.speak();
    // Dog d2= new Dog(){
    //     @Override
    //     void speak(){
    //         System.out.println("dogs ruh ruh");
    //     }

    // };

    // d2.speak();

    Timer timer = new Timer();
    TimerTask task=new TimerTask() {

        int count=5;
        @Override
        public void run(){

            System.out.println(count);
            count--;
            if(count<0){
                System.out.println("HAPPY NEW YEAR");
                timer.cancel();
            }



        }
        
    };

    timer.scheduleAtFixedRate(task, 0, 1000);

    







        






    }
    
}
