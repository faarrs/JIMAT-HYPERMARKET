package main;

//QUESTION 1
public class CustomerInformation {
	
	//ATTRIBUTES
    private String custID;
    private String custIC;
    private String custName;
    private String counterPaid;
    
    //ITEM INFORMATION
    private ItemInformation itemInformation;
    
    //CONSTRUCTOR WITHOUT PARAMETER
    public CustomerInformation(){
        this.itemInformation = null;
        this.custID = null;
        this.custIC= null;
        this.custName = null;
        this.counterPaid = null;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public CustomerInformation(String custID, String custIC, String custName, String counterPaid, String itemID, String itemName, double itemPrice, String date){
        this.itemInformation = new ItemInformation(itemID, itemName, itemPrice, date, custID);
        this.custID = custID;
        this.custIC = custIC;
        this.custName = custName;
        this.counterPaid = counterPaid;
    }
    
    //ACCESSOR / GETTER METHOD
    public String getCustID(){
        return custID;
    }
    
    public String getCustIC(){
        return custIC;
    }
    
    public String getCustName(){
        return custName;
    }
    
    public String getCounterPaid(){
        return counterPaid;
    }
    
    public String getItemID(){
        return itemInformation.getItemID();
    }
    
    public String getItemName(){
        return itemInformation.getItemName();
    }
    
    public double getitemPrice(){
        return itemInformation.getitemPrice();
    }
    
    public String getDate(){
        return itemInformation.getDate();
        
    }
}
