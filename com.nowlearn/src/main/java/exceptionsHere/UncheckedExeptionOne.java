package exceptionsHere;

public class UncheckedExeptionOne {
    public static void main(String[] args) throws ArithmeticException{
        int a=5;
        int b=0;
        //System.out.println(a / b);
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
            //System.out.println(e.toString());
        }
    }
}
