package cheting;

import java.util.Arrays;
public class methods {
    static public void main(String[] str) {

        //удаление элемента из массива
        int counter = 1;
        int a = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length ; i++) {
            array[i] = (2+i)*(6+i);
        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i]==32){
                counter--;
            }else {
                counter++;
            }
        }
        int[] d_array = new int[counter];
        for (int i = 0; i < array.length ; i++) {
        if (array[i]==32){
            a++;
        }else {

            d_array[i-a] = array[i];
        }

        }
        
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(d_array));
    }
}
