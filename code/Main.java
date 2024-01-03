import java.lang.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        String jStr = Integer.toString(j);
        for (int i=1; i<=jStr.length(); i++){
            System.out.println("№"+i+"  digit is: "+jStr.charAt(i-1));
        }
    }
}