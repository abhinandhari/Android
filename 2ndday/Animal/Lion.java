public class Lion extends Animal{
    boolean hunt;
    //constructorss,inheritance
    public Lion(String says,int legs, boolean hunt){
        this.says=says;
        this.legs=legs;
        this.hunt = hunt;
    }
    public Lion(){
        says=null;
        legs=0;
        hunt = false;
    }
    public void setHunt(boolean hunt){
        this.hunt=hunt;
    }
    public boolean getHunt(){
        return hunt;
    }

    @Override
    public void print(){  //Overriding
        System.out.print("I "+says+" and have "+legs+" legs. ");
        if(hunt)
        System.out.println("I am also being hunted.");
        else
        System.out.println("I am not being hunted.");
    }

    public void print(boolean p){ //Overloading
        if(p){
            System.out.println("Hunted");
        }
        else
            System.out.println("Not hunted");
    }
    public String toString(){
        if(hunt)
            return ("hunteeeeeeddddd");
        else
            return ("nope");
    }
}