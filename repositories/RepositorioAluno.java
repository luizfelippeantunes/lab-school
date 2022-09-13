package projeto1v2.repositories;

import projeto1v2.models.Aluno;
import projeto1v2.models.Pessoa;

import java.util.List;
import java.util.Scanner;

import static projeto1v2.repositories.RepositorioPessoa.repositorioPessoas;

public class RepositorioAluno {

    public static void cadastraAluno(Scanner entrada) {
        System.out.printf("%nCADASTRO - NOVO ALUNO%n");
        System.out.printf("Digite o nome do aluno: ");
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
        Double notaProcessoSeletivo;
        do {
            System.out.printf("Digite a nota de %s no processo seletivo (0 a 10): ", nome);
            notaProcessoSeletivo = Double.parseDouble(entrada.nextLine());
        } while (notaProcessoSeletivo < 0 || notaProcessoSeletivo > 10);

        Aluno x = new Aluno(nome, telefone, dataNascimento, cpf, notaProcessoSeletivo);
        repositorioPessoas.add(x);
        System.out.printf("%nAluno cadastrado com sucesso.%n");
    }

    public static void editaAluno(Scanner entrada) {
        System.out.printf("%nEDITAR ALUNO - STATUS%n");
        System.out.printf("Digite o codigo do aluno que deseja alterar o status: ");
        int codigo = Integer.parseInt(entrada.nextLine());
        int posicao = posicaoAluno(repositorioPessoas, codigo);
        if (posicao == -1) {
            System.out.println("Aluno não cadastrado.");
        } else {
            Aluno alunoEncontrado = (Aluno) repositorioPessoas.get(posicao);
            System.out.printf("O aluno %s está com a matrícula atualmente no status: %s%n",
                    alunoEncontrado.getNome(), alunoEncontrado.getStatusMatricula());
            System.out.printf("Para qual status deseja alterar: %n1 - Ativo%n2 - Irregular%n3 - Atendimento Pedagogico%n4 - Inativo%n");
            int status = Integer.parseInt(entrada.nextLine());
            if (status == 1) {
                alunoEncontrado.setStatusMatricula("Ativo");
                System.out.println("Status alterado para Ativo.");
            } else if (status == 2) {
                alunoEncontrado.setStatusMatricula("Irregular");
                System.out.println("Status alterado para Irregular.");
            } else if (status == 3) {
                alunoEncontrado.setStatusMatricula("Atendimento Pedagogico");
                System.out.println("Status alterado para Atendimento Pedagogico.");
            } else if (status == 4) {
                alunoEncontrado.setStatusMatricula("Inativo");
                System.out.println("Status alterado para Inativo.");
            } else
                System.out.println("Situação inválida.");
        }
    }

    public static int posicaoAluno(List<Pessoa> repositorioPessoas, int codigo) {
        for (int i = 0; i < repositorioPessoas.size(); i++) {
            if (repositorioPessoas.get(i).getCodigo() == codigo) {
                if (repositorioPessoas.get(i) instanceof Aluno) {
                    return i;
                }
            }
        }
        return -1;
    }
}