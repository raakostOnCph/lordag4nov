public class Konto
{
    String navn;
    int saldo;

    private String password;

    public String getPassword()
    {
        return password;
    }

    public Konto(String navn, String password)
    {
        this.navn = navn;
        this.saldo = 100;
        this.password = password;

    }

    public Konto(String navn, int saldo ,String password)
    {
        this.navn = navn;
        this.saldo = saldo;
        this.password = password;
    }

    public int insæt(int i)
    {

        if (i >= 0) {
            saldo = saldo + i;
        }

        return saldo;
    }

    public int hæv(int i)
    {


        if (i >= 50 ) {
            saldo = saldo - i;
        }

        return saldo;
    }

    public boolean skiftkode(String gammel, String ny1, String ny2 ) {

//        if (!password.equals(gammel)) {
//            return false;
//        }
//        if (!ny1.equals(ny2)) {
//            return false;
//        }
//                password = ny1;
//                return true;


        if (password.equals(gammel)) {

            if (ny1.equals(ny2)) {
                password = ny1;
                return true;
            }
        }
        return false;




    }
}
