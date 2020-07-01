package main.java.com.yaroslavshchur.objcount;

public class ObjCount {
    private static int count;

    public ObjCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
