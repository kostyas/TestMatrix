package com.ua.kashyrin;

import java.util.Scanner;

public class MatrixMain {

    public static void main(String[] args) {

        System.out.println("Enter your string: ");
        Scanner scanner = new Scanner(System.in);
        String stringMatrix = scanner.nextLine();

        int stringLenth = stringMatrix.length(); //угадываем длину строки
        //System.out.println(stringLenth);
        int row = (int) Math.ceil(Math.sqrt(stringLenth));//округляем строку до целого числа в большуюсторону
        int column = (int) Math.ceil(Math.sqrt(stringLenth));//округляем строку до целого числа в большуюсторону

        char str[][] = new char[row][column];//обьявляем двумерный массив и задаем ему колличество полей и колонок
        int count = 0;
        //здесь проставляем каждый символ в свою ячейку
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (count < stringMatrix.length())
                    str[i][j] = stringMatrix.charAt(count);
                count++;
                //Этот кусок необходим для того что бы нам в конце не выводили пустые символы
                if (str[i][j] == 0)
                    break;
                System.out.print(str[i][j]);//вывод нашей матрицы
            }
            System.out.println(""); //\n не работает
        }
    }}