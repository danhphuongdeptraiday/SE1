package Tut3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            String curLine;
            br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\SE1\\src\\Tut3\\text.txt"));
            String text = "";
            while ((curLine = br.readLine()) != null) {
                text+= curLine;
            }
            String[] arrText = text.split(" ");
            String newText = "";
            for (int i = 0; i < args.length; i++){
                newText += arrText[i];
            }
            System.out.println(newText);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
