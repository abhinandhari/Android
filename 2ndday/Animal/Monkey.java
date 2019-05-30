public class Monkey extends Animal{
    boolean walk;
    //constructorss,inheritance
    public Monkey(String says,int legs, boolean walk){
        this.says=says;
        this.legs=legs;
        this.walk = walk;
    }
    public Monkey(){
        says=null;
        legs=0;
        walk = false;
    }
    public void setwalk(boolean walk){
        this.walk=walk;
    }
    public boolean getwalk(){
        return walk;
    }
    public String toString(){
        if(walk)
            return ("I am a monkey and I "+says+". I have "+legs+" legs and I can walk");
        else
            return ("I am a monkey and I "+says+". I have "+legs+" legs and I can't walk");
    }
    public void print(){
        System.out.println("I am a monkey with "+legs+ " legs and I "+says+ ".");
    }
}