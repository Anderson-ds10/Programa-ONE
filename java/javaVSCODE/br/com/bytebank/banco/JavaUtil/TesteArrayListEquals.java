package JavaUtil;

import java.util.ArrayList;
import modelo.Conta;
import modelo.ContaCorrente;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(123, 456);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(321, 654);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(321, 654);
        Boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista){
            System.out.println(conta);
        }
    }
    
}
