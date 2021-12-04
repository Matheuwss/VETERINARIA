package poo_projetoFinal.jdbc;

import javax.swing.JOptionPane;

public class ConnectionTest {
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro "+ e);
        }
    }

}