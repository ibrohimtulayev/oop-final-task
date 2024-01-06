package util;

import java.util.Scanner;

public interface Input {
    static int inputInt(String msg){
        Scanner scanner= new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextInt();
    }
    static double inputDouble(String msg){
        Scanner scanner= new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextDouble();
    }

    static String inputStr(String msg){
        Scanner scanner= new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
