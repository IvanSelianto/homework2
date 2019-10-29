package com.company;


import java.util.Arrays;
import java.util.Random;


public class Main {
    public static final Random RANDOM = new Random();


    public static void main(String[] args) {
        int[] intArray = createArray(4);


        checkPalindrome("шаdлаш");
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(intArray));
        System.out.println("-----------------------");
        System.out.println(checkArray(-3, intArray));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(swapMinMaxElement(intArray)));
        System.out.println("Среднее арифметическое равно: " + averageOfArray(intArray));
        System.out.println("Количество отрицатлельных элементов массива: " + amountOfNegativeElements(intArray));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(deleteElementFromIntArray(3, intArray)));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString((fromTheEndArray(intArray))));
        System.out.println("-----------------------");
        System.out.println(isSorted(sortIntArray(intArray)));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(mixArrayElements(intArray)));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(sortIntArray(intArray)));
        System.out.println("-----------------------");
        printTwoDimensionalArray(generateTwoDimensionalArray(4, 5));

        // write your code here
    }

    public static void checkPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int j = 0;
        for (int i = charArray.length - 1; i > -1; i--) {
            if (charArray[i] != charArray[j]) {
                System.out.println("Строка  не является палиндромом");

                return;
            } else {
                j++;
            }
        }
        System.out.println("Строка является палиндромом");
    }


    public static int[] createArray(int n) {

        int[] intArray = new int[n];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = RANDOM.nextInt(100) - 50;
        }
        return intArray;
    }

    public static int checkArray(int x, int[] intArray) {

        boolean ind = false;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == x) {
                System.out.println("Ваше число " + x + " находится на позиции номер " + i);
                ind = true;
            }
        }
        int val = (ind) ? 1 : -1;
        return val;

    }

    public static int[] swapMinMaxElement(int[] intArray) {
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
            if (min == arrayOfNumbers[i]) {
                minElementIndex = i;
            }
            if (max == arrayOfNumbers[i]) {
                maxElementIndex = i;
            }
            i++;
        }

        for (int j = 0; j < arrayOfNumbers.length; j++) {

        }
        int tempInt = arrayOfNumbers[maxElementIndex];
        arrayOfNumbers[maxElementIndex] = arrayOfNumbers[minElementIndex];
        arrayOfNumbers[minElementIndex] = tempInt;
        return arrayOfNumbers;


    }

    public static double averageOfArray(int[] intArray) {


        int i = 0;
        int allAmount = 0;
        do {
            allAmount += intArray[i];
            i++;

        } while (i < intArray.length);
        return (double) (allAmount / intArray.length);
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
        int[] resultArray = new int[intArray.length - 1];
        int j = 0;
        int[] outOfBoundsException = new int[1];
        if (n > intArray.length - 1) {
            outOfBoundsException[0] = -1;
            return outOfBoundsException;
        }

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == intArray[n]) {
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

    public static boolean isSorted(int[] intArray) {
        boolean isSorted = false;
        boolean[] array = new boolean[intArray.length];

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] < intArray[i + 1]) {
                array[i] = true;

            }

        }

        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                isSorted = true;
                break;

            }
        }
        return  isSorted;
    }


    public static int[] mixArrayElements(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            int index = RANDOM.nextInt(i + 1);
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
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;

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
                array[i][j] = RANDOM.nextInt((10) - 5);


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








            

