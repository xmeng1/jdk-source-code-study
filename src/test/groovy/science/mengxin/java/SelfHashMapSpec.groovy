package science.mengxin.java

import science.mengxin.utilities.HashCodeUtil
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

/**
 * User:    mengxin
 * Date:    17/01/2018
 * Project: Default (Template) Project
 * Package: science.mengxin.java
 * Description: SelfHashMapSpec.
 * @author mengxin
 * @version 1.0
 */

@Narrative("""

""")
@Title("Unit test for self simulated HashMap")
@Subject(HashMap)
class SelfHashMapSpec extends Specification {

    /**
     * This test is design to basic display the information of HashMap
     */
    def "test basic information of self HashMap"() {
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



    def "test putValue in HashMap"() {
        given: "generate list of string with same hashcode"
        List<String> strList = HashCodeUtil.generateN(5)  // 2 ^ 5 = 32
        when: "put all the string with same hashcode to HashMap"
        HashMap hashMap = new HashMap()

        hashMap.put("test1","value1")
        hashMap.logNodesTable()

        hashMap.put("test2","value2")
        hashMap.logNodesTable()

        hashMap.put("test1","modified_value1")
        hashMap.logNodesTable()

        int i = 0
        for (String obj : strList) {
            hashMap.put(obj,obj)
            hashMap.logNodesTable()
            i++
            if(i>8){
                break
            }
        }

        then:
        hashMap.size() != 0
    }

    def "test default HashMap with treeifyBin"() {
        given: "generate list of string with same hashcode"
        List<String> strList = HashCodeUtil.generateN(5)  // 2 ^ 5 = 32
        when: "put all the string with same hashcode to HashMap"
        HashMap hashMap = new HashMap()
        int i = 0
        for (String obj : strList) {
            hashMap.put(obj,obj)
            hashMap.logNodesTable()
            i++
            if(i>10){
                break
            }
        }
        then:
        hashMap.size() != 0
    }
}