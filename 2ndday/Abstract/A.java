public abstract class A{
    String hi;
    public A(){
            hi="hi";
    }
    public A(String hi){
        this.hi=hi;
    }

    abstract void saySomething();
    abstract void sayHello();

    public void print(){
        System.out.println(hi);
    }
}