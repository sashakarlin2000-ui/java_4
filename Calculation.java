package fourth;

import java.util.Objects;

public abstract class Calculation {

    private final double mass;

    protected Calculation(double mass) {
        if (mass <= 0) {
            throw new IllegalArgumentException(
                    "Масса должна быть больше 0"
            );
        }

        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public abstract double calculate();

    public abstract String getDescription();

    @Override
    public String toString() {
        return String.format(
                "%s | Масса: %.2f кг | Результат: %.2f Н",
                getDescription(),
                mass,
                calculate()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Calculation other = (Calculation) o;

        return Double.compare(mass, other.mass) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass);
    }
}
