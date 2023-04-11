public class AlfredTest {
  
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();
      
        String testGuestGreeting = alfredBot.guestGreeting( "Beth Kane.");
        System.out.println(testGuestGreeting);  

        String testDateAnnouncement = alfredBot.dateAnnouncement();
        System.out.println(testDateAnnouncement);



        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        System.out.println(alexisTest);
                          
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        System.out.println(alfredTest);
        
        String notRelevantTest = alfredBot.respondBeforeAlexis( "Maybe that's what Batman is about. Not winning. But failing..");
        System.out.println(notRelevantTest);
    }
}
