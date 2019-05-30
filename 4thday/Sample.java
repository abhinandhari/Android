public class Sample<T>{
    T variable;
    public Sample(T variable){
        this.variable = variable;
    }
    public String toString(){
        return "The input is "+variable;
    }
}