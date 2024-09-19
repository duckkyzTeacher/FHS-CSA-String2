/**
Run this to test your code. I figure this will be easier then just doing it through
the test file
*/

public class String2Driver {
    public static void main(String[] args) {
        String2 string2 = new String2();

        // Testing doubleChar
        System.out.println("doubleChar");
        System.out.println("Input: The, Output: " + string2.doubleChar("The"));
        System.out.println("Input: abc, Output: " + string2.doubleChar("abc"));
        System.out.println("Input: , Output: " + string2.doubleChar(""));

        // Testing countCode
        System.out.println("\ncountCode");
        System.out.println("Input: aaacodebbb, Output: " + string2.countCode("aaacodebbb"));
        System.out.println("Input: cozexxcodecode, Output: " + string2.countCode("cozexxcodecode"));
        System.out.println("Input: abc, Output: " + string2.countCode("abc"));

        // Testing bobThere
        System.out.println("\nbobThere");
        System.out.println("Input: abcbob, Output: " + string2.bobThere("abcbob"));
        System.out.println("Input: bobby, Output: " + string2.bobThere("bobby"));
        System.out.println("Input: xyz, Output: " + string2.bobThere("xyz"));

        // Testing repeatEnd
        System.out.println("\nrepeatEnd");
        System.out.println("Input: Hello, 2, Output: " + string2.repeatEnd("Hello", 2));
        System.out.println("Input: ab, 2, Output: " + string2.repeatEnd("ab", 2));
        System.out.println("Input: xxxx, 3, Output: " + string2.repeatEnd("xxxx", 3));

        // Testing prefixAgain
        System.out.println("\nprefixAgain");
        System.out.println("Input: ababc, Output: " + string2.prefixAgain("ababc"));
        System.out.println("Input: ababc, Output: " + string2.prefixAgain("ababc"));
        System.out.println("Input: ababcabc, Output: " + string2.prefixAgain("ababcabc"));

        // Testing sameStarChar
        System.out.println("\nsameStarChar");
        System.out.println("Input: xy*abc*def, Output: " + string2.sameStarChar("xy*abc*def"));
        System.out.println("Input: xy*ab*cd*ef, Output: " + string2.sameStarChar("xy*ab*cd*ef"));
        System.out.println("Input: *abc*def*, Output: " + string2.sameStarChar("*abc*def*"));

        // Testing starOut
        System.out.println("\nstarOut");
        System.out.println("Input: ab*cd, Output: " + string2.starOut("ab*cd"));
        System.out.println("Input: ab*cd*ef, Output: " + string2.starOut("ab*cd*ef"));
        System.out.println("Input: **, Output: " + string2.starOut("**"));

        // Testing countHi
        System.out.println("\ncountHi");
        System.out.println("Input: abc hi ho hi, Output: " + string2.countHi("abc hi ho hi"));
        System.out.println("Input: hi there, Output: " + string2.countHi("hi there"));
        System.out.println("Input: hello, Output: " + string2.countHi("hello"));

        // Testing endOther
        System.out.println("\nendOther");
        System.out.println("Input: Hiabc, abc, Output: " + string2.endOther("Hiabc", "abc"));
        System.out.println("Input: abc, Hiabc, Output: " + string2.endOther("abc", "Hiabc"));
        System.out.println("Input: abc, xyz, Output: " + string2.endOther("abc", "xyz"));

        // Testing xyBalance
        System.out.println("\nxyBalance");
        System.out.println("Input: aaxbby, Output: " + string2.xyBalance("aaxbby"));
        System.out.println("Input: aaxbbyx, Output: " + string2.xyBalance("aaxbbyx"));
        System.out.println("Input: xaxbby, Output: " + string2.xyBalance("xaxbby"));

        // Testing repeatFront
        System.out.println("\nrepeatFront");
        System.out.println("Input: Chocolate, 4, Output: " + string2.repeatFront("Chocolate", 4));
        System.out.println("Input: abcd, 2, Output: " + string2.repeatFront("abcd", 2));
        System.out.println("Input: a, 1, Output: " + string2.repeatFront("a", 1));

        // Testing xyzMiddle
        System.out.println("\nxyzMiddle");
        System.out.println("Input: abcxyz123, Output: " + string2.xyzMiddle("abcxyz123"));
        System.out.println("Input: abcxyz12, Output: " + string2.xyzMiddle("abcxyz12"));
        System.out.println("Input: xyz123xyz, Output: " + string2.xyzMiddle("xyz123xyz"));

        // Testing oneTwo
        System.out.println("\noneTwo");
        System.out.println("Input: abcdef, Output: " + string2.oneTwo("abcdef"));
        System.out.println("Input: xyzxyz, Output: " + string2.oneTwo("xyzxyz"));
        System.out.println("Input: ab, Output: " + string2.oneTwo("ab"));

        // Testing plusOut
        System.out.println("\nplusOut");
        System.out.println("Input: abcxyz, xyz, Output: " + string2.plusOut("abcxyz", "xyz"));
        System.out.println("Input: aabb, ab, Output: " + string2.plusOut("aabb", "ab"));
        System.out.println("Input: abcdef, xyz, Output: " + string2.plusOut("abcdef", "xyz"));

        // Testing catDog
        System.out.println("\ncatDog");
        System.out.println("Input: catdogcat, Output: " + string2.catDog("catdogcat"));
        System.out.println("Input: catdog, Output: " + string2.catDog("catdog"));
        System.out.println("Input: dogcat, Output: " + string2.catDog("dogcat"));

        // Testing xyzThere
        System.out.println("\nxyzThere");
        System.out.println("Input: abcxyz, Output: " + string2.xyzThere("abcxyz"));
        System.out.println("Input: abcxxyz, Output: " + string2.xyzThere("abcxxyz"));
        System.out.println("Input: xyz, Output: " + string2.xyzThere("xyz"));

        // Testing mixString
        System.out.println("\nmixString");
        System.out.println("Input: abc, 123, Output: " + string2.mixString("abc", "123"));
        System.out.println("Input: abc, 12, Output: " + string2.mixString("abc", "12"));
        System.out.println("Input: abcd, , Output: " + string2.mixString("abcd", ""));

        // Testing repeatSeparator
        System.out.println("\nrepeatSeparator");
        System.out.println("Input: Word, X, 3, Output: " + string2.repeatSeparator("Word", "X", 3));
        System.out.println("Input: abc, b, 3, Output: " + string2.repeatSeparator("abc", "b", 3));
        System.out.println("Input: xyz, X, 1, Output: " + string2.repeatSeparator("xyz", "X", 1));

        // Testing getSandwich
        System.out.println("\ngetSandwich");
        System.out.println("Input: breadjambread, Output: " + string2.getSandwich("breadjambread"));
        System.out.println("Input: breadbread, Output: " + string2.getSandwich("breadbread"));
        System.out.println("Input: breadxyzbread, Output: " + string2.getSandwich("breadxyzbread"));

        // Testing zipZap
        System.out.println("\nzipZap");
        System.out.println("Input: zipzap, Output: " + string2.zipZap("zipzap"));
        System.out.println("Input: zippzap, Output: " + string2.zipZap("zippzap"));
        System.out.println("Input: zaps, Output: " + string2.zipZap("zaps"));

        // Testing wordEnds
        System.out.println("\nwordEnds");
        System.out.println("Input: abcxxabc, abc, Output: " + string2.wordEnds("abcxxabc", "abc"));
        System.out.println("Input: abcxxabc, abc, Output: " + string2.wordEnds("abcxxabc", "abc"));
        System.out.println("Input: abcdef, ghi, Output: " + string2.wordEnds("abcdef", "ghi"));
    }
}
