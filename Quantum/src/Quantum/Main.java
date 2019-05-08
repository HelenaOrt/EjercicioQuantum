package Quantum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println("Total de todas las reparaciones");
        double sum = repairList.stream().mapToDouble(Reparaciones::getPecioTotal).sum();
        System.out.println(sum);
        //contar reparaciones de moto


        if(!(vehicleList.get(0)instanceof Moto)){
            System.out.println("Es un coche");
        }

        //media del coste de cada factura

        //total facturado

        //Total facturado solo en reparaciones de coche

        //Total facturado en cada tipo de vehiculo
        //collectors groupingBy
    }
}
