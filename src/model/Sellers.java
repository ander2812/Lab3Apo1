package model;

public class Sellers{

    private String name;

    private String lastName;

    private String id;

    private int totalSales;

   

    public Sellers (String name, String lastName, String id){

        this.name=name;
        this.lastName=lastName;
        this.id=id;
        
        


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