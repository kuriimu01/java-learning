import java.lang.*;

class Main{
    public static void main(String[] args){
        String s = "AAAAAAG";
        if (s.matches("[0-9A-F]+")){
            System.out.println("hexadecimal");
        }else {
            System.out.println("not hexadecimal");
        }
    }
}
