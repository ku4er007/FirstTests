import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ParamTest {
    @RunWith(Parameterized.class)
    public static class AdditionTest {
        @Parameterized.Parameters(name = "{index}: {0} + {1} = {2}")
        public static Iterable<Object[]> data() {
            return Arrays.asList(new Object[][]{{0, 0, 0}, {1, 1, 2},
                    {3, 2, 5}, {4, 3, 7}});
        }

        @Parameterized.Parameter(0)
        public int firstSummand;

        @Parameterized.Parameter(1)
        public int secondSummand;

        @Parameterized.Parameter(2)
        public int sum;

        @Test
        public void param() {
            assertEquals(sum, firstSummand + secondSummand);
        }

    }
}