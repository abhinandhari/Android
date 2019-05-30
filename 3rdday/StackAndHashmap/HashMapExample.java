import java.util.HashMap;
import java.util.LinkedHashMap;
public class HashMapExample{
    public static void main(String[] args) {
        HashMap<Integer, String> studentHashMap = new HashMap<>();//jumbled
        studentHashMap.put(102,"Cersie");//any integer ok
        studentHashMap.put(21,"Jamie");
        studentHashMap.put(315,"The Man");
        studentHashMap.put(4,"Jack");
        studentHashMap.put(5,"Danny");
        studentHashMap.put(5,"Jon Snow"); //overwrites the value in 5
        System.out.println(studentHashMap);
        studentHashMap.forEach((key,value)->{
            System.out.println(key + " " + value);
        });
        LinkedHashMap<Integer, String> studentLinkedHashMap = new LinkedHashMap<>(); //in order
        studentLinkedHashMap.put(102,"Cersie");//any integer ok
        studentLinkedHashMap.put(21,"Jamie");
        studentLinkedHashMap.put(315,"The Man");
        studentLinkedHashMap.put(4,"Jack");
        studentLinkedHashMap.put(5,"Danny");
        System.out.println(studentLinkedHashMap);
    }
}