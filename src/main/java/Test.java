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
        System.out.println(c1.getYearOfClaim());
        System.out.println(c1);
        // ClaimTpt
        ClaimTpt t1 = new ClaimTpt("e2", LocalDate.of(2026, 6, 30),200);
        
        
    }
    
}
