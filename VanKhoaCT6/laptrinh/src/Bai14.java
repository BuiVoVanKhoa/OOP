import java.util.Scanner;
public class Bai14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = in.nextFloat();
        System.out.print("Nhap b: ");
        float b = in.nextFloat();
        System.out.print("Nhap c: ");
        float c = in.nextFloat();
        float max=a;
        if (b>max)
            max=b;
        if (c>max)
            max=c;
        float min=a;
        if (b<min)
            min=b;
        if (c<min)
            min=c;
        System.out.print("Day so theo thu tu tang dan: "+min+" "+((a+b+c)-(min+max))+" "+max);
    }
}
