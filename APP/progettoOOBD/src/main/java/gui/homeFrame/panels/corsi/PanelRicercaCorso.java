package gui.homeFrame.panels.corsi;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelRicercaCorso extends PanelGenerico {

    public PanelRicercaCorso(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableCorsi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRicercaCorsi = new javax.swing.JLabel();
        scrollPaneTableCorsi = new javax.swing.JScrollPane();
        tableCorsi = new javax.swing.JTable();
        textFieldDescrizione = new javax.swing.JTextField();
        buttonIndietro = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelRicercaCorsi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelRicercaCorsi.setForeground(new java.awt.Color(153, 204, 255));
        labelRicercaCorsi.setText("Ricerca corsi");

        tableCorsi.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsi.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Nome", "Descrizione", "Tasso presenze minime", "Numero massimo iscritti"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCorsi.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsi.setRowHeight(40);
        tableCorsi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsi.setShowGrid(true);
        tableCorsi.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsi.setViewportView(tableCorsi);

        textFieldDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescrizione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDescrizione.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDescrizione.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDescrizione.setSelectionColor(new java.awt.Color(51, 153, 255));
        textFieldDescrizione.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldDescrizioneKeyTyped(evt);
            }
        });

        buttonIndietro.setBackground(new java.awt.Color(153, 204, 255));
        buttonIndietro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonIndietro.setForeground(new java.awt.Color(255, 255, 255));
        buttonIndietro.setText("Indietro");
        buttonIndietro.setBorder(null);
        buttonIndietro.setBorderPainted(false);
        buttonIndietro.setFocusPainted(false);
        buttonIndietro.setOpaque(true);
        buttonIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIndietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneTableCorsi)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRicercaCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addGap(408, 408, 408))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelRicercaCorsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(scrollPaneTableCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelCorsi();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void textFieldDescrizioneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldDescrizioneKeyTyped
        getController().ricercaCorso(textFieldDescrizione.getText().trim());
    }//GEN-LAST:event_textFieldDescrizioneKeyTyped
    
    public void svuotaTutteTable() {
        svuotaTable(tableCorsi);
    }
    
    public void inserisciInTableCorsi(Object[] row) {
        inserisciRigaInJTable(tableCorsi, row);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelRicercaCorsi;
    private javax.swing.JScrollPane scrollPaneTableCorsi;
    private javax.swing.JTable tableCorsi;
    private javax.swing.JTextField textFieldDescrizione;
    // End of variables declaration//GEN-END:variables

}
