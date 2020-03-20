package ru.Konyukhov.Git;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

	    int count = in.nextInt();
        int price = in.nextInt();

        int total = count*price;
        System.out.println(total);
    }
}
