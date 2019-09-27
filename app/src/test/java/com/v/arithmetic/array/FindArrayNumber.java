package com.v.arithmetic.array;

public class FindArrayNumber {

    /**
     * 第二大的数
     */
    public static void findSecondBig(int array[]) {
        if (array.length < 3) {
            System.out.println("数组太小");
        }

        int i, max = array[0], second = array[1];
        if (max < second) {
            max = array[1];
            second = array[0];
        }
        for (i = 2; i < array.length; ++ i) {
            if (array[i] > max) {
                second = max;
                max = array[i];
            } else if (array[i] > second) {
                second = array[i];
            }
        }
        System.out.println("第一大的数:" + max);
        System.out.println("第二大的数:" + second);
    }

    /**
     * 第二小的数
     */
    public static void findSecondSmall(int array[]) {
        if (array.length < 3) {
            System.out.println("数组太小");
        }

        int i, min = array[0], second = array[1];
        if (min > second) {
            min = array[1];
            second = array[0];
        }
        for (i = 2; i < array.length; ++ i) {
            if (array[i] < min) {
                second = min;
                min = array[i];
            } else if (array[i] < second) {
                second = array[i];
            }
        }
        System.out.println("第一小的数:" + min);
        System.out.println("第二小的数:" + second);
    }
}
