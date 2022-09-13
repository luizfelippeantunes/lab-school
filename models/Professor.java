package projeto1v2.models;

public class Professor extends Pessoa {

    private String formacaoAcademica;
    private String experienciaDev;
    private String status;

    public Professor(String nome, String telefone, String dataNascimento, String cpf, String formacaoAcademica, String experienciaDev) {
        super(nome, telefone, dataNascimento, cpf);
        this.formacaoAcademica = formacaoAcademica;
        this.experienciaDev = experienciaDev;
        this.status = "Ativo";
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public String getExperienciaDev() {
        return experienciaDev;
    }

    public String getStatus() {
        return status;
    }

    public String impressaoProfessor() {
        return "Código: " + super.codigo + ", Nome: " + super.nome + ", Experiência DEV: " + experienciaDev + ".";
    }
}