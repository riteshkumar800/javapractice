
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

interface A{
    // void run();
    void config();
}

interface X{
    void run();
}

class B implements A,X{
    public void run(){
        System.out.println("running...");
    }
    public void config(){
        System.out.println("configuring....");
    }
}




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

public class Demo
{
    public static void main(String a[])
    {
        B obj = new B();

        obj.run();
    }
}