package cheting;

import java.util.Arrays;

public class prime {
    public static void main(String str[]){

        int counter = 0;
        int num = 0;
        int[] p_array = new int[counter];

        int size = 99;
        int[] array = new int[size];

        for (int i = 0; i < array.length ; i++) {
            array[i] = i+2;
        }
        for (int i = 0; i < 98 ; i++) {
            boolean prime = true;

            for (int j = 2; j < array[i] ; j++) {
                if (array[i]%j==0) {
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.println(array[i]);
                counter++;
                num = array[i];
                }
            }


        }
    }

