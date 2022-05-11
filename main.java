// import org.json.simple.JSONObject;
// import org.json.simple.JSONArray;
// import java.net.MalformedURLException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.MalformedURLException;
// import java.net.URL;
// import java.util.Map;
// import java.util.Scanner;

import java.io.*;
import java.net.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;


public class main{
    URL url;
    JSONObject obj = new JSONObject();

    public static void main(String[] args) throws Exception{
        // API Key is : 9e32e1c117e9206264ef7c63453dca84
        String profile_url = new String("https://financialmodelingprep.com/api/v3/profile/TSLA?apikey=9e32e1c117e9206264ef7c63453dca84");
        
        JSONParser parser = new JSONParser();
        URL url = new URL("https://financialmodelingprep.com/api/v3/profile/TSLA?apikey=9e32e1c117e9206264ef7c63453dca84");

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
        for (String line; (line = reader.readLine()) != null;) {
            System.out.println("Hi");
        System.out.println(line);
  }
}
catch(Exception e){
    e.printStackTrace();
}
        // Scanner scan = new Scanner(System.in);
        // System.out.println("What would you like to look at?");
        // String input = scan.nextLine();
        
        
            Object obj = parser.parse(profile_url);
            JSONArray array = (JSONArray)obj;

            for(int i=0; i<array.size(); i++){
                System.out.println(array.get(i));
            }
       


        // try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
        //     String line; 
        //     line = reader.readLine(1);
        //     System.out.println(line);
        // }

    }
    
}
