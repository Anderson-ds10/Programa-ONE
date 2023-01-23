package testes;

import modelo.*;

public class TesteContaEX {
    
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 3214);
        
        conta.deposita(200);

        try {
            conta.saca(210);
        } catch (SaldoInsuficienteEX ex) {
            System.out.println(ex.getMessage());
        } 
        
        System.out.println(conta.getSaldo());
    }
}
