import java.util.Scanner;
public class Bai110 {
    public static void xoa(int a[]){
        System.out.print("Mang goc: ");
        for (int i=0; i<a.length; i++)
            System.out.print("a["+i+"] ");
        System.out.print("\n\t  ");
        for (int i=0; i<a.length; i++)
            System.out.print("  "+a[i]+"  ");
        int sophantu=a.length/2;
        if (a.length%2!=0)
            sophantu+=1;
        for (int i=1; i<sophantu; i++)
            a[i] = a[2*i];
                    
        System.out.print("\nMang moi: ");
        for (int i=0; i<sophantu; i++)
            System.out.print("a["+i+"] ");
        System.out.print("\n\t  ");
        for (int i=0; i<sophantu; i++)
            System.out.print("  "+a[i]+"  ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        xoa(a);
    }
}