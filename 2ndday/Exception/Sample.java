public class Sample{
    public static void main(String[] args){
        int[] arr = new int[5];
        try{
            arr[5]=6;       //checks this
        }
        catch(ArrayIndexOutOfBoundsException aoe){ //If there is error, this is executed.
//Exception is first made and then copied above, or just put Exception.
            System.out.println(aoe);
        } finally{                              //always executed, but not mandatory
            System.out.println("It is done");
        }
    }
}