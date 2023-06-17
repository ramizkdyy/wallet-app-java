import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Scanner;

public class MainFrame extends JFrame implements ActionListener {

    static String spendingWay;

    JButton btnCash, btnCredit, btnVoucher;

    static String money;
    double cashMoney, creditMoney, voucherMoney;
    SecondFrame secFrame;
    JButton finalBtn;

    public MainFrame() {

        setLayout(null);


        btnCash = new JButton("Cash");
        btnCredit = new JButton("Credit");
        btnVoucher = new JButton("Voucher");
        finalBtn = new JButton("See your wallet");
        btnCash.setSize(90, 90);
        btnCredit.setSize(90, 90);
        btnVoucher.setSize(90, 90);
        btnCash.setLocation(215, 270);
        btnCredit.setLocation(305, 270);
        btnVoucher.setLocation(395, 270);
        finalBtn.setSize(200,50);
        finalBtn.setLocation(400,550);

        add(btnCash);
        add(btnCredit);
        add(btnVoucher);
        add(finalBtn);
        btnCash.addActionListener(this);
        btnCredit.addActionListener(this);
        btnVoucher.addActionListener(this);
        finalBtn.addActionListener(this);
        setResizable(false);
        getContentPane().setBackground(Color.darkGray);
        setSize(700, 700);
        setVisible(true);
        setTitle("My Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MainFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==btnCash) {
            spendingWay = "cash";
            money = JOptionPane.showInputDialog("Type How much did you spend: ");
            try {
                Scanner scn = new Scanner(FirstFrame.cashF);
                double keeper = Double.parseDouble(scn.next());
                double convert = Double.parseDouble(money);
                keeper = keeper - convert;
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(FirstFrame.cashF));
                bWriter.write(String.valueOf(keeper));
                bWriter.close();

            } catch (Exception ex) {
            ex.printStackTrace();
            }
            this.setVisible(false);
            new SecondFrame();
        } else if(e.getSource()==btnCredit) {
            spendingWay = "credit";
            money = JOptionPane.showInputDialog("Type How much did you spend: ");
            try {
                Scanner scn = new Scanner(FirstFrame.creditF);
                double keeper = Double.parseDouble(scn.next());
                double convert = Double.parseDouble(money);
                keeper = keeper - convert;
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(FirstFrame.creditF));
                bWriter.write(String.valueOf(keeper));
                bWriter.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            this.setVisible(false);
            new SecondFrame();
        } else if (e.getSource()==btnVoucher) {
            spendingWay = "voucher";
            money = JOptionPane.showInputDialog("Type How much did you spend: ");
            try {
                Scanner scn = new Scanner(FirstFrame.voucherF);
                double keeper = Double.parseDouble(scn.next());
                double convert = Double.parseDouble(money);
                keeper = keeper - convert;
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(FirstFrame.voucherF));
                bWriter.write(String.valueOf(keeper));
                bWriter.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            this.setVisible(false);
            new SecondFrame();

        } else if (e.getSource()==finalBtn) {
            setVisible(false);
            new LastFrame();
        }



    }
}
