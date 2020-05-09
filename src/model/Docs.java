package model;

public class Docs{

    private int price;

    private String year;

    private int[][] image;

    private int documentCode;

    public Docs (int price, String year, int[][] image, int documentCode){

        this.price=price;
        this.year=year;
        this.image=image;
        this.documentCode=documentCode;




    }

    public void setPrice(int price) {

        this.price=price;
        
    }

    public int getPrice(){

        return price;
    }

    public void setYear(String year) {

        this.year=year;
        
    }

    public String getYear(){

        return year;
    }

    public void seiImage(int image) {

        this.image=image;
        
    }

    public int getImage(){

        return image;
    }

    public void setDocumentCode(int documentCode) {

        this.documentCode=documentCode;
        
    }

    public  int getDocumentCode(){

        return documentCode;
    }

}




