import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest
{

    Konto konto = new Konto("Oliver", 100);

    @Test
    void insert()
    {
        assertEquals(100,konto.insæt(0));
        assertEquals(150,konto.insæt(50));

    }

    @Test
    void insertNegativ()
    {

        assertEquals(100, konto.insæt(-100));

    }

    @Test
    void hævPosetivt()
    {
        assertEquals(100, konto.hæv(0));

    }

    @Test
    void transaktionsStørrelseIHav()
    {


        assertEquals(100, konto.hæv(49));
        assertEquals(50, konto.hæv(50));
        konto.insæt(50);
        assertEquals(49, konto.hæv(51));

    }
}