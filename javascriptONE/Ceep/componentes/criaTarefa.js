import botaoConclui from "./concluiTarefa.js";
import deletaTarefa from "./deletaTarefa.js";
import { carregaTarefa } from "./carregaTarefa.js";

const novaTarefa = document.querySelector("[data-form-button]");
const input = document.querySelector("[data-form-input]");
const calendario = document.querySelector("[data-form-date]");

export const handleNovoItem = (evento) => {
    evento.preventDefault();

    const tarefas = JSON.parse(localStorage.getItem("tarefas")) || [];

    const valor = input.value;
    const data = moment(calendario.value);
    const horario = data.format("HH:mm")
    const dataFormatada = data.format('DD/MM/YYYY');
    const concluida = false;

    const dados = {
        valor, 
        dataFormatada,
        horario,
        concluida
    };

    const tarefasAtualizads = [...tarefas, dados]

    localStorage.setItem("tarefas", JSON.stringify(tarefasAtualizads))

    input.value = " ";
    carregaTarefa()
}

export const Tarefa = ( {valor, horario, concluida}, id) => {
    const tarefa = document.createElement("li");
    const conteudo = `<p class="content">${horario} * ${valor}</p>`;

    if(concluida){
        tarefa.classList.add("done");
    }
    tarefa.classList.add("task");

    tarefa.innerHTML = conteudo;
    tarefa.appendChild(botaoConclui(carregaTarefa, id));
    tarefa.appendChild(deletaTarefa(carregaTarefa, id));

    return tarefa;
};

novaTarefa.addEventListener("click", handleNovoItem);