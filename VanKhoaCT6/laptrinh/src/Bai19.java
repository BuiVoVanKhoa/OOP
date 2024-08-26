import java.util.Scanner;
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so co 3 chu so: ");
        int so=sc.nextInt(),
                a=so/100,
                b=so%100/10,
                c=so%10,
                max=a,
                min=a,
                mid=a;
        if (b>max)
            max=b;
        if (c>max)
            max=c;
        
        if (b<min)
            min=b;
        if (c<min)
            min=c;
        
        if (mid==max)
            mid=b;
        if (mid==min)
            mid=c;
        System.out.print("So voi chu so tang dan: "+min+mid+max);        
                
    }
}
