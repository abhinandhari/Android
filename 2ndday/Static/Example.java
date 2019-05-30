public class Example{
    public static void print(){
        System.out.println("Somethingfromexample");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        print(); //static can call static
        // cant call sayHello() as it is non-static
        Example E = new Example();
        E.sayhello();
    }
}