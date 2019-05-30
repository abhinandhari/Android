public class B extends A{
    public void saySomething(){
        System.out.println("BLAH "+hi);
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        B b= new B();
        b.saySomething();
        b.sayHello();
        b.print();
    }
}