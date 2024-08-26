import java.util.Scanner;
public class Bai62 {
    static boolean hoanthien(int i){
        boolean hoanthien=true;
        int tong=0;
        for (int j=1; j<=i-1; j++){
            if (i%j==0){
                tong+=j;
            }
        }
        if (tong!=i)
            hoanthien=false;
        return hoanthien;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n=sc.nextInt(),
                i=1;
        System.out.print("So hoan thien nho hon n: ");
        while (i<n-1){
            i++;
            if (hoanthien(i))
                System.out.print(i+" ");
        }
        System.out.print("\n");
    }
}