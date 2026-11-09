package fourth;

import java.util.Date;
import java.util.Objects;

public abstract class Payment {
    private final double summ;
    private final Date date;
    private final String purpose;

    protected Payment(double summ, Date date, String purpose) {
        if (summ <= 0)
            throw new IllegalArgumentException("Сумма должна быть > 0");
        if (date == null)
            throw new IllegalArgumentException("Дата обязательна");
        if (purpose == null)
            throw new IllegalArgumentException("Назначение обязательно");

        this.summ = summ;
        this.date = new Date(date.getTime());
        this.purpose = purpose;

    }

    public double getSumm(){
        return summ;}

    public Date getDate(){
        return date;}

    public String getPurpose(){
        return purpose;}

    public abstract double calculateCommission();
    public abstract String getDescription();

    @Override
    public String toString() {
        return String.format("%s сумма=%.2f, дата=%s, назначение='%s', комиссия=%.2f",
               getDescription(),summ, date, purpose, calculateCommission());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment other = (Payment) o;
        return Double.compare(other.summ, summ) == 0
                && date.equals(other.date)
                && purpose.equals(other.purpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summ, date, purpose);
    }
}
