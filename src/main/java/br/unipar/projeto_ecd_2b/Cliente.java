package br.unipar.projeto_ecd_2b;

public class Cliente {
    int codigo;
    String nome;
    int dataNascimento;
    int telefone;
    Cliente proximo;

    public Cliente(int codigo, String nome, int dataNascimento, int telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.proximo = null;
    }
}