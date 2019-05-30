public class Car{
    String company;
    String color;
    int noOfSeats;

    //constructors

    public Car(){ //Default constructor
        company =null;
        color = null;
        noOfSeats = 0;
    }

    public Car(String company,String color, int noOfSeats){ //Parametric constructor
        this.company= company;              //this refers to the Car itself
        this.color = color;
        this.noOfSeats=noOfSeats;
    }
    public Car(String company,String color){
        this.company=company;
        this.color=color;
    }
    public Car(String company){
        this.company=company;
    }
    //methods or functions
    //setters
    public void SetColor(String color){ 
        this.color=color;
    }

    public void SetnoOfSeats(int noOfSeats){
        this.noOfSeats=noOfSeats;
    }

    //getters
    public String getCompany(){
        return company;
    }
    public String getColor(){
        return color;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void addSeats(int seats){
        this.noOfSeats+=seats;
    }public void print(){
        System.out.println(this.company+" "+ this.color+" "+ this.noOfSeats);
    }
}