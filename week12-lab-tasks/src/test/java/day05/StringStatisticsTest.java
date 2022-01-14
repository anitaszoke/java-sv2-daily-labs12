package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void getCharacterTest() {
        StringStatistics ss = new StringStatistics();

        assertEquals(3,ss.getCharacter("alma").entrySet().size());
        assertEquals(2,ss.getCharacter("alma").get("a"));
        assertEquals(1,ss.getCharacter("alma").get("m"));
    }

}