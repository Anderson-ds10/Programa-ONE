package JavaPilha;

public class TestaContaComEx {

    public static void main(String[] args){

        Conta c = new Conta();
        try{
            c.deposita();
        } catch(Minhaexecption ex){
            System.out.println("Tratamento .... ");
        }


    }

}
