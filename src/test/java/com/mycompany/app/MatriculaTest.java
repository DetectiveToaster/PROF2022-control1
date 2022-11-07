package com.mycompany.app;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Vector;

/**
 * Unit test for simple App.
 */
public class MatriculaTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAsignaturasNulo()
    {
        Matricula testMatricula = new Matricula(null);
        Assertions.assertThrows(Exception.class, () -> testMatricula.getImporte());
    }

    @Test
    public void testSumaAsignaturasOk() throws Exception {
        Vector vectorAsignaturas = new Vector();
        Asignatura mockedAsig1 = Mockito.mock(Asignatura.class);
        Asignatura mockedAsig2 = Mockito.mock(Asignatura.class);
        Mockito.when(mockedAsig1.getImporte()).thenReturn(2.0);
        Mockito.when(mockedAsig2.getImporte()).thenReturn(3.5);
        vectorAsignaturas.add(mockedAsig1);
        vectorAsignaturas.add(mockedAsig2);
        Matricula testMatricula = new Matricula(vectorAsignaturas);
        Assertions.assertEquals(testMatricula.getImporte(), 5.5);
    }

    @Test
    public void testRecorrerAsignaturasOk() throws Exception {
        Vector vectorAsignaturas = new Vector();
        Asignatura mockedAsig1 = Mockito.mock(Asignatura.class);
        Asignatura mockedAsig2 = Mockito.mock(Asignatura.class);
        Mockito.when(mockedAsig1.getImporte()).thenReturn(2.0);
        Mockito.when(mockedAsig2.getImporte()).thenReturn(3.5);
        vectorAsignaturas.add(mockedAsig1);
        vectorAsignaturas.add(mockedAsig2);
        Matricula testMatricula = new Matricula(vectorAsignaturas);
        Assertions.assertEquals(testMatricula.getImporte(), 5.5);
        Mockito.verify(mockedAsig1, Mockito.atLeastOnce()).getImporte();
        Mockito.verify(mockedAsig2, Mockito.atLeastOnce()).getImporte();
    }

}
