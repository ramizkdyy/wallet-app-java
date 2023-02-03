import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class LastFrame extends JFrame implements ActionListener{

    private JLabel lblCash,lblCredit,lblVoucher,lblGrocery,lblFood,lblClothes,lblOther;
    private JButton btnExit;
    private String str1,str2,str3,str4,str5,str6,str7;
    public LastFrame() {
        try {
            Scanner cashScn = new Scanner(FirstFrame.cashF);
            Scanner creditScn = new Scanner(FirstFrame.creditF);
            Scanner voucherScn = new Scanner(FirstFrame.voucherF);
            Scanner groceryScn = new Scanner(SecondFrame.groceryF);
            Scanner foodScn = new Scanner(SecondFrame.foodF);
            Scanner clotheScn = new Scanner(SecondFrame.clotheF);
            Scanner otherScn = new Scanner(SecondFrame.otherF);
            str1 = cashScn.nextLine();
            str2 = creditScn.next();
            str3 = voucherScn.next();
            str4 = groceryScn.next();
            str5 = foodScn.next();
            str6 = clotheScn.next();
            str7 = otherScn.next();

        }
        catch (Exception e) {
            System.out.println("Error");
        }
        btnExit = new JButton("Exit");


        setLayout(new GridLayout(4,4));
        lblCash = new JLabel("Your cash value is : "+ str1);
        lblCredit = new JLabel("Your credit value is : "+str2);
        lblVoucher = new JLabel("Your Voucher values is : "+str3);
        lblGrocery = new JLabel("Total waste for grocery is : "+str4);
        lblFood = new JLabel("Total waste for food is : "+str5);
        lblClothes = new JLabel("Total waste for clothe is : "+str6);
        lblOther = new JLabel("Total waste for other is : "+str7);
        lblCash.setForeground(Color.CYAN);
        lblCredit.setForeground(Color.CYAN);
        lblVoucher.setForeground(Color.CYAN);
        lblGrocery.setForeground(Color.CYAN);
        lblFood.setForeground(Color.CYAN);
        lblClothes.setForeground(Color.CYAN);
        lblOther.setForeground(Color.CYAN);

        add(lblCash);
        add(lblCredit);
        add(lblVoucher);
        add(lblGrocery);
        add(lblFood);
        add(lblClothes);
        add(lblOther);
        add(btnExit);




        setResizable(false);
        getContentPane().setBackground(Color.darkGray);
        setSize(700, 700);
        setVisible(true);
        setTitle("My Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new LastFrame();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnExit) {
        }
    }
}
