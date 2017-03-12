/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculopialcuadrado;

import java.math.BigDecimal;

public class CalculoPICuadrado {
    /**
     * Se encarga de elevar al cuadrado la constante PI
     */
    public void calcularPiAlCuadrado(){
        double pi = 3.1416;
        double piAlCuadrado =pi * pi;
        System.out.println("* Calculo de PI al cuadrado**");
        
        System.out.println("PI AL CUADRADO: " + piAlCuadrado);
        }
    public static void main(String[] args) {
        CalculoPICuadrado calculoPICuadrado = new CalculoPICuadrado();
        
            calculoPICuadrado.calcularPiAlCuadrado();
    }
    
} 
    public BigDecimal calcularAreaCirculo (BigDecimal radio){
    
        BigDecimal areaCirculo;
        BigDecimal pi = new BigDecimal ("3.14159265358979323846");
    
            System.out.println("***calculo del area");
            System.out.println("*Radio (objeto Big Decimal):" + radio);
            System.out.println("Constante pi: " + pi);
            
            radio = radio.multiply(radio);   //r = r*r = r^2
            System.out.println("Radio al cuadrado: "+ radio);

            areaCirculo = radio.multiply(pi); //pi*r^2
            
            return areaCirculo;
    }

public static void main (string[] args) {

        CalculoPIBigDecimal CalculoPIBigDecimal = new CalculoPIBigDecimal

        BigDecimal radio = new BigDecimal("87.5698");

        BigDecimal areacirculo;
            
        areaCirculo = calculoPIBigDecimal.calcularAreaCirculo(radio);

    System.out.println("Area del Circulo(pi*r^2) = " + areaCirculo);

}