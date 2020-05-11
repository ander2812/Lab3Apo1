package model;

public class Motorcicle extends Vehicle{

    String typeMotorcycle;

    public Motorcicle(int totalPrice, int basePrice, String bran, int model, int displacement, int mileaje, String newv, String typeMotorcicle, String plate) {
        super(totalPrice, basePrice, bran, model, displacement, mileaje, newv, plate);

        this.typeMotorcycle=typeMotorcicle;

        
    }

    public String getTypeMotorcycle() {
        return typeMotorcycle;
    }

    public void setTypeMotorcycle(String typeMotorcycle) {
        this.typeMotorcycle = typeMotorcycle;

    }








    
}