/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import junit.framework.TestCase;
import modelo.Curso;

/**
 *
 * @author Marco
 */
public class CursoTest extends TestCase {
       
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testGravar() throws SQLException, ClassNotFoundException {
        Curso curso = new Curso(); 
        curso.setCodCurso(5);
        curso.setNome("BSI");
        curso.setCargaHoraria(3000);
        curso.setTipoCurso("Graduacao");
        curso.setTotalPeriodos(8);
       // curso.setCoordenador(null);
   //     assertEquals(true, curso.gravar());
    }

}
