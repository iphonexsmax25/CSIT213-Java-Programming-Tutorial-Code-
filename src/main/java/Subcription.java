import java.time.LocalDate;


public class Subcription implements Payable{
    private String code, name;
    private LocalDate startDate, expiryDate;
    private double fee;
    
    public Subcription( String code, String name, 
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
        return String.format("%s %s $%2.f ", code, startDate, getAmount());
    }
    
    public boolean equals(Object other){
        if (other == null){
            return false;
        }
            
        if (other instanceof Subcription == false){
            return false;
        }
        Subcription s = (Subcription)other;
        return code.equalsIgnoreCase(s.code);
        
    }
}
