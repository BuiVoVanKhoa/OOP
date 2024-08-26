import java.util.Scanner;
public class Bai76 {
    public static void vtnguyento(int a[], int i){
        boolean nguyento=true;
        for (int j=2; j<a[i]/2; j++)
            if (a[i]%j==0){
                nguyento=false;
                break;
            }
        if (a[i]<=1)
            nguyento=false;
        if (nguyento)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Vi tri phan tu nguyen to: ");
        for (int i=0; i<a.length; i++)
            vtnguyento(a, i);
        System.out.print("\n");
    }
}