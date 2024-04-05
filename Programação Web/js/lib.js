function minhaFuncao() {
    alert('Esse é um alerta!');
}

function outraFuncao(pMensagem) {
    alert(pMensagem);
}

function alteraDiv() {
    document.getElementById('div1').innerHTML = "Muda conteúdo";
}

function alteraBG() {
    let vElemento = document.getElementById('mensagem');
    vElemento.style.backgroundColor = "Red";
    vElemento.style.fontFamily = "Verdana";
    vElemento.style.textAlign = "center";
}

function ativaSucesso() {
    let vElemento = document.getElementById('mensagem');
    vElemento.classList.add('sucesso');
    vElemento.classList.remove('erro','cuidado');
}

function ativaErro() {
    let vElemento = document.getElementById('mensagem');
    vElemento.classList.add('erro');
    vElemento.classList.remove('sucesso','cuidado');
}

function ativaCuidado() {
    let vElemento = document.getElementById('mensagem');
    vElemento.classList.add('cuidado');
    vElemento.classList.remove('erro','sucesso');
}

function setInfo() {
    localStorage.setItem("nome","Marcos");
    localStorage.setItem("objeto","{ nome: 'Marcos', emprego: 'Professor'}");
}

function delInfo() {
    localStorage.removeItem("nome");
}