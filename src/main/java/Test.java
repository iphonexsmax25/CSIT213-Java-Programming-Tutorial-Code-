import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args){
        test1();
        
    }
    public static void test2(){
        
        
    }
    public static void test1(){
        EquipRental r = new EquipRental("r1", "desc 1", LocalDate.of(2026, 3, 20), 50, 10);
        System.out.println(r);
        
        Subscription s = new Subscription ("s1", "name 1", LocalDate.of(2025, 12, 1), LocalDate.of(2026, 12, 1), 100);
        System.out.println(s);
        
        PremiumSubscription p = new PremiumSubscription("p1", "name 1", LocalDate.of(2025, 12, 1), LocalDate.of(2026, 12, 1), 100, 0.2);
        System.out.println(p);
                
    }
}
