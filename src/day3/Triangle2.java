package day3;

import java.io.File;
import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        int p = 0;
        try {
            Scanner reader = new Scanner(new File("src/day3/input.txt"));
            while(reader.hasNext()) {
                int[][] tri = new int[][]{{reader.nextInt(), reader.nextInt(), reader.nextInt()},
                                        {reader.nextInt(), reader.nextInt(), reader.nextInt()},
                                        {reader.nextInt(), reader.nextInt(), reader.nextInt()}};
                for (int c = 0; c < 3; c++) {
                    if(tri[0][c] + tri[1][c] > tri[2][c] && tri[1][c] + tri[2][c] > tri[0][c] && tri[0][c] + tri[2][c] > tri[1][c]) p++;
                }
            }
        }catch(Exception e){e.printStackTrace();}
        System.out.print(p);

    }
}
