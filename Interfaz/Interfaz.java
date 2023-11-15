package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoPassword;
//h
    public Interfaz() {
        // Configuración de la ventana
        setTitle("Inicio de Sesión");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Diseño de la interfaz
        JPanel panel = new JPanel();
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        campoUsuario = new JTextField(20);
        JLabel etiquetaPassword = new JLabel("Contraseña:");
        campoPassword = new JPasswordField(20);
        JButton botonIniciarSesion = new JButton("Iniciar Sesión");

        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                char[] password = campoPassword.getPassword();
                String passwordString = new String(password);

                // Usuario y contraseña ficticios
                String usuarioCorrecto = "usuario";
                String passwordCorrecto = "contrasena";

                if (usuario.equals(usuarioCorrecto) && passwordString.equals(passwordCorrecto)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario inválido");
                }

                // Limpiar los campos después de comprobar las credenciales
                campoUsuario.setText("");
                campoPassword.setText("");
            }
        });

        panel.add(etiquetaUsuario);
        panel.add(campoUsuario);
        panel.add(etiquetaPassword);
        panel.add(campoPassword);
        panel.add(botonIniciarSesion);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interfaz ventana = new Interfaz();
                ventana.setVisible(true);
            }
        });
    }
}
