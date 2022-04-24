package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ситаксис Java чтобы ввод пользвоателя принмать не обращай внимание
        int userPoints = 35;
        int temp = 0;
        while (userPoints > 0) {
            System.out.println("Ваш счёт " + userPoints);
            System.out.println("Осторожно, Запускаем барабаны!!!");
            int a = 1 + (int) (Math.random() * 11);
            System.out.println("Первый барабан: " + a);
            int b = (int) (Math.random() * 10);
            System.out.println("Второй барабан: " + b);
            int c = (int) (Math.random() * 10);
            System.out.println("Третий барабан: " + c);
            if (a == b && b == c) {
                temp = a;
                System.out.println("Вы счастливчик!");
                userPoints = userPoints + temp;
                System.out.println("Ваш счёт: " + userPoints);
                System.out.println("Играем дальше? Введите 1 чтобы продолжить 0 чтобы выйти");
                int num3 = in.nextInt();
                if (num3 == 0) {
                    System.out.println("Досвидания! Ваш счёт: " + userPoints);
                    break;
                }
            }
            else if ((a == b) || (b == c)) {
                temp = b;
                System.out.println("Сделайте выбор получить: " + temp + " или получите 1 очко");
                System.out.println("Введите любое число чтобы рискнуть или 1 чтобы получить 1 очко");
                int num = in.nextInt();//принимает пользовательский ввод
                if (num == 1) {
                    userPoints = userPoints + 1;
                } else {
                    int d = (int) (Math.random() * 10);
                    System.out.println("Рисковый барабан: " + d);
                    if (d == temp) {
                        System.out.println("Вы счастливчик!");
                        userPoints = userPoints + temp;
                        System.out.println("Ваш счёт: " + userPoints);
                    } else {
                        System.out.println("Вам не повезло! Минус 5 очков");
                        userPoints = userPoints - 5;
                        System.out.println("Ваш счёт: " + userPoints);
                        System.out.println("Играем дальше? Введите 1 чтобы продолжить 0 чтобы выйти");
                        int num3 = in.nextInt();
                        if (num3 == 0) {
                            System.out.println("Досвидания! Ваш счёт: " + userPoints);
                            break;
                        }
                    }
                }
            } else if (a == c) {
                temp = c;
                System.out.println("Сделайте выбор получить: " + temp + "или получите 1 очко");
                System.out.println("Введите любое число чтобы рискнуть или 1 чтобы получить 1 очко");
                int num = in.nextInt();//принимает пользовательский ввод
                if (num == 1) {
                    userPoints = userPoints + 1;
                } else {
                    int d = (int) (Math.random() * 10);
                    System.out.println("Рисковый барабан: " + d);
                    if (d == temp) {
                        userPoints = userPoints + temp;
                    } else {
                        System.out.println("Вам не повезло! Минус 5 очков");
                        userPoints = userPoints - 5;
                        System.out.println("Ваш счёт: " + userPoints);
                        System.out.println("Играем дальше? Введите 1 чтобы продолжить 0 чтобы выйти");
                        int num2 = in.nextInt();
                        if (num2 == 0) {
                            System.out.println("Досвидания! Ваш счёт: " + userPoints);
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Вы проиграли! минус 5 очков с вашего счёта");
                userPoints = userPoints - 5;
                System.out.println("Ваш счёт " + userPoints);
                System.out.println("Играем дальше? Введите 1 чтобы продолжить 0 чтобы выйти");
                int num = in.nextInt();
                if (num == 0) {
                    System.out.println("Досвидания! Ваш счёт: " + userPoints);
                    break;
                }
            }
            if (userPoints >= 50) {
                System.out.println("Вы обыграли наше казино!");
                System.out.println("Досвидания! Ваш счёт: " + userPoints);
                break;
            } else if (userPoints <= 0) {
                System.out.println("Вы БАНКРОТ! Проваливай");
                break;
            }
        }
    }
}
