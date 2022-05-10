import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

public class main{
    URL url;
    JSONObject obj = new JSONObject();

    public main() {
        String urlBase = "https://financialmodelingprep.com/api/v3/income-statement/RY.TO?apikey=9e32e1c117e9206264ef7c63453dca84";
        try {

            URL url = new URL("url");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			if(conn.getResponseCode() == 200) {
				//Scanner sc = new Scanner(url.openStream)
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            
            e.printStackTrace();
        }
    }
    
}