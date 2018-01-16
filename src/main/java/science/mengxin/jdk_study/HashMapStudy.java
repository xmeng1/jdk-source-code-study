package science.mengxin.jdk_study;

/**
 * User:    mengxin
 * Date:    05/01/2018
 * Project: jdk_study-source-code-study
 * Package: science.mengxin.jdk_study
 * Description: HashMapStudy.
 *
 * @author mengxin
 * @version 1.0
 */
public class HashMapStudy {
    /**
     * The maximum capacity, used if a higher value is implicitly specified
     * by either of the constructors with arguments.
     * MUST be a power of two <= 1<<30.
     */
    static final int MAXIMUM_CAPACITY = 1 << 30;
//1000000000000000000000000000000
    // 1073741824
    static final public int tableSizeFor(int cap) {
        System.out.println("Start to tableSizeFor: " + cap);
        int n = cap - 1;
        System.out.println("cap - 1: " + n);
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 1;
        System.out.println(">>>1: " + n);
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 2;
        System.out.println(">>>2: " + n);
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 4;
        System.out.println(">>>4: " + n);
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 8;
        System.out.println(">>>8: " + n);
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 16;
        System.out.println(">>>16: " + n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println("MAXIMUM_CAPACITY: " + MAXIMUM_CAPACITY);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
