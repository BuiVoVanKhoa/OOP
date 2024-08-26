import java.util.Scanner;
public class Bai107 {
    public static boolean nguyento(int i){
        boolean nguyento=true;
        if (i<=1)
            nguyento=false;
        for (int j=2; j<=i-1; j++)
            if (i%j==0){
                nguyento=false;
                break;
            }
        return nguyento;
    }
    public static void tangdan(int a[]){
        int doi;
        for (int i=0; i<a.length; i++)
            if (nguyento(a[i]))
                for (int j = i + 1; j < a.length; j++)
                    if (nguyento(a[j]) && a[j]<a[i]) {
                        doi = a[i];
                        a[i] = a[j];
                        a[j] = doi;
                    }
        System.out.print("Tang dan: \n");
        for (int i=0; i<a.length; i++)
            System.out.print("a["+i+"]: "+a[i]+"\n");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        tangdan(a);
    }
}