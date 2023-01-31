package testes;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Conta;

public class TesteArrayReferencia {
    
    public static void main(String[] args) {
        
        Conta[] contas = new Conta[5];
        
        ContaCorrente cc1 = new ContaCorrente(123, 145);

        contas[1] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(456,789);

        contas [2] = cc2;
    
        // System.out.println(contas[1].getNumero());

        // Cast exceptionn
        ContaCorrente ref = (ContaCorrente) contas[1];

        System.out.println(ref.getNumero());
    }
}
