public class Fruit{
    private String color;
    private String taste;
    private int price;

    public Fruit(){
        //Default
        color=null;
        taste=null;
        price=0;
    }

    public Fruit(String color,String taste){
        this.color = color;
        this.taste =taste;
    }
    public Fruit(String color,String taste, int price){
        tihs.color=color;
        this.taste=taste;
        this.price=price;
    }

    @Override
    public String toString(){
        return color+" "+taste+" "+price;
    }
}