package test;

import java.util.Arrays;

public class SelectionSort {
    static int[] array = {2,9,5,1,4,8};

//    public static void check(int[] array){
//        int min ;
//        for(int k = 0; k < array.length - 1; k ++){
//            min = k;
//            for (int j = k + 1; j < array.length; j ++){
//                if(array[j] < array[min]){
//                    min = j;
//                }
//            }
//
//            if(min != k){
//                int temp = array[min];
//                array[min] = array[k];
//                array[k] = temp;
//            }
//        }
//    }
    public static void check(int [] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        check(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}
