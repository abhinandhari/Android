public class Student{
    String name;
    int RollNo;
    String Class;
    int age;
    public Student(){
        name = null;
        RollNo=0;
        Class=null;
        age=0;
    }

    public void checker() throws UnderageException{
        if(age<18){
            throw new UnderageException();
        }
    }
    public void print(){
        System.out.println("Name : "+name);
        System.out.println("RollNo : "+RollNo);
        System.out.println("Class : "+Class);
        System.out.println("Age : "+age);
    }
    @Override
    public String toString(){
        return "Name : "+name+" RollNo :"+RollNo+" Class : "+Class+" Age : "+age;
    }
}