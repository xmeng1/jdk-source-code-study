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
    def "test the String hashcode with relation part of string"() {
        given: ""

        and: "information"
        str =str as String
        String partA = str.substring(0,strPartA)
        String partB = str.substring(strPartA,str.size())
        when: "when"
        int hashCodeResult = StringStudy.hashCode(str.getBytes())
        int hashCodeResultPartA = StringStudy.hashCode(partA.getBytes())
        int hashCodeResultPartB = StringStudy.hashCode(partB.getBytes())
        then: "then"
        println(str + " hashCode " + str +  " " + hashCodeResult)
        println(str + " hashCodeResultPartA " + partA +  " " + hashCodeResultPartA)
        println(str + " hashCodeResultPartB " + partB +  " "  + hashCodeResultPartB)
        double pow = Math.pow(31d, strPartB as double)
        int pow1 = pow as int
        if (hashCodeResult >0)
            hashCodeResult == hashCodeResultPartA * pow1 + hashCodeResultPartB
        else {
            println(str + " Integer.MAX_VALUE " + Integer.MAX_VALUE)
            hashCodeResult == Integer.MAX_VALUE - (hashCodeResultPartA * pow1 + hashCodeResultPartB)
        }
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
        str      | strPartA | strPartB || hash
        "AaAaAa" | 3        | 3        || 1952508096
        "abcdef" | 3        | 3        || 1952508096
        "qewrwe" | 3        | 3        || 1952508096
        "abcdefghhi" | 3        | 7       || 1952508096
    }

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