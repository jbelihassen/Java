import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {


         CafeUtil appTest  = new CafeUtil();
   

    // !!!  Streak Goal Test
    

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

      
    // !!!  Order Total Test 

      
     System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
       
       
    // !!  Diplay Menu Test 

      System.out.println("----- Display Menu Test-----");
                      
        ArrayList <String> menu = new ArrayList<String>();
      
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

    
    // !!  Add Customer

        //   System.out.println("\n----- Add Customer Test-----");
        //  ArrayList<String> customers = new ArrayList<String>();
        //  for (int i = 0; i < 4; i++) {
        //     appTest.addCustomer(customers);
        //     System.out.println("\n");
        // }
     
}
}