import java.util.Scanner;
public class Bai57 {
    static boolean nguyento(int n){
        boolean nguyento=true;
        for (int i=2; i<n/2; i++)
            if (n%i==0){
                nguyento=false;
                break;
            }
        return nguyento;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        byte nguyento=0;
        while (n!=0){
        if (nguyento(n%10) && n%10>=2)
            nguyento+=1;
        n/=10;
        }
        System.out.println("n co "+nguyento+" chu so nguyen to");
    }
}