import java.util.Scanner;
public class Bai46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n=sc.nextInt();
        while (n<=0){
            System.out.print("Nhap lai: ");
            n=sc.nextInt();
        }
        if (n<=2)
            System.out.print("Khong ton tai so nguyen to nho hon n");
        else{
            System.out.print("Cac so nguyen to nho hon n: ");
            for (int i=2; i<n; i++)
                if (nguyento(i))
                    System.out.print(i+" ");
        }
    }
    public static boolean nguyento(int i){
        if (i<=1)
            return false; 
        for (int j=2; j<i; j++)
            if (i%j==0)
                return false;
        return true;
    }
}