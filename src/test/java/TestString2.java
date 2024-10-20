package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class String1Test. Dont edit or it will mess up your grade :)
 *
 * @author Mr. Johnson
 * @version 9/18/24 v1 (a version number or a date)
 */

public class TestString2 {

    String2 string2 = new String2();

    @Test
    public void doubleCharTest() {
        assertEquals("TThhee", string2.doubleChar("The"));
        assertEquals("aabbcc", string2.doubleChar("abc"));
        assertEquals("", string2.doubleChar(""));
    }

    @Test
    public void countCodeTest() {
        assertEquals(1, string2.countCode("aaacodebbb"));
        assertEquals(2, string2.countCode("cozexxcodecode"));
        assertEquals(0, string2.countCode("abc"));
    }

    @Test
    public void bobThereTest() {
        assertEquals(true, string2.bobThere("abcbob"));
        assertEquals(false, string2.bobThere("bobby"));
        assertEquals(false, string2.bobThere("xyz"));
    }

    @Test
    public void repeatEndTest() {
        assertEquals("lolo", string2.repeatEnd("Hello", 2));
        assertEquals("abab", string2.repeatEnd("ab", 2));
        assertEquals("xxxxxxxxx", string2.repeatEnd("xxxx", 3));
    }

    @Test
    public void prefixAgainTest() {
        assertEquals(true, string2.prefixAgain("ababcxyzabazy"));
        assertEquals(false, string2.prefixAgain("ababc"));
        assertEquals(true, string2.prefixAgain("toy car toyota"));
    }

    @Test
    public void sameStarCharTest() {
        assertEquals(true, string2.sameStarChar("xa*abc*cef"));
        assertEquals(false, string2.sameStarChar("xy*yb*ce*ef"));
        assertEquals(true, string2.sameStarChar("i*iby*yef*f"));
    }

    @Test
    public void starOutTest() {
        assertEquals("ad", string2.starOut("ab*cd"));
        assertEquals("af", string2.starOut("ab*cd*ef"));
        assertEquals("", string2.starOut("**"));
    }

    @Test
    public void countHiTest() {
        assertEquals(2, string2.countHi("abc hi ho hi"));
        assertEquals(1, string2.countHi("hi there"));
        assertEquals(0, string2.countHi("hello"));
    }

    @Test
    public void endOtherTest() {
        assertEquals(true, string2.endOther("Hiabc", "abc"));
        assertEquals(true, string2.endOther("abc", "Hiabc"));
        assertEquals(false, string2.endOther("abc", "xyz"));
    }

    @Test
    public void xyBalanceTest() {
        assertEquals(true, string2.xyBalance("aaxbby"));
        assertEquals(false, string2.xyBalance("aaxbbyx"));
        assertEquals(true, string2.xyBalance("xaxbby"));
    }

    @Test
    public void repeatFrontTest() {
        assertEquals("ChocChocChocChoc", string2.repeatFront("Chocolate", 4));
        assertEquals("abab", string2.repeatFront("abcd", 2));
        assertEquals("a", string2.repeatFront("a", 1));
    }

    @Test
    public void xyzMiddleTest() {
        assertEquals(true, string2.xyzMiddle("abcxyz123"));
        assertEquals(false, string2.xyzMiddle("abcxyz12"));
        assertEquals(false, string2.xyzMiddle("xyz123xyz"));
    }

    @Test
    public void oneTwoTest() {
        assertEquals("bcaefd", string2.oneTwo("abcdef"));
        assertEquals("yzxyzx", string2.oneTwo("xyzxyz"));
        assertEquals("cat", string2.oneTwo("tca"));
    }

    @Test
    public void plusOutTest() {
        assertEquals("---+", string2.plusOut("abcxyz", "xyz"));
        assertEquals("-+-", string2.plusOut("aabb", "ab"));
        assertEquals("------", string2.plusOut("abcdef", "xyz"));
    }

    @Test
    public void catDogTest() {
        assertEquals(false, string2.catDog("catdogcat"));
        assertEquals(true, string2.catDog("catdog"));
        assertEquals(true, string2.catDog("dogcat"));
    }

    @Test
    public void xyzThereTest() {
        assertEquals(true, string2.xyzThere("abcxyz"));
        assertEquals(false, string2.xyzThere("abcxxyz"));
        assertEquals(true, string2.xyzThere("xyz"));
    }

    @Test
    public void mixStringTest() {
        assertEquals("a1b2c3", string2.mixString("abc", "123"));
        assertEquals("a1b2c", string2.mixString("abc", "12"));
        assertEquals("abcd", string2.mixString("abcd", ""));
    }

    @Test
    public void repeatSeparatorTest() {
        assertEquals("WordXWordXWord", string2.repeatSeparator("Word", "X", 3));
        assertEquals("abcbabc", string2.repeatSeparator("abc", "b", 2));
        assertEquals("xyz", string2.repeatSeparator("xyz", "X", 1));
    }

    @Test
    public void getSandwichTest() {
        assertEquals("jam", string2.getSandwich("breadjambread"));
        assertEquals("", string2.getSandwich("breadbread"));
        assertEquals("xyz", string2.getSandwich("breadxyzbread"));
    }

    @Test
    public void zipZapTest() {
        assertEquals("zz", string2.zipZap("zipzap"));
        assertEquals("zpz", string2.zipZap("zippzap"));
        assertEquals("zs", string2.zipZap("zaps"));
    }

    @Test
    public void wordEndsTest() {       
        assertEquals("c13i", string2.wordEnds("abcXY123XYijk", "XY"));
        assertEquals("13", string2.wordEnds("XY123XY", "XY"));
        assertEquals("11", string2.wordEnds("XY1XY", "XY"));
    }
}
