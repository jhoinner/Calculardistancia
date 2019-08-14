/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formuladistancia;

/**
 *
 * @author Usuario
 */
public class FormulaDistancia {
 public FormulaDistancia(){
     
 }
 public double ResultadoFormula(double x2, double x1, double y2, double y1){
     double distancia;
     distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
     return distancia;
 }

   
}
