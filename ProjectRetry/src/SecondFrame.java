import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class SecondFrame extends JFrame implements ActionListener {


    public static File groceryF,clotheF,foodF,otherF;
    JButton btnGrocery, btnClothes, btnFood, btnOther;
    private Timer  timer;
    private JTextField txtMain;

    public SecondFrame() {

        groceryF = new File("grocery.txt");
        clotheF = new File("clothes.txt");


        setLayout(null);

        timer = new Timer(50,this);
        btnGrocery = new JButton("Grocery");
        btnClothes = new JButton("Clothes");
        btnFood = new JButton("Food");
        btnOther = new JButton("Other");

        btnGrocery.setSize(90,90);
        btnClothes.setSize(90,90);
        btnFood.setSize(90,90);
        btnOther.setSize(90,90);

        btnGrocery.setLocation(215,215);
        btnClothes.setLocation(305,215);
        btnFood.setLocation(215,305);
        btnOther.setLocation(305,305);

        add(btnGrocery);
        add(btnClothes);
        add(btnFood);
        add(btnOther);
        btnGrocery.addActionListener(this);
        btnClothes.addActionListener(this);
        btnFood.addActionListener(this);
        btnOther.addActionListener(this);



        getContentPane().setBackground(Color.darkGray);
        setSize(700, 700);
        setVisible(true);
        setTitle("My Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        new SecondFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       Loader l1 = new Loader();
       setVisible(false);
       l1.start();


        if (e.getSource()==btnGrocery) {
            try {
                Scanner scn = new Scanner(groceryF);
                double keeper = Double.parseDouble(scn.next());
                double convert = Double.parseDouble(MainFrame.money);
                keeper = keeper + convert;
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(groceryF));
                bWriter.write(String.valueOf(keeper));
                bWriter.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null,"You spent "+MainFrame.money +"$ from your " +MainFrame.spendingWay+" account for your grocery Shopping");

        } else if (e.getSource()==btnClothes) {
            try {
                Scanner scn = new Scanner(clotheF);
                double keeper = Double.parseDouble(scn.next());
                double convert = Double.parseDouble(MainFrame.money);
                keeper = keeper + convert;
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(clotheF));
                bWriter.write(String.valueOf(keeper));
                bWriter.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }



            JOptionPane.showMessageDialog(null,"You spent "+MainFrame.money +"$ from your " +MainFrame.spendingWay+" account for your Clothes Shopping");
        } else if (e.getSource()==btnFood) {
            try {
                Scanner scn = new Scanner(foodF);
                double keeper = Double.parseDouble(scn.next());
                double convert = Double.parseDouble(MainFrame.money);
                keeper = keeper + convert;
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(foodF));
                bWriter.write(String.valueOf(keeper));
                bWriter.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null,"You spent "+MainFrame.money +"$ from your " +MainFrame.spendingWay+" account for your food Shopping");
        } else if (e.getSource()==btnOther) {
            try {
                Scanner scn = new Scanner(otherF);
                double keeper = Double.parseDouble(scn.next());
                double convert = Double.parseDouble(MainFrame.money);
                keeper = keeper + convert;
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(otherF));
                bWriter.write(String.valueOf(keeper));
                bWriter.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null,"You spent "+MainFrame.money +"$ from your " +MainFrame.spendingWay+" account for your Other Shopping");
        }




    }
}
