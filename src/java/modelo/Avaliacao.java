package modelo;

public class Avaliacao {
    private float nota1;
    private float nota2;
    private int numFaltas;
    private float notaProvaFinal;
    private Aluno aluno;
    private Turma turma;

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }

    public float getNotaProvaFinal() {
        return notaProvaFinal;
    }

    public void setNotaProvaFinal(float notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
