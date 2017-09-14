package modelo;
import java.util.ArrayList;

public class Disciplina {
    private int codDisciplina;
    private String nome;
    private String ementa;
    private int periodo;
    private int qtdeCreditos;
    private Curso curso;
    private ArrayList preRequisitos;

    public Disciplina() {
        preRequisitos = new ArrayList();
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getQtdeCreditos() {
        return qtdeCreditos;
    }

    public void setQtdeCreditos(int qtdeCreditos) {
        this.qtdeCreditos = qtdeCreditos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList getPreRequisitos() {
        return this.preRequisitos;
    }

    public void addPreRequisito (Disciplina disciplina) {
        this.preRequisitos.add(disciplina);
    }
}
