import java.util.HashMap;
import java.io.FileReader;
import java.util.Scanner;
public class Driver{
    public void checker(HashMap<Integer,String> countryHashMap, String search) throws NoCountryException{
        String c=null;
        Integer p = null;
        try{
            p=Integer.parseInt(search);
        }catch (NumberFormatException E){
            p=null;
        }
        if(p==null){
            System.out.println("Seaching with Country Name...");
            p=0;
            for(p=0;p<1000;p++){
                if(search.equals(countryHashMap.get(p))){
                    System.out.println("Code for "+search+" IS "+p);
                    return;
                }
            }
            if(p==1000){
                throw new NoCountryException();
            }
            }else{
            System.out.println("Searching for Country Code...");
            if(countryHashMap.containsKey(p)){
                c=countryHashMap.get(p);
                System.out.println("Name of the Country having code "+p+" IS "+c);
            }else{
                throw new NoCountryException();
            }
        }
    }
    public String reverse(String A){
        int i=A.length()-1;
        String B=null;
        while(i!=-1)
        {
            B=B+A.charAt(i);
            i--;
        }
        B=B.substring(4);
        return B;
    }
    public void display(HashMap<Integer,String> countryHashMap){
        System.out.println(countryHashMap);
    }
        public static void main(String[] args){
        HashMap<Integer,String> countryHashMap = new HashMap<>();    
        FileReader file=null;
       try{
            file = new FileReader("cod2.csv");
        }
        catch(Exception e)
        {
            System.out.println("FILE NOT FOUND. BYE BYE");
        }  
        Scanner scanFromUser = new Scanner(System.in);
        Scanner scanFromFile = new Scanner(file);
        scanFromFile.nextLine();
        Driver d2 =new Driver();
        while(scanFromFile.hasNext()){
            String cname=null;
            String codes=null;
            int i=0,c=0;//c is the number of commas...
            String temp=scanFromFile.next();
            if(temp.charAt(0)=='\"'){
                while(c!=2){
                    c=0;
                    for(int k=0;k<temp.length();k++)
                    {
                        if(temp.charAt(k)=='\"')
                        c++;
                    }
                    if(c!=2){
                        temp=temp+scanFromFile.next();
                    }
                    else
                        break;
                    }
                }
            else{
                while(c!=4){
                c=0;
                for(int k=0;k<temp.length();k++)
                {
                    if(temp.charAt(k)==',')
                    c++;
                }
                if(c!=4){
                    temp=temp+scanFromFile.next();
                }
                else
                    break;
                }
            }    
            while(temp.charAt(i)!=','){
                cname= cname+temp.charAt(i);
                i++; 
            }
            int j=temp.length()-5;
            while(temp.charAt(j)!=','){
                codes=codes+temp.charAt(j);
                j--;
            }
            cname=cname.substring(4);
            codes=codes.substring(4);
            codes=d2.reverse(codes);
            scanFromFile.nextLine();
     /*     System.out.println(cname);
            System.out.println(codes);*/
            Integer code = Integer.parseInt(codes);
            countryHashMap.put(code,cname);
            }
        System.out.println("Well, what are u searching for???Enter the code or the name of a country ...");
        String user = scanFromUser.nextLine();
     // d2.display(countryHashMap);
     try{
        d2.checker(countryHashMap,user);
    }catch(NoCountryException nc){
        System.out.println(nc);
    }
    }
}