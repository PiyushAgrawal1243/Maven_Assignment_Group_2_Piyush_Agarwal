import java.util.Scanner;

public class Application {

    public static void main(String args[])
    {
        StringFunction ss=new StringFunction();
        Scanner ob =new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println("reverse of String :"+ss.reverseString(s));
        System.out.println("Length of String " +ss.length(s));

    }
}
