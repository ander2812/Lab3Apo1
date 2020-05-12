package model;

import java.util.ArrayList;


public class Sellers{ 

    private String name;

    private String lastName;

    private String id;

    private int totalSales;

    private Clients[] clients;;



     private static ArrayList<Clients> misClients;

   

    public Sellers (String name, String id, String lastName,int totalSales){

        this.name=name;
        this.id=id;

        misClients=new ArrayList<Clients>();



        
    }

   

    public boolean canClients() {
        return misClients.size()<=5;
    }

    public void addClient (Clients client) {
        if(misClients.size()<=5) {
            misClients.add(client);
        }
    }

    public void setClients(Clients[] client){

        this.clients=clients;


    }

    public Clients[] getClients(){

        return clients;
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

    public ArrayList<Clients> getMisClients() {
        return misClients;
    }

    public void setMisClients(ArrayList<Clients> misClients) {
        Sellers.misClients = misClients;
    }

    

    




}