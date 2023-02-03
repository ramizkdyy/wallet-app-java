import java.net.*;
import java.io.*;

public class ProjectClient {
    public static void main(String[] args) {
        try {
            Socket Client = new Socket("localhost",5000);
            InputStream in = Client.getInputStream();
            ObjectInputStream os = new ObjectInputStream(in);
            os.readObject();
            os.close();
            in.close();
            Client.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
