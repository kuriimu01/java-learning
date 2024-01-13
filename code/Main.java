public class Main {

    public static void main(String[] arg) {
        boolean b = true;
        System.out.println(BooleanToString.convert(b));
    }
}
class BooleanToString {
    public static String convert(boolean b) {
        return Boolean.toString(b);
    }
}
