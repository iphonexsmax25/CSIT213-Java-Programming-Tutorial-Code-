import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.Month;



public class ClaimManager {
    private ArrayList<Claim> claims;
    public ClaimManager(){
        claims = new ArrayList<>();
    }
    
    public HashMap<String, ArrayList<Claim>> getSummary(){
        HashMap<String, ArrayList<Claim>> result = new HashMap<>();
        for (Claim c : claims){
            String empId = c.getEmpId();
            if(result.containsKey(empId)){
                // Add to existing ArrayList
                ArrayList<Claim> currList =result.get(empId);
                currList.add(c);
            }
            else{
                // Must new entry
                ArrayList<Claim> newList = result.get(empId);
                newList.add(c);
                result.put(empId, newList);
                
            }
        }
        return result;
    }
    
    public void load(){
        claims.add(new Claim("e1", LocalDate.of(2026, 6, 31)));
        claims.add(new ClaimTpt("e1", LocalDate.of(2026, 6, 30), 200));
        claims.add(new ClaimTpt("e2", LocalDate.of(2026, 7, 30), 200));
        claims.add(new ClaimOT("e2", LocalDate.of(2026, 7, 30), 10));
        claims.add(new Claim("e3", LocalDate.of(2026, 7, 25)));
        claims.add(new ClaimOT("e3", LocalDate.of(2026, 7, 25), 2));
        claims.add(new ClaimOT("e3", LocalDate.of(2026, 7, 30), 1));
        claims.add(new ClaimOT("e4", LocalDate.of(2026, 7, 30), 2));
        
    }
    
    
    
}
