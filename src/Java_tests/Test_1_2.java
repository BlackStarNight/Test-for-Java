package Java_tests;

//Реализуйте алгоритм сортировки пузырьком для сортировки массива

public class Test_1_2 {
    public static void main(String[] args) {
        //Берем массив и заполням рандомными числами, количество в массиве задается N
        int n = 10;
        double[] a = new double[n];
        for (int i=0;i<n;i++){
            a[i] = (int)(Math.random()*1000);
        }

        double temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
