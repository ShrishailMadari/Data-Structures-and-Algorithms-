package printing;

public class PPowerQ {
    public static void main(String[] args) {
        int powerQ = pPowerQ(10,2);
        System.out.println(powerQ);
    }

    private static int pPowerQ(int p,int q) {
        if(q<=1)
            return p;
        return pPowerQ(p,q-1)*p;
    }
}
