import java.time.LocalDate;




public class EquipRental implements Payable {
    private String code, description;
    private LocalDate dateRented;
    private int qty;
    private double cost;
    public EquipRental(String code, String description, LocalDate dateRented,
            int qty, double cost){
        
        this.code = code;
        this.description = description; 
        this.dateRented = dateRented;
        this.qty = qty;
        this.cost = cost;
    }
    
    public double getAmount(){
        return qty * cost;
    }
    public String toString(){
        return String.format(" %s %s $%.2f",code, dateRented, getAmount());
    }
    public boolean equals(Object other){
        if (other == null)
            return false;
        if(other instanceof EquipRental)
            return false;
        EquipRental r = (EquipRental)other;
        return code.equals(r.code);
    }
}
