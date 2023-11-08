import java.util.*;

public class Main
{
    public static void main(String[] args)
    {


//
//
//        Bank bank = new Bank();
//
//        bank.opretKonto("patrick", "password");
//
//        bank.logOn("patrick", "password");
//
//        System.out.println(bank.getAktivKonto().navn);
//
//        System.out.println(bank.logOn("simone", "jegtagerendramkl.otte 00"));
//
//        try {
//            System.out.println(bank.getAktivKonto().navn);
//        } catch (Exception e) {
//            System.out.println("du er ikke logget ind");
//        }

        Map<String, Integer> integerMap1 = new HashMap<>();
        Map<String, Integer> integerMap2 = new HashMap<>();

        integerMap1.put("nik1", 1);
        integerMap1.put("nik2", 2);
        integerMap1.put("nik3", 3);
        integerMap1.put("nik4", 4);
        integerMap1.put("nik", 8);


        Collection<Integer> collection = integerMap1.values();




        ArrayList <Integer> integers = new ArrayList<Integer>((integerMap1.values()) );

        for (Integer integer : integers) {
            System.out.println(integer);
        }

            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList({1,2,3,4,5}))




    }
}