package model;

public class Car extends Vehicle{

    int doors;
    String typeOfCar;
    String polarized;


     

    public Car(int totalPrice, int basePrice, String bran, int model, int displacement, int mileaje, String newv, String plate, int doors, String typeOfCar, String polarized ) {

        super(totalPrice, basePrice, bran, model, displacement, mileaje, newv, plate);

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

    public String getType() {
        return typeOfCar;
    }

    public void setType(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getPolarized() {
        return polarized;
    }

    public void setPolarized(String polarized) {
        this.polarized = polarized;
    }

    

    

    







}