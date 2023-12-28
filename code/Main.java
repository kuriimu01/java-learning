import java.lang.*;

class Main{
    public static void main(String[] args){
        int a = 1010101021;
        String s = String.valueOf(a);
        if (s.matches("[01]+")){
            System.out.println("binary");
        }else {
            System.out.println("not binary");
        }
    }
}