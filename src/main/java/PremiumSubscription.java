import java.time.LocalDate;


public class PremiumSubscription extends Subscription{
    private double disRate;
    
    public PremiumSubscription(String code,  String name,  LocalDate startDate,  LocalDate expiryDate,  double fee, double disRate){
        super(code, name, startDate, expiryDate, fee);
        this.disRate = disRate;
    }
    
    public double getAmount(){
        return super.getAmount() * (1- disRate);
    }
}
