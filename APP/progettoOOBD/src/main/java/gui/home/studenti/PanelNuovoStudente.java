package gui.home.studenti;

import controller.Controller;
import gui.home.HomeFrameOperatore;
import gui.home.PanelContenutiGenerico;

public class PanelNuovoStudente extends PanelContenutiGenerico {
    
    public PanelNuovoStudente(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNomeStudente = new javax.swing.JTextField();
        textFieldCognomeStudente = new javax.swing.JTextField();
        buttonRegistraStudente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        textFieldNomeStudente.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNomeStudente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNomeStudente.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNomeStudente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNomeStudente.setSelectionColor(new java.awt.Color(51, 153, 255));

        textFieldCognomeStudente.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCognomeStudente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldCognomeStudente.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCognomeStudente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldCognomeStudente.setSelectionColor(new java.awt.Color(51, 153, 255));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldNomeStudente)
                                .addComponent(textFieldCognomeStudente))
                            .addGap(92, 92, 92))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(152, 152, 152)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(textFieldNomeStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(117, 117, 117)
                    .addComponent(textFieldCognomeStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                    .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(101, 101, 101)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistraStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraStudenteActionPerformed
        // TODO add your handling code here:
        String nome = textFieldNomeStudente.getText();
        String cognome = textFieldCognomeStudente.getText();

        getController().nuovoStudente(nome, cognome);

        getHomeFrame().mostraCardStudentiHome();
    }//GEN-LAST:event_buttonRegistraStudenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistraStudente;
    private javax.swing.JTextField textFieldCognomeStudente;
    private javax.swing.JTextField textFieldNomeStudente;
    // End of variables declaration//GEN-END:variables
}
