package poo_projetoFinal.view;

import poo_projetoFinal.DAO.MedicamentoDAO;
import poo_projetoFinal.model.Medicamento;
import poo_projetoFinal.model.Funcionario;
import poo_projetoFinal.model.Utilitarios;
import poo_projetoFinal.model.Animal;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class MedicamentoView extends javax.swing.JFrame {

    //método LISTAR NA TABELA
    public void listar(){
        MedicamentoDAO MedicamentoDAO = new MedicamentoDAO();
        List<Medicamento> lista = MedicamentoDAO.listarMedicamento();
        DefaultTableModel dados = (DefaultTableModel) tabelaMedicamento.getModel();
        dados.setNumRows(0);

        lista.forEach(medicamento -> {
            dados.addRow(new Object[]{
                    medicamento.getId(),
                    medicamento.getNome(),
                    medicamento.getQuantidade(),
                    medicamento.getValor(),
                    medicamento.getFuncionario().getCrmv(),
                    medicamento.getAnimal().getId(),
            });
        });

    }
    public MedicamentoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFAnimalId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFidMedicamento = new javax.swing.JTextField();
        jTFFuncionaCrmv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        painelConsulta = new javax.swing.JPanel();
        ButtonPesquisar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTFPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedicamento = new javax.swing.JTable();
        ButtonSalvar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();

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
        jLabel1.setText("Medicamentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel2.setText("idMedicamento:");

        jTFAnimalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAnimalIdActionPerformed(evt);
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
        jLabel4.setText("Quantidade:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Valor:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Animal ID:");

        jTFidMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFidMedicamentoActionPerformed(evt);
            }
        });

        jTFFuncionaCrmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFuncionaCrmvActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Funcionário que receitou:");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
                painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(painelDadosLayout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadosLayout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTFidMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFFuncionaCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(165, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
                painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))
                        .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTFidMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)
                                                .addComponent(jTFFuncionaCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTFAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6))))
        );

        jTabbedPane1.addTab("Dados do Medicamento", painelDados);

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

        tabelaMedicamento.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "idMedicamento", "Nome", "Quantidade", "Valor", "Funcionario receitou", "ID Animal"
                }
        ));
        tabelaMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMedicamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMedicamento);

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
                                .addContainerGap(372, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar Medicamento", painelConsulta);

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

        jButtonMenu.setText("MENU");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
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
                                .addGap(91, 91, 91)
                                .addComponent(ButtonSalvar)
                                .addGap(54, 54, 54)
                                .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButtonMenu)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonExcluir, ButtonSalvar, jButtonMenu});

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
                                        .addComponent(jButtonMenu))
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonExcluir, ButtonSalvar, jButtonMenu});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFAnimalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAnimalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAnimalIdActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        //BOTÃO SALVAR
        Medicamento medicamento = new Medicamento();
        medicamento.setId(Integer.parseInt(jTFidMedicamento.getText()));
        medicamento.setNome(jTFNome.getText());
        medicamento.setQuantidade(Integer.parseInt(jTFQtd.getText()));
        medicamento.setValor(Double.parseDouble(jTFValor.getText()));

        Animal animal = new Animal();
        animal.setId(Integer.parseInt(jTFAnimalId.getText()));
        medicamento.setAnimal(animal);

        Funcionario funcionario = new Funcionario();
        funcionario.setCrmv(Integer.parseInt(jTFFuncionaCrmv.getText()));
        medicamento.setFuncionario(funcionario);
        MedicamentoDAO MedicamentoDAO = new MedicamentoDAO();
        MedicamentoDAO.cadastrarMedicamento(medicamento);

        new Utilitarios().LimpaTela(painelDados);

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed

        Medicamento medicamento = new Medicamento();
        medicamento.setId(Integer.parseInt(jTFidMedicamento.getText()));

        MedicamentoDAO MedicamentoDAO = new MedicamentoDAO();
        MedicamentoDAO.excluirMedicamento(medicamento);
        new Utilitarios().LimpaTela(painelDados);

    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //CARREGA A LISTA
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMedicamentoMouseClicked
        //CLICANDO NA TABELA E PEGANDO OS DADOS
        jTabbedPane1.setSelectedIndex(0);   //INDO PARA OUTRA ABA
        jTFidMedicamento.setText(tabelaMedicamento.getValueAt(tabelaMedicamento.getSelectedRow(), 0).toString());     //pegando a linha selecionada
        jTFNome.setText(tabelaMedicamento.getValueAt(tabelaMedicamento.getSelectedRow(), 1).toString());            //pegando a linha selecionada
        jTFQtd.setText(tabelaMedicamento.getValueAt(tabelaMedicamento.getSelectedRow(), 2).toString());             //pegando a linha selecionada
        jTFValor.setText(tabelaMedicamento.getValueAt(tabelaMedicamento.getSelectedRow(), 3).toString());           //pegando a linha selecionada
        jTFFuncionaCrmv.setText(tabelaMedicamento.getValueAt(tabelaMedicamento.getSelectedRow(), 4).toString());    //pegando a linha selecionada
        jTFAnimalId.setText(tabelaMedicamento.getValueAt(tabelaMedicamento.getSelectedRow(), 5).toString());        //pegando a linha selecionada

    }//GEN-LAST:event_tabelaMedicamentoMouseClicked

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        //BOTÃO EDITAR
        Medicamento medicamento = new Medicamento();
        medicamento.setId(Integer.parseInt(jTFidMedicamento.getText()));
        medicamento.setNome(jTFNome.getText());
        medicamento.setQuantidade(Integer.parseInt(jTFQtd.getText()));
        medicamento.setValor(Double.parseDouble(jTFValor.getText()));

        Animal animal = new Animal();
        animal.setId(Integer.parseInt(jTFAnimalId.getText()));
        medicamento.setAnimal(animal);

        Funcionario funcionario = new Funcionario();
        funcionario.setCrmv(Integer.parseInt(jTFFuncionaCrmv.getText()));
        medicamento.setFuncionario(funcionario);

        MedicamentoDAO MedicamentoDAO = new MedicamentoDAO();
        MedicamentoDAO.alterarMedicamento(medicamento);

        new Utilitarios().LimpaTela(painelDados);

    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisar2ActionPerformed
        //BOTÃO PESQUISAR
        String nome= "%"+jTFPesquisa.getText()+ "%";  //pegando o nome digitado e colocando na string

        MedicamentoDAO MedicamentoDAO = new MedicamentoDAO();
        List<Medicamento>lista = MedicamentoDAO.listarMedicamentoporNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaMedicamento.getModel();
        dados.setNumRows(0);

        lista.forEach(medicamento -> {
            dados.addRow(new Object[]{
                    medicamento.getId(),
                    medicamento.getNome(),
                    medicamento.getQuantidade(),
                    medicamento.getValor(),
                    medicamento.getFuncionario().getCrmv(),
                    medicamento.getAnimal().getId(),
            });
        });
    }//GEN-LAST:event_ButtonPesquisar2ActionPerformed

    private void jTFPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyPressed
        //IR APARECENDO O NOME DE ACORDO QUE DIGITA
        String nome = "%"+jTFPesquisa.getText()+ "%";   //pegando o nome digitado e colocando na string

        MedicamentoDAO MedicamentoDAO = new MedicamentoDAO();
        List<Medicamento>lista = MedicamentoDAO.listarMedicamentoporNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaMedicamento.getModel();
        dados.setNumRows(0);

        lista.forEach(medicamento -> {
            dados.addRow(new Object[]{
                    medicamento.getId(),
                    medicamento.getNome(),
                    medicamento.getQuantidade(),
                    medicamento.getFuncionario().getCrmv(),
                    medicamento.getAnimal().getId(),
            });
        });
    }//GEN-LAST:event_jTFPesquisaKeyPressed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFidMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFidMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidMedicamentoActionPerformed

    private void jTFFuncionaCrmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFuncionaCrmvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFuncionaCrmvActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MedicamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicamentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonPesquisar2;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAnimalId;
    private javax.swing.JTextField jTFFuncionaCrmv;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFQtd;
    private javax.swing.JTextField jTFValor;
    private javax.swing.JTextField jTFidMedicamento;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTable tabelaMedicamento;
    // End of variables declaration//GEN-END:variables

}