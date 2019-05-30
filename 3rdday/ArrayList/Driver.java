import java.util.ArrayList;
public class Driver{
    public static void display(Fruit[] fruits){
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
    }
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Round","Green","Watermelon");
        System.out.println(fruit);
        Fruit[] fruits = new Fruit[3];
        fruits[0]=new Fruit("Long", "Yellow", "Banana");
        fruits[1]=fruit;
        fruits[2]=new Fruit("Round","Red","Apple");
        display(fruits);
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruit);
        fruitList.add(new Fruit("Long", "Yellow", "Banana"));
        fruitList.add(new Fruit("Round","Red","Apple"));
        fruitList.remove(2);
        System.out.println(fruitList);
        ArrayList<Integer> integerList = new ArrayList<>(); //int is datatype, which cant be put here. Only classes can be put.
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(100);
        System.out.println(integerList);
    }
}