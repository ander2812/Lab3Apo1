package model;

import java.util.ArrayList;


public class Sellers{

    private String name;

    private String lastName;

    private String id;

    private int totalSales;

    private Clients[] client;

    private static ArrayList<Clients> misClients;

   

    public Sellers (String name, String id){

        this.name=name;
        this.id=id;

        misClients=new ArrayList<Clients>();

        
    }

    



    public String addClient(){

        String msg = "cliente asignado exitosamente";

        for (int i = 0; i<client.length ; i++) {

            if (misClients.size()<10){

                misClients.add(client[i]);

                return msg;
              

            
               
            }else {
                
                msg="No asignado escoja otro vendedor";}

            
            
        }

        

        return msg;


    }

    public void setClients(Clients[] client){

        this.client=client;


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

    public void setTotalSales(int totalSales) {

        this.totalSales=totalSales;
        
    }

    public int getTotalSales(){  

        return totalSales;
    }





}