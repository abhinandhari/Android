public class Fruit{
    private String shape;
    private String color;
    private String name;
    public Fruit(String shape,String color,String name){
        this.shape=shape;
        this.color=color;
        this.name=name;
    }
    public void setShape(String shape){
        this.shape=shape;
    }
    public String getShape(){
        return shape;
    }
    public String toString(){
        return shape+" "+color+" "+name;
    }
}