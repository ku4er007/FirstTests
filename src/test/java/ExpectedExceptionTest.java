import org.junit.Test;
public class ExpectedExceptionTest {

    @Test
    public void except1() {
        int i = 1 / 1;
        System.out.println(i);
    }
    @Test (expected = ArithmeticException.class)
    public void except2(){
        int i = 1 / 0;
        System.out.println(i);
    }
    @Test(expected = ArithmeticException.class)
    public void except3() {
        System.out.println("running testMethod3");
    }
}