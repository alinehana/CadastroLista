package br.unipar.projeto_ecd_2b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Projeto_ECD_2B {
    static Scanner s = new Scanner(System.in);
    static ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

    public static void main(String[] args) throws Exception{
            boolean teste=true;
            
            while(teste){
                try{
                System.out.println("====================");
                System.out.println("Menu");
                System.out.println("1 - Gravar novo cadastro");
                System.out.println("2 - Excluir cadastro");
                System.out.println("3 - Alterar cadastro");
                System.out.println("4 - Localizar cadastro");
                System.out.println("5 - Exibir todos os cadastros");
                System.out.println("6 - Sair");
                System.out.println("====================");
                int opcao = s.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Código: ");
                        int codigo = s.nextInt();
                        System.out.println("Nome: ");
                        String nome = s.next();
                        System.out.println("Data de nascimento: ");
                        int dataNascimento = s.nextInt();
                        System.out.println("Telefone: ");
                        int telefone = s.nextInt();
                        Cliente cliente = new Cliente(codigo, nome, dataNascimento, telefone);
                        lista.inserir(cliente);
                        System.out.println("Cadastro gravado com sucesso!");
                        break;
                    case 2:
                        System.out.print("Código do cadastro a excluir: ");
                        int codigoExcluir = s.nextInt();
                        s.nextLine();
                        lista.excluir(codigoExcluir);
                        break;
                    case 3:
                        System.out.print("Código do cadastro a alterar: ");
                        int codigoAlterar = s.nextInt();
                        s.nextLine();
                        lista.alterar(codigoAlterar);
                        break;
                    case 4:
                        System.out.print("Código do cadastro a localizar: ");
                        int codigoLocalizar = s.nextInt();
                        s.nextLine();
                        lista.localizar(codigoLocalizar);
                        break;
                    case 5:
                        lista.exibirTodos();
                        break;
                    case 6:
                        System.out.println(" ");
                        return;
                            }
                        }
                    catch (InputMismatchException ex){
                            System.out.println("Digite um valor valido");
                            } catch (Exception ex){
                            System.out.println(ex.getMessage());
                            } finally {                                                                                                         //Bloco finally
                                System.out.println("Finalizado");
                        }
                    }  
                }
            }
