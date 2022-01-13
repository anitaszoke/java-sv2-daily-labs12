package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadingTeacherTest {

    @Test
    void getHoursByNameTest() {
        assertEquals(24,new ReadingTeacher().getHoursByName("Albatrosz Aladin"));
        assertEquals(22,new ReadingTeacher().getHoursByName("Csincsilla Csilla"));

    }

}