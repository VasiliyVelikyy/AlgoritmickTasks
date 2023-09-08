package code_wars.eight_kyu.test;



import code_wars.eight_kyu.YesOrNo;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        Assert.assertEquals(YesOrNo.boolToWord(true), "Yes");
        assertEquals(YesOrNo.boolToWord(false), "No");

    }
}