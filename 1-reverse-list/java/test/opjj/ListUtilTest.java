package opjj;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListUtilTest {

    @Test
    public void reverseOfEmptyListIsEmptyList() {
        List<Integer> list = new ArrayList<Integer>();

        assertEquals(list, ListUtil.reverse(list));
    }

    @Test
    public void singletonListIsAlreadyReversed() {
        List<Integer> list = Arrays.asList(42);

        assertEquals(list, ListUtil.reverse(list));
    }

    @Test
    public void reverseOfListInteger() {
        List<Integer> list     = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        assertEquals(expected, ListUtil.reverse(list));
    }

    @Test
    public void reverseOfListString() {
        List<String> list     = Arrays.asList("foo", "bar", "baz");
        List<String> expected = Arrays.asList("baz", "bar", "foo");

        assertEquals(expected, ListUtil.reverse(list));
    }

}
