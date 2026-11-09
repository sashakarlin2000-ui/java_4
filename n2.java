package fourth;
import java.util.Date;

public class n2 {
    public static void main(String[] args) {

        Payment[] payments = {
                new CardPayment(
                        1000, new Date(), "Покупка продуктов", "Семенов"
                ),
                new CashPayment(
                        5000, new Date(), "Покупка техники", "1234"
                ),
                new BankTransferPayment(
                        10000, new Date(), "Оплата услуг", "Сбербанк"
                )
        };

        for (Payment payment : payments) {
            System.out.println(payment);
            System.out.println(
                    "Комиссия: " + payment.calculateCommission()
            );
        }
    }
}

