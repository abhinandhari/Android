import java.util.Scanner;
public class Input
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter int: ");
        int k = scan.nextInt();
        System.out.println(k);
        System.out.print("Enter double: ");
        double kk=scan.nextDouble();
        System.out.println(kk);//To care care of the \n got after pressing enter, using nextLiine to scan full string
        System.out.print("Enter String: ");
        String str = scan.next();
        String str1 = scan.next();
        System.out.println(str);
        System.out.println(str1);
    }
}