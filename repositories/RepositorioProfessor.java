package projeto1v2.repositories;

import projeto1v2.models.Pedagogo;
import projeto1v2.models.Pessoa;
import projeto1v2.models.Professor;

import java.util.List;
import java.util.Scanner;

import static projeto1v2.repositories.RepositorioPessoa.repositorioPessoas;

public class RepositorioProfessor {

    public static void cadastraProfessor(Scanner entrada) {
        System.out.printf("%nCADASTRO - NOVO PROFESSOR%n");
        System.out.printf("Digite o nome do professor: ");
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
        int opcaoFormacao;
        String formacaoAcademica = "";
        do {
            System.out.printf("Qual a formação acadêmica de %s:%n" +
                    "1 - Graduação incompleta%n2 - Gradução completa%n3 - Mestrado%n4 - Doutorado%n", nome);
            opcaoFormacao = Integer.parseInt(entrada.nextLine());
            if (opcaoFormacao == 1) {
                formacaoAcademica = "Graduação incompleta";
            }
            if (opcaoFormacao == 2) {
                formacaoAcademica = "Gradução completa";
            }
            if (opcaoFormacao == 3) {
                formacaoAcademica = "Mestrado";
            }
            if (opcaoFormacao == 4) {
                formacaoAcademica = "Doutorado";
            }
        } while (formacaoAcademica.equals(""));
        int opcaoDev;
        String experienciaDev = "";
        do {
            System.out.printf("Qual a experiência de %s como DEV:%n" +
                    "1 - Front-End%n2 - Back-End%n3 - Full-Stack%n", nome);
            opcaoDev = Integer.parseInt(entrada.nextLine());
            if (opcaoDev == 1) {
                experienciaDev = "Front-End";
            }
            if (opcaoDev == 2) {
                experienciaDev = "Back-End";
            }
            if (opcaoDev == 3) {
                experienciaDev = "Full-Stack";
            }
        } while (experienciaDev.equals(""));

        Professor x = new Professor(nome, telefone, dataNascimento, cpf, formacaoAcademica, experienciaDev);
        repositorioPessoas.add(x);
        System.out.printf("%nProfessor cadastrado com sucesso.%n");
    }

    public static int posicaoProfessor(List<Pessoa> repositorioAlunos, int codigo) {
        for (int i = 0; i < repositorioPessoas.size(); i++) {
            if (repositorioPessoas.get(i).getCodigo() == codigo) {
                if (repositorioPessoas.get(i) instanceof Professor) {
                    return i;
                }
            }
        }
        return -1;
    }
}
