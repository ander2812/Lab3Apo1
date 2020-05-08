package model;

public class Vehicle{

    private int totalPrice;

    private int basePrice;

    private String bran;

    private String model;

    private int displacement;

    private int mileaje;

    private boolean newv;

    private String plate;

    public Vehicle (int totalPrice, int basePrice, String bran, String model, int displacement, int mileaje, boolean newv, String plate){

        this.totalPrice=totalPrice;
        this.basePrice=basePrice;
        this.bran=bran;
        this.model=model;
        this.displacement=displacement;
        this.mileaje=mileaje;
        this.newv=newv;
        this.plate=plate;



    }

    public void setTotalPrice(int totalPrice) {

        this.totalPrice=totalPrice;
        
    }

    public int getTotalPrice(){

        return totalPrice;
    }

    public void setBasePrice(int basePrice) {

        this.basePrice=basePrice;
        
    }

    public int getBasePrice(){

        return basePrice;
    }

    public void setBran(String bran) {

        this.bran=bran;
        
    }

    public String getBran(){

        return bran;
    }

    public void setModel(String model) {

        this.model=model;
        
    }

    public  String getModel(){

        return model;
    }

    public void setDisplacemment(int displacement) {

        this.displacement=displacement;


        
    }

    public int getDisplacement(){

        return displacement;
    }

    public void setMileage(int mileaje) {

        this.mileaje=mileaje;
        
    }

    public int getMileaje(){

        return mileaje;
    }

    public void setNew(boolean newv) {

        this.newv=newv;


        
    }

    public boolean getNew(){

        return newv;
    }

    public void plate(String plate) {

        this.plate=plate;
        
    }

    public String plate(){

        return plate;
    }





}