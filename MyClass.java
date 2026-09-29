import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;




public class MyClass {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My JavaFX Application");
            frame.add(new JLabel("Examen del primer parcial Programacion Avanzada Hola mi nombre es Cesar Raul Ramirez Cab 69967"));
            frame.add(new JLabel("Esto no es JavaFX Cesar"), java.awt.BorderLayout.SOUTH);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}


