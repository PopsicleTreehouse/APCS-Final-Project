import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class StockEvent extends api{
    private String key;
    private String value;
    private static URL url;
    

public StockEvent(String key, String value) throws Exception{
    this.key = key;
    this.value = value;
    url = new URL(api.stringUrl);
}

public String getKey(){
    return key;
} 

public String getValue(){
    return value;
}

public static String findInputValue(String x){
        int splitter = 0;
        String key = "";
        String value = "";

    
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
        for (String line; (line = reader.readLine()) != null;) {
            splitter = line.indexOf("price");
            key = line.substring(0, splitter);
            value = line.substring(splitter+1);
            StockEvent event = new StockEvent(key, value);

            System.out.println(splitter);

        
            System.out.println(event.getValue());
        }

        Object obj = parser.parse(url);
        JSONArray array = (JSONArray)obj;
}
catch(Exception e){
    e.printStackTrace();
}
}

}