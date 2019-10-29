package com.company;


import java.util.Arrays;
import java.util.Random;


public class Main {
    public static final Random RANDOM = new Random();


    public static void main(String[] args) {
        int[] intArray = createArray(4);


        System.out.println(checkPalindrome("шаkлаш"));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(intArray));
        System.out.println("-----------------------");
        System.out.println(findPos(3, intArray));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(swapMinMaxElement(intArray)));
        System.out.println("Среднее арифметическое равно: " + averageOfArray(intArray));
        System.out.println("Количество отрицатлельных элементов массива: " + amountOfNegativeElements(intArray));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(deleteElementFromIntArray(7, intArray)));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString((reverseArray(intArray))));
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

    public static boolean checkPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int j = 0;
        boolean bool = false;
        for (int i = charArray.length - 1; i > -1; i--) {
            if (charArray[i] != charArray[j]) {


                return bool;
            } else {
                j++;
            }
        }
        return !bool;
    }


    public static int[] createArray(int n) {

        int[] intArray = new int[n];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = RANDOM.nextInt(100) - 50;
        }
        return intArray;
    }

    public static int findPos(int x, int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == x) {
                return i;
            }
        }
        return -1;

    }

    public static int[] swapMinMaxElement(int[] intArray) {
        int k = 0;
        int min = intArray[0];
        int max = intArray[0];
        int indexMin = 0;
        int indexMax = 0;
        while (k < intArray.length) {

            if (min >= intArray[k]) {

                min = intArray[k];
                indexMin += k;
            }

            if (max <= intArray[k]) {

                max = intArray[k];
                indexMax += k;
            }

            k++;
        }
        intArray[indexMin] = max;
        intArray[indexMax] = min;
        return intArray;
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

        if (n > intArray.length - 1) {
            System.err.println("Число n превышает длину массива");
            return intArray;
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

    public static int[] reverseArray(int[] intArray) {
        int j = 0;

        int[] reverseArray = new int[intArray.length];
        for (int i = intArray.length - 1; i > -1; i--) {
            reverseArray[j] = intArray[i];
            j++;
        }
        return reverseArray;
    }

    public static boolean isSorted(int[] intArray) {
        boolean isSorted = true;


        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] < intArray[i + 1]) {
                continue;

            } else {
                isSorted = false;
                break;
            }

        }

        return isSorted;
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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = RANDOM.nextInt((10) - 5);


            }


        }

        return array;
    }

    public static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}








            

