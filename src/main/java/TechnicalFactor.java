/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beemo
 */
public class TechnicalFactor implements Factors{
    double total;
       TechnicalFactor(double total){
      this.total = total;
   }

    @Override
    public double calculate(double total) {
        double tcf = 0.6+(total/100);
        return total;
    }
    
}
