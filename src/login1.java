import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
    private DefaultTableModel tableModel;
    public login1() {
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass =  new String(passField1.getPassword());
                if(usuarioFormattedText.getText().equals("s") && pass.equals("123")){

                    JFrame form1 = new JFrame("página 1");
                    form1.setContentPane(new form1().pag1);
                    form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    form1.setVisible(true);


                    form1.setSize(300, 300);
                    Main.login1.dispose();

                    // Tabla crear tabla
                    tableModel = new DefaultTableModel();
                    tableModel.addColumn("Columna 1");
                    tableModel.addColumn("Columna 2");
                    tableModel.addColumn("Columna 3");

                    // Agregar 4 filas de datos (puedes modificar esto según tus necesidades)
                    tableModel.addRow(new Object[]{"Dato 1-1", "Dato 1-2", "Dato 1-3"});
                    tableModel.addRow(new Object[]{"Dato 2-1", "Dato 2-2", "Dato 2-3"});
                    tableModel.addRow(new Object[]{"Dato 3-1", "Dato 3-2", "Dato 3-3"});
                    tableModel.addRow(new Object[]{"Dato 4-1", "Dato 4-2", "Dato 4-3"});

                    // Crear la tabla con el modelo modificado
                    JTable table = new JTable(tableModel);

                    // EJEMPLO DE MENU

                    JFrame menuEjemplo = new JFrame("Ejemplo de JMenu");
                    JMenuBar menuBar = new JMenuBar();

                    // Crear un menú
                    JMenu menu = new JMenu("Menu");

                    // Crear elementos de menú
                    JMenuItem op1 = new JMenuItem("Mostrar ejemplo de dialogo");
                    JMenuItem op2 = new JMenuItem("Guardar");
                    JMenuItem op3 = new JMenuItem("Salir");

                    // Agregar elementos al menú
                    menu.add(op1);
                    menu.addSeparator(); // Separador entre elementos
                    menu.add(op2);
                    menu.addSeparator();
                    menu.add(op3);

                    // Agregar el menú a la barra de menú
                    menuBar.add(menu);

                    // Agregar la barra de menú al marco
                    form1.setJMenuBar(menuBar);
                    menuEjemplo.setSize(300, 200);

                    // Mostrar ejemplo de dialogo

                    op1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // EJEMPLO DE DIALOGO
                            JFrame frame = new JFrame("Ejemplo de JDialog");
                            JButton boton = new JButton("Mostrar diálogo");

                            boton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {

                                    JDialog dialogo = new JDialog(frame, "Diálogo de ejemplo", true);

                                    // Crear y añadir contenido al diálogo
                                    JLabel etiqueta = new JLabel("Este es un cuadro de diálogo de ejemplo");
                                    dialogo.add(etiqueta);

                                    // Configurar el tamaño y mostrar el diálogo
                                    dialogo.setSize(250, 150);
                                    dialogo.setVisible(true);
                                }
                            });

                            frame.add(boton);
                            frame.setSize(300, 200);
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setVisible(true);

                        }
                    });

                    // Configurar el comportamiento del elemento de menú "Salir"
                    op3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0); // Salir de la aplicación al hacer clic en "Salir"
                        }
                    });

                }
            }
        });


    }
}
