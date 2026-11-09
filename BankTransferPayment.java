package fourth;

import java.util.Date;

public class BankTransferPayment extends Payment{
    private String bankName;

    public BankTransferPayment(double summ, Date date, String purpose,String bankName){
        super(summ,date,purpose);
        this.bankName = bankName;
    }

    @Override
    public double calculateCommission(){
        return getSumm()*0.01;
    }

    @Override
    public String getDescription(){
        return "Банковский перевод + ("+bankName+")";
    }

}
