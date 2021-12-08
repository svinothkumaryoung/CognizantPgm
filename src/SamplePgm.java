import java.util.Scanner;
public class SamplePgm {
    int a;
    int b;
    int c;
    Scanner s1=new Scanner(System.in);
     void getData()
    {
        System.out.println("Enter the Value for A");
        a=s1.nextInt();
        System.out.println("Enter the Value for B");
        b=s1.nextInt();
        c=a/b;
        System.out.println("The value of c is "+c);
        System.out.println("Hai How are you");
    }


    public static void main(String[] args) {
        SamplePgm sp=new SamplePgm();
        sp.getData();
    }
}
