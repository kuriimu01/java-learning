import java.util.Random;

public class Main {

    public static void main(String[] arg) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i: arr){
            arr[i]= rd.nextInt(1,100);
            System.out.print(arr[i]+"  ");
        }
    }
}