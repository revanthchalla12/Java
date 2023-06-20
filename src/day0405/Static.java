package day0405;

public class Static {
    static int result;
    static {
        result=90;
    }
    public static int returnResult(){
        return result;
    }
}
