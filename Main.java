import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String options = new String("0 - Price, 1 - Volume Average, 2 - Market Cap, 3 - Range, 4 - CEO");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("What stock would you like? ");
            String ticker = scan.nextLine();
            URL url = new URL("https://financialmodelingprep.com/api/v3/profile/" + ticker
                    + "?apikey=9e32e1c117e9206264ef7c63453dca84");
            System.out.print("What would you like to look at? ");
            String keyInput = scan.nextLine();
            StockEvent stockWithKey = new StockEvent(keyInput, url);
            System.out.println(stockWithKey.getValue());
            //scan.close();

            //System.out.print(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}