
package fourth;

import java.util.Date;

public class n4 {

    public static void main(String[] args) {

        Date today = new Date();

        Payment[] payments = {
                new CashPayment(1000, today, "Продукты", "Иванов"),
                new CashPayment(2000, today, "Одежда", "Петров"),

                new CardPayment(5000, today, "Техника", "1234"),
                new CardPayment(3000, today, "Мебель", "5678"),

                new BankTransferPayment(10000, today, "Аренда", "Сбербанк"),
                new BankTransferPayment(15000, today, "Обучение", "Т-Банк")
        };

        double totalSumm = 0;
        double totalCommission = 0;

        System.out.println("ИСТОРИЯ ПЛАТЕЖЕЙ\n");

        for (Payment payment : payments) {

            System.out.println(payment.toString());

            totalSumm += payment.getSumm();
            totalCommission += payment.calculateCommission();
        }

        System.out.println("\nОбщий результат");

        System.out.printf("Количество платежей: %d%n", payments.length);
        System.out.printf("Общая сумма платежей: %.2f руб.%n", totalSumm);
        System.out.printf("Общая комиссия: %.2f руб.%n", totalCommission);
    }
}
