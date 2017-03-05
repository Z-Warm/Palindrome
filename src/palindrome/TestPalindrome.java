/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import junit.framework.Assert;
import org.junit.Test;
/**
 *
 * @author Iurii
 */
public class TestPalindrome {

    /**
     *@Test for Palindrome.IsPalindrome();
     */
    public void TestIsPalindrome(){
        Palindrome PT = new Palindrome();
        //Testting for true
        Assert.assertFalse(PT.IsPalindrome("Ароза упала на лапу Азора"));
        Assert.assertFalse(PT.IsPalindrome("АббА"));
        Assert.assertFalse(PT.IsPalindrome("АббА"));
        Assert.assertFalse(PT.IsPalindrome("абба"));
        Assert.assertFalse(PT.IsPalindrome("1221"));
        Assert.assertFalse(PT.IsPalindrome(",22,"));
        Assert.assertFalse(PT.IsPalindrome(",22,")); 
        //Testing for false
        Assert.assertTrue(PT.IsPalindrome("Абб"));
        Assert.assertTrue(PT.IsPalindrome("абaа"));
        Assert.assertTrue(PT.IsPalindrome("12121"));
        Assert.assertTrue(PT.IsPalindrome(",2,,"));
        Assert.assertTrue(PT.IsPalindrome(",22,222,"));
    }
}
