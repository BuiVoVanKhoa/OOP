import java.util.Random;
import java.util.Scanner;
public class Bai66 {
    public static void main(String[] args) {
        Random rd=new Random();
        int a[]=new int[5];
        System.out.print("Mang a:\n");
        for (int i=0; i<5; i++){
                a[i]=-rd.nextInt(101);
            System.out.print("a["+i+"]: "+a[i]+"\n");
        }
    }
}