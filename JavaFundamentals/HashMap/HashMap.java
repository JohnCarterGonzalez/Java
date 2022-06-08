import java.util.HashMap;
import java.util.ArrayList;

public class HashMap {
    /*
     * TODO:
     * Create a trackList of type HashMap<String, String>
     * add in at least 4 songs that are stored by title
     * pull out one of the songs by its track title
     * print out all the track names and lyrics int he format Track: Lyrics
     */

     public static void main(String[] args){
        //create a new Hashmap trackList
        HashMap<String, String> trackList = new HashMap<String, String>();

        //add in at least 4 songs that are stored by title
        trackList.put("TheOne", "One by one");
        trackList.put("TheTwo", "Two by two");
        trackList.put("TheThree", "Three by three");
        trackList.put("TheFour", "Four by four");

        //get the keys by using the keySet method
        ArrayList<String> keys = new ArrayList<String>(trackList.keySet());
        for (String key : keys) {

            //print out all the track names and lyrics in the format Track: Lyrics
            System.out.println(key + ": " + trackList.get(key));
        }

        //pull out one of the songs by its track title
        String track = trackList.get("TheOne");
        System.out.println("\n" + track);
        
     }
}
