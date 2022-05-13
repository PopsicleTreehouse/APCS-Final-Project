import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class StockEvent extends Stock{
    private String key;
    private String value;
    private static URL url;
    

public StockEvent(String key, String value) throws Exception{
    this.key = key;
    this.value = value;
    url = new URL(api.stringUrl);
}
public StockEvent(String key) throws Exception{
    this.key = key;
    this.value = findInputValue(key);;
    url = new URL(api.stringUrl);
}

public String getKey(){
    return key;
} 

public String getValue(){
    return value;
}

public void setKey(String key){
    this.key = key;
}

public void setValue(String value){
    this.value = value;
}

public String findInputValue(String x){
        int splitter = 0;
        String key = "";
        String value = "";

    
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
        for (String line; (line = reader.readLine()) != null;) {
            splitter = line.indexOf(":");
            key = line.substring(0, splitter);
            if()
            value = line.substring(splitter+1);
            this.setValue(value);
            

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