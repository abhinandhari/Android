public class Driver{
    public static void main(String[] args) {
        String name = "1";
        int k=Integer.parseInt(name,16);
        name = name +1.5;
        System.out.println(k);
        float pp = Float.parseFloat(name);
        System.out.println(pp);
        double l = 10.7;
        String binary = Integer.toBinaryString(123);
        System.out.println(binary);
    }
}