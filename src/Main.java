import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {

        Konto [] kontos = new Konto[3];

        kontos[0] = new Konto("patrick");
        kontos[1] = new Konto("nikolaj");
        kontos[2] = new Konto("steen");

     //   kontos[1] = null;

        System.out.println("gammelt array");

        for (int i = 0; i < kontos.length; i++) {

            System.out.println(kontos[i].navn);
        }




        ArrayList<Konto> kontoArrayList = new ArrayList<>(Arrays.asList(kontos));

        kontoArrayList.add(new Konto("simone", 117));

      //  kontoArrayList.remove(1);

        System.out.println("arrayliste");

        for (Konto k : kontoArrayList) {

            System.out.println(k.navn);
        }


        Map<String, Konto> kontoMap = new TreeMap<>();

        for (Konto k : kontoArrayList) {

            kontoMap.put(k.navn, k);

        }

        System.out.println("map kun nøglerne");

        for (String s : kontoMap.keySet()) {

            System.out.println(s);
        }


        System.out.println("værdien dvs kontoen ud");
        for (Konto value : kontoMap.values()) {

            System.out.println(value.navn + " : " + value.saldo);

        }





    }
}