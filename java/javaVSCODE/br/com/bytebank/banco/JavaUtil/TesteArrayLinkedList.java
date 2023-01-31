package JavaUtil;


import java.util.LinkedList;
import modelo.Conta;
import modelo.ContaCorrente;

public class TesteArrayLinkedList {

    public static void main(String[] args) {
        
        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(123, 456);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(321, 654);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(6123, 7456);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(8321, 9654);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("*------------------*");

        for(Conta conta : lista){
            System.out.println(conta);
        }
    }
    
}
