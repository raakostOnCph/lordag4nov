import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest
{

    Konto konto = new Konto("simone", 139, "hej");

    @Test
    void skiftkode()
    {
        assertEquals(true, konto.skiftkode("hej","sommer", "sommer"));
        assertEquals(false, konto.skiftkode("hej","vinter", "sommer"));
        assertEquals(false, konto.skiftkode("klovn","sommer", "sommer"));
        assertEquals(false, konto.skiftkode("hej","sommer", "vinter"));
        assertEquals(false, konto.skiftkode("klovn","sommer", "vinter"));


    }
}