import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;

public class AssertThatTest {
    int number = 0;

    @Before
    public void setData() {
        this.number = 9;
        System.out.println("Start test");
    }

    @Test
    public void assertThatEqual() {
        assertThat("123", is("123"));
    }

    @Test
    public void assertThatNotEqual() {
        assertThat(number, is(123));
    }

    @Test
    public void assertThatObject() {
        assertThat("123", isA(String.class));
    }

    @Test
    public void assertThatWMessage() {
        assertThat("They are not equal!", "123", is("1234"));
    }

    @After
    public void setData1() {
        System.out.println("Close test");
    }
}


