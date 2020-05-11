package model;

import java.util.ArrayList;

public class Clients{

    private String name;

    private String lastName;

    private String id;

    private String phoneNumber;

    private ArrayList<Vehicle> myVehicleAdd;


    public Clients (String name, String lastName, String id, String phoneNumber){

        this.name=name;
        this.lastName=lastName;
        this.id=id;
        this.phoneNumber=phoneNumber;
        myVehicleAdd=new ArrayList<Vehicle>();

        


    }

    public void myVehiclesAdd(Vehicle myVehicle, Clients[] client ){

        for (int i = 0; i < client.length; i++) {

            client[i].myVehicleAdd.add(myVehicle);
            
        }

        


    }




    public void setName(String name) {

        this.name=name;
        
    }

    public String getName(){

        return name;
    }

    public void setLastName(String lastName) {

        this.lastName=lastName;
        
    }

    public String getLastName(){

        return lastName;
    }

    public void setId(String id) {

        this.id=id;
        
    }

    public String getId(){

        return id;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber=phoneNumber;
        
    }

    public String getPhoneNumber(){

        return phoneNumber;
    }

    public ArrayList<Vehicle> getMyVehicleAdd() {
        return myVehicleAdd;
    }

    public void setMyVehicleAdd(ArrayList<Vehicle> myVehicleAdd) {
        this.myVehicleAdd = myVehicleAdd;
    }

   /* public void addVehicle(int totalPrice, int basePrice, String bran, String model, int displacement, int mileaje, boolean newv, String plate){


        Vehicle newVehicle = new Vehicle(totalPrice, basePrice, bran, model, displacement, mileaje, newv, plate);

        theVehicle.add(newVehicle);

        System.out.println(theVehicle);
    }*/





}