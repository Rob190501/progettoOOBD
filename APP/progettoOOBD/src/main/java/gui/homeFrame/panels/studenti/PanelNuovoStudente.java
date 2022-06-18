package gui.homeFrame.panels.studenti;

import controller.Controller;
import eccezioni.gui.CampoVuotoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelNuovoStudente extends PanelGenerico {
    
    public PanelNuovoStudente(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNome = new javax.swing.JTextField();
        textFieldCognome = new javax.swing.JTextField();
        buttonRegistraStudente = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelNuovoStudente = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCognome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        textFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNome.setSelectionColor(new java.awt.Color(51, 153, 255));

        textFieldCognome.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCognome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldCognome.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCognome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldCognome.setSelectionColor(new java.awt.Color(51, 153, 255));

        buttonRegistraStudente.setBackground(new java.awt.Color(153, 204, 255));
        buttonRegistraStudente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegistraStudente.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistraStudente.setText("Registra studente");
        buttonRegistraStudente.setBorder(null);
        buttonRegistraStudente.setBorderPainted(false);
        buttonRegistraStudente.setFocusPainted(false);
        buttonRegistraStudente.setOpaque(true);
        buttonRegistraStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistraStudenteActionPerformed(evt);
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

        labelNuovoStudente.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNuovoStudente.setForeground(new java.awt.Color(153, 204, 255));
        labelNuovoStudente.setText("Nuovo studente");

        labelNome.setBackground(new java.awt.Color(255, 255, 255));
        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(153, 204, 255));
        labelNome.setText("Nome");

        labelCognome.setBackground(new java.awt.Color(255, 255, 255));
        labelCognome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCognome.setForeground(new java.awt.Color(153, 204, 255));
        labelCognome.setText("Cognome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(188, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelCognome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldCognome)
                            .addComponent(textFieldNome))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelNuovoStudente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelNome)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelCognome)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistraStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraStudenteActionPerformed
        try {
            controllaCampi();
            getController().nuovoStudente(textFieldNome.getText(), textFieldCognome.getText());
            getHomeFrame().mostraPanelStudenti();
        }
        catch(CampoVuotoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRegistraStudenteActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelStudenti();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void controllaCampi() throws CampoVuotoException {
        if (textFieldNome.getText().isBlank() ||
            textFieldCognome.getText().isBlank()) {
            throw new CampoVuotoException();
        }
    }
    
    public void svuotaCampi() {
        textFieldNome.setText("");
        textFieldCognome.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonRegistraStudente;
    private javax.swing.JLabel labelCognome;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNuovoStudente;
    private javax.swing.JTextField textFieldCognome;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

}
