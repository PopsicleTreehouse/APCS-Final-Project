import java.util.ArrayList;

public class User extends StockAPI{
    private ArrayList<Stock> watchlist;
    private ArrayList<Stock> portfolio;
    private String email;
    private String password;

    public User(String email, String password){
        this.email = email;
        this.password = password;
        watchlist = new ArrayList<Stock>();
        portfolio = new ArrayList<Stock>();
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public ArrayList<Stock> getWatchlist(){
        return this.watchlist;
    }

    public ArrayList<Stock> getPortfolio(){
        return this.portfolio;
    }

    public void addWatchlistStock(Stock stock){
        watchlist.add(stock);
    }

    public void addPortfolioStock(Stock stock){
        portfolio.add(stock);
    }
}