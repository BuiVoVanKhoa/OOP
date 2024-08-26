import java.util.Random;
import java.util.Scanner;
public class Bai67 {
    public static void main(String[] args) {
        Random rd=new Random();
        int a[]=new int[5];
        boolean am;
        System.out.print("Mang a:\n");
        am=rd.nextBoolean();
            if (am)
                a[0]=-1*rd.nextInt(101);
            else
                a[0]=-rd.nextInt(101);
        System.out.print("a[0]: "+a[0]+"\n");
        for (int i=1; i<5; i++){
            do{
                am=rd.nextBoolean();
                if (am)
                    a[i]=-rd.nextInt(101);
                else
                    a[i]=rd.nextInt(101);
            }
            while (a[i]<a[i-1]);
            System.out.print("a["+i+"]: "+a[i]+"\n");
        }
    }
}