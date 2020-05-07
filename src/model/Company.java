package model;

public class Company{

    private String name;

    private String id;

    private int totalProfist;

    private int totalSales;

    private Company[] seller=new Company[5];

    private Sellers[] client;

     

    public Company (String name, String id){

        name="Concessionaire company" ;
        this.id=id;
        seller[1]= new Company("Paola","12345");
        seller[2]= new Company("Camilo","12345");
        seller[3]= new Company("Arturo","12345");
        seller[4]= new Company("Andrea","12345");
        seller[5]= new Company("Anderson","12345");
       

        totalProfist=0;
        totalSales=0;

       


    }

    public void setClients(Sellers[] client) {

        this.client=client;
        
    }

    public Sellers[] getClients(){

        return client;
    }


    public void setName(String name) {

        this.name=name;
        
    }

    public String getName(){

        return name;
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