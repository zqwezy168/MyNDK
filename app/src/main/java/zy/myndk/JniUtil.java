package zy.myndk;

/**
 * Created by zy
 * on 2020/3/24.
 */
public class JniUtil {
    static {
        System.loadLibrary("myJni");
    }
    public native int add(int a,int b);
}
