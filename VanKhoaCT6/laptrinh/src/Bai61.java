import java.util.Scanner;
public class Bai61 {
    static boolean nguyento(int i){
        boolean nguyento=true;
        for (int j=2; j<=i-1; j++)
            if (i%j==0){
                nguyento=false;
                break;
            }
        return nguyento;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n=sc.nextInt(),
                i=1,
                dem=0;
        System.out.print(n+" so nguyen to dau tien: ");
        while (dem<n){
            i++;
            if (nguyento(i)){
                System.out.print(i+" ");
                dem+=1;
            }
        }
    }
}