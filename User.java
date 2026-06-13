public class User {

    String username;
        String email;
        int age;

        User(){
            this.username="guest";
            this.email="not provided";
            this.age=0;
        }

        User(String username){
            this.username=username;
        }

        User(String username, String email){
            this.email=email;
            this.username=username;
        }

        User(String username, String email, int age){
            this.username=username;
            this.age=age;
            this.email=email;
        }



        
    
}
