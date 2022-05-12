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


public class api{
    static String stringUrl = "";

    public static void api(String[] args) throws Exception{

        // API Key is : 9e32e1c117e9206264ef7c63453dca84
        JSONParser parser = new JSONParser();

        Scanner scan = new Scanner(System.in);
        System.out.print("What stock would you like?");
        String stockInput = scan.nextLine();

        stringUrl = "https://financialmodelingprep.com/api/v3/profile/" + stockInput + "?apikey=9e32e1c117e9206264ef7c63453dca84";
        //URL url = new URL(stringUrl);

        System.out.print("What would you like to look at?");
        String keyInput = scan.nextLine();
        StockEvent.findInputValue(keyInput);



        
}

}
    

