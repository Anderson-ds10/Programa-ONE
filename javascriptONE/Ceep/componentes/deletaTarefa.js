const excluiTarefa = (atualiza, id) => {
    const index = id;
    const tarefasCadastradas = JSON.parse(localStorage.getItem("tarefas"))

    tarefasCadastradas.splice(index, 1)

    localStorage.setItem("tarefas", JSON.stringify(tarefasCadastradas))

    atualiza()
}

const deletaTarefa = (atualiza, id) => {
    const botaoDeleta = document.createElement("button")

    botaoDeleta.classList.add("delete-button")
    botaoDeleta.innerText = "Deletar"
    botaoDeleta.addEventListener("click", () => excluiTarefa(atualiza, id))
    return botaoDeleta;
}

export default deletaTarefa