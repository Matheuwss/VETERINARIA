package poo_projetoFinal.view;

import poo_projetoFinal.DAO.FuncionarioDAO;
import poo_projetoFinal.model.Funcionario;
import poo_projetoFinal.model.Utilitarios;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class FuncionarioView extends javax.swing.JFrame {

    //método LISTAR NA TABELA
    public void listar(){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        List<Funcionario> lista = funcionarioDAO.listarFuncionario();
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);

        lista.forEach(funcionario -> {
            dados.addRow(new Object[]{
                    funcionario.getCrmv(),
                    funcionario.getNome(),
                    funcionario.getCargo(),
                    funcionario.getSalario(),
                    funcionario.getIdade(),

            });
        });
    }
    public FuncionarioView() {
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
        jTFCRMV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFCargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFIdade = new javax.swing.JTextField();
        painelConsulta = new javax.swing.JPanel();
        ButtonPesquisar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTFPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
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
        jLabel1.setText("Funcionários");

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
        jLabel2.setText("CRMV Veterinário:");

        jTFCRMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCRMVActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Cargo:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Salário:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Idade:");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
                painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFCRMV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFNome))
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFCargo))
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTFSalario))
                                        .addGroup(painelDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTFIdade)))
                                .addContainerGap(278, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
                painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTFCRMV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTFCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Funcionário", painelDados);

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

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "CRMV", "Nome", "Cargo", "Salário", "Idade"
                }
        ));
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);

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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(painelConsultaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
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

        jTabbedPane1.addTab("Consultar Funcionário", painelConsulta);

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
                                .addGap(30, 30, 30)
                                .addComponent(ButtonSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
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

    private void jTFCRMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCRMVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCRMVActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        //BOTÃO SALVAR
        Funcionario funcionario = new Funcionario();
        funcionario.setCrmv(Integer.parseInt(jTFCRMV.getText()));
        funcionario.setNome(jTFNome.getText());
        funcionario.setCargo(jTFCargo.getText());
        funcionario.setSalario(Double.parseDouble(jTFSalario.getText()));
        funcionario.setIdade(Integer.parseInt(jTFIdade.getText()));

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.cadastrarFuncionario(funcionario);

        new Utilitarios().LimpaTela(painelDados);

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        Funcionario funcionario = new Funcionario();
        funcionario.setCrmv(Integer.parseInt(jTFCRMV.getText()));

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.excluirFuncionario(funcionario);
        new Utilitarios().LimpaTela(painelDados);
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //CARREGA A LISTA
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked
        //CLICANDO NA TABELA E PEGANDO OS DADOS
        jTabbedPane1.setSelectedIndex(0);   //INDO PARA OUTRA ABA
        jTFCRMV.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0).toString());    //pegando a linha selecionada
        jTFNome.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 1).toString());    //pegando a linha selecionada
        jTFCargo.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 2).toString());   //pegando a linha selecionada
        jTFSalario.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 3).toString()); //pegando a linha selecionada
        jTFIdade.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 4).toString());   //pegando a linha selecionada
    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        //BOTÃO EDITAR
        Funcionario funcionario = new Funcionario();
        funcionario.setCrmv(Integer.parseInt(jTFCRMV.getText()));
        funcionario.setNome(jTFNome.getText());
        funcionario.setCargo(jTFCargo.getText());
        funcionario.setSalario(Double.parseDouble(jTFSalario.getText()));
        funcionario.setIdade(Integer.parseInt(jTFIdade.getText()));

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.alterarFuncionario(funcionario);

        new Utilitarios().LimpaTela(painelDados);
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisar2ActionPerformed
        //BOTÃO PESQUISAR
        String nome = "%"+jTFPesquisa.getText()+ "%";   //pegando o nome digitado e colocando na string

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        List<Funcionario>lista = funcionarioDAO.buscarFuncionarioPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);

        lista.forEach(funcionario -> {
            dados.addRow(new Object[]{
                    funcionario.getCrmv(),
                    funcionario.getNome(),
                    funcionario.getCargo(),
                    funcionario.getSalario(),
                    funcionario.getIdade(),

            });
        });
    }//GEN-LAST:event_ButtonPesquisar2ActionPerformed

    private void jTFPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyPressed
        //IR APARECENDO O NOME DE ACORDO QUE DIGITA
        String nome = "%"+jTFPesquisa.getText()+ "%";   //pegando o nome digitado e colocando na string

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        List<Funcionario>lista = funcionarioDAO.buscarFuncionarioPorNome(nome);
        DefaultTableModel dados =(DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);

        lista.forEach(funcionario -> {
            dados.addRow(new Object[]{
                    funcionario.getCrmv(),
                    funcionario.getNome(),
                    funcionario.getCargo(),
                    funcionario.getSalario(),
                    funcionario.getIdade(),

            });
        });
    }//GEN-LAST:event_jTFPesquisaKeyPressed

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
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCRMV;
    private javax.swing.JTextField jTFCargo;
    private javax.swing.JTextField jTFIdade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFSalario;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables

}