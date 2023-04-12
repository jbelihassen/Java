public class TestOrders {
    public static void main(String[] args) {


    // Create 4 item variables of type Item and instantiate  

    // Set the price and the name for each


    Item item1 = new Item();
    item1.name = "mocha";
    item1.price = 3.5;    
     
    Item item2 = new Item();
    item2.name = "latte";
    item2.price = 2.5;

    Item item3 = new Item();
    item3.name = "drip coffee";
    item3.price = 4.5;

    Item item4 = new Item();
    item4.name = "capuccino";
    item4.price = 3.5;

    // Create 4 order variables of type Order

    Order order1 = new Order();
    order1.name = "Cindhuri";

    Order order2 = new Order();
    order2.name = "Jimmy"; 

    Order order3 = new Order();
    order3.name = "Noah"; 

    Order order4 = new Order();
    order4.name = "Sam"; 
   

   // Print the order1 variable to the console to see what happens. 
   System.out.println(order1);     // Output : Order@36baf30c

   // Predict what will happen if you print order1.total
   System.out.println(order1.total);   // Output : Default Value total : 0.0


   // Add item1 to order2's item list and increment the order's total.

     order2.items.add(item1);
     order2.total = order2.total + item1.price;
     System.out.println(order2.total);    //   Output  order2.total: 3.5


   // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.

    order3.items.add(item4);
    order3.total += item4.price;
    System.out.println(order3.total);   // Output order3.total : 3.5
    
   // order4 added a latte

    order4.items.add(item2);
    order4.total += item2.price; 
    System.out.println(order4.total);   //  Output order4.total : 2.5


    // Cindhuri’s order is now ready. Update her status

    order1.ready = true; 
    System.out.println(order1.ready);

    // Sam ordered more drinks - 2 lattes. Update their order as well.

    order4.items.add(item2);
    order4.items.add(item2);
    order4.total += item2.price * 2;
    System.out.println(order4.total);  

    // Jimmy’s order is now ready
    
    order2.ready = true; 
    System.out.println(order2.ready);   

    }
}
