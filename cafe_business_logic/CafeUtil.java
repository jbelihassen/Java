import java.util.ArrayList;
public class CafeUtil {

   // !!  Implement the getStreakGoal method and test.

    public int getStreakGoal() {
        int sum = 0;
        for ( int i = 1 ; i < 11 ; i++ ) {          
          sum +=i;
        }
          return  sum;
    }
   
   // !! Implement the printPriceChart method and test.

   public double getOrderTotal(double[] prices){
    
        double total = 0.0;
        for (int i = 0; i < prices.length; i++) {
        total += prices[i];
    }
       return total;
       }



    // !! Implement the displayMenu method and test.
     
   
   public void displayMenu(ArrayList<String> menuItems){
        String order1 = menuItems.get(0);
        String order2 = menuItems.get(1);
        String order3 = menuItems.get(2);
        String order4 = menuItems.get(3);
        System.out.println("0 "+order1);
        System.out.println("1 "+order2);
        System.out.println("2 "+order3);
        System.out.println("3 "+order4);
    }


    //!! Implement the addCustomer method and test.

 


}