import java.util.Scanner;
public class Bai53 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.print("Nhap so nguyen duong a: ");
        int a=nhapDuLieu();
        System.out.print("Nhap so nguyen duong b: ");
        int b=nhapDuLieu();
        System.out.println("Uoc chung lon nhat: "+uocLon(a, b));
        System.out.println("Boi chung nho nhat: "+boiNho(a, b));
        Lyric();
    }
    public static int nhapDuLieu(){
        int x;
        do{
            x=sc.nextInt();
            if (x<0)
                System.out.print("Nhap lai: ");
        }
        while (x<0);
        return x;
    }
    public static int uocLon(int a, int b){
        for (int i=Math.min(a, b); i>=1; i--)
            if (a%i==0 && b%i==0)
                return i;
        return 1;
    }
    public static int boiNho(int a, int b){
        return a*b/uocLon(a, b);
    }



    public static void Lyric() {
        System.out.println("Chau len ba\n
        Chau di mau giao\n
        Co thuong chau thi chau khong khoc nhe\n
        Khong khoc nhe thi me trong cay trai\n
        Em vao nha may em ngoi vui cay cay\n
        La la la la la la la la la\n
        ");
    }
}

