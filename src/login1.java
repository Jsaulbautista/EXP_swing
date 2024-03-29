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
                if(usuarioFormattedText.getText().equals("saul") && pass.equals("123")){

                    JFrame form1 = new JFrame("página 1");
                    form1.setContentPane(new form1().pag1);
                    form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    form1.setVisible(true);


                    form1.setSize(700, 500);
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
                    JMenuItem op5 = new JMenuItem("cambiar color");
                    JMenuItem op6 = new JMenuItem("checkbox");
                    JMenuItem op7 = new JMenuItem("silder");
                    JMenuItem op3 = new JMenuItem("Salir");


                    // Agregar elementos al menú
                    menu.add(op1);
                    menu.addSeparator(); // Separador entre elementos
                    menu.add(op2);
                    menu.addSeparator();
                    menu.add(op4);
                    menu.addSeparator();
                    menu.add(op5);
                    menu.addSeparator();
                    menu.add(op6);
                    menu.addSeparator();
                    menu.add(op7);
                    menu.addSeparator();
                    menu.add(op3);


                    // Agregar el menú a la barra de menú
                    menuBar.add(menu);

                    // Agregar la barra de menú al marco
                    form1.setJMenuBar(menuBar);
                    menuEjemplo.setSize(300, 200);



                    op1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // EJEMPLO DE DIALOGO
                            JFrame dial = new JFrame("Ejemplo de JDialog");
                            JButton boton = new JButton("Mostrar diálogo");

                            dial.add(boton);
                            dial.setSize(300, 300);
                            dial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dial.setVisible(true);
                            boton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {

                                    JDialog dialogo = new JDialog(dial, "Diálogo de ejemplo", true);


                                    JLabel texto = new JLabel("Estudiantes mostrados con exito!");
                                    dialogo.add(texto);


                                    dialogo.setSize(300, 300);
                                    dialogo.setVisible(true);
                                }
                            });



                        }
                    });

                    op2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            JFrame frame = new JFrame("Ejemplo");


                            JButton button = new JButton("Buscar Archivo");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {

                                    JFileChooser fileChooser = new JFileChooser();


                                    int result = fileChooser.showOpenDialog(frame);


                                    if (result == JFileChooser.APPROVE_OPTION) {
                                        // Obtener el archivo seleccionado
                                        java.io.File selectedFile = fileChooser.getSelectedFile();
                                        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                                    }
                                }
                            });


                            frame.getContentPane().add(button);


                            frame.setSize(400, 200);
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setVisible(true);
                        }
                    });


                    op4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            JFrame tablaFrame = new JFrame("Ejemplo de tabla ");


                            modelo = new DefaultTableModel();
                            modelo.addColumn("Nombre");
                            modelo.addColumn("Edad");
                            modelo.addColumn("Carrera");


                            Object[] fila1 = {"Jennyfer", 25, "Programacion"};
                            Object[] fila2 = {"María", 30, "Sistemas"};
                            Object[] fila3 = {"Pedro", 28, "Redes"};


                            modelo.addRow(fila1);
                            modelo.addRow(fila2);
                            modelo.addRow(fila3);


                            tabla = new JTable(modelo);


                            JScrollPane scrollPane = new JScrollPane(tabla);


                            tablaFrame.add(scrollPane);
                            tablaFrame.setSize(300,300);


                            tablaFrame.setVisible(true);

                        }
                    });

                    op5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {

                        }
                    });

                    //SALIR
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
