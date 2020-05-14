package model;

import java.util.ArrayList;

public class Clients{

    private String name;

    private String lastName;

    private String id;

    private String phoneNumber;

    ArrayList<Vehicle> theVehicle = new ArrayList<>();

    

    public Clients (String name, String lastName, String id, String phoneNumber){

        this.name=name;
        this.lastName=lastName;
        this.id=id;
        this.phoneNumber=phoneNumber;

        


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

    public ArrayList<Vehicle> getTheVehicle() {
        return theVehicle;
    }

    public void setTheVehicle(ArrayList<Vehicle> theVehicle) {
        this.theVehicle = theVehicle;
    }





}