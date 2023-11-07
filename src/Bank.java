import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Bank
{

    private  Konto aktivKonto = null;

    public Konto getAktivKonto()
    {
        return aktivKonto;
    }

    Map<String, Konto> kontoMap = new TreeMap<>();




    public boolean opretKonto(String s, int i, String password) {

        if (kontoMap.containsKey(s)) {
            return false;
        }

        Konto konto = new Konto(s, i, password);
        kontoMap.put(konto.navn,konto);
        return true;


    }


    public boolean opretKonto(String s, String password) {

        if (kontoMap.containsKey(s)) {
            return false;
        }

        Konto konto = new Konto(s, password);
        kontoMap.put(konto.navn,konto);
        return true;


    }


    public boolean slet(String s)
    {
        if (kontoMap.containsKey(s)) {
            kontoMap.remove(s);
            return true;
        }

        return false;
    }

    public int antalKontoer()
    {
        return kontoMap.size();

    }

    public boolean logOn(String  s, String password){

       if( !kontoMap.containsKey(s) ) {

           aktivKonto = null;
           return false;
       }

       aktivKonto = kontoMap.get(s);

       if (!aktivKonto.getPassword().equals(password)) {
           aktivKonto = null;
           return false;
       }

        return true;

    }



}
