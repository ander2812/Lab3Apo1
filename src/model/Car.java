package model;

public class Car extends Vehicle{

    int doors;
    String typeOfCar;
    String polarized;


     

    public Car(double totalPrice, double basePrice, String bran, int model, int displacement, int mileaje, String newv, String plate, int doors, String typeOfCar, String polarized, String type ) {

        super(totalPrice, basePrice, bran, model, displacement, mileaje, newv, plate, type);

        this.doors=doors;

        this.typeOfCar=typeOfCar;

        this.polarized=polarized;

    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getPolarized() {
        return polarized;
    }

    public void setPolarized(String polarized) {
        this.polarized = polarized;
    }

    

    

    







}