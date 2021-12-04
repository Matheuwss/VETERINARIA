package poo_projetoFinal.view;

import poo_projetoFinal.model.Utilitarios;
import poo_projetoFinal.model.Cliente;
import poo_projetoFinal.DAO.AnimalDAO;
import poo_projetoFinal.model.Animal;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class AnimalView extends javax.swing.JFrame {

    //método LISTAR NA TABELA
    public void listar(){
        AnimalDAO animalDAO = new AnimalDAO();
        List<Animal> lista = animalDAO.listarAnimal();
        DefaultTableModel dados = (DefaultTableModel) tabelaAnimal.getModel();
        dados.setNumRows(0);

        lista.forEach(animal -> {
            dados.addRow(new Object[]{
                    animal.getId(),
                    animal.getTipo(),
                    animal.getNome(),
                    animal.getRaca(),
                    animal.getCliente().getCpf(),
            });
        });
    }
    public AnimalView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    //<editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFDonoCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFRaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFidAnimal = new javax.swing.JTextField();
        painelConsulta = new javax.swing.JPanel();
        ButtonPesquisar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTFPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAnimal = new javax.swing.JTable();
        ButtonSalvar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VETERINÁRIA");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Animais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("idAnimal:");

        jTFDonoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDonoCpfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("RAÇA:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Dono CPF:");

        jTFidAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFidAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
                painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFRaca, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(painelDadosLayout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosLayout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTFTipo))
                                                .addGroup(painelDadosLayout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTFidAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFDonoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(127, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
                painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTFidAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jTFDonoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(11, 11, 11)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTFRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Animal", painelDados);

        ButtonPesquisar2.setText("PESQUISA");
        ButtonPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisar2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Nome:");

        jTFPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPesquisaKeyPressed(evt);
            }
        });

        tabelaAnimal.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "idAnimal", "Tipo", "Nome", "RAÇA", "Dono CPF"
                }
        ));
        tabelaAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAnimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAnimal);

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
                painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelConsultaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(286, Short.MAX_VALUE))
                        .addGroup(painelConsultaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
        );
        painelConsultaLayout.setVerticalGroup(
                painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelConsultaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonPesquisar2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar Animal", painelConsulta);

        ButtonSalvar.setText("SALVAR");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonExcluir.setText("EXCLUIR");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonMenu.setText("MENU");
        ButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(ButtonSalvar)
                                .addGap(28, 28, 28)
                                .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonExcluir, ButtonSalvar});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtonSalvar)
                                        .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonExcluir, ButtonSalvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDonoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDonoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDonoCpfActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        //BOTÃO SALVAR
        Animal animal = new Animal();
        animal.setId(Integer.parseInt(jTFidAnimal.getText()));
        animal.setNome(jTFNome.getText());
        animal.setTipo(jTFTipo.getText());
        animal.setRaca(jTFRaca.getText());

        Cliente cliente = new Cliente();
        cliente.setCpf(Integer.parseInt(jTFDonoCpf.getText()));
        animal.setCliente(cliente);
        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.cadastrarAnimal(animal);

        new Utilitarios().LimpaTela(painelDados);

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed

        Animal animal = new Animal();
        animal.setId(Integer.parseInt(jTFidAnimal.getText()));

        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.excluirAnimal(animal);
        new Utilitarios().LimpaTela(painelDados);

    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //CARREGA A LISTA
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAnimalMouseClicked
        //CLICANDO NA TABELA E PEGANDO OS DADOS
        jTabbedPane1.setSelectedIndex(0);   //INDO PARA OUTRA ABA
        jTFidAnimal.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 0).toString());  //pegando a linha selecionada
        jTFNome.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 1).toString());      //pegando a linha selecionada
        jTFTipo.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 2).toString());      //pegando a linha selecionada
        jTFRaca.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 3).toString());      //pegando a linha selecionada
        jTFDonoCpf.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 4).toString());   //pegando a linha selecionada

    }//GEN-LAST:event_tabelaAnimalMouseClicked

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        //BOTÃO EDITAR
        Animal animal = new Animal();
        animal.setId(Integer.parseInt(jTFidAnimal.getText()));
        animal.setNome(jTFNome.getText());
        animal.setTipo(jTFTipo.getText());
        animal.setRaca(jTFRaca.getText());

        Cliente cliente = new Cliente();
        cliente.setCpf(Integer.parseInt(jTFDonoCpf.getText()));
        animal.setCliente(cliente);

        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.alterarAnimal(animal);

        new Utilitarios().LimpaTela(painelDados);

    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisar2ActionPerformed
        //BOTÃO PESQUISAR
        String nome = "%"+jTFPesquisa.getText()+ "%";  //pegando o nome digitado e colocando na string

        AnimalDAO animalDAO = new AnimalDAO();
        List<Animal>lista = animalDAO.listarAnimalPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaAnimal.getModel();
        dados.setNumRows(0);

        lista.forEach(animal -> {
            dados.addRow(new Object[]{
                    animal.getId(),
                    animal.getTipo(),
                    animal.getNome(),
                    animal.getRaca(),
                    animal.getCliente().getCpf(),
            });
        });
    }//GEN-LAST:event_ButtonPesquisar2ActionPerformed

    private void jTFPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyPressed
        //IR APARECENDO O NOME DE ACORDO QUE DIGITA
        String nome = "%"+jTFPesquisa.getText()+ "%";   //pegando o nome digitado e colocando na string

        AnimalDAO animalDAO = new AnimalDAO();
        List<Animal>lista = animalDAO.listarAnimalPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaAnimal.getModel();
        dados.setNumRows(0);

        lista.forEach(animal -> {
            dados.addRow(new Object[]{
                    animal.getId(),
                    animal.getTipo(),
                    animal.getNome(),
                    animal.getRaca(),
                    animal.getCliente().getCpf(),
            });
        });
    }//GEN-LAST:event_jTFPesquisaKeyPressed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFidAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFidAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidAnimalActionPerformed

    private void ButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenuActionPerformed
        TelaPrincipal telaPrincipal= new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonMenu;
    private javax.swing.JButton ButtonPesquisar2;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDonoCpf;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFRaca;
    private javax.swing.JTextField jTFTipo;
    private javax.swing.JTextField jTFidAnimal;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTable tabelaAnimal;
    // End of variables declaration//GEN-END:variables

}