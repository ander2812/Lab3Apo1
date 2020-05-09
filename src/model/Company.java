package model;

public class Company{

    private String name;

    private String id;

    private int totalProfist;

    private int totalSales;

     private Sellers[] seller=new Sellers[5];

     

    

     

    public Company (String name, String id){

        name="Concessionaire company" ;
        this.id=id;
        seller[0]= new Sellers("Paola","12345");
        seller[1]= new Sellers("Camilo","12345");
        seller[2]= new Sellers("Arturo","12345");
        seller[3]= new Sellers("Andrea","12345");
        seller[4]= new Sellers("Anderson","12345");
       

        totalProfist=0;
        totalSales=0;

       


    }


    public Sellers[] getSeller(){

        return seller;


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