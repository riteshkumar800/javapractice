import java.io.FilterWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class file {
    public static void main (String[] args){

        //// try(FileWriter writer=new FileWriter("test.txt") ){
        // try(FileWriter writer=new FileWriter("/Users/riteshkuma/javapractice/test1.txt") ){
        //     writer.write("Ilike you");
        //     System.out.println("file has been written");


        // }
        // catch(FileNotFoundException e){
        //     System.out.println("File not found");
        // }
        // catch(IOException e){
        //     System.out.println("cannot write file");
        // }
        try(BufferedReader reader = new BufferedReader(new FileReader("/Users/riteshkumar/javapractice/test1.txt"))){
            // writer.write("Ilike you");
            // System.out.println("file has been written");
            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);

            }



        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("cannot write file");
        }
            
        
    }
    
}
