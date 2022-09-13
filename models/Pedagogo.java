package projeto1v2.models;

public class Pedagogo extends Pessoa implements AtendimentoPedagogico {

    private int qtdAtendimentosPedagogicos;
    private boolean emAtendimentoPedagogico;

    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
        this.qtdAtendimentosPedagogicos = 0;
        this.emAtendimentoPedagogico = false;
    }

    public boolean isEmAtendimentoPedagogico() {
        return emAtendimentoPedagogico;
    }

    public void setEmAtendimentoPedagogico(boolean emAtendimentoPedagogico) {
        this.emAtendimentoPedagogico = emAtendimentoPedagogico;
    }

    public int getQtdAtendimentosPedagogicos() {
        return qtdAtendimentosPedagogicos;
    }

    @Override
    public void incrementoAtendimentoPedagogico() {
        this.qtdAtendimentosPedagogicos++;
    }

    @Override
    public void iniciaAtendimentoPedagogico() {
        this.emAtendimentoPedagogico = true;
    }

    @Override
    public void finalizaAtendimentoPedagogico() {
        this.emAtendimentoPedagogico = false;
        this.incrementoAtendimentoPedagogico();
    }

    public String impressaoPedagogo() {
        return "Código: " + super.codigo + ", Nome: " + super.nome +
                ", Total de Atendimentos pedagógicos: " + qtdAtendimentosPedagogicos + ".";
    }
}