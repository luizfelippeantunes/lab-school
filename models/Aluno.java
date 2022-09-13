package projeto1v2.models;

public class Aluno extends Pessoa implements AtendimentoPedagogico {

    private String statusMatricula;
    private double notaProcessoSeletivo;
    private int qtdAtendimentosPedagogicos;

    public Aluno(String nome, String telefone, String dataNascimento, String cpf, double notaProcessoSeletivo) {
        super(nome, telefone, dataNascimento, cpf);
        this.notaProcessoSeletivo = notaProcessoSeletivo;
        this.statusMatricula = "Ativo";
        this.qtdAtendimentosPedagogicos = 0;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public double getNotaProcessoSeletivo() {
        return notaProcessoSeletivo;
    }

    public int getQtdAtendimentosPedagogicos() {
        return qtdAtendimentosPedagogicos;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    @Override
    public void incrementoAtendimentoPedagogico() {
        this.qtdAtendimentosPedagogicos++;
    }

    @Override
    public void iniciaAtendimentoPedagogico() {
        this.statusMatricula = "Atendimento Pedagogico";
    }

    @Override
    public void finalizaAtendimentoPedagogico() {
        this.statusMatricula = "Ativo";
        this.incrementoAtendimentoPedagogico();
    }

    public String impressaoAluno() {
        return "Código: " + super.codigo + ", Nome: " + super.nome + ", Nota: " + this.notaProcessoSeletivo +
                ", Total de Atendimentos pedagógicos: " + qtdAtendimentosPedagogicos + ".";
    }
}