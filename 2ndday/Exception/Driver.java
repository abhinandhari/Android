public class Driver{
    public static void catcher(Car c)
    {
        try{
            c.go();
        }catch(CarOutOfFuelException E){
            System.out.println(E);
        }
    }
    public static void main(String[] args) {
        Car C = new Car();
        catcher(C);
        C.SetFuel(0);
        catcher(C);
    }
}