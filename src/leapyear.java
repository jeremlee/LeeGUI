import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class leapyear extends JFrame {

    private JPanel panel1;
    private JLabel lblLeapYear;
    private JTextField textField1;
    private JButton button1;
    public static boolean isLeap(int year){
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            else
                leap = true;
        }
        else
            leap = false;
        return leap;
    }
    leapyear(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int res = Integer.parseInt(textField1.getText());
                    if(isLeap(res)){
                        JOptionPane.showMessageDialog(panel1,"Leap year");
                    } else{
                        JOptionPane.showMessageDialog(panel1,"Not leap year");
                    }
                }catch(Exception ee){
                    JOptionPane.showMessageDialog(panel1,"Enter an actual year");
                }
            }
        });
    }
    public static void main(String[] args){
        leapyear lp = new leapyear();
        lp.setContentPane(lp.panel1);
        lp.setSize(500,500);
        lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lp.setVisible(true);
        lp.setTitle("Simple Calculator");
    }
}
