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
        hashMap.logNodesTable()

        hashMap.put("test2","value1")
        hashMap.logNodesTable()

        hashMap.put("test3","value1")
        hashMap.logNodesTable()

        hashMap.put("test4","value1")
        hashMap.logNodesTable()

        hashMap.put("test5","value1")
        hashMap.logNodesTable()


        hashMap.put("test6","value1")
        hashMap.logNodesTable()
        then:
        hashMap.size() == 6
    }
}