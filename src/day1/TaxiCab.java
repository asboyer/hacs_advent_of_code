package day1;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TaxiCab {

    public static final int NORTH=0, EAST=1, SOUTH=2, WEST=3;

    public static void main(String[] args) {
        int facing = 0;
        int x = 0;
        int y = 0;
        boolean going = true;
        ArrayList<Point> coors = new ArrayList();
        // try and catch
        try {
            Scanner reader = new Scanner(new File("src/day1/input.txt"));
            while(reader.hasNext()) {
                String step = reader.next();
                String dir = step.substring(0, 1);
                int steps = Integer.parseInt(step.substring(1));
                if(dir.equals("R")) facing++;
                else facing+= 3;
                for (int i = 0; i < steps; i++) {
                    if(facing % 4 == NORTH) y++;
                    if(facing % 4 == EAST) x++;
                    if(facing % 4 == SOUTH) y--;
                    if(facing % 4 == WEST) x--;
                    Point p = new Point(x, y);
                    if(coors.contains(p) && going) { System.out.print("Answer to part 2: "); System.out.println(Math.abs(x) + Math.abs(y)); going = false;}
                    coors.add(p);
                }
            }
        }catch(Exception e){e.printStackTrace();}
        System.out.print("Answer to part 1: ");
        System.out.println(Math.abs(x) + Math.abs(y));
    }
}
