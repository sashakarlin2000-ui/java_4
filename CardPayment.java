package fourth;

import java.util.Date;

public class CardPayment extends Payment {
    private final String cardNum;
    public CardPayment(double summ, Date date, String purpose, String cardNum){
        super(summ, date, purpose);
        this.cardNum = cardNum;
    }

    @Override
    public double calculateCommission(){
        return getSumm()*0.02;
    }

    @Override
    public String getDescription(){
        return "Оплата картой "+cardNum;
    }

}

