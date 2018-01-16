import java.util.HashMap;
import java.util.Map;

/**
 * User:    mengxin
 * Date:    02/01/2018
 * Project: jdk_study-source-code-study
 * Package: PACKAGE_NAME
 * Description: HashMapStudy.
 *
 * @author mengxin
 * @version 1.0
 */
public class HashMapStudyDemo {
    public static void main(String[] arg) {
        Map<String,Integer> test = new HashMap<>();
        float factor = 0.75f;
        Map<String,Integer> test2 = new HashMap<>(16, factor);

        test.put("KING", 100);
        test.put("CLARK", 99);
        test.put("BLAKE", 10);
        test.put("FORD", 110);
        test.put("SMITH", 10);
        test.put("WARD", 100);
        test.put("JONES", 90);

        System.out.print("previous value " + test.put("KING", 1010) + "\n");
        System.out.print("previous value " + test.put("CLARK", 919) + "\n");
        System.out.print("previous value " + test.put("BLAKE", 110) + "\n");
        System.out.print("previous value " + test.put("FORD", 1110) + "\n");
        System.out.print("previous value " + test.put("SMITH", 110) + "\n");
        System.out.print("previous value " + test.put("WARD", 1010) + "\n");
        System.out.print("previous value " + test.put("JONES", 910) + "\n");

        System.out.print(test);

        test.get("KING");
        test.get("CLARK");
        test.get("BLAKE");
        test.get("FORD");
        test.get("SMITH");
        test.get("WARD");
        test.get("JONES");

    }
}
