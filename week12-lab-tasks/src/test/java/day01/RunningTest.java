package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.YearMonth;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    Running running = new Running();
    YearMonth date = YearMonth.of(2021, 12);

    @Test
    void readTest() {
        assertEquals(3, running.read(date).size());
    }

    @Test
    void monthlyRunTest() {
        assertEquals(41.2,running.monthlyRun(date));
    }

}