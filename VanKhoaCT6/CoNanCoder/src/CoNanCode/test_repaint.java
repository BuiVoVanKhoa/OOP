import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class test_repaint extends JPanel {

    private int x = 0;
    static int k=2;
   
    public static void delay(int n) {
        try {
            Thread.sleep(n); // Độ trễ 1 giây (1000 milliseconds)
        } catch (InterruptedException e) {
        }
    }
    
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static String tittle="hello";
    static int rd=0;
    
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,scw + 20, sch);
        
      
        switch(rd){
            case 1:
             g.setColor(Color.RED);
             break;
            case 2:
             g.setColor(Color.YELLOW);
             break;
            case 3:
             g.setColor(Color.BLUE);
             break;
            case 4:
             g.setColor(Color.GREEN);
             break;
            default:
                g.setColor(Color.PINK);
             break;
                
        }
             
        
        g.setFont(new Font("Arial", Font.BOLD, 800/k)); 
        g.drawString(tittle, x ,1000/k);
    }
    

    public void move(int n) {
        x = n*2;
        int dl=0;
        dl=x;
        if(dl%100==0){
        rd=random.nextInt(4)+1;
        }
        System.out.println(rd);
        System.out.println(dl);
       repaint();
    }
   
    static Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
       static int scw = (int) scr.getWidth();
       static int sch = (int) scr.getHeight();
   
    public static void main(String[] args) {
        
        
        JFrame frame = new JFrame("App Run Tittle");      
        test_repaint panel = new test_repaint();
       
        frame.setLocation(-10, 0);
        frame.add(panel);
        frame.setSize(scw + 20, sch);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
         JFrame frameinput = new JFrame("Input");
        frameinput.setSize(300, 200);
        frameinput.setLayout(null);
        frameinput.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);

        // Thêm ActionListener để lắng nghe sự kiện khi người dùng nhấn Enter trên bàn phím
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy giá trị đã nhập trong JTextField
                String text = textField.getText();
                // Xử lý dữ liệu đã nhập theo ý muốn
                tittle=text;
                System.out.println(tittle);
                frameinput.setVisible(false);
            }
        });

        frameinput.add(textField);

        frameinput.setVisible(true);
        
        while(true){
            System.out.println("tái lập hệ thống và chế độ chờ");
        if( !"hello".equals(tittle)){       
         for(int i=scw/2;i+(tittle.length()*50*k)>0;i--){
             
            panel.move(i);
   
            //delay
            delay(3);
             System.out.println(i);
                }
           
        
        }
         
        }
    }
}
