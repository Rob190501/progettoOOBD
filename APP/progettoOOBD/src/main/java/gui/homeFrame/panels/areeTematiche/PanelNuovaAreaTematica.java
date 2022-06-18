package gui.homeFrame.panels.areeTematiche;

import controller.Controller;
import eccezioni.gui.CampoVuotoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelNuovaAreaTematica extends PanelGenerico {
    
    public PanelNuovaAreaTematica(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNome = new javax.swing.JTextField();
        textFieldDescrizione = new javax.swing.JTextField();
        buttonRegistraAreaTematica = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelNuovaAreaTematica = new javax.swing.JLabel();
        labelNomeAreaTematica = new javax.swing.JLabel();
        labelDescrizioneAreaTematica = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        textFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNome.setSelectionColor(new java.awt.Color(51, 153, 255));

        textFieldDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescrizione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDescrizione.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDescrizione.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDescrizione.setSelectionColor(new java.awt.Color(51, 153, 255));

        buttonRegistraAreaTematica.setBackground(new java.awt.Color(153, 204, 255));
        buttonRegistraAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegistraAreaTematica.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistraAreaTematica.setText("Registra area");
        buttonRegistraAreaTematica.setBorder(null);
        buttonRegistraAreaTematica.setBorderPainted(false);
        buttonRegistraAreaTematica.setFocusPainted(false);
        buttonRegistraAreaTematica.setOpaque(true);
        buttonRegistraAreaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistraAreaTematicaActionPerformed(evt);
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

        labelNuovaAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNuovaAreaTematica.setForeground(new java.awt.Color(153, 204, 255));
        labelNuovaAreaTematica.setText("Nuova area tematica");

        labelNomeAreaTematica.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNomeAreaTematica.setForeground(new java.awt.Color(153, 204, 255));
        labelNomeAreaTematica.setText("Nome area tematica");

        labelDescrizioneAreaTematica.setBackground(new java.awt.Color(255, 255, 255));
        labelDescrizioneAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDescrizioneAreaTematica.setForeground(new java.awt.Color(153, 204, 255));
        labelDescrizioneAreaTematica.setText("Descrizione area tematica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNuovaAreaTematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 175, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNomeAreaTematica, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelDescrizioneAreaTematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(buttonRegistraAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldDescrizione)
                            .addComponent(textFieldNome))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelNuovaAreaTematica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelNomeAreaTematica)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelDescrizioneAreaTematica)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRegistraAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistraAreaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraAreaTematicaActionPerformed
        try {
            controllaCampi();
            getController().nuovaAreaTematica(textFieldNome.getText(), textFieldDescrizione.getText());
            getHomeFrame().mostraPanelAreeTematiche();
        }
        catch(CampoVuotoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRegistraAreaTematicaActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelAreeTematiche();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void controllaCampi() throws CampoVuotoException {
        if (textFieldNome.getText().isBlank() || textFieldDescrizione.getText().isBlank()) {
            throw new CampoVuotoException();
        }
    }
    
    public void svuotaCampi() {
        textFieldNome.setText("");
        textFieldDescrizione.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonRegistraAreaTematica;
    private javax.swing.JLabel labelDescrizioneAreaTematica;
    private javax.swing.JLabel labelNomeAreaTematica;
    private javax.swing.JLabel labelNuovaAreaTematica;
    private javax.swing.JTextField textFieldDescrizione;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

}
