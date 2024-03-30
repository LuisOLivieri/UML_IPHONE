interface ReprodutorMusical {
    + tocar()
    + pausar()
    + selecionarMusica()
}

interface AparelhoTelefonico {
    + ligar()
    + atender()
    + iniciarCorreioVoz()
}

interface NavegadorInternet {
    + exibirPagina()
    + adicionarNovaAba()
    + atualizarPagina()
}

class iPhone {
    - reprodutorMusical: ReprodutorMusical
    - aparelhoTelefonico: AparelhoTelefonico
    - navegadorInternet: NavegadorInternet
    + iPhone(reprodutorMusical: ReprodutorMusical, aparelhoTelefonico: AparelhoTelefonico, navegadorInternet: NavegadorInternet)
    + tocarMusica()
    + ligarTelefone()
    + abrirNavegador()
}

iPhone *-- ReprodutorMusical
iPhone *-- AparelhoTelefonico
iPhone *-- NavegadorInternet