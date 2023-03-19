/*
   Exam 17 March 2023

   Book: Daron (2019), Economics, 2nd Edition. pag. 404
   Problem 3: compound interest (future value)
        Future value = (1 + r)^T * Principal.
   Compound interest equation or the future value equation.
   In this equation, r is the interest rate, and T is the
   number of years that the investment lasts.
 */
package PckExamen17March;

import javax.swing.*;

public class InteresCompuesto1 {
    public static void main(String[] args) {

        String interest  = JOptionPane.showInputDialog(null,
                "Give the interest rate r: ");
        String year  = JOptionPane.showInputDialog(null,
                "Give the years T: ");
        double ci = 234*Math.pow(1 + Double.parseDouble(interest),
                                    Double.parseDouble(year));
        JOptionPane.showMessageDialog(null,
                    "The future value is: " + ci);
    }
}
