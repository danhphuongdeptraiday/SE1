import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soLanTest = sc.nextInt();

        for (int i = 0; i < soLanTest; i++){
            int doDaiString = sc.nextInt();
            String s = sc.next();
            String tempString = s;
            s+="#";
            int temp = 1;
            String empty = "";

            if (doDaiString == 1){
                System.out.println(tempString);
            } else {
                for (int j = 1; j <= doDaiString; j++){
                    if (s.charAt(j) == s.charAt(j-1)){
                        temp++;
                    } else {
                        empty += s.charAt(j-1) +  String.valueOf(temp);
                        temp = 1;
                    }
                }
                if (empty.length() >= doDaiString){
                    System.out.println(tempString);
                }else {
                    System.out.println(empty);

                }
            }

        }
    }
}
