package Java_tests;

//Задача:
//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).

import java.util.Arrays;

public class Test_1_4 {
    public static void main(String[] args) {
        //Берем массив и заполням рандомными числами, количество в массиве задается N
        int n = 20;
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = 1 + (int)(Math.random()*8);
        }
        int k = 1 + (int)(Math.random()*8);
        System.out.println("Key = "+k);
        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1){
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i]+", ");
        }
        a = removeElem(a,k);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1){
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i]+", ");
        }

    }

    public static int[] removeElem(int[] mass, int key) {
        int temp = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key){
                temp++;
            }else{
                mass[i-temp] = mass[i];
            }
        }
        return Arrays.copyOf(mass,mass.length - temp);
    }
}
