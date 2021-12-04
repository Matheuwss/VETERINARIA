package poo_projetoFinal.model;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JPanel;

public class Utilitarios {
    public void LimpaTela(JPanel container){
        Component comonente[]=container.getComponents();
        for (Component component : comonente){
            if(component instanceof JTextField){
                ((JTextField)component).setText(null);

            }
        }
    }
}