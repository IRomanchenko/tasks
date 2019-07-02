import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    private Task task = new Task();

    @Test
    void someMetod() {
        assertEquals(42, task.someMetod());
    }
}