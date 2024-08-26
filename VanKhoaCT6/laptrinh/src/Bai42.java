import java.util.Scanner;
public class Bai42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        System.out.print("Nhap y: ");
        int y=sc.nextInt();
        double luythua=1;
        for (int i=1; i<=y; i++)
            luythua*=x;
        if (y<0)
            for (int i=1; i<=-y; i++)
            luythua/=x;
        System.out.print("Ket qua: "+luythua+"\n");
    }
}