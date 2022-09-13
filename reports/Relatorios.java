package projeto1v2.reports;

import projeto1v2.models.Aluno;
import projeto1v2.models.Pedagogo;
import projeto1v2.models.Professor;

import static projeto1v2.repositories.RepositorioPessoa.*;

public class Relatorios {

    public static void relatorioTodasPessoas() {
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de todas as pessoas:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                System.out.println(repositorioPessoas.get(i));
            }
        }
    }

    public static void relatorioTodosAlunos() {
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de todos os alunos:");
            int contador = 0;
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Aluno) {
                    contador++;
                    System.out.println(repositorioPessoas.get(i));
                }
            }
            if (contador == 0) {
                System.out.println("Nenhum aluno cadastrado.");
            }
        }
    }

    public static void relatorioTodosProfessores() {
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de todos os professores:");
            int contador = 0;
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Professor) {
                    contador++;
                    System.out.println(repositorioPessoas.get(i));
                }
            }
            if (contador == 0) {
                System.out.println("Nenhum professor cadastrado.");
            }
        }
    }

    public static void relatorioTodosPedagogos() {
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de todos os pedagogos:");
            int contador = 0;
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Pedagogo) {
                    contador++;
                    System.out.println(repositorioPessoas.get(i));
                }
            }
            if (contador == 0) {
                System.out.println("Nenhum pedagogo cadastrado.");
            }
        }
    }

    public static void relatorioAlunosAtivos() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de alunos ativos:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Aluno alunoEncontrado) {
                    if (alunoEncontrado.getStatusMatricula().equals("Ativo")) {
                        contador++;
                        System.out.println(alunoEncontrado.impressaoAluno());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum aluno com a matrícula ativa.");
            }
        }
    }

    public static void relatorioAlunosIrregulares() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de alunos irregulares:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Aluno alunoEncontrado) {
                    if (alunoEncontrado.getStatusMatricula().equals("Irregular")) {
                        contador++;
                        System.out.println(alunoEncontrado.impressaoAluno());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum aluno com a matrícula irregular.");
            }
        }
    }

    public static void relatorioAlunosEmAtendimento() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de alunos em atendimento pedagógico:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Aluno alunoEncontrado) {
                    if (alunoEncontrado.getStatusMatricula().equals("Atendimento Pedagogico")) {
                        contador++;
                        System.out.println(alunoEncontrado.impressaoAluno());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum aluno em atendimento pedagógico.");
            }
        }
    }


    public static void relatorioAlunosInativos() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de alunos inativos:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Aluno alunoEncontrado) {
                    if (alunoEncontrado.getStatusMatricula().equals("Inativo")) {
                        contador++;
                        System.out.println(alunoEncontrado.impressaoAluno());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum aluno com a matrícula inativa.");
            }
        }
    }

    public static void relatorioAlunosTodos() {
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de alunos cadastrados:");
            int contador = 0;
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Aluno alunoEncontrado) {
                    contador++;
                    System.out.println(alunoEncontrado.impressaoAluno());
                }
            }
            if (contador == 0) {
                System.out.println("Nenhum aluno cadastrado.");
            }
        }
    }

    public static void relatorioProfessoresFront() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de professores Front-End:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Professor professorEncontrado) {
                    if (professorEncontrado.getExperienciaDev().equals("Front-End")) {
                        contador++;
                        System.out.println(professorEncontrado.impressaoProfessor());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum professor Front-End cadastrado.");
            }
        }
    }

    public static void relatorioProfessoresBack() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            System.out.println("Lista de professores Back-End:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Professor professorEncontrado) {
                    if (professorEncontrado.getExperienciaDev().equals("Back-End")) {
                        contador++;
                        System.out.println(professorEncontrado.impressaoProfessor());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum professor Back-End cadastrado.");
            }
        }
    }

    public static void relatorioProfessoresFull() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de professores Full-Stack:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Professor professorEncontrado) {
                    if (professorEncontrado.getExperienciaDev().equals("Full-Stack")) {
                        contador++;
                        System.out.println(professorEncontrado.impressaoProfessor());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum professor Full-Stack cadastrado.");
            }
        }
    }

    public static void relatorioProfessoresTodos() {
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Lista de professores cadastrados:");
            int contador = 0;
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Professor professorEncontrado) {
                    contador++;
                    System.out.println(professorEncontrado.impressaoProfessor());
                }
            }
            if (contador == 0) {
                System.out.println("Nenhum professor cadastrado.");
            }
        }
    }

    public static void relatorioPedagogosDisponiveis() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Pedagogos disponíveis:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Pedagogo pedagogoEncontrado) {
                    if (!pedagogoEncontrado.isEmAtendimentoPedagogico()) {
                        contador++;
                        System.out.println(pedagogoEncontrado.impressaoPedagogo());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum pedagogo disponível.");
            }
        }
    }

    public static void relatorioPedagogosEmAtendimento() {
        int contador = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            System.out.println("Pedagogos disponíveis:");
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Pedagogo pedagogoEncontrado) {
                    if (pedagogoEncontrado.isEmAtendimentoPedagogico()) {
                        contador++;
                        System.out.println(pedagogoEncontrado.impressaoPedagogo());
                    }
                }
            }
            if (contador == 0) {
                System.out.println("Não há nenhum pedagogo disponível.");
            }
        }
    }

    public static void relatorioAlunoMaisAtendido() {
        int alunoMaisAtendido = -1;
        int qtdAtendimentos = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Aluno alunoEncontrado) {
                    if (alunoEncontrado.getQtdAtendimentosPedagogicos() > qtdAtendimentos) {
                        qtdAtendimentos = alunoEncontrado.getQtdAtendimentosPedagogicos();
                        alunoMaisAtendido = i;
                    }
                }
            }
            if (alunoMaisAtendido == -1) {
                System.out.println("Nenhum aluno recebeu atendimento pedagógico.");
            } else {
                System.out.println("Aluno com mais atendimentos pedagógicos:");
                System.out.println(repositorioPessoas.get(alunoMaisAtendido));
            }
        }
    }

    public static void relatorioPedagogoMaisAtendeu() {
        int pedagogoMaisAtendeu = -1;
        int qtdAtendimentos = 0;
        if (repositorioPessoas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada no sistema.");
        } else {
            for (int i = 0; i < repositorioPessoas.size(); i++) {
                if (repositorioPessoas.get(i) instanceof Pedagogo pedagogoEncontrado) {
                    if (pedagogoEncontrado.getQtdAtendimentosPedagogicos() > qtdAtendimentos) {
                        qtdAtendimentos = pedagogoEncontrado.getQtdAtendimentosPedagogicos();
                        pedagogoMaisAtendeu = i;
                    }
                }
            }
            if (pedagogoMaisAtendeu == -1) {
                System.out.println("Nenhum pedagogo efetuou atendimentos.");
            } else {
                System.out.println("Pedagogo com mais atendimentos pedagógicos:");
                System.out.println(repositorioPessoas.get(pedagogoMaisAtendeu));
            }
        }
    }
}