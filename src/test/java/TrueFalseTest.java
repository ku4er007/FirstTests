import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TrueFalseTest {

    @Test
    public void evenNumber1() {
        TrueFalse evenNum = new TrueFalse();
        assertTrue(evenNum.evenNumber(4));

    }
    @Test
    public void evenNumber2() {
        TrueFalse evenNum = new TrueFalse();
        assertTrue(evenNum.evenNumber(3));

    }
    @Test
    public void evenNumber3() {
        TrueFalse evenNum = new TrueFalse();
        assertTrue(evenNum.evenNumber(14));

    }
    @Test
    public void evenNumber4() {
        TrueFalse evenNum = new TrueFalse();
        assertTrue(evenNum.evenNumber(104));

    }
    @Test
    public void evenNumber5() {
        TrueFalse evenNum = new TrueFalse();
        assertTrue(evenNum.evenNumber(140));

    }
}