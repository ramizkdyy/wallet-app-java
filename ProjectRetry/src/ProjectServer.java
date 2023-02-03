import java.net.*;
import java.io.*;

public class ProjectServer {
    public static void main(String[] args){
            try {
                ServerSocket sSocket = new ServerSocket(5000);
                System.out.println("Waiting the client.. ");
                Socket ssSocket = sSocket.accept();
                System.out.println("Client found");
                OutputStream ot = ssSocket.getOutputStream();
                ObjectOutputStream oot = new ObjectOutputStream(ot);
               FirstFrame fFrame = new FirstFrame();
                oot.writeObject(fFrame);
                ssSocket.close();

            } catch (Exception e) {
                e.printStackTrace();
            }



    }
}
