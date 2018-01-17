package science.mengxin.java

import spock.lang.Specification


/**
 * User:    mengxin
 * Date:    17/01/2018
 * Project: Default (Template) Project
 * Package: science.mengxin.java
 * Description: SelfHashMapSpec.
 * @author mengxin
 * @version 1.0
 */
class SelfHashMapSpec extends Specification {
    def "test self hashmap"() {
        given:
        String key = "test1"
        when:
        HashMap hashMap = new HashMap()
        hashMap.put("test1","value1")
        then:
        hashMap.size() == 1
    }
}