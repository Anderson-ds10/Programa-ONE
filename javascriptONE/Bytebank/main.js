import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente("Ricardo", 1234567890);
const ContaCorrenteRicardo = new ContaCorrente(cliente1, 1001);

const cliente2 = new Cliente("Alice", 2345678910);
const ContaCorrenteAlice = new ContaCorrente(cliente2, 1001);

ContaCorrenteRicardo.depositar(500)
ContaCorrenteRicardo.transferir(250, ContaCorrenteAlice)

console.log(ContaCorrenteRicardo)
console.log(ContaCorrenteAlice)
console.log(ContaCorrente.numeroDeContas)