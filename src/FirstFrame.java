import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FirstFrame extends JFrame implements ActionListener {

    private JLabel lblCash, lblCredit, lblVoucher;
    private JTextField txtCash, txtCredit, txtVoucher;

    private JButton btnCont;

    public final File [] ff= {};

    public static File cashF, creditF, voucherF;
    public FirstFrame() {

        Object [] options = {"Reset the Wallet","Continue"};
        JOptionPane.showMessageDialog(null, "Welcome to the Wallet application");
        int choice = JOptionPane.showOptionDialog(null,"Choose an option","Title",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        if (choice == JOptionPane.YES_OPTION) {

        }
        else if (choice == JOptionPane.NO_OPTION) {
            setVisible(false);
            new MainFrame();

        }

        setLayout(null);
        cashF = new File("C:\\Users\\Ramiz\\IdeaProjects\\ProjectRetry\\cash.txt");
        creditF = new File("C:\\Users\\Ramiz\\IdeaProjects\\ProjectRetry\\credit.txt");
        voucherF = new File("C:\\Users\\Ramiz\\IdeaProjects\\ProjectRetry\\voucher.txt");
        lblCash = new JLabel("Enter Your Cash value : ");
        lblCredit = new JLabel("Enter Your Credit value : ");
        lblVoucher = new JLabel("Enter Your Voucher value : ");
        txtCash = new JTextField();
        txtCredit = new JTextField();
        txtVoucher = new JTextField();
        btnCont = new JButton("Continue");

        lblCash.setSize(170, 30);
        lblCash.setLocation(100, 230);
        lblCash.setForeground(Color.CYAN);
        txtCash.setSize(50, 30);
        txtCash.setLocation(270, 230);
        lblCredit.setSize(170, 30);
        lblCredit.setLocation(100, 260);
        lblCredit.setForeground(Color.CYAN);
        txtCredit.setSize(50, 30);
        txtCredit.setLocation(270, 260);
        lblVoucher.setSize(170, 30);
        lblVoucher.setLocation(100, 290);
        lblVoucher.setForeground(Color.CYAN);
        txtVoucher.setSize(50, 30);
        txtVoucher.setLocation(270, 290);

        btnCont.setSize(140,35);
        btnCont.setLocation(400,500);
        btnCont.addActionListener(this);



        add(lblCash);
        add(txtCash);
        add(lblCredit);
        add(txtCredit);
        add(lblVoucher);
        add(txtVoucher);
        add(btnCont);
        setResizable(false);
        getContentPane().setBackground(Color.darkGray);
        setSize(700, 700);
        setVisible(true);
        setTitle("My Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FirstFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnCont) {
            try {
                BufferedWriter cashWriter = new BufferedWriter(new FileWriter(cashF));
                String  cashKeep = String.valueOf(txtCash.getText());
                cashWriter.write(cashKeep);
                cashWriter.close();
                BufferedWriter creditWriter = new BufferedWriter(new FileWriter(creditF));
                String creditKeep = String.valueOf(txtCredit.getText());
                creditWriter.write(creditKeep);
                creditWriter.close();
                BufferedWriter voucherWriter = new BufferedWriter(new FileWriter(voucherF));
                String voucherKeep = String.valueOf(txtVoucher.getText());
                voucherWriter.write(voucherKeep);
                voucherWriter.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            this.setVisible(false);
            new MainFrame();
        }




    }
}
