import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;


public class ClaimManager {
        
    private ArrayList<Claim> claims;

    public ClaimManager(){
        claims = new ArrayList<>();
    }
    public void load(){
        claims.add(new Claim("e1", LocalDate.of(2026, 4, 25)));
        claims.add(new ClaimTpt("e2", LocalDate.of(2026, 6, 30), 200));
        claims.add(new ClaimOT("e3", LocalDate.of(2026, 7, 30), 10));
        claims.add(new ClaimOT("e4", LocalDate.of(2026, 7, 30), 2));
    }
    
}
