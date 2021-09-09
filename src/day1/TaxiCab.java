package day1;

import java.io.File;
import java.util.Scanner;

public class TaxiCab {
    public static void main(String[] args) {

        // try and catch
        try {
            Scanner reader = new Scanner(new File("input.txt"));
        }catch(Exception e){e.printStackTrace();}
    }
}
