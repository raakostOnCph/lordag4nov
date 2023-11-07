import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest
{

    Bank  bank = new Bank();


    @BeforeEach
    void setUp()
    {
        bank.opretKonto("lone","password");
        bank.opretKonto("ida","password");
    }

    @Test
    void opretKonto()
    {

        assertEquals(true,bank.opretKonto("palle","password"));
        assertEquals(false,bank.opretKonto("lone","password"));
    }

    @Test
    void testOpretKonto()
    {
        assertEquals(true, bank.opretKonto("ulla", 122, "password"));
        assertEquals(false, bank.opretKonto("lone", 122, "password"));

    }

    @Test
    void deleteKonto()
    {

        assertEquals(true, bank.slet("lone"));
        assertEquals(false, bank.slet("palle"));

    }

    @Test
    void antal()
    {
        assertEquals(2,bank.antalKontoer());
        bank.opretKonto("palle",1000, "password");
        assertEquals(3,bank.antalKontoer());
        assertEquals(3,bank.antalKontoer());
        bank.slet("palle");
        assertEquals(2,bank.antalKontoer());


    }

    @Test
    void logIn()
    {
        assertEquals(true, bank.logOn("ida","password"));
        assertEquals(false, bank.logOn("palle","password"));
        assertEquals(false, bank.logOn("lone","IloveWillagePeople"));


    }
}