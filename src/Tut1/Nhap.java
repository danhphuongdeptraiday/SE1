package Tut1;

public class Nhap {
    public static void main(String[] args) {
        int c = 0;
        String s = "aba  babab";
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                String.valueOf(s.charAt(i));
            }
        }
        System.out.println(s);
    }
}
