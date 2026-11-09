package fourth;

import java.util.Date;

public class CashPayment extends Payment {

    private final String cashier;

    public CashPayment(double summ, Date date,
                       String purpose, String cashier) {
        super(summ, date, purpose);
        this.cashier = cashier;
    }

    @Override
    public double calculateCommission() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Оплата наличными (кассир: " + cashier + ")";
    }
}

