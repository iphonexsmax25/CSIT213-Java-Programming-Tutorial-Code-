import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;




public class PaymentManager {
    private ArrayList<Payable> items;
    public PaymentManager(){
        items = new ArrayList<>();
    }
    
    public void load (String filename){
        
    }
    
    public double getTotalAmount(){
        double total = 0;
        return total;
    }
    
    public double getTotalSuncription(){
        double total = 0; 
        return total;
    }
}
