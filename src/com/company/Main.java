package com.company;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        int x = in.nextInt();
        int a = in.nextInt();
        int i=0;
        int c=0;

            while(i!=a){
                c+=x;
                i++;}



        System.out.println(c);
    }
}
