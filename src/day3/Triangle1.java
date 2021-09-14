package day3;

import java.io.File;
import java.util.Scanner;

public class Triangle1 {

    public static void main(String[] args) {
        int p = 0;
        try {
            Scanner reader = new Scanner(new File("src/day3/input.txt"));
            while(reader.hasNext()) {
                int[] tri = new int[]{reader.nextInt(), reader.nextInt(), reader.nextInt()};
                if(tri[0] + tri[1] > tri[2] && tri[1] + tri[2] > tri[0] && tri[0] + tri[2] > tri[1]) p++;
            }
        }catch(Exception e){e.printStackTrace();}
        System.out.print(p);

    }
}
