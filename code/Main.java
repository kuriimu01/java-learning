import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Main {
    public static void push(float[] list, String path) throws Exception{
        FileOutputStream fos = new FileOutputStream(path);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for (float f: list){
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();
    }
    public static void read(String path) throws Exception{
        FileInputStream fis = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(fis);
        int length = dis.readInt();
        float data;
        for (int i = 0; i < length; i++) {
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
    public static void main(String[] args) throws Exception{
        float[] list={1.2f , 2.45f , 7.78f , 9.01f , 2.35f};
        String path = "C:\\Users\\Користувач\\Desktop\\output.ser";
        push(list, path);
        read(path);
    }
}