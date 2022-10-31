import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

// const cliente1 = new Cliente();
// cliente1.nome = "Ricardo";
// cliente1.cpf = 1234567890;

// const cliente2 = new Cliente();
// cliente2.nome = "Alice";
// cliente2.cpf = 2345678910;

const ContaCorrenteRicardo = new ContaCorrente();
ContaCorrenteRicardo.cliente = new Cliente;
ContaCorrenteRicardo.cliente.nome = "Ricardo";
ContaCorrenteRicardo.cliente.cpf = 1234567890
ContaCorrenteRicardo.agencia = 1001;
ContaCorrenteRicardo._saldo = 0;

const ContaCorrenteAlice = new ContaCorrente();
ContaCorrenteAlice.cliente = new Cliente;
ContaCorrenteAlice.cliente.nome = "Alice";
ContaCorrenteAlice.cliente.cpf = 2345678910
ContaCorrenteAlice.agencia = 1001;
ContaCorrenteAlice._saldo = 20;

console.log(ContaCorrenteRicardo)
console.log(ContaCorrenteAlice)



