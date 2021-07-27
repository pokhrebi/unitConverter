
package unitconverter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author bhakti
 */
public class converterWindow 
{
    private JTextField  farenheitTF;
    private JTextField celsiusTF;
    private JButton convertBtn;
    private JLabel farenheitLabel;
    private JLabel celsiusLabel;
    private JPanel container;
    private JFrame window;
    
    public converterWindow ()
    {
        farenheitTF = new JTextField(15);
        celsiusTF = new JTextField(15);
        farenheitLabel = new JLabel("Farenheit: ");
        celsiusLabel = new JLabel("Celsius: ");
        convertBtn = new JButton("Convert");
        
    }
}
