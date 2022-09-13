import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int doDaiString = sc.nextInt();
            String s = sc.next();
            String space = " ";
            String tempString = s;
            String newString = "";
            int c = 0;

//            if (doDaiString == 1 ){
//                if (s.equals(" ")){
//                    tempString = "";
//                    System.out.println(tempString);
//                } else  {
//                    System.out.println(tempString);
//                }
//            } else {
                for (int j = 0; j < s.length(); j++) {
                    if (String.valueOf(s.charAt(j)).equals(space)) {
//                        String.valueOf(tempString.charAt(j)) = "%";
                    } else {
                        newString = newString + ""+ s.charAt(j);
                    }
                }
                System.out.println(c);
                System.out.println(newString);

        }
    }
}
