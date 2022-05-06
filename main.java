import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class main{
    URL url;

    public main() {
        String urlBase = "https://financialmodelingprep.com/api/v3/income-statement/RY.TO?apikey=9e32e1c117e9206264ef7c63453dca84";
        try {

            url = new URL(urlBase);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            
            e.printStackTrace();
        }
    }
    
}