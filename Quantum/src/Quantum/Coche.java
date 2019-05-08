package Quantum;

import java.util.stream.Stream;

public class Coche extends Vehiculo{


    protected Coche(String color) {
        super(50, color);
    }


    @Override
    public String toString() {
        return "Coche{" +
                "color='" + getColor() + '\'' +
                "Total='" + getPrecioReparacion() + '\'' +
                '}';
    }
}
