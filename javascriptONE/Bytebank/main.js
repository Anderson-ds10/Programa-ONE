import { Cliente } from "./Cliente.js";
import { Gerente } from "./Funcionarios/Gerente.js";
import { Diretor } from "./Funcionarios/Diretor.js";
import { SistemaAutenticacao } from "./SistemaAutenticacao.js";

const diretor = new Diretor("Rodrigo", 10000, 1546798535);
diretor.cadastrarSenha("123456789")

const gerente = new Gerente("Marcelo", 5000, 4698345812);
gerente.cadastrarSenha("123456987")

const DiretorEstaLogado = SistemaAutenticacao.login(diretor, "123456789");
const GerenteEstaLogado = SistemaAutenticacao.login(gerente, "123456987");

const cliente = new Cliente("Lais", 4569852345, "789456")
const clienteEstaLogado = SistemaAutenticacao.login(cliente, "789456");
console.log(DiretorEstaLogado)
console.log(GerenteEstaLogado)
console.log(clienteEstaLogado)
