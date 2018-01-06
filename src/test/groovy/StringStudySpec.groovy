import science.mengxin.jdk.StringStudy
import spock.lang.Specification
import spock.lang.Unroll

/**
 * User:    mengxin
 * Date:    06/01/2018
 * Project: Default (Template) Project
 * Package: 
 * Description: StringStudySpec.
 * @author mengxin
 * @version 1.0
 */
class StringStudySpec extends Specification {
    @Unroll()
    def "test the hashcode function of string"() {
        given: ""

        and: "information"

        when: "when"
        int hashCodeResult = StringStudy.hashCode(str.getBytes())
        then: "then"
        hashCodeResult == hash as int
        println(str + " hashCode " + hashCodeResult)
        where: "when"
        /*
        AaAaAa---1952508096
        AaAaBB---1952508096
        AaBBAa---1952508096
        AaBBBB---1952508096
        BBAaAa---1952508096
        BBAaBB---1952508096
        BBBBAa---1952508096
        BBBBBB---1952508096
        * */
        str      || hash
        "AaAaAa" || 1952508096
        "AaAaBB" || 1952508096
        "AaBBAa" || 1952508096
        "AaBBBB" || 1952508096
        "BBAaAa" || 1952508096
        "BBAaBB" || 1952508096
        "BBBBAa" || 1952508096
        "BBBBBB" || 1952508096
    }
}