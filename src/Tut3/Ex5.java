package Tut3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex5 {
    public static void divide(int[] a, int[] b){
        Scanner sc = new Scanner(System.in);
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        List<Integer> tempArr = new ArrayList<>();

        if (b.length < a.length) {
            try {
                throw new IndexOutOfBoundsException();
            } catch (Exception e) {
                System.out.println("Arrays of B is smaller than Arrays of A, add more ?");
                String ans = sc.nextLine();

                if (ans.equalsIgnoreCase("no")) {
                    System.out.println("Quit success");
                    return;
                } else if (ans.equalsIgnoreCase("yes")) {

                    for (int i = 0; i < (a.length - b.length); i++){
                        System.out.println("Enter number for b");
                        listB.add(sc.nextInt());
                    }
                }
            }
            for (int i = 0; i < a.length; i++){
                try {
                    if (listA.get(i).equals(0)){
                        throw new ArithmeticException();
                    }
                } catch (ArithmeticException e1 ){
                    System.out.println("Do you want to continue");
                    String errAns = sc.nextLine();
                    if (errAns.equalsIgnoreCase("no")){
                    } else if (errAns.equalsIgnoreCase("yes")){
                        System.out.println("Replace this zero number of a by ");
                        listA.set(i, sc.nextInt());
                    }
                }
                tempArr.add(listB.get(i) / listA.get(i));
            }
        }

        else if (b.length > a.length) {
            try {
                throw new IndexOutOfBoundsException();
            } catch (Exception e) {
                System.out.println("Arrays of A is smaller than Arrays of B, add more ?");
                String ans = sc.nextLine();

                if (ans.equalsIgnoreCase("no")) {
                    System.out.println("Quit success");
                    return;
                } else if (ans.equalsIgnoreCase("yes")) {

                    for (int i = 0; i < (b.length - a.length); i++){
                        System.out.println("Enter number for a");
                        listA.add(sc.nextInt());
                    }
                }
            }
            for (int i = 0; i < b.length; i++){
                try {
                    if (listA.get(i).equals(0)){
                        throw new ArithmeticException();
                    }
                } catch (ArithmeticException e1 ){
                    System.out.println("Do you want to continue");
                    String errAns = sc.nextLine();
                    if (errAns.equalsIgnoreCase("no")){
                    } else if (errAns.equalsIgnoreCase("yes")){
                        System.out.println("Replace this zero number of a by ");
                        listA.set(i, sc.nextInt());
                    }
                }
                tempArr.add(listB.get(i) / listA.get(i));
            }
        }

        else {
            for (int i = 0; i < b.length; i++) {
                try {
                    if (listA.get(i).equals(0)) {
                        throw new ArithmeticException();
                    }
                } catch (ArithmeticException e1) {
                    System.out.println("Do you want to continue");
                    String errAns = sc.nextLine();
                    if (errAns.equalsIgnoreCase("no")) {
                    } else if (errAns.equalsIgnoreCase("yes")) {
                        System.out.println("Replace this zero number of a by ");
                        listA.set(i, sc.nextInt());
                    }
                }
                tempArr.add(listB.get(i) / listA.get(i));
            }
        }
        int[] primitive = tempArr.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(primitive));
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,10};
        int[] b = {2,4,6,8,10};
        divide(a,b);
    }
}
