public class TestOrders {
    public static void main(String[] args) {


//  Create 2 orders for unspecified guests

        Order order1 = new Order();
        Order order2 = new Order();


//  Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Smith");
        Order order4 = new Order("Bob");
        Order order5 = new Order("Alain");

// Implement the addItem method within the Order class

        Item item1 = new Item("drip coffee", 1.60);
        Item item2 = new Item("capuccino", 2.45);
        Item item3 = new Item("iced coffee", 2.15);
        Item item4 = new Item("mocha", 3.10);



 // Add at least 2 items to each of the orders using the addItem method    


        order1.addItem(item4);
        order1.addItem(item3);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);



// Implement the getStatusMessage method within the Order class   
      System.out.println(order2.getStatusMessage());
      order2.setReady(false);
      System.out.println(order2.getStatusMessage());

///   Implement the getOrderTotal method within the Order class


    order2.getOrderTotal();
    System.out.println(order2.getOrderTotal());

//  Implement the display method within the Order class
   System.out.println(order4.getOrderTotal());
    order4.display();
   


      

    }
}
