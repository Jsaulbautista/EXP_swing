import javax.swing.*;

public class Main {
    static JFrame login1 = new JFrame("Iniciar Sesión");
    public static void main(String[] args) {
        login1.setContentPane(new form1().pag1);
        login1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login1.setVisible(true);
        login1.setSize(300,300);
    }
}