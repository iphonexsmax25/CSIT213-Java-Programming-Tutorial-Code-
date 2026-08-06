import java.time.LocalDate;


public class Subscription implements Payable{
    private String code, name;
    private LocalDate startDate, expiryDate;
    private double fee;
    
    public Subscription( String code, String name, 
            LocalDate startDate, LocalDate expiryDate, double fee ){
        this.code = code;
        this.name = name;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.fee = fee;
    }
    
    public double getAmount(){
        return fee;
    }
    
    public String toString(){
        String className = this.getClass().getSimpleName();
        return String.format("%s %s %s $%.2f ", className, code, startDate, getAmount());
    }
    
    public boolean equals(Object other){
        if (other == null){
            return false;
        }
            
        if (other instanceof Subscription == false){
            return false;
        }
        Subscription s = (Subscription)other;
        return code.equalsIgnoreCase(s.code);
        
    }
}
