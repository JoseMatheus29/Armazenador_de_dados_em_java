import java.io.*;
import java.util.ArrayList;
import java.nio.file.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author Jose Matheus
 */
public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
    }
    public ArrayList<Produto> ListaProdutos = new ArrayList<>();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        salvar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        remover = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        txtquantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);

        tabela.setBackground(new java.awt.Color(255, 255, 255));
        tabela.setForeground(new java.awt.Color(0, 0, 0));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        salvar.setBackground(new java.awt.Color(255, 255, 255));
        salvar.setForeground(new java.awt.Color(0, 0, 0));
        salvar.setText("Gerar txt");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        atualizar.setBackground(new java.awt.Color(255, 255, 255));
        atualizar.setForeground(new java.awt.Color(0, 0, 0));
        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        txtnome.setBackground(new java.awt.Color(255, 255, 255));
        txtnome.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Quantidade");

        remover.setBackground(new java.awt.Color(255, 255, 255));
        remover.setForeground(new java.awt.Color(0, 0, 0));
        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        adicionar.setBackground(new java.awt.Color(255, 255, 255));
        adicionar.setForeground(new java.awt.Color(0, 0, 0));
        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        txtquantidade.setBackground(new java.awt.Color(255, 255, 255));
        txtquantidade.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Documento");

        jMenuItem1.setText("Verificar doc");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adicionar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(remover)))
                                .addGap(58, 58, 58)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salvar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(atualizar)
                    .addComponent(remover)
                    .addComponent(adicionar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        //pegar elemento selecionado 
        int posicao = tabela.getSelectedRow();
        txtquantidade.setText(tabela.getValueAt(posicao, 1).toString());
        txtnome.setText(tabela.getValueAt(posicao, 0).toString());

    }//GEN-LAST:event_tabelaMouseClicked

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        //salvar Documento
        try {
            FileWriter Documento = new FileWriter("produtos.txt",true);
            PrintWriter escrever = new PrintWriter(Documento);
             for(Produto prod1: ListaProdutos){
               int posicao = tabela.getSelectedRow();
               escrever.println("Nome:"+tabela.getValueAt(posicao, 0).toString());
               escrever.println("Quantidade:"+tabela.getValueAt(posicao, 1).toString());
               escrever.flush();
               escrever.close();
               Documento.close();
            }
        } catch (Exception error) {}
    }//GEN-LAST:event_salvarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        //atualizar tabela
        int posição = tabela.getSelectedRow();
        ListaProdutos.get(posição).setNome(txtnome.getText());
        ListaProdutos.get(posição).setQuantidade(txtquantidade.getText());
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for(Produto prd1: ListaProdutos){
                modelo.addRow(new Object[]{
                   prd1.getNome(),prd1.getQuantidade()
            });
        }
        txtquantidade.setText("");
        txtnome.setText("");
    }//GEN-LAST:event_atualizarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        //Metodo para remover produto
        int posição = tabela.getSelectedRow();
        ListaProdutos.remove(posição);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for(Produto prd1: ListaProdutos){
            modelo.addRow(new Object[]{
               prd1.getNome(),prd1.getQuantidade()
            });
        }
        txtquantidade.setText("");
        txtnome.setText("");
    }//GEN-LAST:event_removerActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        //Metodo para adicionar produto
        String quant = txtquantidade.getText();
        String nome = txtnome.getText();
        Produto produto1 = new Produto();
        if(nome.equals("") || quant.equals("")){
            JOptionPane.showMessageDialog(null, "Existem campos em branco, preencha novamente");
        }
        else{
            produto1.setNome(nome);
            produto1.setQuantidade(quant);
            ListaProdutos.add(produto1);
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for(Produto prd1: ListaProdutos){
                modelo.addRow(new Object[]{
                    prd1.getNome(),prd1.getQuantidade()
            });}
            txtquantidade.setText("");
            txtnome.setText("");
        }
    }//GEN-LAST:event_adicionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Encerrar programa
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Path caminho = Paths.get("C:\\Users\\Jose Matheus\\Documents\\NetBeansProjects\\Trabalho_final_v2\\produtos.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String TextoLido = new String(texto);
            JOptionPane.showMessageDialog(null, TextoLido);
            
        } catch (Exception error) {}
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remover;
    private javax.swing.JButton salvar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtquantidade;
    // End of variables declaration//GEN-END:variables
}
