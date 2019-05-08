package Quantum;

public class Vehiculo {

    private final double REPAIR_PRICE;
    private String color;

    protected Vehiculo(double repairPrice, String color) {
        this.REPAIR_PRICE = repairPrice;
        this.color = color;
    }

    public double getPrecioReparacion() {
        return REPAIR_PRICE;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                ", color='" + color + '\'' +
                '}';
    }
}







/*public static Vehiculo from(String text){
        Vehiculo vehiculo = new Vehiculo();
        return vehiculo;
    }*/
