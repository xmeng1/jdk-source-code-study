package science.mengxin.utilities

import science.mengxin.java.HashMap
import spock.lang.Specification


/**
 * User:    mengxin
 * Date:    18/01/2018
 * Project: Default (Template) Project
 * Package: science.mengxin.utilities
 * Description: BTreePrinterSpec.
 * @author mengxin
 * @version 1.0
 */
class BTreePrinterSpec extends Specification {
    def "test print diagram of BTree"() {
        given: "construct a BTree"
        /*
        * hash code
        *         15
        *    7            30
        *  3   9      18        34
        * 1 4 8  14  16  21  31     37
        *
        *
        * */
        HashMap.TreeNode<String, String> treeNode1 = new HashMap.TreeNode<String, String>(1,"1","1",null)
        HashMap.TreeNode<String, String> treeNode3 = new HashMap.TreeNode<String, String>(3,"3","3",null)
        HashMap.TreeNode<String, String> treeNode4 = new HashMap.TreeNode<String, String>(4,"4","4",null)
        HashMap.TreeNode<String, String> treeNode7 = new HashMap.TreeNode<String, String>(7,"7","7",null)
        HashMap.TreeNode<String, String> treeNode8 = new HashMap.TreeNode<String, String>(8,"8","8",null)
        HashMap.TreeNode<String, String> treeNode9 = new HashMap.TreeNode<String, String>(9,"9","9",null)

        HashMap.TreeNode<String, String> treeNode14 = new HashMap.TreeNode<String, String>(14,"14","14",null)
        HashMap.TreeNode<String, String> treeNode15 = new HashMap.TreeNode<String, String>(15,"15","15",null)
        HashMap.TreeNode<String, String> treeNode16 = new HashMap.TreeNode<String, String>(16,"16","16",null)
        HashMap.TreeNode<String, String> treeNode18 = new HashMap.TreeNode<String, String>(18,"18","18",null)
        HashMap.TreeNode<String, String> treeNode21 = new HashMap.TreeNode<String, String>(21,"21","21",null)
        HashMap.TreeNode<String, String> treeNode30 = new HashMap.TreeNode<String, String>(30,"30","30",null)
        HashMap.TreeNode<String, String> treeNode31 = new HashMap.TreeNode<String, String>(31,"31","31",null)
        HashMap.TreeNode<String, String> treeNode34 = new HashMap.TreeNode<String, String>(34,"34","34",null)
        HashMap.TreeNode<String, String> treeNode37 = new HashMap.TreeNode<String, String>(37,"37","37",null)
        treeNode15.left = treeNode7
        treeNode15.right = treeNode30

        treeNode7.left = treeNode3
        treeNode7.right = treeNode9

        treeNode3.left = treeNode1
        treeNode3.right = treeNode4

        treeNode9.left = treeNode8
        treeNode9.right = treeNode14

        treeNode30.left = treeNode18
        treeNode30.right = treeNode34

        treeNode18.left = treeNode16
        treeNode18.right = treeNode21

        treeNode34.left = treeNode31
        treeNode34.right = treeNode37

        when: " print the tree"
        BTreePrinter.printNode(treeNode15)
        then: ""
        // TODO implement then
    }

    def "test print diagram of BTree 2"() {
        given: "construct a BTree"
        /*
        * hash code
        *         15
        *    7            30
        *  3   9      18        34
        * 1 4 8  14  16  21  31     37
        *
        *
        * */
        HashMap.TreeNode<String, String> treeNode1 = new HashMap.TreeNode<String, String>(1,"key1","value1",null)
        HashMap.TreeNode<String, String> treeNode3 = new HashMap.TreeNode<String, String>(3,"key3","value3",null)
        HashMap.TreeNode<String, String> treeNode4 = new HashMap.TreeNode<String, String>(4,"key4","value4",null)
        HashMap.TreeNode<String, String> treeNode7 = new HashMap.TreeNode<String, String>(7,"key7","value7",null)
        HashMap.TreeNode<String, String> treeNode8 = new HashMap.TreeNode<String, String>(8,"key8","value8",null)
        HashMap.TreeNode<String, String> treeNode9 = new HashMap.TreeNode<String, String>(9,"key9","value9",null)

        HashMap.TreeNode<String, String> treeNode14 = new HashMap.TreeNode<String, String>(14,"key14","value14",null)
        HashMap.TreeNode<String, String> treeNode15 = new HashMap.TreeNode<String, String>(15,"key15","value15",null)
        HashMap.TreeNode<String, String> treeNode16 = new HashMap.TreeNode<String, String>(16,"key16","value16",null)
        HashMap.TreeNode<String, String> treeNode18 = new HashMap.TreeNode<String, String>(18,"key18","value18",null)
        HashMap.TreeNode<String, String> treeNode21 = new HashMap.TreeNode<String, String>(21,"key21","value21",null)
        HashMap.TreeNode<String, String> treeNode30 = new HashMap.TreeNode<String, String>(30,"key30","value30",null)
        HashMap.TreeNode<String, String> treeNode31 = new HashMap.TreeNode<String, String>(31,"key31","value31",null)
        HashMap.TreeNode<String, String> treeNode34 = new HashMap.TreeNode<String, String>(34,"key34","value34",null)
        HashMap.TreeNode<String, String> treeNode37 = new HashMap.TreeNode<String, String>(37,"key37","value37",null)
        treeNode15.left = treeNode7
        treeNode15.right = treeNode30

        treeNode7.left = treeNode3
        treeNode7.right = treeNode9

        treeNode3.left = treeNode1
        treeNode3.right = treeNode4

        treeNode9.left = treeNode8
        treeNode9.right = treeNode14

        treeNode30.left = treeNode18
        treeNode30.right = treeNode34

        treeNode18.left = treeNode16
        treeNode18.right = treeNode21

        treeNode34.left = treeNode31
        treeNode34.right = treeNode37

        when: " print the tree"
        BTreePrinter.printNode(treeNode15)
        then: ""
        // TODO implement then
    }
}