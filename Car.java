public class Car {

    // String make= "Ford";
    // String model="Mustang";
    // int year= 2026;
    // double price=99.99;
    // boolean isRunning=false;
    String color;
    String model;

    Car(String model, String color){
        this.color=color;
        this.model=model;

    }

    // void start(){
    //     System.out.println("Car started");
    // }
    void drive(){
        System.out.println("You drive the "+ this.model + " " + this.color);
    }
    
}
