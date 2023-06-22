package Practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class JavaPractice {
    public static void main(String[] args) {
        String c = "Hello I am practicing Java";
        try {
            if (c.startsWith("H")) {
                c = c.trim();
                c = c.replaceAll("am", "was");
                c = c.substring(3, 5);
                byte[] b = c.getBytes();
                FileOutputStream f = new FileOutputStream("test txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
                objectOutputStream.writeObject(b);
                objectOutputStream.flush();
                objectOutputStream.close();

            }
        } catch (Exception e) {
            System.out.println("Catch exception");
            System.exit(0);
        }
        try {
            FileOutputStream first = new FileOutputStream("test txt");
            ObjectOutputStream oris = new ObjectOutputStream(first);
            oris.close();
            System.out.println(oris.available());

        } catch (Exception e) {
            System.exit();
        }
    }
}
