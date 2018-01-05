import science.mengxin.jdk.HashMapStudy
import spock.lang.*

/**
 * User:    mengxin
 * Date:    05/01/2018
 * Project: jdk-source-code-study
 * Package: 
 * Description: HashMapStudySpec.
 * @author mengxin
 * @version 1.0
 */

@Narrative("""
""")
@Title("Unit test for HashMapStudySpec")
@Subject(HashMapStudySpec)
class HashMapStudySpec extends Specification {

    @Unroll()
    def "test the tableSizeFor function"() {
        given: ""

        and: "information"

        when: "when"
        int result = HashMapStudy.tableSizeFor(capacity)
        then: "then"
        Integer resultInteger = result
        resultInteger == expectedResult
        println(capacity + " tableSizeFor " + result)
        where: "when"
        capacity   || expectedResult
        1          || 1
        2          || 2
        3          || 4
        4          || 4
        5          || 8
        10         || 16
        15         || 16
        16         || 16
        17         || 32
        18         || 32
        19         || 32
        18         || 32
        19         || 32
        39         || 64
        78         || 128
        189        || 256
        456        || 512
        1073741822 || 1073741824
        1073741825 || 1073741824
    }
}