
// class A{
    
//     public A(){
//         System.out.println("A in");
//     }
//     public A(int n){
//         System.out.println("A int in");
//     }

// }

// class B extends A{
//     public B(){
//         System.out.println("B in");
//     }
//     public B(int n){
//         this();
//         // super(5);
//         System.out.println("B int in");
//     }

// }

// public class Demo {

//     public static void main(String[] args) {

//         B obj = new B(5);
//         // A obj1=new B();
        
        
//     }


    
// }

// interface A{
//     // void run();
//     void config();
// }

// interface X{
//     void run();
// }

// class B implements A,X{
//     public void run(){
//         System.out.println("running...");
//     }
//     public void config(){
//         System.out.println("configuring....");
//     }
// }

// interface y extends X{

// }

// class Laptop{
//     public void code(){
//         System.out.println("code ,compile,run");
//     }
// }

// class Developer{
//     public void devApp(Laptop lap){
//        lap.code();
//     }
// }




// class A
// {
//     public void show()
//     {
//         System.out.println("in A Show");
//     }
// }

// class B extends A
// {
//     // No show() here
// }
class Computer{
    public void code(){

    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code,compile, run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code,compile,run,fastest");

    }
}

class Developer{
    public void devApp(Computer com){
        com.code();
    }
}

public class Demo
{
    public static void main(String a[])
    {
        // B obj = new B();

        // obj.run();

        // Laptop lap=new Laptop();
        // Developer rk=new Developer();
        // rk.devApp(lap);

        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer dev=new Developer();
        dev.devApp(desk);



    }
}