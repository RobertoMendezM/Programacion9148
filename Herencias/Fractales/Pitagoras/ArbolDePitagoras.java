/**
 * Curso: Programación
 *
 * Tomado de:
 * Buch: Gunter Saake Kai-Uwe Sattler (2021). Algorithmen and Datenstrukturen Eine Einführung mit Java
 * Buchseite: ---
 *
 * Temas: Herencia
 *        Recursividad
 *        Graficación
 *
 * @version 9/ May/ 22
 */

import javax.swing.JFrame;
import java.awt.Graphics;

public class ArbolDePitagoras extends JFrame {
        double tanphi = 1;

        public void paint(Graphics g) {
            g.clearRect(10, 10, 510, 510);
            paintTree(g, 210, 400, 290, 400);
        }

        void paintTree(Graphics g, double x1, double y1,
                       double x2, double y2 ) {

            double dx = x2 - x1; double dy = y1 - y2;
            double x3 = x1 - dy; double y3 = y1 - dx;
            double x4 = x2 - dy; double y4 = y2 - dx;

            g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
            g.drawLine((int)x2, (int)y2, (int)x4, (int)y4);
            g.drawLine((int)x4, (int)y4, (int)x3, (int)y3);
            g.drawLine((int)x1, (int)y1, (int)x3, (int)y3);

            double v = (x3 + x4) / 2 - (dy / 2 * tanphi);
            double w = (y3 + y4) / 2 - (dx / 2 * tanphi);

            if (dx * dx + dy * dy > 2) {
                paintTree(g, x3, y3, v, w);
                paintTree(g, v, w, x4, y4);
            }
        }
}
