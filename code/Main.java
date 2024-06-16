import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("C:/Users/Користувач/Desktop/source1.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/Користувач/Desktop/source2.txt");

        FileOutputStream fos = new FileOutputStream("C:/Users/Користувач/Desktop/glued.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        int x;
        while ((x=sis.read())!=-1){
            fos.write(x);
        }
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();

    }
}