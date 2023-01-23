package modelo;

public class CalculadorDeImposto {

    double totalImposto;

    public void registro(Tributavel t) {

        double valor = t.getValorImposto();
        this.totalImposto += valor;
    
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}