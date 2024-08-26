import java.util.Scanner;
public class Bai20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap gio: ");
        int gio=sc.nextInt();
        System.out.print("Nhap phut: ");
        int phut=sc.nextInt();
        System.out.print("Nhap giay: ");
        int giay=sc.nextInt();
        if ((gio>=0) && (gio<=23) && (phut>=0) && (phut<=59) && (giay>=0) && (giay<=59))
            System.out.print("Thoi gian hop le");
        else System.out.print("Thoi gian khong hop le");
    }
}
