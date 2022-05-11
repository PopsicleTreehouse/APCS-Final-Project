import java.util.ArrayList;

public class StockEvent{
    private String key;
    private String value;

public StockEvent(String key, String value){
    this.key = key;
    this.value = value;
}

public String getKey(){
    return key;
} 

public String getValue(){
    return value;
}

}