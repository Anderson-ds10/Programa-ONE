package Tratamentoconexao;

public class TesteConexao {
    
    public static void main(String[] args) {
        
        try (conexao conexao = new conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao!!!");
        }
        
        
        //-----------------------------------------
        /* conexao con = null;

        try {
            con = new conexao();
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao!!!");
        }finally{
            con.close();
        } */
    }
}
