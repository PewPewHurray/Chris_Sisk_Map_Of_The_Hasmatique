import java.util.HashMap;
import java.util.Set;
public class HashMapFun{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("A Dream of Hope", "I dream every day of a hope to get me through the day...");
        trackList.put("The Sun During the Rain", "Even in the most rainy days you are the sun that shines through...");
        trackList.put("The Beauty I See", "This world is filled with beauties but you are the beauty I see...");
        trackList.put("Is You", "This first thing I want to see, the last thing I want to see each day, is you...");
        System.out.println(trackList.get("The Beauty I See"));
        // Set<String> keys = trackList.keySet();
        // for(String key : keys){
        //     System.out.printf("Track: %s: Lyrics: %s%n", key, trackList.get(key));
        // }
        for(String key : trackList.keySet()){
            System.out.printf("Track: %s:%nLyrics: %s%n", key, trackList.get(key));
        }
    }
}