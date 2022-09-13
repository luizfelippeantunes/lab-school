package projeto1v2.models;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String dataNascimento;
    protected String cpf;
    protected static int totalCadastros;
    protected int codigo;

    public Pessoa(String nome, String telefone, String dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.codigo = ++totalCadastros;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", CPF: " + cpf + ".";
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCodigo() {
        return codigo;
    }
}