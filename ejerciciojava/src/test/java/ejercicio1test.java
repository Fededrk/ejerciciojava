/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author alumno
 */
public class ejercicio1test {
    
    public ejercicio1test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Ignore
    @Test
        public void mostrarValor() {
            //crear variable entera
            int x;
            //instanciar la variable x con el valor 3
            x=3;
            //mostrar en pantalla el valor de variable x
            System.out.println("el valor de la variable es: "+3);
    }
    @Test
        public void mostrarObjetoEntero() {
            
            //crear objeto de tipo entero
            ObjetoEntero a;
            //instanciar el objeto
            a=new ObjetoEntero();
            //crevar variable tipo entero con valor 3
            int n = 3;
            //instanciar obejeto a con el valor
            a.setValue(n);
            //imprimir valor del objeto entero
            a.mostrarobjetoentero();
        }
}
