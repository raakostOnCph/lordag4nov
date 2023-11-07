import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {




        Bank bank = new Bank();

        bank.opretKonto("patrick", "password");

        bank.logOn("patrick", "password");

        System.out.println(bank.getAktivKonto().navn);

        System.out.println(bank.logOn("simone", "jegtagerendramkl.otte 00"));

        try {
            System.out.println(bank.getAktivKonto().navn);
        } catch (Exception e) {
            System.out.println("du er ikke logget ind");
        }


    }
}