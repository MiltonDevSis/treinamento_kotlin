package br.com.teste.bytebank.model

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int){
        if (admin.autenticar(senha)){
            println("Bem vindo ao banco")
        }else{
            println("Falha na autenticação")
        }
    }
}