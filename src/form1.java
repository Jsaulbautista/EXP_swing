import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;



public class form1 {
    private JTextArea textArea1;
    private JFormattedTextField formato_texto;
    private JRadioButton opcionFecha;
    public JPanel pag1;
    private JRadioButton opcionHora;
    private JRadioButton opcionTiempo;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        formato_texto = new JFormattedTextField();
        opcionTiempo = new JRadioButton();
        opcionFecha = new JRadioButton();
        opcionHora = new JRadioButton();

        try {
            MaskFormatter formato = new MaskFormatter("##:## aa");
            formato_texto.setFormatterFactory(new DefaultFormatterFactory(formato));
        } catch (ParseException e0) {
            e0.printStackTrace();
        }

        // Establecer metodos para cuando se active algun JRadioButton
        opcionFecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(pag1, "Has seleccionado la opcion: Fecha");
            }
        });

        opcionHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(pag1, "Has seleccionado la opcion: Hora");
            }
        });

        opcionTiempo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(pag1, "Has seleccionado la opcion: Tiempo");
            }
        });

        // Establecer una opcion activada por defecto
        opcionFecha.setSelected(true);
    }
}
