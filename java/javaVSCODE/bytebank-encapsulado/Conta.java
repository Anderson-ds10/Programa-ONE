class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;
    static int total;

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito feito com sucesso!");
    }

    void sacar(double valor) {
        if(this.saldo < valor) {
            System.out.println("Você náo tem esse saldo para sacar! Seu saldo é: " + saldo);
        } else {
            this.saldo -= valor;
            System.out.println("Saque feito com sucesso!");
        }
    }

    void tranfere(double valor, Conta destino) { 
        if(this.saldo < valor) {
            System.out.println("Você náo tem esse valor para tranferir! Seu saldo é: " + saldo);
        } else{
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência feita com sucesso!");
        } 
    }

    double Saldo(){
        return this.saldo;
    }
}