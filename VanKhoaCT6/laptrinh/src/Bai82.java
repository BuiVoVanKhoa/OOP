import java.util.Scanner;
public class Bai82 {
    public static void boi3hoac5(int a[]){
            for (int i=0; i<a.length; i++)
                if (a[i]%3==0 || a[i]%5==0)
                    System.out.print("\na["+i+"]: "+a[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Phan tu la boi 3 hoac 5: ");
        boi3hoac5(a);
        System.out.print("\n");
    }
}