import java.time.LocalDate;
public class Claim {
    private String empId;
    private LocalDate dateofClaim;
    public Claim(String empId, LocalDate dateofClaim){
        this.empId = empId;
        this.dateofClaim = dateofClaim;
    }
    public String getEmpId(){ return empId; }
    public int getYearofClaim(){
        return dateofClaim.getYear();
    }
    public int getMonthofClaim(){
        return dateofClaim.getMonthValue();
    }
    public double getClaimAmount(){
        return 20;
    }
    public String toString(){
        return String.format("%s %s $%.2f", empId, dateofClaim, getClaimAmount());
    }
}
