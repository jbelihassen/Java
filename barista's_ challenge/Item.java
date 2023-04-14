public class Item{
   
   //!! membres variables
   
      private  String name;   // Default Value null 
      private  double price;   // Default Value 0.0


 // !! constructor

      public Item(String name, double price) {
       
        this.name = name;
        this.price = price;
    }   
 
      // !!  Getter And Setter

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;        
    }

    
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;        
    }



}