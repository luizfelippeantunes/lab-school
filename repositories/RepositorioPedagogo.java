package projeto1v2.repositories;

import projeto1v2.models.Aluno;
import projeto1v2.models.Pedagogo;
import projeto1v2.models.Pessoa;

import java.util.List;
import java.util.Scanner;

import static projeto1v2.repositories.RepositorioPessoa.repositorioPessoas;

public class RepositorioPedagogo {

    public static void cadastraPedagogo(Scanner entrada) {
        System.out.printf("%nCADASTRO - NOVO PEDAGOGO%n");
        System.out.printf("Digite o nome do Pedagogo: ");
        String nome = entrada.nextLine();
        nome = nome.trim();
        System.out.printf("Digite um telefone para contato: ");
        String telefone = entrada.nextLine();
        telefone = telefone.trim();
        System.out.printf("Digite a data de nascimento de %s: ", nome);
        String dataNascimento = entrada.nextLine();
        dataNascimento = dataNascimento.trim();
        System.out.printf("Digite o CPF de %s: ", nome);
        String cpf = entrada.nextLine();
        cpf = cpf.trim();

        Pedagogo x = new Pedagogo(nome, telefone, dataNascimento, cpf);
        repositorioPessoas.add(x);
        System.out.printf("%nPedagogo cadastrado com sucesso.%n");
    }

    public static void iniciaAtendimentoPedagogico(Scanner entrada) {
        System.out.printf("%nATENDIMENTO PEDAGÓGICO%n");
        System.out.printf("Digite o código do pedagogo que irá realizar o atendimento: ");
        int codigoPedagogo = Integer.parseInt(entrada.nextLine());
        int posicaoPedagogo = posicaoPedagogo(repositorioPessoas, codigoPedagogo);
        if (posicaoPedagogo == -1) {
            System.out.println("Pedagogo não cadastrado.");
        } else {
            Pedagogo pedagogoEncontrado = (Pedagogo) repositorioPessoas.get(posicaoPedagogo);
            if (pedagogoEncontrado.isEmAtendimentoPedagogico()) {
                System.out.printf("O pedagogo selecionado já está em um atendimento.%n");
            } else {
                System.out.printf("Digite o código do aluno que irá realizar o atendimento: ");
                int codigoAluno = Integer.parseInt(entrada.nextLine());
                int posicaoAluno = RepositorioAluno.posicaoAluno(repositorioPessoas, codigoAluno);
                if (posicaoAluno == -1) {
                    System.out.println("Aluno não cadastrado.");
                } else {
                    Aluno alunoEncontrado = (Aluno) repositorioPessoas.get(posicaoAluno);
                    if (alunoEncontrado.getStatusMatricula().equals("Atendimento Pedagógico")) {
                        System.out.println("O aluno selecionado já está em um atendimento.%n");
                    } else {
                        pedagogoEncontrado.iniciaAtendimentoPedagogico();
                        alunoEncontrado.iniciaAtendimentoPedagogico();
                        System.out.printf("%nAtendimento iniciado com sucesso.%n");
                    }
                }
            }
        }
    }

    public static void finalizaAtendimentoPedagogico
            (Scanner entrada) {
        System.out.printf("%nATENDIMENTO PEDAGÓGICO%n");
        System.out.print("Digite o código do pedagogo que irá realizar o atendimento: ");
        int codigoPedagogo = Integer.parseInt(entrada.nextLine());
        int posicaoPedagogo = posicaoPedagogo(repositorioPessoas, codigoPedagogo);
        if (posicaoPedagogo == -1) {
            System.out.println("Pedagogo não cadastrado.");
        } else {
            Pedagogo pedagogoEncontrado = (Pedagogo) repositorioPessoas.get(posicaoPedagogo);
            if (!pedagogoEncontrado.isEmAtendimentoPedagogico()) {
                System.out.println("O pedagogo " + pedagogoEncontrado.getNome() +
                        " não está realizando atendimentos no momento.");
            } else {
                System.out.print("Digite o código do aluno que irá realizar o atendimento: ");
                int codigoAluno = Integer.parseInt(entrada.nextLine());
                int posicaoAluno = RepositorioAluno.posicaoAluno(repositorioPessoas, codigoAluno);
                if (posicaoAluno == -1) {
                    System.out.println("Aluno não cadastrado.");
                } else {
                    Aluno alunoEncontrado = (Aluno) repositorioPessoas.get(posicaoAluno);
                    if (!alunoEncontrado.getStatusMatricula().equals("Atendimento Pedagogico")) {
                        System.out.println("O aluno " + alunoEncontrado.getNome() +
                                " não está em atendimento no momento.");
                    } else {
                        pedagogoEncontrado.finalizaAtendimentoPedagogico();
                        alunoEncontrado.finalizaAtendimentoPedagogico();
                        System.out.printf("%nAtendimento finalizado com sucesso.%n");
                    }
                }
            }
        }
    }

    public static int posicaoPedagogo(List<Pessoa> repositorioPessoas, int codigo) {
        for (int i = 0; i < repositorioPessoas.size(); i++) {
            if (repositorioPessoas.get(i).getCodigo() == codigo) {
                if (repositorioPessoas.get(i) instanceof Pedagogo) {
                    return i;
                }
            }
        }
        return -1;
    }
}
