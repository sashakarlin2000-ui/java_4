package fourth;

public class n1 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        m1.insertDouble(1.5, 0, 0);
        m1.insertDouble(2.5, 0, 1);
        m1.insertDouble(3.0, 1, 2);
        System.out.println("Элементов: " + m1.getLength());
        System.out.println("Сумма: " + m1.getSum());

        m1.multiplyElMatrix(2);
        System.out.println("После *2: " + m1.getSum());

        m1.addElMatrix(1);
        System.out.println("После +1: " + m1.getSum());

        Matrix m2 = new Matrix(1, 1);
        m2.insertDouble(10, 0, 0);
        m2.multiplyElMatrix(5);
        m2.addElMatrix(2);
        System.out.println("m2 сумма: " + m2.getSum());

        try {
            m1.insertDouble(1, 5, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            new Matrix(0, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}


