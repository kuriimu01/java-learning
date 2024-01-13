public class Main {

    public static void main(String[] arg) {
        Boolean[] arrayOfSheeps = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  null,  true ,
                false, false, true,  true };
        Counter.countSheeps(arrayOfSheeps);
    }
}
class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean i : arrayOfSheeps) {
            if (i != null && i) {
                count++;
            }
        }
        System.out.print(count);
        return count;
    }
}
