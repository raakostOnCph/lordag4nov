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
}
