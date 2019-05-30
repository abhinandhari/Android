public class Driver{
    public static void main(String[] args) {
        Sample<Integer> sampleInt = new Sample<>(65);
        Sample<String> sampleString = new Sample<String>("PIKAAAA");
        Sample<Double> sampleDouble = new Sample<Double>(45.287);
        System.out.println(sampleInt);
        System.out.println(sampleString);   
        System.out.println(sampleDouble);  
        Example<Integer,String> example1 = new Example<Integer,String>(5, "Integer");
        System.out.println(example1);  
        Example<String,Double> example2 = new Example<String,Double>("variableT", 666.234);
        System.out.println(example2);
    }
}