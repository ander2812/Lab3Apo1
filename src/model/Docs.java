package model;

public class Docs{

    private int price;

    private String year;

    private int image;

    private int documentCode;

    public Docs (int price, String year, int image, int documentCode){

        this.price=price;
        this.year=year;
        this.image=image;
        this.documentCode=documentCode;




    }

    /**
	
	*this method modifies the price of the docs

	*<b>pre: </b> 
	
	*<b>post: price changed
	
	*@param price != null
	
	*@author Anderson Rueda.
	
	*/

    public void setPrice(int price) {

        this.price=price;
        
    }

     /**
	
	*this method returns the price of the docs

	*<b>pre: </b> 
	
	*<b>post: return price add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getPrice(){

        return price;
    }

    /**
	
	*this method modifies the year of the docs

	*<b>pre: </b> 
	
	*<b>post: year changed
	
	*@param year != null
	
	*@author Anderson Rueda.
	
	*/

    public void setYear(String year) {

        this.year=year;
        
    }

     /**
	
	*this method returns the year of the docs

	*<b>pre: </b> 
	
	*<b>post: return year add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getYear(){

        return year;
    }

    /**
	
	*this method modifies the image of the docs

	*<b>pre: </b> 
	
	*<b>post: customer arraylist changed
	
	*@param arraylist != null
	
	*@author Anderson Rueda.
	
	*/

    public void setImage(int image) {

        this.image=image;
        
    }

     /**
	
	*this method returns the image of the docs

	*<b>pre: </b> 
	
	*<b>post: return docs add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

     

    public int getImage(){

        return image;
    }

    /**
	
	*this method modifies the documents code

	*<b>pre: </b> 
	
	*<b>post: documents code changed
	
	*@param documents code != null
	
	*@author Anderson Rueda.
	
	*/

    


    public void setDocumentCode(int documentCode) {

        this.documentCode=documentCode;
        
    }

    /**
	
	*this method returns the document code

	*<b>pre: </b> 
	
	*<b>post: return the document code add
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public  int getDocumentCode(){

        return documentCode;
    }

}




