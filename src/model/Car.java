package model;

import java.util.function.DoubleConsumer;

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

    /**
	
	*this method returns the doors of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return doors add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getDoors() {
        return doors;
    }

     /**
	
	*this method modifies the doors of the vehicle

	*<b>pre: </b> 
	
	*<b>post: doors changed
	
	*@param doors != null
	
	*@author Anderson Rueda.
	
	*/

    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
	
	*this method returns the type of vehicle

	*<b>pre: </b> 
	
	*<b>post: return type add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getType() {
        return typeOfCar;
    }

     /**
	
	*this method modifies the type of vehicle

	*<b>pre: </b> 
	
	*<b>post: type changed
	
	*@param type != null
	
	*@author Anderson Rueda.
	
	*/

    public void setType(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

     /**
	
	*this method returns vehicle polarized or not polarized

	*<b>pre: </b> 
	
	*<b>post: return polarized add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getPolarized() {
        return polarized;
    }

    /**
	
	*this method modifies vehicle polarized or not polarized

	*<b>pre: </b> 
	
	*<b>post: polarized changed
	
	*@param polarized != null
	
	*@author Anderson Rueda.
	
	*/

    public void setPolarized(String polarized) {
        this.polarized = polarized;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    

    

    







}