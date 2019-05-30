public class D extends C{
    public void sayB(){
        System.out.println("BBBB");
    }
    public static void main(String[] args) {
        D d = new D();
        d.sayB();
        d.say();
        d.sayA();
    }
}