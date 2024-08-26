import java.util.Scanner;

public class Bai103 {
    public static boolean hoanthien(int i){
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
    public static void tong(int a[]){
        int tong=0, dem=0;
        for (int i=0; i<a.length; i++)
            if (hoanthien(a[i])){
                tong+=a[i];
                dem+=1;}
        System.out.print("Trung binh phan tu hoan thien: "+1.d*tong/dem);
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