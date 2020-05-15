package model;

import java.util.ArrayList;

public class Clients{

    private String name;

    private String lastName;

    private String id;

    private String phoneNumber;

    private ArrayList<Vehicle> vehicles = new ArrayList<>();


    

    public Clients (String name, String lastName, String id, String phoneNumber){

        this.name=name;
        this.lastName=lastName;
        this.id=id;
        this.phoneNumber=phoneNumber;

        


    }

    /**
	
	*this method modifies the name of the clients

	*<b>pre: </b> 
	
	*<b>post: name changed
	
	*@param name != null
	
	*@author Anderson Rueda.
	
	*/

   



    public void setName(String name) {

        this.name=name;
        
    }

     /**
	
	*this method returns the name of the clients

	*<b>pre: </b> 
	
	*<b>post: return name of the clients add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getName(){

        return name;
    }

     /**
	
	*this method modifies the last name of the clients

	*<b>pre: </b> 
	
	*<b>post: lastname of the clients changed
	
	*@param lastname != null
	
	*@author Anderson Rueda.
	
	*/

    public void setLastName(String lastName) {

        this.lastName=lastName;
        
    }

    /**
	
	*this method returns the last name of the clients

	*<b>pre: </b> 
	
	*<b>post: return last name of the clients add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getLastName(){

        return lastName;
    }

    /**
	
	*this method modifies the id of the clients

	*<b>pre: </b> 
	
	*<b>post: id of the clients changed
	
	*@param id != null
	
	*@author Anderson Rueda.
	
	*/

    public void setId(String id) {

        this.id=id;
        
    }

      /**
	
	*this method returns the id of the clients

	*<b>pre: </b> 
	
	*<b>post: return id add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getId(){

        return id;
    }

    /**
	
	*this method modifies the phone number of the clients

	*<b>pre: </b> 
	
	*<b>post: phone number changed
	
	*@param phone number != null
	
	*@author Anderson Rueda.
	
	*/

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber=phoneNumber;
        
    }

     /**
	
	*this method returns the phone number of the clients

	*<b>pre: </b> 
	
	*<b>post: return phone number add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getPhoneNumber(){

        return phoneNumber;
    }

     /**
	
	*this method returns the arraylist of the vehicles of the clients

	*<b>pre: </b> 
	
	*<b>post: return vehicle add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

     /**
	
	*this method add the vehicles of the clients

	*<b>pre: </b> 
	
	*<b>post: arraylist changed
	
	*@param arraylist != null
	
	*@author Anderson Rueda.
	
	*/

    public void addMyVehicle(Vehicle vehicles){

        this.vehicles.add(vehicles);


    }





}