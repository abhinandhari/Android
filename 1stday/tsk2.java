import java.util.Scanner;
import java.io.FileReader;
public class tsk2
{
    public static void main(String[] args){
        int sum=0,count=0;
        int k;
        double avg ;
        FileReader file=null;
        try{
            file = new FileReader("numberer.txt");
        }
        catch(Exception e){
            System.out.println("NOT FOUND. BYE BYE");
        }
        Scanner scan = new Scanner(file);
        while(scan.hasNextInt()){
            k=scan.nextInt();
            sum=sum+k;
            count++;
        }
        avg=(double)sum;
        avg=sum/7.00;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Number of numbers = "+count);
    }
}