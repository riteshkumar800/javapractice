import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optional {

    public static void main(String[] args) {

        List<String> names=Arrays.asList("Navin","ritesh","raj","ravi");
 
        Optional<String> name = names.stream()
        .filter(str ->  str.contains("x"))
        .findFirst();


        System.out.println(name.orElse("NOT FOUND"));
    
    
    
    

        
        
    }

    class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

Student s1 = new Student("Ritesh");

Student s2 = new Student(s1.name);  // deep copy

s2.name = "Rahul";

System.out.println(s1.name);  // Ritesh
System.out.println(s2.name);  // Rahul
    
}


