package Smth;

//import Enum.VehicleType;
//import Enum.FuelType;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle implements Comparable {

    //    private final LocalDate creationDate;
    private int id;
    private String name;
    private Coordinates coordinates;
    private LocalDate creationDate;
    private Integer enginePower;
    private Float capacity;
    private VehicleType vehicleType;
    private FuelType fuelType;

    public Vehicle(int id, String name, Coordinates coordinates, LocalDate creationDate, int enginePower, float capacity, VehicleType vehicleType, FuelType fuelType) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.enginePower = enginePower;
        this.capacity = capacity;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public Float getCapacity() {
        return capacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        String info = "Больше информации ниже\n";
        info += ("id:" + id + '\n');
        info += ("Имя:" + name + '\n');
        info += (coordinates.toString());
        info += ("Дата создания:" + creationDate + '\n');
        info += ("Мощность двигателя:" + enginePower + '\n');
        info += ("Емкость:" + capacity + '\n');
        info += ("Тип транспорта:" + vehicleType + '\n');
        info += ("Тип топлива:" + fuelType + '\n');
        return info;
    }

    public Coordinates getCoordinates() {

        return coordinates;
    }

    @Override
    public int compareTo(Object o) {
        Vehicle vehicle = (Vehicle) o;
//        return (getCreationDate().compareTo(getCreationDate()));
        return (getEnginePower() - vehicle.getEnginePower());
    }

}

