package day3;

import java.io.File;
import java.util.Scanner;

public class Triangle1 {

    public static void main(String[] args) {
        int p = 0;
        try {
            Scanner reader = new Scanner(new File("src/day3/input.txt"));
            while(reader.hasNext()) {
                String lengths = reader.nextLine();
                String[] line = new String[4];
                int i = 0;
                int index = 0;
                while(lengths.length() > 0) {
                    if(lengths.length() == 3) {
                        line[index] = lengths;
                        lengths = "";
                    }else {
                        String str = lengths.substring(i, i + 2);
                        if (str.equals("  ")) {
                            String substr = lengths.substring(0, i);
                            line[index] = substr;
                            index++;
                            lengths = lengths.substring(i + 2, lengths.length());
                            i = 0;
                        }
                        i++;
                    }
                }
                int[] tri = new int[3];
                for (int j = 1; j < line.length ; j++) {
                    tri[j] = Integer.parseInt(line[j]);
                }
                if(tri[0] + tri[1] > tri[2]) p++;
            }
        }catch(Exception e){e.printStackTrace();}
//        System.out.print(p);

    }
}
