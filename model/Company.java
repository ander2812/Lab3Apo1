package model;

public class Company{

    private String nameCompany;

    private String id;

    private int totalProfist;

    private int totalSales;

    private Company seller[];

    private Sellers[] client;

   

    public Company (String nameCompany, String id){

        nameCompany="Concessionaire company" ;
        this.id=id;
       

        totalProfist=0;
        totalSales=0;

       


    }

    public void setClients(Sellers[] client) {

        this.client=client;
        
    }

    public Sellers[] getClients(){

        return client;
    }


    public void setNameCompany(String name) {

        this.nameCompany=nameCompany;
        
    }

    public String getNameCompany(){

        return nameCompany;
    }

    public void setNit(String nit) {

        this.id=id;
        
    }

    public String getNit(){

        return id;
    }

    public void setTotalProfist(int totalProfist) {

        this.totalProfist=totalProfist;
        
    }

    public int getTotalProfist(){

        return totalProfist;
    }

    public void setTotalSales(int totalSales) {

        this.totalSales=totalSales;
        
    }

    public int getTotalSales(){

        return totalSales;
    }





}