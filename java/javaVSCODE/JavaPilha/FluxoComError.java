package JavaPilha;

public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception" + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws Minhaexecption {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws Minhaexecption {
        System.out.println("Chamando metodo 2");
        
        throw new Minhaexecption("DEU ERRADO");
        

        //System.out.println("Fim do metodo2");
    }
}