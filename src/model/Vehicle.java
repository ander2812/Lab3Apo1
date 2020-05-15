package model;

import java.util.ArrayList;

public class Vehicle{

    private double totalPrice;

    private double basePrice;

    private String bran;

    private String type;

    private int model;

    private int displacement;

    private int mileaje;

    private String newv;

    private String plate;

    private Docs docs;

    public Vehicle (double totalPrice, double basePrice, String bran, int model, int displacement, int mileaje, String newv, String plate, String type){

        this.totalPrice=totalPrice;
        this.basePrice=basePrice;
        this.bran=bran;
        this.model=model;
        this.displacement=displacement;
        this.mileaje=mileaje;
        this.newv=newv;
        this.plate=plate;

        docs = new Docs(0,"",0,0); 



    }

    /**
	
	*this method returns the code of soat

	*<b>pre: </b> 
	
	*<b>post: return code add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String cDocuments(){

        int numbers=((int)(Math.random()*(100)));

        int[][] code= new int[4][4];
        String chine,chine2, chine3, chine4, chine5, chine6, chine7, chine8="";
       
        int num, num2, num3, num4, num5, num6, num7, num8=0;

        String dCode="";

        code[0][0]=numbers;
        code[1][0]=numbers;
        code[2][0]=numbers;
        code[3][0]=numbers;
        code[3][0]=numbers;
        code[3][1]=numbers;
        code[3][2]=numbers;
        code[3][3]=numbers;

        num=code[0][0];
        num2=code[1][0];
        num3=code[2][0];
        num4=code[3][0];
        num5=code[3][0];
        num6=code[3][1];
        num7=code[3][2];
        num8=code[3][3];

        chine=Integer.toString(num);
        chine2=Integer.toString(num2);
        chine3=Integer.toString(num3);
        chine4=Integer.toString(num4);
        chine5=Integer.toString(num5);
        chine6=Integer.toString(num6);
        chine7=Integer.toString(num7);
        chine8=Integer.toString(num8);

        dCode=chine+chine2+chine3+chine4+chine5+chine6+chine7+chine8;

        return dCode;

        
       


    }

     /**
	
	*this method modifies the total price of the car

	*<b>pre: </b> 
	
	*<b>post: total price changed
	
	*@param total price != null
	
	*@author Anderson Rueda.
	
	*/

    public void setTotalPrice(double totalPrice) {

        this.totalPrice=totalPrice;
        
    }

     /**
	
	*this method returns the total price of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return total price add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/


    public double getTotalPrice(){

        return totalPrice;
    }

     /**
	
	*this method modifies the base price of the vehicle

	*<b>pre: </b> 
	
	*<b>post: base price changed
	
	*@param base price != null
	
	*@author Anderson Rueda.
	
	*/

    public void setBasePrice(double basePrice) {

        this.basePrice=basePrice;
        
    }

     /**
	
	*this method returns the base price of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return base price add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public double getBasePrice(){

        return basePrice;
    }

    /**
	
	*this method modifies the bran of the vehicle

	*<b>pre: </b> 
	
	*<b>post: bran changed
	
	*@param bran != null
	
	*@author Anderson Rueda.
	
	*/

    public void setBran(String bran) {

        this.bran=bran;
        
    }

        /**
	
	*this method returns the bran of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return bran add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getBran(){

        return bran;
    }

    /**
	
	*this method modifies the model of the vehicle

	*<b>pre: </b> 
	
	*<b>post: model changed
	
	*@param model != null
	
	*@author Anderson Rueda.
	
	*/

    public void setModel(int model) {

        this.model=model;
        
    }

     /**
	
	*this method returns the model of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return model add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/


    public  int getModel(){

        return model;
    }

    /**
	
	*this method modifies the displacement of vehicle

	*<b>pre: </b> 
	
	*<b>post: displacement changed
	
	*@param displacement != null
	
	*@author Anderson Rueda.
	
	*/

    public void setDisplacemment(int displacement) {

        this.displacement=displacement;


        
    }

     /**
	
	*this method returns the displacement of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return displacement add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getDisplacement(){

        return displacement;
    }

     /**
	
	*this method modifies the mileaje of the vehicle

	*<b>pre: </b> 
	
	*<b>post: mileaje changed
	
	*@param mileaje != null
	
	*@author Anderson Rueda.
	
	*/

    public void setMileage(int mileaje) {

        this.mileaje=mileaje;
        
    }

    /**
	
	*this method returns the meleaje of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return mileaje add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getMileaje(){

        return mileaje;
    }

     /**
	
	*this method say the vehicle new or used

	*<b>pre: </b> 
	
	*<b>post: newv changed
	
	*@param newv != null
	
	*@author Anderson Rueda.
	
	*/

    public void setNew(String newv) {

        this.newv=newv;


        
    }

     /**
	
	*this method returns the vehicle new or used

	*<b>pre: </b> 
	
	*<b>post: return newv add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getNew(){

        return newv;
    }

     /**
	
	*this method modifies the plate of the vehicle

	*<b>pre: </b> 
	
	*<b>post: plate changed
	
	*@param plate != null
	
	*@author Anderson Rueda.
	
	*/

    public void setPlate(String plate) {

        this.plate=plate;
        
    }

    /**
	
	*this method returns the plate of the vehicle

	*<b>pre: </b> 
	
	*<b>post: return plate add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getPlate(){

        return plate;
    }





}