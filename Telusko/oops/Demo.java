
class A{
    
    public A(){
        System.out.println("A in");
    }
    public A(int n){
        System.out.println("A int in");
    }

}

class B extends A{
    public B(){
        System.out.println("B in");
    }
    public B(int n){
        this();
        // super(5);
        System.out.println("B int in");
    }

}

public class Demo {

    public static void main(String[] args) {

        B obj = new B(5);
        // A obj1=new B();
        
        
    }


    
}
