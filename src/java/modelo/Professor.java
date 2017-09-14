package modelo;

import dao.ProfessorDAO;
import java.util.Date;
import java.util.List;

public class Professor {

    private int matricula;
    private String nome;
    private Date dtNascimento;
    private String endLogradouro;
    private int endNumero;
    private String endComplemento;
    private String endBairro;
    private String endCEP;
    private String endCidade;
    private String endEstado;
    private String email;
    private Date dtIngresso;
    private String titulacao;
    private Curso cursoAtuacao;
    
    private int codCursoAtuacao;

    public Professor(int matricula, String nome, Date dtNascimento, String endLogradouro,
            int endNumero, String endComplemento, String endBairro, String endCEP,
            String endCidade, String endEstado, String email, Date dtIngresso,
            String titulacao, Curso cursoAtuacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.endLogradouro = endLogradouro;
        this.endNumero = endNumero;
        this.endComplemento = endComplemento;
        this.endBairro = endBairro;
        this.endCEP = endCEP;
        this.endCidade = endCidade;
        this.endEstado = endEstado;
        this.email = email;
        this.dtIngresso = dtIngresso;
        this.titulacao = titulacao;
        this.cursoAtuacao = cursoAtuacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndLogradouro() {
        return endLogradouro;
    }

    public void setEndLogradouro(String endLogradouro) {
        this.endLogradouro = endLogradouro;
    }

    public int getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(int endNumero) {
        this.endNumero = endNumero;
    }

    public String getEndComplemento() {
        return endComplemento;
    }

    public void setEndComplemento(String endComplemento) {
        this.endComplemento = endComplemento;
    }

    public String getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }

    public String getEndCEP() {
        return endCEP;
    }

    public void setEndCEP(String endCEP) {
        this.endCEP = endCEP;
    }

    public String getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    public String getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(String endEstado) {
        this.endEstado = endEstado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtIngresso() {
        return dtIngresso;
    }

    public void setDtIngresso(Date dtIngresso) {
        this.dtIngresso = dtIngresso;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Curso getCursoAtuacao() {
        return this.cursoAtuacao;
    }

    public void setCursoAtuacao(Curso cursoAtuacao) {
        this.cursoAtuacao = cursoAtuacao;
    }

    public static Professor obterProfessor(int matricula) throws ClassNotFoundException {
        return ProfessorDAO.obterProfessor(matricula);
    }

    public static List<Professor> obterProfessores() throws ClassNotFoundException {
        return ProfessorDAO.obterProfessores();
    }

    /**
     * @return the codCursoAtuacao
     */
    public int getCodCursoAtuacao() {
        return codCursoAtuacao;
    }

    /**
     * @param codCursoAtuacao the codCursoAtuacao to set
     */
    public void setCodCursoAtuacao(int codCursoAtuacao) {
        this.codCursoAtuacao = codCursoAtuacao;
    }
}
