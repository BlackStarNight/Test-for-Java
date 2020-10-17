package Java_tests;

//Задача:
//Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

public class Test_1_1 {
    public static void main(String[] args) {
        int n = 10;
        double[] a = new double[n];
        for (int i=0;i<n;i++){
            a[i] = (int)(Math.random()*1000);
        }
        double min = a[0];
        double max = a[0];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]<min){
                min = a[i];
            }
            if (a[i]>max){
                max = a[i];
            }
            sum +=a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        double aver = sum/n;
        double aver_num = a[0];
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i]-aver) < Math.abs(aver_num-aver)){
                aver_num = a[i];
            }
        }
        System.out.println(min+"\n"+max+"\n"+aver_num+"\n"+aver);
    }
}
