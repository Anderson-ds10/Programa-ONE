import botaoConclui from "./componentes/concluiTarefa.js";
import deletaTarefa from "./componentes/deletaTarefa.js";

const novaTarefa = document.querySelector("[data-form-button]");
const input = document.querySelector("[data-form-input]");
const lista = document.querySelector("[data-list]")

const criarTarefa = (evento) => {

    evento.preventDefault();
    
    const valor = input.value;
    const tarefa = document.createElement("li");
    tarefa.classList.add("task");
    const conteudo = `<p class="content">${valor}</p>`;
    
    tarefa.innerHTML = conteudo;

    tarefa.appendChild(botaoConclui());
    tarefa.appendChild(deletaTarefa());
    lista.appendChild(tarefa);
    input.value = " ";
};

novaTarefa.addEventListener("click", criarTarefa);