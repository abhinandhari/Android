public class Numbers {
    public static void main(String[] args)        //LE comments
    {
        double num=6.6789;
        int n = 12;
        System.out.println(n);
        System.out.println(num);
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
        switch(n)
        {
            case 12 :System.out.println("1");
                    break;
            case 7: System.out.println("Not 1");
                    break;
            default : System.out.println("wooow");
                    break;
        }
    }
}