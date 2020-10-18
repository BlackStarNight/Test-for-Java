package Java_tests;

//Задача:
//
//Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
//Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
//Пример:
//Дан массив [1, 2, 3], и массив весов [1, 2, 10].
//В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».


public class Test_2_2 {
    public static void main(String[] args) {
        int[] mass = {1,2,3};
        int[] massWeight = {1,2,10};
        randomNum a = new randomNum(mass, massWeight);
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
        System.out.println(a.getNum());
    }
}


class randomNum{
    private int[] newMass;
    private int massSize;

    public randomNum(int[] mass, int[] massWeight){
        if (mass.length == massWeight.length) {
            int sum = 0;
            for (int i = 0; i < mass.length; i++) {
                sum += massWeight[i];
            }
            this.newMass = new int[sum];
            this.massSize = sum;
            int k = 0;
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < massWeight[i]; j++) {
                    this.newMass[k] = mass[i];
                    k++;
                }
            }
        } else{
            System.out.println("Ошибка: количество значений в массиве не совпадает с весами");
        }
    }

    public int getNum(){
        return (newMass[(int)(Math.random()*massSize)]);
    }

}
