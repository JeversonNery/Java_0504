
package java_0504;

import javax.swing.JOptionPane;
/**
 *
 * @author Jeverson Nery
 */
public class Java_0504 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str_1 = JOptionPane.showInputDialog(null, "Informe uma palavra: ");
        String str_2 = JOptionPane.showInputDialog(null, "Informe outra palavra: ");
        
        JOptionPane.showMessageDialog(null, str_1.equalsIgnoreCase(str_2));
    }
    
}
