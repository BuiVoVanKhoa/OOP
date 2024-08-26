import java.util.Scanner;
public class Bai101 {
    public static void tong(int a[]){
        int tong=0;
        for (int i=0; i<a.length; i++)
            if (a[i]%3==0 || a[i]%5==0)
                tong+=a[i];
        System.out.print("Tong cac phan tu chia boi 3 hoac 5: "+tong);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        tong(a);
    }
}