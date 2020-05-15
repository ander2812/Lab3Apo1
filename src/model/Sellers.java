package model;

import java.util.ArrayList;


public class Sellers{ 

    private String name;

    private String lastName;

    private String id;

    private int totalSales;



     private ArrayList<Clients> misClients;

   

    public Sellers (String name, String id, String lastName,int totalSales){

        this.name=name;
        this.id=id;

        misClients=new ArrayList<Clients>();



        
    }

    /**
	
	*this method returns restricts the number of customers per seller

	*<b>pre: </b> 
	
	*<b>post: return restrics return
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

   

    public boolean canClients() {
        return misClients.size()<=5;
    }

    /**
	
	*this method returns the client add for seller

	*<b>pre: </b> 
	
	*<b>post: return client add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public void addClient (Clients client) {
        if(misClients.size()<=5) {
            misClients.add(client);
        }
    }

    /**
	
	*this method returns the name of the sellers

	*<b>pre: </b> 
	
	*<b>post: return name add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public void setName(String name) {

        this.name=name;
        
    }

    /**
	
	*this method modifies the name

	*<b>pre: </b> 
	
	*<b>post: name changed
	
	*@param name != null
	
	*@author Anderson Rueda.
	
	*/

    public String getName(){

        return name;
    }

    /**
	
	*this method modifies the name of the sellers

	*<b>pre: </b> 
	
	*<b>post: name sellers changed
	
	*@param name != null
	
	*@author Anderson Rueda.
	
	*/


    

    public void setLastName(String lastName) {

        this.lastName=lastName;
        
    }

    /**
	
	*this method returns the name of the sellers

	*<b>pre: </b> 
	
	*<b>post: return name sellers add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getLastName(){

        return lastName;
    }

    /**
	
	*this method modifies the id of the sellers

	*<b>pre: </b> 
	
	*<b>post: id of the sellers changed
	
	*@param id != null
	
	*@author Anderson Rueda.
	
	*/

    public void setId(String id) {

        this.id=id;
        
    }

     /**
	
	*this method returns the id of the sellers

	*<b>pre: </b> 
	
	*<b>post: return id of the sellers add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getId(){

        return id;
    }

    /**
	
	*this method modifies the total sales of the sellers

	*<b>pre: </b> 
	
	*<b>post: customer arraylist changed
	
	*@param total sales != null
	
	*@author Anderson Rueda.
	
	*/

    public void setTotalSales(int totalSales) {

        this.totalSales=totalSales;
        
    }

    /**
	
	*this method returns the total sales of the sellers

	*<b>pre: </b> 
	
	*<b>post: return total sales of the sellers add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getTotalSales(){  

        return totalSales;
    }

    /**
	
	*this method returns the arraylist of the clients add to the sellers

	*<b>pre: </b> 
	
	*<b>post: return arraylist add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/


    public ArrayList<Clients> getMisClients() {
        return misClients;
    }

    

    




}