import java.time.LocalDate;


public class ClaimTpt extends Claim{
    private static double PER_KM = 1.5;
    private double distance;
    
    public ClaimTpt(String empId, LocalDate dateOfClaim, double distance){
        super(empId, dateOfClaim);
        this.distance = distance;
    }
    
    
    public  double getDistance(){
        return distance ;
    }
    
    @Override
    public double getClaimAmount(){
        return distance * PER_KM;
    }
    
    public String toString(){
        return String.format(("ClaimTpt %.1f %s" ), distance, super .toString());
    }
    
    
    
}
