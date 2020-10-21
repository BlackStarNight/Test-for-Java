package Java_tests;

import java.lang.*;

//Задача:
//
// Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
// Используйте перебор и двоичный поиск для решения этой задачи.
// Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).


public class Test_3_1 {
    public static void main(String[] args) {
        int n = 1000000;
        double[] a = new double[n];
        for (int i=0;i<n;i++){
            a[i] = 2 + (int)(Math.random()*(200-2));
        }
        a = sortMass(a,0, n-1);
        double time = System.currentTimeMillis();
        System.out.println();
        System.out.println(bruteForce(a,180));
        System.out.println(System.currentTimeMillis() - time);
        System.out.println();
        double time2 = System.currentTimeMillis();
        System.out.println(binarySearch(a, 180));
        System.out.println(System.currentTimeMillis() - time2);
    }


    public static double bruteForce(double[] array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key)
                return i;
        }
        return -1;
    }


    public static double[] sortMass(double[] array, int low, int high){
        if (array.length == 0)
            return array;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return array;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        double opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sortMass(array, low, j);

        if (high > i)
            sortMass(array, i, high);
        return array;
    }

    public static int binarySearch(double[] sortArray, double key){
        return binarySearch(sortArray, key, 0, sortArray.length);
    }


    private  static  int binarySearch(double[] sortedArray, double key, int low, int high){
        int middle = (low + high) / 2;

        if (high < low){
            return -1;
        }

        if (key == sortedArray[middle]){
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearch( sortedArray, key, low, middle-1);
        }else {
            return  binarySearch( sortedArray, key,middle+1,high);
        }

    }
}
