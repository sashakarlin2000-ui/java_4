package fourth;

import java.util.Arrays;

public class CalculationHistory {

    private Calculation[] history = new Calculation[0];

    public void add(Calculation calculation) {
        history = Arrays.copyOf(history, history.length + 1);
        history[history.length - 1] = calculation;
    }

    public void printHistory() {
        if (history.length == 0) {
            System.out.println("\nИстория расчётов пуста.");
            return;
        }

        System.out.println("\nИстория расчётов");

        for (int i = 0; i < history.length; i++) {
            System.out.println((i + 1) + ". " + history[i]);
        }
    }
}