
package fourth;

import java.util.Objects;

public class EarthGravity extends Calculation {

    private static final double G = 9.81;

    public EarthGravity(double mass) {
        super(mass);
    }

    @Override
    public double calculate() {
        return getMass() * G;
    }

    @Override
    public String getDescription() {
        return "Расчёт на Земле";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        EarthGravity other = (EarthGravity) o;

        return Double.compare(G, G) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), G);
    }
}
