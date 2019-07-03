import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TaskTest {
    private Task task = new Task();

    @Test
    void largestTriangle() {
        List<Integer> result = task.largestTriangle(Arrays.asList(1, 34, 4, 5, 3, 10, 100, 1));
        assertEquals(Arrays.asList(5,4,3), result);
    }

    @Test
    void singleTriangle() {
        List<Integer> result = task.largestTriangle(Arrays.asList(1, 1, 1));
        assertEquals(Arrays.asList(1,1,1), result);
    }

    @Test
    void noTriangle() {
        assertThrows(IllegalArgumentException.class, () -> task.largestTriangle(Arrays.asList(1, 34, 4, 5, 1, 10, 100)));
    }
}