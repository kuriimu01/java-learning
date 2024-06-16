import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/Користувач/Desktop/source1.txt");
            FileOutputStream fos = new FileOutputStream("C:/Users/Користувач/Desktop/source2.txt");
            int x;
            String str = "";
            do{x=fis.read();if (x!=-1) {
                str+=String.valueOf((char)x);
            }
            }while(x!=-1);
            fos.write(str.getBytes());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}