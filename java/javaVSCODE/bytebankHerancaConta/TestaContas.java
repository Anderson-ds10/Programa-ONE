package bytebankHerancaConta;
public class TestaContas {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(111, 123);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();
        
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registro(cc);
        calc.registro(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
