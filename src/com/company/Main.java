package com.company;


import java.util.Arrays;
import java.util.Random;


public class Main {


    public static void main(String[] args) {
        int[] intArray = createArray(4);


        checkPalindrome("шавлаш");
        System.out.println(Arrays.toString(intArray));
        checkArray(23, intArray);
        swapMinMaxElement(intArray);
        averageOfArray(intArray);
        System.out.println("Количество отрицатлельных элементов массива: " + amountOfNegativeElements(intArray));
        System.out.println(Arrays.toString(deleteElementFromIntArray(3, intArray)));
        System.out.println(Arrays.toString((fromTheEndArray(intArray))));
        // sortArrayOrNo(intArray);
        System.out.println(Arrays.toString(mixArrayElements(intArray)));
        System.out.println(Arrays.toString(sortIntArray(intArray)));
        System.out.println("------------");
        printTwoDimensionalArray(generateTwoDimensionalArray(4,5));

        // write your code here
    }

    public static void checkPalindrome(String str) {
        char[] charArray = str.toCharArray();
        char[] charArrayAtFirst = new char[charArray.length];
        char[] charArrayFromTheEnd = new char[charArray.length];
        boolean k = false;
        for (int i = 0; i < charArray.length; i++) {
            charArrayAtFirst[i] = charArray[i];
        }

        for (int i = charArray.length - 1; i > -1; i--) {
            charArrayFromTheEnd[i] = charArray[i];
        }
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArrayAtFirst[i] != charArrayFromTheEnd[i]) {
                System.out.println("Строка не является палиндромом");
                break;
            } else {
                k = true;
            }

        }
        if (k == true) {
            System.out.println("Строка является палиндромом");
        }
//Подскажи, пожалуйста, как написать правильно, не переписывая здесь весь код, я знаю, что этот метод не работает

    }

    public static int[] createArray(int n) {

        int[] intArray = new int[n];
        Random r = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = r.nextInt(100) - 50;
        }
        return intArray;
    }

    public static void checkArray(int x, int[] intArray) {

        boolean ind = false;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == x) {
                System.out.println("Ваше число " + x + " находится на позиции номер " + i);
                ind = true;
            }
        }
        if (ind == false) {
            System.out.println(-1);

        }

    }

    public static void swapMinMaxElement(int[] intArray) {
        int[] arrayOfNumbers = intArray;

        int k = 0;
        int i = 0;

        int min = arrayOfNumbers[0];
        int max = arrayOfNumbers[0];

        int minElementIndex = arrayOfNumbers[0];
        int maxElementIndex = arrayOfNumbers[0];

        while (k < arrayOfNumbers.length) {

            if (min > arrayOfNumbers[k]) {

                min = arrayOfNumbers[k];
            }
            k++;
        }

        while (i < arrayOfNumbers.length) {

            if (max < arrayOfNumbers[i]) {

                max = arrayOfNumbers[i];
            }
            i++;
        }

        for (int j = 0; j < arrayOfNumbers.length; j++) {
            if (min == arrayOfNumbers[j]) {
                minElementIndex = j;
            }
            if (max == arrayOfNumbers[j]) {
                maxElementIndex = j;
            }
        }
        int tempInt = arrayOfNumbers[maxElementIndex];
        arrayOfNumbers[maxElementIndex] = arrayOfNumbers[minElementIndex];
        arrayOfNumbers[minElementIndex] = tempInt;
        System.out.println(Arrays.toString(arrayOfNumbers));


    }

    public static void averageOfArray(int[] intArray) {
        int[] arrayOfNumbers = intArray;

        int i = 0;
        int allAmount = 0;
        do {
            allAmount += arrayOfNumbers[i];
            i++;

        } while (i < arrayOfNumbers.length);
        System.out.println("Среднее арифметическое массива будет равно:" + (double) allAmount / arrayOfNumbers.length);
    }

    public static int amountOfNegativeElements(int[] intArray) {
        int counter = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {
                counter++;

            }
        }
        return counter;
    }

    public static int[] deleteElementFromIntArray(int n, int[] intArray) {
        int[] copiedArray = intArray;
        int[] resultArray = new int[intArray.length - 1];
        int j = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (copiedArray[i] == intArray[n]) {
                continue;
            } else {
                resultArray[j] = intArray[i];
                j++;


            }

        }
        return resultArray;
    }

    public static int[] fromTheEndArray(int[] intArray) {
        int j = 0;

        int[] arrayFromTheEnd = new int[intArray.length];
        for (int i = intArray.length - 1; i > -1; i--) {
            arrayFromTheEnd[j] = intArray[i];
            j++;
        }
        return arrayFromTheEnd;
    }

    public static void sortArrayOrNo(int[] intArray) {
        boolean[] array = new boolean[intArray.length];

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] < intArray[i + 1]) {
                array[i] = true;

            }

        }

        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                System.out.println("Массив не отсортирован по возрастанию");
                break;

            }
        }
    }
    // Как написать об отсортировке массива?
    public static int[] mixArrayElements(int[] intArray) {
        Random r = new Random();

        for (int i = 0; i < intArray.length; i++) {
            int index = r.nextInt(i + 1);
            int j = intArray[index];
            intArray[index] = intArray[i];
            intArray[i] = j;

        }

        return intArray;

    }

    public static int[] sortIntArray(int[] intArray) {
        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int max = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = max;

                }
            }


        }

        return intArray;
    }
    public static int[][] generateTwoDimensionalArray(int length, int width) {
        int[][] array = new int[length][width];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(10) - 5;


            }

            // write your code here
        }

        return array;
    }
    public static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}








            

