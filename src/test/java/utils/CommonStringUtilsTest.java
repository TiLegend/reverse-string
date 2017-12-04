package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Tlegen on 05.12.2017.
 */
public class CommonStringUtilsTest {
    CommonStringUtils commonStringUtils = new CommonStringUtils();

    //check string with even size
    @Test
    public void checkReverseStringEvenSize(){
        String originalString = "google";
        String reverseString = "elgoog";
        assertEquals(originalString.length() % 2, 0);
        assertEquals(commonStringUtils.reverse(originalString), reverseString);
    }

    //check string with odd size
    @Test
    public void checkReverseStringOddSize(){
        String originalString = "bingo";
        String reverseString = "ognib";
        assertEquals(originalString.length() % 2, 1);
        System.out.println(commonStringUtils.reverse(originalString));
        assertEquals(commonStringUtils.reverse(originalString), reverseString);
    }
}
