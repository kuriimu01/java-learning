import java.lang.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        String jStr = Integer.toString(j);
        for (int i=1; i<=jStr.length(); i++){
            int num = jStr.charAt(i-1)-'0';
            switch (num){
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
        }
    }
}