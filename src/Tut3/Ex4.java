package Tut3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void combine(int[] a, int[] b){
        int sumOfB = 0;
        Scanner sc = new Scanner(System.in);

        if (a.length == 0 && b.length == 0){
            System.out.println("asd");
            try {
                if (a.length == 0 && b.length == 0) {
                    throw new NullPointerException();
                }
            } catch (NullPointerException e) {
                System.out.println("Enter number of element to array a");
                int n = sc.nextInt();
                a = new int[n];
                for (int i = 0 ; i < n; i++){
                    System.out.println("Enter element at "+ (i+1));
                    a[i] = sc.nextInt();
                }

                System.out.println("Enter number of element to array b");
                int m = sc.nextInt();
                b = new int[m];
                for (int i = 0 ; i < m; i++){
                    System.out.println("Enter element at "+ (i+1));
                    b[i] = sc.nextInt();
                    sumOfB += b[i];
                }

                for (int j = 0; j < n; j++) {
                    a[j] *= sumOfB;
                }
            }
        }
        else if (a.length < 1 && b.length >= 1) {
            try {
                if (a.length < 1 && b.length >= 1) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Enter number of element to array a");
                int n = sc.nextInt();
                a = new int[n];
                for (int i = 0 ; i < n; i++){
                    System.out.println("Enter element at "+ (i+1));
                    a[i] = sc.nextInt();
                }

                for (int i = 0 ; i < b.length; i++){
                    sumOfB += b[i];
                }

                for (int j = 0; j < n; j++) {
                    a[j] *= sumOfB;
                }
            }
        }

        else if (a.length >= 1 && b.length < 1) {
            try {
                if (a.length >= 1 && b.length < 1) {
                    throw new Exception();
                }
            } catch (Exception e) {

                System.out.println("Enter number of element to array b");
                int m = sc.nextInt();
                b = new int[m];
                for (int i = 0 ; i < m; i++){
                    System.out.println("Enter element at "+ (i+1));
                    b[i] = sc.nextInt();
                    sumOfB += b[i];
                }

                for (int j = 0; j < a.length; j++) {
                    a[j] *= sumOfB;
                }
            }
        }

        else if (a.length > 0 && b.length > 0){
            for (int i = 0 ; i < b.length; i++){
                sumOfB += b[i];
            }

            for (int j = 0; j < a.length; j++) {
                a[j] *= sumOfB;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5};
        combine(a,b);
    }
}
