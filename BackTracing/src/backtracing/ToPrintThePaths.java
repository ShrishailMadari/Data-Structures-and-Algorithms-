package backtracing;

public class ToPrintThePaths {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        String path = "Path";
        mazePathToPrintPath(1,1,rows,cols,path);
    }

    private static void mazePathToPrintPath(int sr, int sc, int er, int ec, String path) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }
        // go right
        // if you go right then column will change
        mazePathToPrintPath(sr,sc+1,er,ec,path+": R ");

        // go down
        // if u going down then rows change
        mazePathToPrintPath(sr+1,sc,er,ec,path+": D ");

    }
}
