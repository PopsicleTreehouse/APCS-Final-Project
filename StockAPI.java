import java.net.URL;
import java.util.Scanner;
import java.util.*;

public class StockAPI {

    public void start(){
        String options = new String("0 - price, 1 - volAvg, 2 - mktCap, 3 - range, 4 - ceo");
        Scanner scan = new Scanner(System.in);

        try {
            
            System.out.print("What stock would you like? ");
            String ticker = scan.nextLine();
            URL url = new URL("https://financialmodelingprep.com/api/v3/profile/" + ticker
                    + "?apikey=9e32e1c117e9206264ef7c63453dca84");
            System.out.println("What would you like to look at from that stock? ");
            System.out.println("The options are: " + options);
            String keyInput = scan.nextLine();
            StockEvent stockWithKey = new StockEvent(keyInput, url);
            System.out.println(stockWithKey.getValue());
            

            //System.out.print(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void loop(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Would you like to start? | y/n");
        String play = scan.nextLine();

        boolean start = false;
        if(play.equals("y")){
            start = true;
        }
        
        while(start == true){
            this.start();
            System.out.println("Go again? | y/n");
            play = scan.nextLine();
            if(play.equals("y")){
                continue;
            }
            else{
                start = false;
            }


        }
        System.out.println("Thanks for using Nigel and Nick's Stock API!");
        

    }

    public static void main(String[] args) {
        StockAPI api = new StockAPI();
        api.loop();;
        
    }
}