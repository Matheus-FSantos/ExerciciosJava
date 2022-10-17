/**
 *
 */
package pacoteCronometro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author mfm65
 *
 */
public class Main extends JFrame implements ActionListener {
    Font standardFont = new Font("Arial", Font.BOLD, 150);
    
    static int number = 0;
    
    private final JLabel numberText;
    private final JButton reset;

    public Main() {
        numberText = new JLabel();
        numberText.setFont(standardFont);
        numberText.setBounds(100, 95, 200, 150);
        numberText.setHorizontalAlignment(SwingConstants.CENTER);
        add(numberText);

        reset = new JButton("Resetar");
        reset.setBounds(150, 300, 100, 35);
        add(reset);
        reset.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                number = 0;
            }
        });
    }
    
    private void contagem(){
        while(true){
            try{
                numberText.setText(number+"");
                number++;
                Thread.sleep(1000);    
            } catch (InterruptedException erro){

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        Main form = new Main();

        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 400, 400);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setTitle("Cronometro");
        
        form.contagem();
    }
}
