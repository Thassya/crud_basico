package modelo;

import java.util.Date;

public class Aluno {
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
    private String rg;
    private String cpf;
    private String email;
    private int anoIngresso;
    private int semestreIngresso;
    private String status;
    private int posicaoVestibular;
    private Curso curso;

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getSemestreIngresso() {
        return semestreIngresso;
    }

    public void setSemestreIngresso(int semestreIngresso) {
        this.semestreIngresso = semestreIngresso;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPosicaoVestibular() {
        return posicaoVestibular;
    }

    public void setPosicaoVestibular(int posicaoVestibular) {
        this.posicaoVestibular = posicaoVestibular;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
