public class CriaConta {
    public static void main(String[] args) {
        Cliente anderson = new Cliente();
        anderson.nome = "Anderson Silva";
        anderson.cpf = "045.037.870-55";
        anderson.profissao = "Programador";
        Conta contaDoAnderson = new Conta(2484, 267708);
        contaDoAnderson.titular = anderson;
        contaDoAnderson.depositar(200);
        
        Cliente bruna = new Cliente();
        bruna.nome = "Bruna Ferrari";
        bruna.cpf = "024.574.500-98";
        bruna.profissao = "Suporte";
        Conta contaDaBruna = new Conta(2484, 267718);
        contaDaBruna.titular = bruna;
        contaDaBruna.depositar(50);

        System.out.println(contaDaBruna.titular.nome);
        System.out.println(contaDaBruna.Saldo());

        System.out.println(contaDoAnderson.titular.nome);
        System.out.println(contaDoAnderson.Saldo());
    }
}
