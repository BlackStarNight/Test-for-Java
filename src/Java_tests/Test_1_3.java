package Java_tests;

//Задача:
//Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.


public class Test_1_3 {
    public static void main(String[] args) {
        //Берем массив и заполням рандомными числами, количество в массиве задается N
        int n = 20;
        double[] a = new double[n];
        for (int i=0;i<n;i++){
            a[i] = 2 + (int)(Math.random()*100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+", ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= a[i]; j++) {
                if (a[i] % j == 0 && j != a[i]) {
                    break;
                }
                else if(a[i] == j){
                    System.out.println(a[i]);
                }
            }
        }
    }

}

