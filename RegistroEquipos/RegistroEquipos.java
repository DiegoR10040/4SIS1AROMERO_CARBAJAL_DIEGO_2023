package RegistroEquipos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegistroEquipos extends JFrame {
    private static final int MAX_EQUIPOS = 10;
    private int equiposRegistrados = 0;

    private JTextField nombreEquipoField;
    private JTextArea areaResultados;

    private List<String> jugadoresEquipoActual;

    public RegistroEquipos() {
        super("Registro de Equipos de Fútbol");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Nombre del Equipo:"));
        nombreEquipoField = new JTextField();
        panel.add(nombreEquipoField);

        panel.add(new JLabel("Nombres de los Jugadores (separados por coma):"));
        JTextField jugadoresField = new JTextField();
        panel.add(jugadoresField);

        JButton registrarEquipoButton = new JButton("Registrar Equipo");
        registrarEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarEquipo(jugadoresField.getText());
            }
        });
        panel.add(registrarEquipoButton);

        areaResultados = new JTextArea();
        areaResultados.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaResultados);
        panel.add(scrollPane);

        add(panel);
    }

    private void registrarEquipo(String jugadores) {
        if (equiposRegistrados < MAX_EQUIPOS) {
            String nombreEquipo = nombreEquipoField.getText();
            if (!nombreEquipo.isEmpty()) {
                jugadoresEquipoActual = obtenerNombresJugadores(jugadores);
                if (!jugadoresEquipoActual.isEmpty()) {
                    equiposRegistrados++;
                    areaResultados.append("Equipo registrado: " + nombreEquipo + "\n");
                    areaResultados.append("Jugadores: " + String.join(", ", jugadoresEquipoActual) + "\n");

                    if (equiposRegistrados == MAX_EQUIPOS) {
                        generarRolJuegos();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese al menos un nombre de jugador.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese el nombre del equipo.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ya se han registrado todos los equipos.");
        }
        nombreEquipoField.setText("");
    }

    private List<String> obtenerNombresJugadores(String jugadores) {
        List<String> nombres = new ArrayList<>();
        String[] nombresArray = jugadores.split(",");
        for (String nombre : nombresArray) {
            String nombreTrimmed = nombre.trim();
            if (!nombreTrimmed.isEmpty()) {
                nombres.add(nombreTrimmed);
            }
        }
        return nombres;
    }

    private void generarRolJuegos() {
        // Obtener una lista de equipos registrados
        List<String> equipos = new ArrayList<>();
        for (int i = 1; i <= MAX_EQUIPOS; i++) {
            equipos.add("Equipo " + i);
        }

        // Mezclar aleatoriamente la lista de equipos
        Collections.shuffle(equipos);

        // Generar los partidos del rol de juegos
        List<String[]> rolJuegos = new ArrayList<>();
        for (int i = 0; i < equipos.size(); i += 2) {
            String equipo1 = equipos.get(i);
            String equipo2 = equipos.get(i + 1);
            rolJuegos.add(new String[]{equipo1, equipo2});
        }

        areaResultados.append("\nRol de Juegos (al azar):\n");
        for (String[] partido : rolJuegos) {
            areaResultados.append(partido[0] + " vs " + partido[1] + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroEquipos().setVisible(true);
            }
        });
    }
}