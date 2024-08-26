import java.util.Scanner;
public class Bai93 {
    public static void dem(int a[]){
        int dem=0;
        for (int i=0; i<a.length; i++)
            if ((a[i]%3==0 || a[i]%5==0))
                dem+=1;
        System.out.print("So phan tu boi 3 hoac 5: "+dem);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        dem(a);
    }
}