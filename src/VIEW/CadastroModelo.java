/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.FabricanteDAO;
import DAO.ModeloDAO;
import DTO.FabricanteDTO;
import DTO.ModeloDTO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Claudio
 */
public class CadastroModelo extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroModelo
     */
    public CadastroModelo() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTModelo.getModel();
        jTModelo.setRowSorter(new TableRowSorter(modelo));
        
        DefaultTableModel modelo2 = (DefaultTableModel) jTFabricante.getModel();
        jTFabricante.setRowSorter(new TableRowSorter(modelo2));
        
        readTableFabricante();
        readTableModelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFabricante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTModelo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIdModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdFabricante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Modelo");

        jTFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Fabricante", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFabricanteMouseClicked(evt);
            }
        });
        jTFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFabricanteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTFabricante);

        jTModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Modelo", "ID Fabricante", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTModeloMouseClicked(evt);
            }
        });
        jTModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTModeloKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTModelo);

        jLabel1.setText("Id Modelo");

        jLabel2.setText("Nome ");

        jLabel3.setText("Id Fabricante");

        jLabel4.setText("Modelo");

        jLabel5.setText("Fabricante");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atulizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdModelo))
                            .addGap(67, 67, 67)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(txtNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAtualizar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(txtIdFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(jButton3))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addGap(101, 101, 101)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar)
                    .addComponent(jButton3))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        ModeloDTO m = new ModeloDTO();
        ModeloDAO dao = new ModeloDAO();

        m.setNome(txtNomeModelo.getText());
        m.setId_fabricante(Integer.parseInt(txtIdFabricante.getText()));
       

        dao.create(m);

        readTableModelo();
        limpar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if (jTFabricante.getSelectedRow() != -1) {

            ModeloDTO m = new ModeloDTO();
            ModeloDAO dao = new ModeloDAO();

            m.setNome(txtNomeModelo.getText());
            m.setId_fabricante(Integer.parseInt(txtIdFabricante.getText()));
            
            m.setId_modelo((int) jTModelo.getValueAt(jTModelo.getSelectedRow(), 0));

            dao.update(m);

            readTableModelo();
            limpar();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jTModelo.getSelectedRow() != -1) {
            ModeloDTO m = new ModeloDTO();
            ModeloDAO dao = new ModeloDAO();

            
            m.setId_modelo((int) jTModelo.getValueAt(jTModelo.getSelectedRow(), 0));

            dao.delete(m);

            readTableModelo();
            limpar();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTModeloMouseClicked
        // TODO add your handling code here:
        
        if (jTModelo.getSelectedRow() != -1) {

            txtIdModelo.setText(jTModelo.getValueAt(jTModelo.getSelectedRow(), 0).toString());
            txtNomeModelo.setText(jTModelo.getValueAt(jTModelo.getSelectedRow(), 1).toString());
           
        }
    }//GEN-LAST:event_jTModeloMouseClicked

    private void jTFabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFabricanteMouseClicked
        // TODO add your handling code here:
        if (jTFabricante.getSelectedRow() != -1) {

            txtIdFabricante.setText(jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 0).toString());
            
           
        }
    }//GEN-LAST:event_jTFabricanteMouseClicked

    private void jTModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTModeloKeyReleased
        // TODO add your handling code here:
        if (jTModelo.getSelectedRow() != -1) {

            txtIdModelo.setText(jTModelo.getValueAt(jTModelo.getSelectedRow(), 0).toString());
            txtNomeModelo.setText(jTModelo.getValueAt(jTModelo.getSelectedRow(), 1).toString());
           
        }
        
    }//GEN-LAST:event_jTModeloKeyReleased

    private void jTFabricanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFabricanteKeyReleased
        // TODO add your handling code here:
        if (jTFabricante.getSelectedRow() != -1) {

            txtIdFabricante.setText(jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 0).toString());
            
           
        }
    }//GEN-LAST:event_jTFabricanteKeyReleased
    public void readTableFabricante (){
        DefaultTableModel modelo2 = (DefaultTableModel) jTFabricante.getModel();
        modelo2.setNumRows(0);
        FabricanteDAO fdao = new FabricanteDAO();

        for (FabricanteDTO f : fdao.read()) {

            modelo2.addRow(new Object[]{
                f.getId_fabricante(),
                f.getNome()

            });

        }
    }
    
    public void readTableModelo (){
        DefaultTableModel modelo = (DefaultTableModel) jTModelo.getModel();
        modelo.setNumRows(0);
        ModeloDAO mdao = new ModeloDAO();

        for (ModeloDTO m : mdao.read()) {

            modelo.addRow(new Object[]{
                m.getId_modelo(),
                m.getId_fabricante(),
                m.getNome()

            });

        }
    }
    
    private void limpar(){
        String texto = " ";
        
        txtNomeModelo.setText(texto);
        txtIdModelo.setText(texto);
        txtIdFabricante.setText(texto);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTFabricante;
    private javax.swing.JTable jTModelo;
    private javax.swing.JTextField txtIdFabricante;
    private javax.swing.JTextField txtIdModelo;
    private javax.swing.JTextField txtNomeModelo;
    // End of variables declaration//GEN-END:variables
}