package day2;

import java.io.File;
import java.util.Scanner;

public class KeyPad2 {

    public static void main(String[] args) {
        int code[] = new int[5];
        int arr2[][] = new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 2, 3, 4, 0},
                        {5, 6, 7, 8, 9},
                        {0, 10, 11, 12, 0},
                        {0, 0, 13, 0, 0}
                        };
        int r = 2;
        int c = 0;
        int num = 0;
        
        try {
            Scanner reader = new Scanner(new File("src/day2/input.txt"));
            while(reader.hasNext()) {
                String steps = reader.nextLine();
                for (int i = 0; i < steps.length(); i++) {
                    char dir = steps.charAt(i);
                    
                    if((dir == 'L') && (c - 1 >= 0) && (arr2[r][c - 1] != 0)) c --;
                    else if((dir == 'R') && (c + 1 <= 4) && (arr2[r][c + 1] != 0)) c ++;
                    else if((dir == 'U') && (r - 1 >= 0) &&(arr2[r - 1][c] != 0)) r --;
                    else if((dir == 'D') && (r + 1 <= 4) && (arr2[r + 1][c] != 0)) r ++;
                }
                code[num] = arr2[r][c];
                num++;
            }

        }catch(Exception e){e.printStackTrace();}
        System.out.print("Answer to part 2: ");
        for(int n: code) {
            if(n == 10) System.out.print("A");
            else if(n == 11) System.out.print("B");
            else if(n == 12) System.out.print("C");
            else if(n == 13) System.out.print("D");
            else System.out.print(n);
        }
    }
}
