import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arrUnsort) {
        int count = 0;
        for (int i = 0; i < arrUnsort.length - 1; i++)
            if (arrUnsort[i] > arrUnsort[i + 1]) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
                count++;
            }
        if (count > 0) {
            bubbleSort(arrUnsort);
        }
    }

    public static void main(String[] args) {
        int[] myArr = {104, 64, 34, 25, 12, 22, 11, 90};
        bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
