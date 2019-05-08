package Quantum;

public class Reparaciones {

    private final double BASE_PRICE = 30;
    private Vehiculo tipoVehiculo;

    public Reparaciones(Vehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getPrecioBase() {
        return BASE_PRICE;
    }

    public Vehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public Reparaciones setTipoVehiculo(Vehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        return this;
    }

    public double getPecioTotal(){
        return tipoVehiculo.getPrecioReparacion() + getPrecioBase();
    }

    @Override
    public String toString() {
        return "Reparaciones{" +
                "BASE_PRICE=" + BASE_PRICE +
                ", tipoVehiculo=" + tipoVehiculo +
                ", Total Reparaciones=" + getPecioTotal() +
                '}';
    }
}
