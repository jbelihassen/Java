import java.util.Date;
public class AlfredQuotes {
    
    
    public String guestGreeting(String name) {
        return "Hello %s,%s.Lovely to see you.";
    }


    public String dateAnnouncement() {
       
        return String.format("It is currently %s", new Date()) ;
    }


    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "She certainly isn't sophisticated enough for that.";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "At your service ?";
        }
        return "Right. And with that I shall retire.";    
    }
  
}

