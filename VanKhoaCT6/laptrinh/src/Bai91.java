import java.util.Scanner;
public class Bai91 {
    public static boolean nguyento(int i){
        boolean nguyento=true;
        if (i<=1){
            nguyento=false;
        }
        for (int j=2; j<=i-1; j++){
            if (i%j==0){
                nguyento=false;
                break;
            }
        }
        return nguyento;
    }
    public static void dem(int a[]){
        int dem=0;
        for (int i=0; i<a.length; i++){
            if (nguyento(a[i])){
                dem+=1;
            }
        }
        System.out.print("So phan tu nguyen to: "+dem);
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