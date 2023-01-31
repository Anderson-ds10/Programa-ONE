package testes;

import modelo.Conta;
import modelo.ContaCorrente;

public class TesteContaGuardada {
    
    public static void main(String[] args) {
        
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(123, 456);

        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(321, 654);

        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getRef(0);
        System.out.println(ref.getNumero());

    }
}
