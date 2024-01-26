import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
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
    private JTable tabla;
    private DefaultTableModel modelo;

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



                    // EJEMPLO DE MENU

                    JFrame menuEjemplo = new JFrame("Ejemplo de JMenu");
                    JMenuBar menuBar = new JMenuBar();

                    // Crear un menú
                    JMenu menu = new JMenu("Menu");

                    // Crear elementos de menú
                    JMenuItem op1 = new JMenuItem("Mostrar ejemplo de dialogo");
                    JMenuItem op2 = new JMenuItem("Buscar Archivo");
                    JMenuItem op4 = new JMenuItem("Tabla");
                    JMenuItem op3 = new JMenuItem("Salir");


                    // Agregar elementos al menú
                    menu.add(op1);
                    menu.addSeparator(); // Separador entre elementos
                    menu.add(op2);
                    menu.addSeparator();
                    menu.add(op4);
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

                    op2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Crear un nuevo JFrame
                            JFrame frame = new JFrame("File Chooser Ejemplo");

                            // Crear un botón que abrirá el JFileChooser
                            JButton button = new JButton("Open File ejemplo");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // Crear un JFileChooser
                                    JFileChooser fileChooser = new JFileChooser();

                                    // Mostrar el cuadro de diálogo de selección de archivos
                                    int result = fileChooser.showOpenDialog(frame);

                                    // Verificar si el usuario seleccionó un archivo
                                    if (result == JFileChooser.APPROVE_OPTION) {
                                        // Obtener el archivo seleccionado
                                        java.io.File selectedFile = fileChooser.getSelectedFile();
                                        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                                    }
                                }
                            });

                            // Agregar el botón al JFrame
                            frame.getContentPane().add(button);

                            // Configurar el JFrame
                            frame.setSize(400, 200);
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setVisible(true);
                        }
                    });


                    op4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Configuración del JFrame
                            JFrame tablaFrame = new JFrame("Ejemplo de tabla ");

                            // Crear un modelo de tabla
                            modelo = new DefaultTableModel();
                            modelo.addColumn("Nombre");
                            modelo.addColumn("Edad");
                            modelo.addColumn("Carrera");

                            // Crear datos de ejemplo
                            Object[] fila1 = {"Jennyfer", 25, "Programacion"};
                            Object[] fila2 = {"María", 30, "Sistemas"};
                            Object[] fila3 = {"Pedro", 28, "Redes"};

                            // Agregar filas al modelo
                            modelo.addRow(fila1);
                            modelo.addRow(fila2);
                            modelo.addRow(fila3);

                            // Crear la tabla con el modelo
                            tabla = new JTable(modelo);

                            // Agregar la tabla a un JScrollPane
                            JScrollPane scrollPane = new JScrollPane(tabla);

                            // Agregar el JScrollPane al JFrame
                            tablaFrame.add(scrollPane);
                            tablaFrame.setSize(300,300);

                            // Mostrar el JFrame
                            tablaFrame.setVisible(true);

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
