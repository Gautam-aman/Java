import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main{
    public static void main(String[] args) {
        File myfile = new File("aman.txt");
       try {
           myfile.createNewFile();
       }
       catch(IOException e){
           System.out.println("rror");}

       //code to write a new file
        try{
            FileWriter newwrite= new FileWriter("aman.txt");
            newwrite.write("aman great hai");
            newwrite.close();
        }
        catch(Exception e){
            System.out.println("aman is great ");
        }
       

       }
    }
