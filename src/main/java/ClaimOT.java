import java.time.LocalDate;


public class ClaimOT extends Claim {
    private static double CLAIM_MAX = 100;
    private static double CLAIM_PER_HOUR = 20;
    private int hoursOT;
    public ClaimOT(String empId, LocalDate dateOfClaim, int hours){
        super(empId, dateOfClaim);
        hoursOT = hours;
    }
     public int getHoursOT(){
         return hoursOT;
     }
     
     @Override
     public double getClaimAmount(){
         double totalOT = hoursOT * CLAIM_PER_HOUR;
         if (totalOT > CLAIM_MAX){
             return CLAIM_MAX;
         }
         else{
             return totalOT;
         }
     }
     public String toString(){
         return String.format("ClaimOT Hour(s): %d %s", hoursOT, super.toString());
     }
    
    
}
