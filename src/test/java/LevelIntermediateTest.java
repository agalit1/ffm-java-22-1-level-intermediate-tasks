import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelIntermediateTest {

    @Test
    public void oneReturnsEins() {
        //given
        int number = 1;

        //when
        String actual = Main.numberAsIntegerReturnsNumberAsString(number);

        //then
        assertEquals("Eins", actual);
    }

    @Test
    public void sixReturnsSechs() {
        //given
        int number = 6;

        //when
        String actual = Main.numberAsIntegerReturnsNumberAsString(number);

        //then
        assertEquals("Sechs", actual);
    }

    @Test
    public void tenReturnsZehn() {
        //given
        int number = 10;

        //when
        String actual = Main.numberAsIntegerReturnsNumberAsString(number);

        //then
        assertEquals("Zehn", actual);
    }


    @Test
    public void testGetSpecialStringBasic() {
        assertEquals("1", Main.getSpecialString(1));
        assertEquals("2", Main.getSpecialString(2));
        assertEquals("7", Main.getSpecialString(7));
    }

    @Test
    public void testGetSpecialStringModulo3() {
        assertEquals("#3", Main.getSpecialString(3));
        assertEquals("#6", Main.getSpecialString(6));
        assertEquals("#12", Main.getSpecialString(12));
    }

    @Test
    public void testGetSpecialStringModulo5() {
        assertEquals("$5", Main.getSpecialString(5));
        assertEquals("$10", Main.getSpecialString(10));
        assertEquals("$20", Main.getSpecialString(20));
    }

    @Test
    public void testGetSpecialStringModulo3and5() {
        assertEquals("#$15", Main.getSpecialString(15));
        assertEquals("#$30", Main.getSpecialString(30));
        assertEquals("#$90", Main.getSpecialString(90));
    }
}
