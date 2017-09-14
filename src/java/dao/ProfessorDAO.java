/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Professor;
import modelo.Curso;

/**
 *
 * @author Marco
 */
public class ProfessorDAO {

    public static Professor obterProfessor(int matricula) throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        Professor professor = null;
        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery(
                    "select * from professor where matricula = " + matricula);
            rs.first();
            professor = new Professor(
                    rs.getInt("matricula"),
                    rs.getString("nome"),
                    rs.getDate("dtNascimento"),
                    rs.getString("endLogradouro"),
                    rs.getInt("endNumero"),
                    rs.getString("endComplemento"),
                    rs.getString("endBairro"),
                    rs.getString("endCEP"),
                    rs.getString("endCidade"),
                    rs.getString("endEstado"),
                    rs.getString("email"),
                    rs.getDate("dtIngresso"),
                    rs.getString("titulacao"),
                    null);
            professor.setCodCursoAtuacao(rs.getInt("cursoAtuacao"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return professor;
    }

    public static List<Professor> obterProfessores() throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        List<Professor> professores = new ArrayList<Professor>();

        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from professor");
            while (rs.next()) {
                Professor professor = new Professor(
                        rs.getInt("matricula"),
                        rs.getString("nome"),
                        rs.getDate("dtNascimento"),
                        rs.getString("endLogradouro"),
                        rs.getInt("endNumero"),
                        rs.getString("endComplemento"),
                        rs.getString("endBairro"),
                        rs.getString("endCEP"),
                        rs.getString("endCidade"),
                        rs.getString("endEstado"),
                        rs.getString("email"),
                        rs.getDate("dtIngresso"),
                        rs.getString("titulacao"),
                        null);
                professor.setCodCursoAtuacao(rs.getInt("cursoAtuacao"));
                professores.add(professor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return professores;
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
