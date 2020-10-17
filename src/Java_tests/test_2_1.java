package Java_tests;

//Задача:
//Создайте класс, который описывает вектор (в трёхмерном пространстве).
//У него должны быть:
//*конструктор с параметрами в виде списка координат x, y, z
//*метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
//*метод, вычисляющий скалярное произведение:
//*метод, вычисляющий векторное произведение с другим вектором:
//*метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
//*методы для суммы и разности:
//*статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
//Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть, нужно реализовать шаблон "Неизменяемый объект"

public class test_2_1 {
    public static void main(String[] args) {
        Vector a = new Vector(2,3,6);
        System.out.println(a.length());
        System.out.println(a.scalarProduct(new Vector(2,3,6)));
        System.out.println(a.crossProduct(new Vector(4,2,14)));
        System.out.println(a.angle(new Vector(4,2,10)));
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
    }
}

class Vector{
    private double x;
    private double y;
    private double z;

    @Override
    public String toString() {
        return "Vector(" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                '}';
    }

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return (Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2)));
    }

    public double scalarProduct(Vector vector){
        return (x*vector.x + y*vector.y + z*vector.z);
    }

    public Vector crossProduct(Vector vector){
        return (new Vector(y*vector.z - z*vector.y,z*vector.x - x*vector.z,x*vector.y - y*vector.x));
    }

    public double angle(Vector vector){
        return (this.scalarProduct(vector) / (this.length()*vector.length()));
    }

    public Vector add(Vector vector){
        return (new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z)
        );
    }

    public Vector subtract(Vector vector){
        return (new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z)
        );
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }

}
