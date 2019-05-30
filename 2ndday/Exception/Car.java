public class Car{
    int fuel;
    public Car()
    {
        fuel=100;
    }
    public Car(int fuel)
    {
        this.fuel =fuel;
    }
    public void SetFuel(int fuel)
    {
        this.fuel = fuel;
    }
    public void go() throws CarOutOfFuelException{
        if(fuel>0){
            System.out.println("Still going");
        }
        else{
            throw new CarOutOfFuelException();
        }
    }
}