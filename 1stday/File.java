import java.util.Scanner;
import java.io.FileReader;
public class File
{
    public static void main(String[] args)
    {
        FileReader file=null;
       try{
            FileReader file = new FileReader("intro.txt");
        }
        catch(Exception e)
        {
            System.out.println("NOT FOUND. BYE BYE");
        }  
        Scanner scank = new Scanner(file);
        int roll = scank.nextInt();
        String branch=scank.next();
        scank.nextLine();
        String name=scank.nextLine();
        String univ=scank.nextLine();
        System.out.println(roll);
        System.out.println(branch);
        System.out.println(name);
        System.out.print(univ);    
    }
}