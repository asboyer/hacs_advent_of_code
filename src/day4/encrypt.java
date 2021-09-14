package day4;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class encrypt {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        try {
            Scanner reader = new Scanner(new File("src/day4/input.txt"));
            while(reader.hasNext()) {
                String steps = reader.nextLine();
                // count
                HashMap<Character, Integer> map = new HashMap<>();
                for(int i = 0; i < alphabet.length(); i++) {
                    map.put(alphabet.charAt(i), 0);
                }
                
                String first = steps.substring(0, steps.length() - 7);
                String second = steps.substring(steps.length() - 6, steps.length() - 1);
                System.out.print(first);
                System.out.print("|");
                System.out.print(second);

                for (int i = 0; i < steps.length(); i++) {
                    if(alphabet.contains(steps.substring(i, i+1))){

                    }
                }
                System.out.println();
            }
        }catch(Exception e){e.printStackTrace();}

    }
}
