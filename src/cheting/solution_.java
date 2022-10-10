package cheting;

import java.util.Arrays;

//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
public class solution_ {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        double mid = 0;

        int a ;


        int[] array = new int[10];
// заполняю массив
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random()*13);
        }

        System.out.println(Arrays.toString(array));
// пузырьковая сортировка
        for (int i = 0; i <= array.length; i++) {
            for (int j = array.length - 1; j > i ; j--) {
                if (array[j-1] > array[j]){
                    a = array[j-1];
                    array[j-1] = array[j];
                    array[j] = a;
                }
            }
        }
// вывод max min и среднего значения
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[i-1]) min = array[i];
            if (array[i] > array[i-1]) max = array[i];
        }

        for (int sum:
             array) {
            mid += sum;
        }

        System.out.println(min);
        System.out.println(mid/array.length);
        System.out.println(max);
        System.out.println(Arrays.toString(array));
    }
}





