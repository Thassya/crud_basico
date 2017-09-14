/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import modelo.Curso;
import modelo.Professor;

/**
 *
 * @author Marco
 */
public class CursoDAO {

    public static void gravar(Curso curso) throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        try {
            conexao = BD.getConexao();
            String sql = "insert into curso (codCurso, nome, cargaHoraria, "
                    + "tipoCurso, totalPeriodos, professorCoordenador) "
                    + "values (?,?,?,?,?,?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, curso.getCodCurso());
            comando.setString(2, curso.getNome());
            comando.setInt(3, curso.getCargaHoraria());
            comando.setString(4, curso.getTipoCurso());
            comando.setInt(5, curso.getTotalPeriodos());
            if (curso.getCoordenador() == null) {
                comando.setNull(6, Types.NULL);
            } else {
                comando.setInt(6, curso.getCoordenador().getMatricula());
            }
            comando.execute();
            comando.close();
            conexao.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    public static void alterar(Curso curso) throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        try {
            conexao = BD.getConexao();
            String sql = "update curso set nome = ?, cargaHoraria = ?, "
                    + "tipoCurso = ?, totalPeriodos = ?, professorCoordenador = ? "
                    + "where codCurso = ?";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, curso.getNome());
            comando.setInt(2, curso.getCargaHoraria());
            comando.setString(3, curso.getTipoCurso());
            comando.setInt(4, curso.getTotalPeriodos());
            if (curso.getCoordenador() == null) {
                comando.setNull(5, Types.NULL);
            } else {
                comando.setInt(5, curso.getCoordenador().getMatricula());
            }
            comando.setInt(6, curso.getCodCurso());
            comando.execute();
            comando.close();
            conexao.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    public static void excluir(Curso curso) throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        String stringSQL;

        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            stringSQL = "delete from curso where codCurso = "
                    + curso.getCodCurso();
            comando.execute(stringSQL);
        } catch (SQLException e) {
            throw e;
        } finally {
            fecharConexao(conexao, comando);
        }
    }

    public static Curso obterCurso(int codCurso) throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        Curso curso = null;
        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery(
                    "select * from curso where codCurso = " + codCurso);
            rs.first();
            curso = new Curso(rs.getInt("codCurso"),
                    rs.getString("nome"),
                    rs.getInt("cargaHoraria"),
                    rs.getString("tipoCurso"),
                    rs.getInt("totalPeriodos"),
                    null);
            curso.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return curso;
    }

    public static List<Curso> obterCursos() throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        List<Curso> cursos = new ArrayList<Curso>();
        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from curso");
            while (rs.next()) {
                Curso curso = new Curso(rs.getInt("codCurso"),
                        rs.getString("nome"),
                        rs.getInt("cargaHoraria"),
                        rs.getString("tipoCurso"),
                        rs.getInt("totalPeriodos"), null);
                curso.setMatriculaProfessorCoordenador(rs.getInt("professorCoordenador"));
                cursos.add(curso);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return cursos;
    }

    public static void fecharConexao(Connection conexao, Statement comando) {
        try {
            if (comando != null) {
                comando.close();
            }
            if (conexao != null) {
                conexao.close();
            }

        } catch (SQLException e) {
        }
    }
}
