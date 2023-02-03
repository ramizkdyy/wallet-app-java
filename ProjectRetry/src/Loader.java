import javax.swing.*;
import java.awt.event.ActionListener;

public class Loader extends Thread{


    JFrame frame;
    JProgressBar bar;

    Loader() {
        frame = new JFrame("Wait For Calculations");
        bar = new JProgressBar(0,100);
        bar.setValue(0);
        bar.setStringPainted(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(bar);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


    }



        public static void main(String[] args) {
        Loader l = new Loader();
        l.start();



    }

    public void run() {
        int i =  0;
        while (i<=100) {
            bar.setValue(i);
            i = i+1;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i==100) {
                System.exit(1);
            }
        }



    }



}
