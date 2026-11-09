
package fourth;

import java.util.Scanner;

public class n3 {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        CalculationHistory history = new CalculationHistory();

        while (true) {
            System.out.println("""
                    МЕНЮ
                    1 - Расчёт на Земле
                    2 - Расчёт на другой планете
                    3 - История расчётов
                    4 - Демонстрация ООП
                    0 - Выход
                    """);

            System.out.print("Выберите пункт: ");

            switch (SC.nextLine()) {

                case "1" -> {
                    System.out.print("Введите массу: ");
                    double mass = SC.nextDouble();

                    Calculation c = new EarthGravity(mass);

                    System.out.println(c);
                    history.add(c);
                }

                case "2" -> {
                    System.out.print("Введите массу: ");
                    double mass = SC.nextDouble();

                    System.out.print("Введите планету: ");
                    String planet = SC.nextLine();

                    System.out.print("Введите ускорение: ");
                    double gravity =  SC.nextDouble();

                    Calculation c = new CustomGravity(mass, planet, gravity);
                    System.out.println(c);
                    history.add(c);
                }

                case "3" -> history.printHistory();

                case "4" -> demonstrateOOP();
                case "0" -> {
                    System.out.println("До свидания!");
                    return;
                }

                default -> System.out.println("Неверный пункт.");
            }
        }
    }

    private static void demonstrateOOP() {

        Calculation calculation = new EarthGravity(10);

        System.out.println("\nПеременная Payment:");
        System.out.println(calculation);

        // Массив родительского типа
        Calculation[] calculations = {
                new EarthGravity(10),
                new CustomGravity(10, "Луна", 1.62),
                new CustomGravity(10, "Марс", 3.71)
        };

        System.out.println("\nПолиморфизм:");

        for (Calculation c : calculations) {
            System.out.println(c.getDescription());
            System.out.println("Результат: " + c.calculate());
        }

        Calculation c1 = new CustomGravity(10, "Луна", 1.62);
        Calculation c2 = new CustomGravity(10, "Луна", 1.62);

        System.out.println("\nequals(): " + c1.equals(c2));

        System.out.println("hashCode c1: " + c1.hashCode());
        System.out.println("hashCode c2: " + c2.hashCode());

        System.out.println("\ntoString(): " + c1);
    }
}
