import java.time.LocalDate;


public class Claim{
    private String empId;
    private LocalDate dateOfClaim;
    public Claim(String empId, LocalDate dateOfClaim){
        this.empId = empId;
        this.dateOfClaim = dateOfClaim;
    }
    
    public String getEmpId(){
        return empId;
    }
    
    public int getYearOfClaim(){
        return dateOfClaim.getYear();
    }
    
    public int getMonthOfClaim(){
        return dateOfClaim.getMonthValue();
    }
    
    public double getClaimAmount(){
        return 20;
    }
    
    public String toString(){
        return String.format("%s %s $%.2f", empId, dateOfClaim, getClaimAmount());
    }
}