import { Conta } from "./Conta/Conta.js";

export class ContaCorrente extends Conta{
    static numeroDeContas = 0;
    constructor(saldoInicial, cliente, agencia){
        super(saldoInicial, cliente, agencia);
        ContaCorrente.numeroDeContas += 1;
    }
    // SOBRESCREVE A CLASSE MÃE
    sacar(valor){
        let taxa = 1.1;
        return this._sacar(valor, taxa);
    }
}