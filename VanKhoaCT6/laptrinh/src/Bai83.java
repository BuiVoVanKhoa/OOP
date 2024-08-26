import java.util.Scanner;
public class Bai83 {
    public static int chan(int a[]){
        int chan=-1;
        for (int i=a.length-1; i>=0; i--)
            if (a[i]%2==0){
                chan=a[i];
                break;
            }
        return chan;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Phan tu chan: "+chan(a)+"\n");
    }
}