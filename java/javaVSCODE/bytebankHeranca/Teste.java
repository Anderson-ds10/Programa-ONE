package bytebankHeranca;
public class Teste {
    public static void main(String[] args) {
        Funcionario anderson = new Funcionario();
        anderson.setNome("Anderson Silva");
        anderson.setCpf("04503787055");
        anderson.setSalario(3000);

        Gerente marcos = new Gerente();
        marcos.setNome("Marcos Oliveira");
        marcos.setCpf("04842489033");
        marcos.setSenha(12345678);
        marcos.setSalario(5000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(marcos);
        controle.registra(anderson);

        System.out.println(controle.getSoma());
    }
}
