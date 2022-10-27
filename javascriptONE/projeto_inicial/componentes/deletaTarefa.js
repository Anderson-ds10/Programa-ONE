const deletaTarefa = () => {
    const botaoDeleta = document.createElement("button")

    botaoDeleta.classList.add("delete-button")
    botaoDeleta.innerText = "Deletar"
    botaoDeleta.addEventListener("click", excluiTarefa)
    return botaoDeleta;
}

const excluiTarefa = (evento) => {
    const botaoDeleta = evento.target

    const tarefaCompleta = botaoDeleta.parentElement

    tarefaCompleta.remove()

    return botaoDeleta
}
export default deletaTarefa