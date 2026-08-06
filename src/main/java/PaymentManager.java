import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;




public class PaymentManager {
    private ArrayList<Payable> items;
    public PaymentManager(){
        items = new ArrayList<>();
    }
    
    public void load (String filename){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner reader = null;
        try{
            reader = new Scanner(new File(filename));
            while (reader.hasNext()){
                String oneLine= reader.nextLine();
                String[] values = oneLine.split(",");
                if (values[0].equals("R")){
                    // EquipRental
                    LocalDate dRented = LocalDate.parse(values[3], fmt );
                    int qty = Integer.parseInt(values[4]);
                    double cost = Double.parseDouble(values[5]);
                    if(qty <= 0 || cost <= 0)
                        continue;
                    EquipRental r = new EquipRental(values[1], values[2], dRented, qty, cost);
                    if (items.contains(r) == false)
                        items.add(r);
                } 
                else {
                    // Subscription or PremiumSubscription
                    LocalDate sDate = LocalDate.parse(values[3], fmt);
                    LocalDate eDate = LocalDate.parse(values[4], fmt);
                    double fee =Double.parseDouble(values[5]);
                    Subscription s = null;
                    if(values[0].equals("S")){
                        s = new Subscription(values[1], values[2], sDate, eDate, fee);
                    }
                    else{
                        double disRate = Double.parseDouble(values[6]);
                        s = new PremiumSubscription(values[1], values[2], sDate, eDate, fee, disRate);
                    }
                    //Check duplicate 
                    if (items.contains(s)== false)
                        items.add(s);
                }
                
            }
        }
        catch(FileNotFoundException err){
            System.out.println(err);
        }
        finally {
            if (reader != null){
                reader.close();
            }
        }
        
    }
    
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Payable p: items){
            result.append(p + "\n");
        }
        return result.toString();
    }
    
    public double getTotalAmount(){
        double total = 0;
        for (Payable p : items){
            total = total +p.getAmount();
        }
        return total;
    }
    
    public double getTotalSubscription(){
        double total = 0; 
        for (Payable p: items){
            if (p  instanceof Subscription){
                total = total + p.getAmount();
            }
        }
        return total;
    }
}
