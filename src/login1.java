import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login1 {
    private JLabel usuario;
    private JLabel iniciarSesion;
    public JFormattedTextField usuarioFormattedText;
    private JLabel contrasena;
    public JPasswordField passField1;
    private JButton entrar;
    public JPanel login;

    public login1() {
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass =  new String(passField1.getPassword());
                if(usuarioFormattedText.getText().equals("s") || pass.equals("123")){
                    JFrame form1 = new JFrame("página 1");
                    form1.setContentPane(new form1().pag1);
                    form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    form1.setVisible(true);

                    form1.setSize(300, 300);
                    Main.login1.dispose();

                }
            }
        });
    }
}
