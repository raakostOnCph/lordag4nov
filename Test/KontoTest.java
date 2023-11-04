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
}