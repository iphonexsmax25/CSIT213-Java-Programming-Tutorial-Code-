import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;



public class Test {
    public static void main(String[] args){
        test1();
    }
    
    public static void test1(){
        Claim c1 = new Claim ("e1", LocalDate.of(2026, 4, 25));
        System.out.println(c1.getYearOfClaim());
        System.out.println(c1.getMonthOfClaim());
        System.out.println(c1);
        // ClaimTpt
        ClaimTpt t1 = new ClaimTpt("e2", LocalDate.of(2026, 6, 30),200);
        System.out.println(t1);
        //ClaimOT
        ClaimOT ot1 = new ClaimOT("e3", LocalDate.of(2026, 7, 30), 10);
        ClaimOT ot2 = new ClaimOT("e3", LocalDate.of(2026, 7, 30), 2);
        System.out.println(ot1);
        System.out.println(ot2);
        
        
    }
    
}
