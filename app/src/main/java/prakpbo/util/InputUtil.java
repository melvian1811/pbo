package prakpbo.util;

import java.util.Scanner;

public class InputUtil{

private static Scanner scanner = new Scanner(System.in);

    public static int readInt(){
           return Integer.parseInt(scanner.nextLine());
    }

    public static String readLine(){
           return scanner.nextLine();
    }

    public static double readDouble(){
       return Double.parseDouble(scanner.nextLine());
    }
}