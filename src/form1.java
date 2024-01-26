import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class form1 {
    private JTextArea textArea1;
    private JFormattedTextField formato_texto;
    private JRadioButton opcion1;
    public JPanel pag1;
    private JRadioButton opcion2;
    private JRadioButton opcion3;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        formato_texto = new JFormattedTextField();
        try {
            MaskFormatter formato = new MaskFormatter("##/##/####");
            DefaultFormatterFactory defecto = new DefaultFormatterFactory(formato);
            formato_texto.setFormatterFactory(defecto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
