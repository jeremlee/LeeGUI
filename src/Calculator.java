import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel panel1;
    private JLabel lblfirstNum;
    private JLabel lblSecondNum;
    private JLabel lblResult;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton button1;

    public static float calculate(float num1,int op,float num2){

        switch(op){
            case 0:
                return num1+num2;
            case 1:
                return num1-num2;
            case 3:
                return num1*num2;
            case 2:
                return num1/num2;
        }


        return 0;
    }

    Calculator(){
        button1.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                try{
                    float num1 = Integer.parseInt(textField1.getText());
                    float num2 = Integer.parseInt(textField2.getText());
                    int op = comboBox1.getSelectedIndex();
                    textField3.setText(String.format("%.2f",calculate(num1,op,num2)));
                }catch(Exception ee){
                    JOptionPane.showMessageDialog(panel1,"Enter an actual number");
                }

            }
        });
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setContentPane(calculator.panel1);
        calculator.setSize(500,500);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setVisible(true);
        calculator.setTitle("Leap Year Checker");
    }
}
