import java.util.Scanner;
public class Bai64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        System.out.print("Mang a:\n");
        for (int i=0; i<a.length; i++){
            a[i]=0;
            System.out.print("a["+i+"]: "+a[i]+"\n");
        }
    }
}