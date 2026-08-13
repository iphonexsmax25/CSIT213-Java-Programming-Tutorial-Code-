import java.time.LocalDate;


public class ClaimOT extends Claim {
    private static double CLAIM_MAX = 100;
    private static double CLAIM_PER_HOUR = 20;
    private int hoursOT;
    public ClaimOT(String empId, LocalDate dateOfClaim, int hours){
        super(empId, dateOfClaim);
        hoursOT = hours;
    }
    
    
    
}
