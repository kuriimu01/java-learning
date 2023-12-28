import java.lang.*;

class Main{
    public static void main(String[] args){
        String s = "danya.but.05@gmail.com";
        String mailDomain;
        String mainPart;
        int len = s.length();
        mainPart = s.substring(0, s.indexOf("@"));
        mailDomain = s.substring(s.indexOf("@"), len);
        System.out.println(mainPart + "\n" + mailDomain);
    }
}