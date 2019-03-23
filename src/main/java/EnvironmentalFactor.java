/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beemo
 */
public class EnvironmentalFactor implements Factors {
      double total;
      EnvironmentalFactor(double total){
      this.total = total;
   }

    @Override
    public double calculate(double total) {
        double ecf = 1.4+(-0.03*total);
        return total;
    }
    
}
