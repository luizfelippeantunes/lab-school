package projeto1v2.menus;

import java.util.Scanner;

import static projeto1v2.reports.Relatorios.*;
import static projeto1v2.repositories.RepositorioAluno.cadastraAluno;
import static projeto1v2.repositories.RepositorioAluno.editaAluno;
import static projeto1v2.repositories.RepositorioPedagogo.*;
import static projeto1v2.repositories.RepositorioProfessor.cadastraProfessor;

public class Menus {

    public static void menuInicial(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("--------------------------------------%n");
            System.out.printf("|          # MENU INICIAL #          |%n");
            System.out.printf("| 1 - Novos cadastros                |%n");
            System.out.printf("| 2 - Editar cadastros               |%n");
            System.out.printf("| 3 - Atendimentos Pedagógicos       |%n");
            System.out.printf("| 4 - Relatórios                     |%n");
            System.out.printf("| 0 - Sair                           |%n");
            System.out.printf("--------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 0:
                    break;
                case 1:
                    menuCadastros(entrada);
                    break;
                case 2:
                    menuEditaCadastros(entrada);
                    break;
                case 3:
                    menuAtendimentosPedagogicos(entrada);
                    break;
                case 4:
                    menuRelatorios(entrada);
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 0);
    }

    private static void menuCadastros(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("--------------------------------------%n");
            System.out.printf("|     # MENU - NOVOS CADASTROS #     |%n");
            System.out.printf("| 1 - Cadastrar um aluno             |%n");
            System.out.printf("| 2 - Cadastrar um professor         |%n");
            System.out.printf("| 3 - Cadastrar um pedagogo          |%n");
            System.out.printf("| 9 - Voltar ao menu inicial         |%n");
            System.out.printf("--------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    cadastraAluno(entrada);
                    break;
                case 2:
                    cadastraProfessor(entrada);
                    break;
                case 3:
                    cadastraPedagogo(entrada);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }

    private static void menuEditaCadastros(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("---------------------------------------%n");
            System.out.printf("|     # MENU - EDITAR CADASTROS #     |%n");
            System.out.printf("| 1 - Alterar status do Aluno         |%n");
            System.out.printf("| 9 - Voltar ao menu inicial          |%n");
            System.out.printf("--------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    editaAluno(entrada);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }

    private static void menuAtendimentosPedagogicos(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("---------------------------------------%n");
            System.out.printf("| # MENU - ATENDIMENTOS PEDAGOGICOS # |%n");
            System.out.printf("| 1 - Iniciar atendimento             |%n");
            System.out.printf("| 2 - Finalizar atendimento           |%n");
            System.out.printf("| 9 - Voltar ao menu inicial          |%n");
            System.out.printf("--------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    iniciaAtendimentoPedagogico(entrada);
                    break;
                case 2:
                    finalizaAtendimentoPedagogico(entrada);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }

    private static void menuRelatorios(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("-----------------------------------------------%n");
            System.out.printf("|            # MENU - RELATÓRIOS #            |%n");
            System.out.printf("| 1 - Relatório de Pessoas                    |%n");
            System.out.printf("| 2 - Relatório de Alunos                     |%n");
            System.out.printf("| 3 - Relatório de Professores                |%n");
            System.out.printf("| 4 - Relatório de Pedagogos                  |%n");
            System.out.printf("| 5 - Aluno com mais atendimentos pedagogicos |%n");
            System.out.printf("| 6 - Pedagogo com mais atendimentos          |%n");
            System.out.printf("| 9 - Voltar ao menu inicial                  |%n");
            System.out.printf("-----------------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    menuRelatorioPessoas(entrada);
                    break;
                case 2:
                    menuRelatorioAlunos(entrada);
                    break;
                case 3:
                    menuRelatorioProfessores(entrada);
                    break;
                case 4:
                    menuRelatorioPedagogos(entrada);
                    break;
                case 5:
                    relatorioAlunoMaisAtendido();
                    break;
                case 6:
                    relatorioPedagogoMaisAtendeu();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }

    private static void menuRelatorioPessoas(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("----------------------------------------------%n");
            System.out.printf("|      # MENU - RELATÓRIOS DE PESSOAS #      |%n");
            System.out.printf("| 1 - Relatório de todas as Pessoas          |%n");
            System.out.printf("| 2 - Relatório de todos os Alunos           |%n");
            System.out.printf("| 3 - Relatório de todos os Professores      |%n");
            System.out.printf("| 4 - Relatório de todos os Pedagogos        |%n");
            System.out.printf("| 9 - Voltar ao menu anterior                |%n");
            System.out.printf("----------------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    relatorioTodasPessoas();
                    break;
                case 2:
                    relatorioTodosAlunos();
                    break;
                case 3:
                    relatorioTodosProfessores();
                    break;
                case 4:
                    relatorioTodosPedagogos();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }

    private static void menuRelatorioAlunos(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("---------------------------------------%n");
            System.out.printf("|   # MENU - RELATÓRIO DE ALUNOS #    |%n");
            System.out.printf("| 1 - Ativos                          |%n");
            System.out.printf("| 2 - Irregulares                     |%n");
            System.out.printf("| 3 - Em Atendimento Pedagógico       |%n");
            System.out.printf("| 4 - Inativos                        |%n");
            System.out.printf("| 5 - Todos                           |%n");
            System.out.printf("| 9 - Voltar ao menu anterior         |%n");
            System.out.printf("--------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    relatorioAlunosAtivos();
                    break;
                case 2:
                    relatorioAlunosIrregulares();
                    break;
                case 3:
                    relatorioAlunosEmAtendimento();
                    break;
                case 4:
                    relatorioAlunosInativos();
                    break;
                case 5:
                    relatorioAlunosTodos();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }

    private static void menuRelatorioProfessores(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("---------------------------------------%n");
            System.out.printf("| # MENU - RELATÓRIO DE PROFESSORES # |%n");
            System.out.printf("| 1 - Front-End                       |%n");
            System.out.printf("| 2 - Back-End                        |%n");
            System.out.printf("| 3 - Full-Stack                      |%n");
            System.out.printf("| 4 - Todos                           |%n");
            System.out.printf("| 9 - Voltar ao menu anterior         |%n");
            System.out.printf("--------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    relatorioProfessoresFront();
                    break;
                case 2:
                    relatorioProfessoresBack();
                    break;
                case 3:
                    relatorioProfessoresFull();
                    break;
                case 4:
                    relatorioProfessoresTodos();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }

    private static void menuRelatorioPedagogos(Scanner entrada) {
        int opcaoMenu = 0;
        do {
            System.out.printf("---------------------------------------%n");
            System.out.printf("|  # MENU - RELATÓRIO DE PEDAGOGOS #  |%n");
            System.out.printf("| 1 - Disponíveis                     |%n");
            System.out.printf("| 2 - Em Atendimento Pedagogico       |%n");
            System.out.printf("| 9 - Voltar ao menu anterior         |%n");
            System.out.printf("--------------------------------------");
            System.out.printf("%nEscolha a opção desejada: ");
            opcaoMenu = Integer.parseInt(entrada.nextLine());
            switch (opcaoMenu) {
                case 1:
                    relatorioPedagogosDisponiveis();
                    break;
                case 2:
                    relatorioPedagogosEmAtendimento();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        } while (opcaoMenu != 9);
    }
}