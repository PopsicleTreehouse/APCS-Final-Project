import java.net.URL;
import java.time.Year;
import java.util.Scanner;
import java.util.*;

public class StockAPI {

    public void start() {
        String options = new String("0 - price, 1 - volAvg, 2 - mktCap, 3 - range, 4 - ceo.  ");
        String options1 = new String("OR 5 - add stock to your Watchlist, 6 - add stock to your Portfolio.");
        Scanner scan = new Scanner(System.in);
        User user;

        try {

            user = login();

            System.out.print("What stock would you like? ");
            String ticker = scan.nextLine();

            URL url = new URL("https://financialmodelingprep.com/api/v3/profile/" + ticker
                    + "?apikey=9e32e1c117e9206264ef7c63453dca84");

            System.out.println("What would you like to do with this stock? ");
            System.out.println("The options are: " + options + options1);
            String keyInput = scan.nextLine();
            int index = Integer.parseInt(keyInput);
            if (index <= 4) {
                String[] keys = { "price", "volAvg", "mktCap", "range", "ceo" };
                StockEvent event = new StockEvent(keys[index], url);
                System.out.println(event.getValue());
            } else {
                Stock stock = new Stock(ticker, url);
                if (index == 5)
                    user.addWatchlistStock(stock);
                else if (index == 6)
                    user.addPortfolioStock(stock);
                System.out.println("done!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User login() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter login info: ");
        System.out.println("email: ");
        String email = scan.nextLine();
        System.out.println("pass: ");
        String pass = scan.nextLine();
        return new User(email, pass);
    }

    public void loop() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to start? | y/n");
        String play = scan.nextLine();

        boolean start = false;
        if (play.equals("y")) {
            start = true;
        }

        while (start == true) {
            this.start();
            System.out.println("Go again? | y/n");
            play = scan.nextLine();
            if (play.equals("y")) {
                continue;
            } else {
                start = false;
            }

        }
        System.out.println("Thanks for using Nigel and Nick's Stock API!");

    }

    public static void main(String[] args) {
        StockAPI api = new StockAPI();
        User user = new User("np@gmail.com", "1234");
        api.loop();

    }
}