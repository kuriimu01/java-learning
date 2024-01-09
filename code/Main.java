import java.util.Random;

public class Main {

    public static void main(String[] arg) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = rd.nextInt(101);
            System.out.print(arr[k] + "  ");
        }
        System.out.println();

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int c : arr) {
            System.out.print(c + "  ");
        }
    }
}
