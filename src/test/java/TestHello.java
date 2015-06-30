import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * Created by cyper on 6/30/15.
 */
public class TestHello {

    @Test
    public void testPasses(){
        String expected = "Hello, JUnit!";
        String hello = "Hello, JUnit!";
        assertThat(hello, is(expected));
    }

    @Test
    public void testFails(){
        assertThat(true, is(not(true)));
    }

    @Test
    public void testArray(){
        int[] array1 = new int[]{1,2,3};
        int[] array2 = new int[]{1,2,3};
        assertThat(array1, is(array2));
    }
}
