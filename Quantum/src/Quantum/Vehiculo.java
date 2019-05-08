package Quantum;

public class Vehiculo {

    private final double REPAIR_PRICE;
    private String color;

    protected Vehiculo(double repairPrice, String color) {
        this.REPAIR_PRICE = repairPrice;
        this.color = color;
    }

    protected double getPrecioReparacion() {
        return REPAIR_PRICE;
    }

    protected String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "color: " + color +
                "coste reparacion: " + getPrecioReparacion() ;
    }
}







/*public static Vehiculo from(String text){
        Vehiculo vehiculo = new Vehiculo();
        return vehiculo;
    }*/
