import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, my name is Alfred.";
    }
    //This method will return a string that is a quote from Alfred
    public String guestGreeting(String guestName) {
        return "Hello, " + guestName + ". I'm Alfred.";
    }

    //code to return the string date, if asked for
    public String dateAnnouncement(){
        Date date = new Date();
        return "Today is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "I don't know what to say.";
        } else if (conversation.contains("Alfred")) {
            return "I’d tell you a Tchaikovsky joke but it’s rather Pathétique.";
        } else {
            return "Right. Off you go.";
        }
    }

    //overload the guessGreeting method to take a guest name as a parameter, create a greeting for the guest, and return it with Alfreds age
    public String guestGreeting(String guestName, String dayPeriod) {
        return dayPeriod + " " + guestName + ". I'm Alfred, lovely to see you.";
    }

    //method where Alfred will respond to a guest greeting with a yell because he is old
    public String guestGreeting(String guestName, int age) {
        if (age > 60) {
            return "HELLO " + guestName.toUpperCase() + "! I'M ALFRED, I'M OLD!";
        } else {
            return "HELLO " + guestName.toUpperCase() + "! I'M ALFRED, I'M YOUNG AND YOU CANT SAY OTHERWISE!";
        }
    }
    
}
