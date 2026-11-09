package fourth;

import java.util.Objects;

public class CustomGravity extends Calculation {

    private final String planetName;
    private final double gravity;

    public CustomGravity(double mass, String planetName,
                         double gravity) {
        super(mass);

        if (gravity <= 0) {
            throw new IllegalArgumentException(
                    "Ускорение должно быть больше 0"
            );
        }

        this.planetName = planetName;
        this.gravity = gravity;
    }

    @Override
    public double calculate() {
        return getMass() * gravity;
    }

    @Override
    public String getDescription() {
        return "Расчёт на объекте: " + planetName
                + " (g = " + gravity + " м/с²)";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        CustomGravity other = (CustomGravity) o;

        return Double.compare(gravity, other.gravity) == 0
                && planetName.equals(other.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                super.hashCode(),
                planetName,
                gravity
        );
    }
}
