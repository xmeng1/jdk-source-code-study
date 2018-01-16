package science.mengxin.jdk_study;


import java.util.Arrays;

/**
 * User:    mengxin
 * Date:    06/01/2018
 * Project: jdk_study-source-code-study
 * Package: science.mengxin.jdk_study
 * Description: StringStudy.
 *
 * @author mengxin
 * @version 1.0
 */
public class StringStudy {

    /** Cache the hash code for the string */
    private int hash; // Default to 0

    /**
     * The value is used for character storage.
     *
     * @implNote This field is trusted by the VM, and is a subject to
     * constant folding if String instance is constant. Overwriting this
     * field after construction will cause problems.
     *
     * Additionally, it is marked with  to trust the contents
     * of the array. No other facility in JDK provides this functionality (yet).
     *  is safe here, because value is never null.
     */
    private final byte[] value;


    /**
     * The identifier of the encoding used to encode the bytes in
     * {@code value}. The supported values in this implementation are
     *
     * LATIN1
     * UTF16
     *
     * @implNote This field is trusted by the VM, and is a subject to
     * constant folding if String instance is constant. Overwriting this
     * field after construction will cause problems.
     */
    private final byte coder;

    /**
     * Initializes a newly created {@code String} object so that it represents
     * an empty character sequence.  Note that use of this constructor is
     * unnecessary since Strings are immutable.
     */
    public StringStudy() {
        this.value = new byte[0];
        this.coder = 0;
    }

    static final boolean COMPACT_STRINGS;
    static final byte LATIN1 = 0;
    static {
        COMPACT_STRINGS = true;
    }

    private boolean isLatin1() {
        return COMPACT_STRINGS && coder == LATIN1;
    }

    public static int hashCode(byte[] value) {
        System.out.println(Arrays.toString(value));
        int h = 0;
        System.out.println("h: " + h);
        StringBuilder hDisplay = new StringBuilder("0");
        int index = 0;
        for (byte v : value) {
            System.out.println(v + " binary: " + Integer.toBinaryString(Byte.toUnsignedInt(v)));
            System.out.println((v & 0xff) + " v & 0xff: " + Integer.toBinaryString(v & 0xff));
            // why use the v&0xff, just keep the last 8 bit of the byte, see this blog
            // https://oscarliang.com/what-s-the-use-of-and-0xff-in-programming-c-plus-p/
            if (index == 0)
                hDisplay = new StringBuilder("31 * " + hDisplay + " + " + v);
            else
                hDisplay = new StringBuilder("31 * (" + hDisplay + ") + " + v);

            h = 31 * h + (v & 0xff);
            System.out.println("h: " + h);
            System.out.println(hDisplay);
            index++;
        }
        int number = 31 * (31 * (31 * (31 * (31 * 66 + 66) + 66) + 66) + 66) + 66;
        System.out.println("test " + number);
        return h;
    }

    public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            hash = h = isLatin1() ? StringStudy.hashCode(value)
                    : StringStudy.hashCode(value);
        }
        return h;
    }
}
