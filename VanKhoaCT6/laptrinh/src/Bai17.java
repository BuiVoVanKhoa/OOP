import java.util.Scanner;
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phuong trinh trung phuong: "
                + "ax^4 + bx^2 + c = 0");
        System.out.print("\nNhap a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap c: ");
        float c = sc.nextFloat();
        if (a==0) {
            if (b==0) {
                if (c==0)
                    System.out.print("Phuong trinh vo so no");
                if (c!=0)
                    System.out.print("Phuong trinh vo nghiem");
            }
            if (b!=0) {
                if (-c/b<0)
                    System.out.print("Phuong trinh vo no");
                if (c==0)
                    System.out.print("""
                                     Phuong trinh co 1 no: 
                                     x=0""");
                if (-c/b>0)
                    System.out.print("""
                                     Phuong trinh co 2 no: 
                                     x1="""+-Math.sqrt(-c/b)
                                    + "\nx1="+Math.sqrt(-c/b));
            }
        }
        if (a!=0) {
            float delta = b*b-4*a*c;
            if (delta<0)
                System.out.print("Phuong trinh vo no");
            if (delta==0) {
                float no = -b/(2*a);
                if (no<0)
                    System.out.print("Phuong trinh vo no");
                if (no==0)
                    System.out.print("Phuong trinh co 1 no: x=0");
                if (no>0)
                    System.out.print("""
                                     Phuong trinh co 2 no: 
                                     x1="""+-Math.sqrt(no)
                            + "\nx2="+Math.sqrt(no));
            }
            if (delta>0) {
                double t1=(-b-Math.sqrt(delta))/(2*a),
                        t2=(-b+Math.sqrt(delta))/(2*a);
                if (t2<0)
                    System.out.print("Phuong trinh vo no");
                if (t1==0)
                    System.out.print("""
                                     Phuong trinh co 3 no: 
                                     x1="""+-Math.sqrt(t2)
                                    + "\nx2=0"
                                    + "\nx3="+Math.sqrt(t2));
                if (t2==0)
                    System.out.print("Phuong trinh co 1 no: x=0");
                if ((t2>0) && (t1<0))
                    System.out.print("""
                                     Phuong trinh co 2 no: 
                                     x1="""+-Math.sqrt(t2)
                                    +"\nx2="+Math.sqrt(t2));
                if (t1>0)
                    System.out.print("""
                                     Phuong trinh co 4 no: 
                                     x1="""+-Math.sqrt(t2)
                                    + "\nx2="+-Math.sqrt(t1)
                                    + "\nx3="+Math.sqrt(t1)
                                    + "\nx4="+Math.sqrt(t2));
            }
        }
        
    }
}
