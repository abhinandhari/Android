public class Driver{
    public static void main(String[] args) {
        Example.print(); // Can do, print() is static
        Example E = new Example();
        E.sayhello();
    }
}