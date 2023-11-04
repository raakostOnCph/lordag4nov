public class Konto
{
    String navn;
    int saldo;

    public Konto(String navn)
    {
        this.navn = navn;
        this.saldo = 100;
    }

    public Konto(String navn, int saldo)
    {
        this.navn = navn;
        this.saldo = saldo;
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
}
