import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class BankTest
{

    Bank bank = new Bank();

    @Test
    void opretKonto()
    {
        assertEquals(true,bank.opret("tau"));
        assertEquals(false,bank.opret("tau"));

    }
}