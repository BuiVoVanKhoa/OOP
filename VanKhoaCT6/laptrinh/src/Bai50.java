import java.util.Scanner;
public class Bai50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Tinh cuoc Internet");
        System.out.print("\nNhap gio bat dau: ");
        byte gbd=sc.nextByte();
        System.out.print("Nhap gio ket thuc: ");
        byte gkt=sc.nextByte();
        cuoc(gbd, gkt);
    }
    public static void cuoc(int gbd, int gkt){
        int cuoc;
        if (gkt<=17)
            cuoc=(gkt-gbd)*2500;
        else
            if (gbd>=17)
                cuoc=(gkt-gbd)*3000;
            else
                cuoc=(17-gbd)*2500+(gkt-17)*3000;
        System.out.print("Cuoc: "+cuoc+" d");
    }
}