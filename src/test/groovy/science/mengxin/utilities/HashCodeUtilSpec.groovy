package science.mengxin.utilities

import spock.lang.Specification
import spock.lang.Unroll


/**
 * User:    mengxin
 * Date:    07/01/2018
 * Project: Default (Template) Project
 * Package: science.mengxin.utilities
 * Description: HashCodeUtilSpec.
 * @author mengxin
 * @version 1.0
 */
class HashCodeUtilSpec extends Specification {
    @Unroll
    def "test generate multiple string with same hash code"() {
//        given:

        when:
        List strList = HashCodeUtil.generateN(number)
        then:
        strList.size() == size as int
        then:
        System.out.println(number)
        System.out.println(strList)
        int hashCode = strList.get(0).hashCode()
        for (int i = 1; i < number; i++) {
            strList.get(0).hashCode() == hashCode
        }
        where:
        number || size
        5      || Math.pow(2d,5d)
//        10     || 10
//        15     || 15
    }
}