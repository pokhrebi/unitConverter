
package unitconverter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        //Create UI
        farenheitTF = new JTextField(15);
        celsiusTF = new JTextField(15);
        celsiusTF.setEditable(false);
        farenheitLabel = new JLabel("Farenheit: ");
        celsiusLabel = new JLabel("Celsius: ");
        convertBtn = new JButton("Convert");
        
        //Create Container        
        container = new JPanel();
        FlowLayout f1 = new FlowLayout();
        container.setLayout(f1);
        
        //Add user UI elements        
        container.add(farenheitLabel);
        container.add(farenheitTF);
        container.add(celsiusLabel);
        container.add(celsiusTF);
        container.add (convertBtn);
        
        
        //Create window        
        window = new JFrame();
        
        //Container to Window    
        window.setContentPane(container);
        
        //Set Title
        window.setTitle("Units Converter");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        
    }
    
}
class convertButtonListener implements ActionListener
{
    public void actionPerformed (ActionEvent e)
    {
        
    }
}
