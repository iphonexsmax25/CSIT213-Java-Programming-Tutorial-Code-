import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        Claim c1 = new Claim("e1", LocalDate.of(2026, 4, 25));
        System.out.println(c1.getYearOfClaim());
        System.out.println(c1.getMonthOfClaim());
        System.out.println(c1);
        // ClaimTpt
        ClaimTpt t1 = new ClaimTpt("e2", LocalDate.of(2026, 6, 30), 200);
        System.out.println(t1);
        // ClaimOT
        ClaimOT ot1 = new ClaimOT("e3", LocalDate.of(2026, 7, 30), 10);
        ClaimOT ot2 = new ClaimOT("e4", LocalDate.of(2026, 7, 30), 2);
        System.out.println(ot1);
        System.out.println(ot2);
    }

    public static void test2() {
        ArrayList<Claim> claims = new ArrayList<>();
        claims.add(new Claim("e1", LocalDate.of(2026, 4, 25)));
        claims.add(new ClaimTpt("e2", LocalDate.of(2026, 6, 30), 200));
        claims.add(new ClaimTpt("e3", LocalDate.of(2026, 7, 30), 10));
        claims.add(new ClaimOT("e4", LocalDate.of(2026, 7, 30), 2));
        // Add all instances
        double total = 0;
        for (Claim c : claims) {
            System.out.println(c);
            total = total + c.getClaimAmount();
        }
        System.out.println(total);
        // Add all ClaimOT instances
        double totalOT = 0;
        for (Claim c : claims) {
            if (c instanceof ClaimOT) {
                totalOT = totalOT + c.getClaimAmount();
            }
        }
        System.out.println(totalOT);
    }

    public static void test3() {
        ClaimManager mgr = new ClaimManager();
        mgr.load();
        System.out.println(mgr);
        System.out.println(mgr.getTotalTp());
        System.out.println(mgr.getTotalClaim("e1"));
        System.out.println(mgr.getTotalClaim("e99"));
        //
        HashMap<String, ArrayList<Claim>> summary = mgr.getSummary();
        for (String empId : summary.keySet()) {
            System.out.println(empId);
            ArrayList<Claim> empClaims = summary.get(empId);
            for (Claim c : empClaims) {
                System.out.println("  " + c);
            }
        }
    }
}
