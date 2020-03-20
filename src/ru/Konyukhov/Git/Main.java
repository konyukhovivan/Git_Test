package ru.Konyukhov.Git;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество товара:");
	    int count = in.nextInt();
        System.out.println("Введите цену:");
        int price = in.nextInt();

        int total = count*price;
        
        System.out.println("Стоимость товара:");
        System.out.println(total);
    }
}
