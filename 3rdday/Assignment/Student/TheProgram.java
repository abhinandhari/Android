import java.util.ArrayList;
import java.util.Scanner;

public class TheProgram{
    public static boolean errcheck(Student temp){
        try{
            temp.checker();
        }catch(UnderageException O){
            System.out.println(O);
            return false;
        }
        return true;
    }
    public static void display(ArrayList<Student> studentList){
        for(int i=0;i<studentList.size();i++)
        {
            System.out.println(studentList.get(i));
        }
    }
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students :");
        n=scan.nextInt();
        ArrayList<Student> studentList = new ArrayList<>();
        int i=0,c=0;
        for(i=0;i<n;i++)
        {
            Student Temp = new Student();
            System.out.println("Enter details of student : "+(i+1));
            System.out.print("Enter name : ");
            scan.nextLine();
            Temp.name = scan.nextLine();
            System.out.println("Enter Roll No : ");
            Temp.RollNo = scan.nextInt();
            System.out.print("Enter Class : ");
            scan.nextLine();
            Temp.Class = scan.nextLine();
            System.out.println("Enter Age : ");
            Temp.age = scan.nextInt();
            boolean p =errcheck(Temp);
            if(p){
                studentList.add(Temp);
                c=c+1;
            }
        }
        System.out.println("The students who are eligilble are...");
        System.out.println(studentList);
    }
}