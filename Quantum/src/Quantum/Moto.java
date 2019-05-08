package Quantum;

public class Moto extends Vehiculo{

    protected Moto (String color) {
        super(25,color);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "color='" + getColor() + '\'' +
                "Total='" + getPrecioReparacion() + '\'' +
                '}';
    }
}
