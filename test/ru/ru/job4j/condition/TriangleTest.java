package ru.ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class TriangleTest {
        @Test
        public void whenExist() {
            boolean result = Triangle.exist(2.0, 2.0, 2.0);
            assertThat(result, is(true));
        }

        public void notExist() {
            boolean result = Triangle.exist(12.0, 1111111.0, 4.0);
            assertThat(result, is(false));
        }

}