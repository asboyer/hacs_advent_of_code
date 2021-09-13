package day2;

import java.io.File;
import java.util.Scanner;

public class KeyPad1 {

    public static void main(String[] args) {
        int code[] = new int[5];
        int arr2[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int r = 1;
        int c = 1;
        int num = 0;
        try {
            Scanner reader = new Scanner(new File("src/day2/input.txt"));
            while(reader.hasNext()) {
                String steps = reader.nextLine();
                for (int i = 0; i < steps.length(); i++) {
                    char dir = steps.charAt(i);
                    
                    if(dir == 'L') c --;
                    else if(dir == 'R') c ++;
                    else if(dir == 'U') r --;
                    else if(dir == 'D') r ++;

                    if(r < 0) r ++;
                    else if(r > 2) r--;
                    if(c < 0) c ++;
                    else if(c > 2) c--;
                }
                code[num] = arr2[r][c];
                num++;

            }
        }catch(Exception e){e.printStackTrace();}
        System.out.print("Answer to part 1: ");
        for(int n: code) System.out.print(n);
    }
}
