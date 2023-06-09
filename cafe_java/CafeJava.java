public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripcoffePrice = 4.3;
        double lattePrice = 5.5;
        double cappuccinoPrice = 4.3;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        // !! 4) 
        System.out.println(customer1 + pendingMessage);  // Displays "Cindhuri, your order will be ready shortly"


        // !! 5)

        if(isReadyOrder4){                                      //   Noah ordered a coffee

         System.out.println(customer4 + pendingMessage); 
            
        }else{

         System.out.println(customer4 + readyMessage);           
        }


       // !! 6)
        System.out.println(displayTotalMessage + lattePrice*2);  // Sam just ordered 2 lattes, print the message to display their total

        if(isReadyOrder2){                                      //   Noah ordered a coffee
            System.out.println(customer2 + readyMessage);  
         
            
        }else{
           System.out.println(customer2 + pendingMessage); 
                  
        }
         
        //!! 7) 
        
        System.out.println(displayTotalMessage + (lattePrice - dripcoffePrice));
  


    	// ** Your customer interaction print statements will go here ** //
    }
}
