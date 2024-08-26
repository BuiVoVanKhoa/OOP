import java.util.Scanner;
public class Bai63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("Nhap mang a: \n");
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Mang a: \n");
        for (int i=0; i<a.length; i++)
            System.out.print("a["+i+"]: "+a[i]+"\n");
    }
}