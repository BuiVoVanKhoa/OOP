import java.util.Random;
import java.util.Scanner;
public class Bai65 {
    public static void main(String[] args) {
        Random rd=new Random();
        int a[]=new int[5];
        boolean am;
        System.out.print("Mang a:\n");
        for (int i=1; i<5; i++){
            am=rd.nextBoolean();
            if (am)
                a[i]=-1*rd.nextInt(101);
            else
                a[i]=rd.nextInt(101);
            System.out.print("a["+i+"]: "+a[i]+"\n");
        }
    }
}