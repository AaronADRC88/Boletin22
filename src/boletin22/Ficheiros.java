package boletin22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ficheiros {

    PrintWriter ficheiro;

    public void leerEscribir(String nombreF) {
        String resp;
        ArrayList<String> texto = new ArrayList();
        int linea = 0;
        try {
            ficheiro = new PrintWriter(new File(nombreF));
            int n = Integer.parseInt(JOptionPane.showInputDialog("Numero de palabras:"));
            do {
                resp = JOptionPane.showInputDialog("Introducir palabra:");
                texto.add(resp);
            } while (texto.size() < n);
            texto.sort(null);
            for (String ar : texto) {
                linea++;
                ficheiro.println(linea + " " + ar);
            }
        } catch (IOException ex) {
            System.err.println("Error de escritura" + ex);
        } finally {
            ficheiro.close();
        }
    }
}
