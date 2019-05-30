public class Driver implements Example,Example1{
    public void sayHello(){
        System.out.println("Hello");
    }
    public void saySomething(String something){
        System.out.println("Something");
    }
    public void sayGoodbye(){
        System.out.println("Goodbye");
    }
    public static void main(String[] args) {
        Driver d = new Driver();
        d.sayHello();
        d.saySomething("Something");
        d.sayGoodbye();
    }
}