// public class Fish  extends Animal{

//     @Override
//     void move(){
//         System.out.println("This animal is swimming");
//     }
    
// }

public class Fish implements prey, predator{
    @Override
    public void flee(){
        System.out.println("the fish is swimming away");

    }

    @Override
    public void hunt(){
        System.out.println("he fish is hunting");
    }
}
