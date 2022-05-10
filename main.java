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


public class main{
    URL url;
    JSONObject obj = new JSONObject();

    public static void main() {
        // API Key is : 9e32e1c117e9206264ef7c63453dca84
        URL url = new URL("https://financialmodelingprep.com/api/v3/profile/TSLA?apikey=9e32e1c117e9206264ef7c63453dca84");
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {

        }

    }
    
}
// test