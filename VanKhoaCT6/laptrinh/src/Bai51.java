import java.util.Scanner;
public class Bai51 {
    static int cuoc(int gia, int tg){
    int luong=tg*gia;
    return luong;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Tinh luong");
        System.out.print("\nNhap gio vao ca: ");
        byte gv=sc.nextByte();
        System.out.print("Nhap gio ra ca: ");
        byte gr=sc.nextByte();
        int luong;
        if (gr<=12)
            luong=cuoc(50000, gr-gv);
        else
            if (gv>=12)
                luong=cuoc(60000, gr-gv);
            else
            luong=cuoc(50000, 12-gv)+cuoc(60000, gr-12);
        System.out.print("Luong moi ngay: "+luong/1000+".000d");
    }
}