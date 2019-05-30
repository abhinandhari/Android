public class Sample1{
    public static void main(String[] args) {
        try{
            sayHello();
        }
        catch(Exception E){
            System.err.println("Caught easily");
        }
    }
    public static void sayHello() throws Exception {
        int[] arr = new int[5];
        arr[5] = 8;
    }
}