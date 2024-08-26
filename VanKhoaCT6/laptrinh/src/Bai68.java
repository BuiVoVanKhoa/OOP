import java.util.Scanner;
public class Bai68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Cac phan tu am trong mang a:\n");
        for (int i=0; i<a.length; i++)
            if (a[i]<0)
            System.out.print("a["+i+"]: "+a[i]+"\n");
        
    }
}