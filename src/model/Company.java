package model;

import java.util.ArrayList;

public class Company{

    private String name;

    private String id;

    private int totalProfist;

    private int totalSales;

    private ArrayList<Vehicle> theVehicle;

    private ArrayList<Vehicle> myVehicleAdd;


     private Sellers[] seller=new Sellers[10];

     

     

    

     

    public Company (String name, String id){

        this.name=name;
        this.id=id;
        seller[0]= new Sellers("Paola","12345","Osorio",0);
        seller[1]= new Sellers("Camilo","12345", "Charro",0);
        seller[2]= new Sellers("Arturo","12345","Rueda",0);
        seller[3]= new Sellers("Andrea","12345", "Osorio",0);
        seller[4]= new Sellers("Anderson","12345", "Rueda",0);
        seller[5]= new Sellers("Carlos","12345", "Rueda",0);
        seller[6]= new Sellers("Joe","12345","The Champion",0 );
        seller[7]= new Sellers("Juan","12345", "Reyes",0);
        seller[8]= new Sellers("Esteban","12345", "Yusunguaira",0);
        seller[9]= new Sellers("Mafe","12345","Cordoba",0);

        theVehicle = new ArrayList<Vehicle>();
        myVehicleAdd=new ArrayList<Vehicle>();
        theVehicle.add(new Car(25000000, 20000000, "chevrolet", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina",
                "si", "camioneta"));
        theVehicle.add(
                new Car(25000000, 35000000, "kia", 2019, 1600, 17000, "nuevo", "12345", 4, "electrico", "si", "sedan"));
        theVehicle.add(
                new Car(25000000, 20000000, "audi", 2019, 1600, 17000, "nuevo", "12345", 4, "hibrido", "si", "sedan"));
        theVehicle.add(new Car(25000000, 20000000, "bmw", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina", "si",
                "camioneta"));
        theVehicle.add(new Car(25000000, 20000000, "nissan", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina", "si",
                "camioneta"));
        theVehicle.add(new Car(25000000, 20000000, "toyota", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina", "si",
                "camioneta"));
        theVehicle.add(new Motorcicle(35000000, 20000000, "ducati", 2019, 1600, 17000, "nuevo", "123456", "cross"));
       

        totalProfist=0;
        totalSales=0;

       


    }

    /**
	
	*this method modifies the total price of the vehicles

	*<b>pre: </b> 
	
	*<b>post: total price changed
	
	*@param total price != null
	
	*@author Anderson Rueda.
	
	*/


    

    
    public void calculateTotalpCar(Vehicle myVehicle, Car car, Motorcicle motorcicle) {

        double calculateTotalp;

        if (myVehicle instanceof Car) {

            if (car.getTypeOfCar().equalsIgnoreCase("electrico")) {

                if (car.getNew().equalsIgnoreCase("nuevo")) {

                    calculateTotalp = ((myVehicle.getBasePrice() * 0.2) + myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

                if (car.getNew().equalsIgnoreCase("usado")) {

                    calculateTotalp = (((myVehicle.getBasePrice() * 0.2) + myVehicle.getBasePrice()) * 0.10)
                            + ((myVehicle.getBasePrice() * 0.2) + myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

            }

            if (car.getTypeOfCar().equalsIgnoreCase("hibrido")) {

                if (car.getNew().equalsIgnoreCase("nuevo")) {

                    calculateTotalp = ((myVehicle.getBasePrice() * 0.15) + myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

                if (car.getNew().equalsIgnoreCase("usado")) {

                    calculateTotalp = (((myVehicle.getBasePrice() * 0.15) + myVehicle.getBasePrice()) * 0.10)
                            - (myVehicle.getBasePrice() * 0.15) + myVehicle.getBasePrice();

                    myVehicle.setTotalPrice(calculateTotalp);

                }

            }

            if (car.getTypeOfCar().equalsIgnoreCase("gasolina")) {

                if (car.getNew().equalsIgnoreCase("nuevo")) {

                    calculateTotalp = myVehicle.getBasePrice();

                    myVehicle.setTotalPrice(calculateTotalp);

                }

                if (car.getNew().equalsIgnoreCase("usado")) {

                    calculateTotalp = ((myVehicle.getBasePrice() * 0.10) - myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

            }

        }

        if (myVehicle instanceof Motorcicle) {

            if (motorcicle.getNew().equalsIgnoreCase("usado")) {

                calculateTotalp = (((myVehicle.getBasePrice() * 0.04) + myVehicle.getBasePrice()) * 0.02)
                        - ((myVehicle.getBasePrice() * 0.04) + myVehicle.getBasePrice());

                myVehicle.setTotalPrice(calculateTotalp);

            }

            if (car.getNew().equalsIgnoreCase("nuevo")) {

                calculateTotalp = ((myVehicle.getBasePrice() * 0.04) + myVehicle.getBasePrice());

                myVehicle.setTotalPrice(calculateTotalp);

            }

        }

    }

    /**
	
	*this method returns the arraylist of the vehicles

	*<b>pre: </b> 
	
	*<b>post: return vehicle add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    

    public ArrayList<Vehicle> getMyVehicles() {
        return theVehicle;
    }

    /**
	
	*this method modifies the arraylist of the vehicles

	*<b>pre: </b> 
	
	*<b>post: customer arraylist changed
	
	*@param arraylist != null
	
	*@author Anderson Rueda.
	
	*/

    public void setMyVehicles(ArrayList<Vehicle> theVheicle) {
        this.theVehicle=theVheicle;
    }

     /**
	
	*this method returns the array of the seller

	*<b>pre: </b> 
	
	*<b>post: return seller add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/



    public Sellers[] getSeller(){

        return seller;


    }

     /**
	
	*this method modifies the name of the company

	*<b>pre: </b> 
	
	*<b>post: company name change
	
	*@param name != null
	
	*@author Anderson Rueda.
	
	*/


    


    public void setName(String name) {

        this.name=name;
        
    }

     /**
	
	*this method returns the name of the company

	*<b>pre: </b> 
	
	*<b>post: return name add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getName(){

        return name;
    }

    /**
	
	*this method modifies the nit of the company

	*<b>pre: </b> 
	
	*<b>post: customer nit changed
	
	*@param arraylist != null
	
	*@author Anderson Rueda.
	
	*/


    public void setNit(String id) {

        this.id=id;
        
    }

    /**
	
	*this method returns the nit of the vehicles

	*<b>pre: </b> 
	
	*<b>post: return nit add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    

    public String getNit(){

        return id;
    }

    /**
	
	*this method modifies the total profist of the company

	*<b>pre: </b> 
	
	*<b>post: customer total profist  changed
	
	*@param arraylist != null
	
	*@author Anderson Rueda.
	
	*/

    public void setTotalProfist(int totalProfist) {

        this.totalProfist=totalProfist;
        
    }

     /**
	
	*this method returns the total profist of the company

	*<b>pre: </b> 
	
	*<b>post: return total profist add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getTotalProfist(){

        return totalProfist;
    }

     /**
	
	*this method modifies the total sales of the company

	*<b>pre: </b> 
	
	*<b>post: customer total sales changed
	
	*@param arraylist != null
	
	*@author Anderson Rueda.
	
	*/

    public void setTotalSales(int totalSales) {

        this.totalSales=totalSales;
        
    }

     /**
	
	*this method returns the total sales of the vehicles

	*<b>pre: </b> 
	
	*<b>post: return total sales add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/


    public int getTotalSales(){

        return totalSales;
    }

     /**
	
	*this method returns the arraylist of the vehicles add for the clients

	*<b>pre: </b> 
	
	*<b>post: return vehicle add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public ArrayList<Vehicle> getMyVehicleAdd() {
        return myVehicleAdd;
    }

    /**
	
	*this method returns the arraylist of the vehicles add of the clients

	*<b>pre: </b> 
	
	*<b>post: return arraylist add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public void setMyVehicleAdd(ArrayList<Vehicle> myVehicleAdd) {
        this.myVehicleAdd = myVehicleAdd;
    }





}