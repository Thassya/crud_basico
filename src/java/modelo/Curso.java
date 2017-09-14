package modelo;

import modelo.Professor;
import dao.CursoDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Curso {

    private int codCurso;
    private String nome;
    private int cargaHoraria;
    private String tipoCurso;
    private int totalPeriodos;
    private Professor coordenador;
    
    private int matriculaProfessorCoordenador;

    public Curso() {
        super();
    }

    public Curso(int codCurso, String nome, int cargaHoraria, String tipoCurso, int totalPeriodos, Professor coordenador) {
        this.codCurso = codCurso;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.tipoCurso = tipoCurso;
        this.totalPeriodos = totalPeriodos;
        this.coordenador = coordenador;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public int getTotalPeriodos() {
        return totalPeriodos;
    }

    public void setTotalPeriodos(int totalPeriodos) {
        this.totalPeriodos = totalPeriodos;
    }

    public Professor getCoordenador() {
        if ((this.matriculaProfessorCoordenador != 0) && (this.coordenador == null)) {
            try {
                this.coordenador = 
                        Professor.obterProfessor(this.matriculaProfessorCoordenador);
            } catch (ClassNotFoundException ex) {
            }
        }
        return this.coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public void gravar() throws SQLException, 
            ClassNotFoundException {
        CursoDAO.gravar(this);
    }

    public void alterar() throws SQLException, ClassNotFoundException {
        CursoDAO.alterar(this);
    }

    public void excluir() throws SQLException, ClassNotFoundException {
        CursoDAO.excluir(this);
    }

    public static Curso obterCurso(int codCurso) throws ClassNotFoundException {
        return CursoDAO.obterCurso(codCurso);
    }

    public static List<Curso> obterCursos() 
            throws ClassNotFoundException {
        return CursoDAO.obterCursos();
    }

    /**
     * @return the matriculaProfessorCoordenador
     */
    public int getMatriculaProfessorCoordenador() {
        return matriculaProfessorCoordenador;
    }

    /**
     * @param matriculaProfessorCoordenador the matriculaProfessorCoordenador to set
     */
    public void setMatriculaProfessorCoordenador(int matriculaProfessorCoordenador) {
        this.matriculaProfessorCoordenador = matriculaProfessorCoordenador;
    }
}
