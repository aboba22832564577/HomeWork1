package com.company;

public class Main {

    public static void main(String[] args) {
        String MyWorld = " Osh,";
        String world = " My name is Urmat, ";
        int num = 0;


        System.out.println(MyWorld + world + num);

        if (num < 0) {
            System.out.println("вы сохранили отрицательное число!");
        } else if (num > 0) {
            System.out.println("вы сохранили положительное число!");
        } else {
            System.out.println("вы сохранили число 0");
        }


        String yourName = "alma";
        System.out.println("введите ваше имя");

        if (yourName == "Urmat") {
            System.out.println("это вы");
        } else {
            System.out.println("это не вы!");
        }
    }
}
