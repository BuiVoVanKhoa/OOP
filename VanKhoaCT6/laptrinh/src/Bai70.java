import java.util.Scanner;
public class Bai70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Cac phan tu chan nho hon 20:\n");
        for (int i=0; i<a.length; i++)
            if (a[i]%2==0 && a[i]<20)
            System.out.print("a["+i+"]: "+a[i]+"\n");
    }
}