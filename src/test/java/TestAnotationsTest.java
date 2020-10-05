import org.junit.*;

import static org.junit.Assert.*;
public class TestAnotationsTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("MyTests1.beforeClass");
    }
    @Before
    public void before() {
        System.out.println("MyTests1.before");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("MyTests1.AfterClass");
    }
    @After
    public void after() {
        System.out.println("MyTests1.after");
    }
    @Test
    public void testAnot() {
        String str3 = null;
        String str4 = null;
        assertSame(str3, str4);
    }
    @Test
    public void testAnot2() {
        String str3 = "null";
        String str4 = "null";
        assertSame(str3, str4);
    }
}