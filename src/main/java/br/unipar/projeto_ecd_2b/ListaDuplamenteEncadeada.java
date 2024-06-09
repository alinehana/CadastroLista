package br.unipar.projeto_ecd_2b;

import static br.unipar.projeto_ecd_2b.Projeto_ECD_2B.s;
import exception.ExceptionLista;

public class ListaDuplamenteEncadeada {
    Cliente inicio;
    Cliente fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(Cliente cliente) {
        if (inicio == null) {
            inicio = cliente;
            fim = cliente;
        } else {
            fim.proximo = cliente;
            fim = cliente;
        }
    }

    public void excluir(int codigo) throws Exception{
        Cliente atual = inicio;
        Cliente anterior = null;
        while (atual!= null) {
            if (atual.codigo == codigo) {
                if (anterior == null) {
                    inicio = atual.proximo;
                } else {
                    anterior.proximo = atual.proximo;
                }
                if (atual == fim) {
                    fim = anterior;
                }
                System.out.println("Cadastro excluído: " + atual.codigo + " - " + atual.nome);
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }
         throw new ExceptionLista();
    }

    public void alterar(int codigo) throws ExceptionLista{
        Cliente atual = inicio;
        while (atual!= null) {
            if (atual.codigo == codigo) {
                System.out.println("Novo nome: ");
                String novoNome = s.next();
                System.out.println("Nova data de nascimento: ");
                int novaDataNascimento = s.nextInt();
                System.out.println("Novo telefone: ");
                int novoTelefone = s.nextInt();
                atual.nome = novoNome;
                atual.dataNascimento = novaDataNascimento;
                atual.telefone = novoTelefone;
                System.out.println("Cadastro alterado com sucesso!");
                return;
            }
            atual = atual.proximo;
        }
         throw new ExceptionLista();
    }

    public void localizar(int codigo) throws ExceptionLista{
        Cliente atual = inicio;
        while (atual!= null) {
            if (atual.codigo == codigo) {
                System.out.println("Cadastro encontrado: " + atual.codigo + " - " + atual.nome + " - " + atual.dataNascimento + " - " + atual.telefone);
                return;
            }
            atual = atual.proximo;
        }
         throw new ExceptionLista();
    }

    public void exibirTodos() throws ExceptionLista{
        Cliente atual = inicio;
        while (atual!= null) {
            System.out.println("Cadastro: " + atual.codigo + " - " + atual.nome + " - " + atual.dataNascimento + " - " + atual.telefone);
            atual = atual.proximo;
        }
         throw new ExceptionLista();
    }
}