package Quantum;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> vehicleList = new ArrayList<>();

        vehicleList.add(new Moto("rojo"));
        vehicleList.add(new Moto("verde"));
        vehicleList.add(new Moto("amarillo"));
        vehicleList.add(new Coche("azul"));
        vehicleList.add(new Coche("rosa"));
        vehicleList.add(new Coche("fucsia"));

        List<Reparaciones> repairList = new ArrayList<>();
        repairList.add(new Reparaciones(vehicleList.get(0)));
        repairList.add(new Reparaciones(vehicleList.get(1)));
        repairList.add(new Reparaciones(vehicleList.get(2)));
        repairList.add(new Reparaciones(vehicleList.get(3)));
        repairList.add(new Reparaciones(vehicleList.get(4)));
        repairList.add(new Reparaciones(vehicleList.get(5)));

        System.out.println("Lista de vehiculos");
        repairList.forEach(System.out::println);

        System.out.println();
        double sum = repairList.stream().mapToDouble(Reparaciones::getPecioTotal).sum();
        System.out.println("Coste total las reparaciones " + sum + " euros");


        long reparacionesMoto = repairList.stream().filter(m -> m.getTipoVehiculo() instanceof Moto).count();
        System.out.println("Cantidad de motos reparadas: " + reparacionesMoto);


        OptionalDouble average = repairList.stream().mapToDouble(Reparaciones::getPecioTotal).average();
        System.out.println("Coste medio de cada factura: " + average.getAsDouble() + " euros");


        double motorbikeCost = repairList.stream().
                filter(m -> m.getTipoVehiculo() instanceof Moto).
                mapToDouble(Reparaciones::getPecioTotal).sum();

        System.out.println("Total facturado en reparaciones de moto " + motorbikeCost + " euros");

        double carCost = repairList.stream().
                filter(m -> m.getTipoVehiculo() instanceof Coche).
                mapToDouble(Reparaciones::getPecioTotal).sum();

        System.out.println("Total facturado en reparaciones de coche " + carCost + " euros");

    }
}

//ejemplo instance of
/*if(!(vehicleList.get(0)instanceof Moto)){
            System.out.println("Es un coche");
        }*/