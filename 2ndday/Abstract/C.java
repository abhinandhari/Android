public class C extends B{
    int num;
    public C()
    {
        hi="Wont say anything";
        num=5;
    }
    public static void main(String[] args){
        C c=new C();
        c.print();
        B b = c;
        b.print();
        b=new B();
        A a1 = c;
        A a2 = b;
        a1.print();
        a2.print();
    }
}