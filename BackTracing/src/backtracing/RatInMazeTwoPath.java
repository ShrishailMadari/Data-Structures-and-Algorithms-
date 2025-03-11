package backtracing;

public class RatInMazeTwoPath {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int count = mazePath(1,1,rows,cols);
        System.out.println(count);
    }
    // 1,1 i m rt now in tht cell

    private static int mazePath(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc == ec) return 1;
        int downWays =  mazePath(sr+1,sc,er,ec);
        int rightWays = mazePath(sr,sc+1,er,ec);
        return downWays  + rightWays;
    }
}
