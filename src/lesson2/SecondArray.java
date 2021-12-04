package lesson2;

import java.util.Scanner;

public class SecondArray {
    public static void main(String[] args) {


        //С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.
        int array[][] = new int[3][4];
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Insert array elements:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Original array");
        for (int i = 0; i < array.length; i++) {
            System.out.println();

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }
        System.out.println();

        // 1. Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
        for (int i = 0; i < array.length; i++) {
            System.out.print("Line " + i + ": ");
            int sumLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumLine += array[i][j];
            }
            System.out.println(sumLine);
        }
        // 2. Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
        int o=0;
        for (int j = 0; j < array[o].length; j++) {
            System.out.print("Column " + j + ": ");
            int sumColumn = 0;
            for ( int f=0; f < array.length; f++) {
                sumColumn += array[f][j];
            }
            System.out.println(sumColumn);
        }

        //4. Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.
        for (int i = 0; i < array.length; i++) {
            System.out.print("Arithmetic mean for line " + i + ": ");
            int sumLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumLine += array[i][j];
            }
            System.out.println((double) sumLine/(array[i].length));
        }

        //5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.

        int  newArray [] = new int[12];

        for (int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                newArray[i*array[i].length+j] = array[i][j];;
            }
        }
        int n = newArray.length;
        int arrayReverse [] = new int[n];
        int c = n;
        for(int i=newArray.length-1;i>=0;i--)
        {
            arrayReverse[c-1]= newArray[i];
            c = c - 1;
            System.out.print(arrayReverse[c] + " ");
        }


        //3. Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.

        for (int i = 0; i < array.length; i++) {
            System.out.println();

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0)
                    array[i][j]=0;
                if (array[i][j] % 2 != 0)
                    array[i][j]=1;
                System.out.print(array[i][j] + " ");
            }

        }
        System.out.println();


    }
}
