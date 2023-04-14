
import java.util.ArrayList;

public class Order{
   
   //!! membres variables
   
      private  String name;    // Default Value null 
      private  boolean ready;    // Default value false 
      private  ArrayList <Item> items ;  // Default value []

   // !! constructor

      public Order() {
       
        this.name = "Guest";  
        this.items = new ArrayList<Item>();
    } 


  //!! overading constructor

   public Order(String name) {
        
        this.name = name;
        this.items = new ArrayList<Item>();
    }

  // !! ORDER METHODS

// Add item //
  public void addItem(Item item) {
      items.add(item);
    }
//    getStatusMessage      //

  public String getStatusMessage () {
      if (this.ready){
        return "Your order is ready.";
      }
        return "Thank you for waiting. Your order will be ready soon.";

    }

//         getOrderTotal     //   

    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }


//         display    //

    public void display(){
        System.out.println("Customer Name: "+this.name);
        for(Item item : items){
            System.out.println(item.getName()+" : $"+item.getPrice());
        }
        System.out.println("Total: $"+getOrderTotal());
    }





    // !! getter
   
    public String getName() {
        return this.name;
    }

    // !!  setter

    public void setName(String name) {
        this.name = name;        
    }
  

   //!! getter

        public boolean getReady() {
        return  this.ready;
    }

    // !!  setter

    public void setReady(boolean name) {
        this.ready = ready;        
    }

      //!! getter 

        public ArrayList<Item> getItems() {
        return this.items;
    }

    // !!  setter

    public void setItems(ArrayList<Item> items) {
        this.items = items;        
    }






    

}