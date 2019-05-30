import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

public class CountryCode  {
    public static void main(String[] args) throws IOException{
        HashMap<Integer,String> countryCodeHashMap = new HashMap<>();
        Scanner scan = new Scanner(new File("cod2.csv"));
        Scanner rowScan = null;
        scan.nextLine();
        while(scan.hasNext()){
            String rowValue= scan.nextLine();
            rowScan = new Scanner(rowValue);
            rowScan.useDelimiter(","); // CSV is comma seperated version
            while(rowScan.hasNext()){
                System.out.println(rowScan.next());
            }
        }
        scan.close();
    }
}