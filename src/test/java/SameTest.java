import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameTest {
    @Test
    public void same1() {
        String str1 = "abc";
        String str2 = "abc";
        assertSame(str1, str2);
    }

    @Test
    public void same2() {
        String str3 = null;
        String str4 = "abc";
        assertSame(str3, str4);
    }

    @Test
    public void same3() {
        String str1 = "Hillel";
        String str2 = "hillel";
        assertSame(str1, str2);
    }

    @Test
    public void same4() {
        String str1 = "TEST";
        String str2 = "TEST";
        assertSame(str1, str2);
    }

    @Test
    public void same5() {
        assertSame("Test", "Test");
    }

    @Test
    public void same6() {
        String str1 = "abc";
        String str2 = "abc";
        assertSame(str1, str2);
    }

    @Test
    public void notSame() {
        String str1 = "abc";
        String str2 = "abc";
        assertNotSame(str1, str2);
    }

    @Test
    public void notSame1() {
        String str1 = "abc3";
        String str2 = "abc";
        assertNotSame(str1, str2);
    }

    @Test
    public void asseNull() {
        String str1 = null;
        assertNull(str1);
    }
    @Test
    public void asseNull1() {
        String str2 = "Test";
        assertNull(str2);
    }
}