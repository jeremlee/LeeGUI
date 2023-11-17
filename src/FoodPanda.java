import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodPanda extends JFrame{
    private JCheckBox cbxPizza;
    private JCheckBox cbxBurger;
    private JCheckBox cbxFries;
    private JCheckBox cbxSoftDrinks;
    private JCheckBox cbxTea;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JCheckBox cbxSundae;
    private JButton btnOrder;
    private JRadioButton rb15;
    private JPanel panel1;

    FoodPanda(){
        JCheckBox[] checkboxes = {cbxBurger,cbxFries,cbxSundae,cbxPizza,cbxSoftDrinks,cbxTea};
        btnOrder.addActionListener(new ActionListener() {

            float price = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cbxPizza.isSelected()){
                    price+=100;
                }
                if(cbxBurger.isSelected()){
                    price+=80;
                }
                if(cbxFries.isSelected()){
                    price+=65;
                }
                if(cbxSoftDrinks.isSelected()){
                    price+=55;
                }
                if(cbxTea.isSelected()){
                    price+=50;
                }
                if(cbxSundae.isSelected()){
                    price+=40;
                }
                float discount = 0;
                if(rbNone.isSelected()){
                    discount = 0;
                } else if(rb5.isSelected()){
                    discount = 5;
                } else if(rb10.isSelected()){
                    discount = 10;
                } else if(rb15.isSelected()){
                    discount = 15;
                }
                float result = price - (price*(discount/100));
                JOptionPane.showMessageDialog(panel1,"The total price is " + String.format("%.2f",result));
                price = 0;
            }
        });
    }

    public static void main(String[] args) {
        FoodPanda fp = new FoodPanda();
        fp.setContentPane(fp.panel1);
        fp.setSize(500,500);
        fp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fp.setVisible(true);
        fp.setTitle("Food Ordering System");
    }
}
