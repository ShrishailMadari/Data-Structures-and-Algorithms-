package printing;

public class PPowerQ {
    public static void main(String[] args) {
        int powerQ = pPowerQ(100,2);
        System.out.println(powerQ);
    }

    private static int pPowerQ(int p,int q) {
        if(q<=1)
            return p;
        q = q-1;
        return pPowerQ(p,q)*p;
    }
}
