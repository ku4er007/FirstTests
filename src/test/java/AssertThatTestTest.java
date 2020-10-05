import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;


public class AssertThatTestTest {
    int number = 0;

    @Before
    public void setData() {
        this.number = 9;
        System.out.println("Start test");
    }

    @Test
    public void assertThat1() {
        assertThat("123", is("123"));
    }

    @Test
    public void assertThat2() {
        assertThat(number, is(123));
    }

    @Test
    public void assertThat3() {
        assertThat("123", isA(String.class));
    }

    @Test
    public void assertThat4() {
        assertThat("They are not equal!", "123", is("1234"));
    }

    @After
    public void setData1() {
        System.out.println("Close test");
    }
}
