package modelo;
import java.util.ArrayList;

public class Turma {
    private int ano;
    private int semestre;
    private int numVagas;
    private String numSala;
    private ArrayList horarios;
    private Disciplina disciplina;
    private Professor professor;

    public Turma() {
        horarios = new ArrayList();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public void addHorario(Horario horario) {
        horarios.add(horario);
    }

    public ArrayList getHorarios() {
        return this.horarios;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
