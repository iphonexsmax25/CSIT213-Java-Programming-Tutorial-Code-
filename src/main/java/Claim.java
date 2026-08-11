import java.time.LocalDate;


public class Claim {
    private String empId;
    private  LocalDate dateOfClaim;
    public Claim(String empId, LocalDate dateofClaim){
        this.empId = empId;
        this.dateOfClaim = dateOfClaim;
    }
    
    public String getEmpId(){
        return empId;
    }
    
    public int getYearOfClaim(){
        return dateOfClaim.getYear();
    }
    
    
    
}
