package main;

//QUESTION 1
public class ItemInformation {
	
	//ATTRIBUTES
    private String itemID;
    private String itemName;
    private double itemPrice;
    private String date;
    private String custID;
    
    //CONSTRUCTOR WITHOUT PARAMETER
    public ItemInformation(){
        this.itemID = null;
        this.itemName = null;
        this.date = null;
        this.custID = null;
        this.itemPrice = 0;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public ItemInformation(String itemID, String itemName, double itemPrice, String date, String custID){
        this.itemID = itemID;
        this.itemName = itemName;
        this.date = date;
        this.custID = custID;
        this.itemPrice = itemPrice;
    }
    
    //ACCESSOR METHOD
    public String getItemID(){
        return itemID;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public double getitemPrice(){
        return itemPrice;
    }
    
    public String getDate(){
        return date;
        
    }
    
    public String getCustID(){
        return custID;
    }
    
}
