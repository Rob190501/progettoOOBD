package gui.homeFrame.panels.corsi;

import controller.Controller;
import eccezioni.elementiGui.CampoVuotoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;

public class PanelNuovoCorso extends PanelGenerico {
    
    public PanelNuovoCorso(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNomeStudente = new javax.swing.JTextField();
        textFieldCognomeStudente = new javax.swing.JTextField();
        buttonRegistraStudente = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelNuovoStudente = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCognome = new javax.swing.JLabel();
        labelNome1 = new javax.swing.JLabel();
        textFieldNomeStudente1 = new javax.swing.JTextField();
        labelCognome1 = new javax.swing.JLabel();
        textFieldCognomeStudente1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

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
        labelNuovoStudente.setText("Nuovo corso");

        labelNome.setBackground(new java.awt.Color(255, 255, 255));
        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(153, 204, 255));
        labelNome.setText("Nome");

        labelCognome.setBackground(new java.awt.Color(255, 255, 255));
        labelCognome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCognome.setForeground(new java.awt.Color(153, 204, 255));
        labelCognome.setText("Cognome");

        labelNome1.setBackground(new java.awt.Color(255, 255, 255));
        labelNome1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNome1.setForeground(new java.awt.Color(153, 204, 255));
        labelNome1.setText("Nome");

        textFieldNomeStudente1.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNomeStudente1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNomeStudente1.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNomeStudente1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNomeStudente1.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelCognome1.setBackground(new java.awt.Color(255, 255, 255));
        labelCognome1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCognome1.setForeground(new java.awt.Color(153, 204, 255));
        labelCognome1.setText("Cognome");

        textFieldCognomeStudente1.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCognomeStudente1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldCognomeStudente1.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCognomeStudente1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldCognomeStudente1.setSelectionColor(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(188, Short.MAX_VALUE)
                        .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(labelCognome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldCognomeStudente)
                                    .addComponent(textFieldNomeStudente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelCognome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldCognomeStudente1)
                                    .addComponent(textFieldNomeStudente1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelNuovoStudente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNomeStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelCognome)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldCognomeStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome1)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNomeStudente1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelCognome1)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldCognomeStudente1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void buttonRegistraStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraStudenteActionPerformed
        // TODO add your handling code here:
        String nome = textFieldNomeStudente.getText();
        String cognome = textFieldCognomeStudente.getText();

        try {
            if (nome.equals("") || cognome.equals("")) {
                throw new CampoVuotoException();
            }
            //getController().nuovoStudente(nome, cognome);
            svuotaCampi();
            getHomeFrame().mostraCardCorsi();
        }
        catch(CampoVuotoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRegistraStudenteActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        // TODO add your handling code here:
        svuotaCampi();
        getHomeFrame().mostraCardCorsi();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void svuotaCampi() {
        textFieldNomeStudente.setText("");
        textFieldCognomeStudente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonRegistraStudente;
    private javax.swing.JLabel labelCognome;
    private javax.swing.JLabel labelCognome1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelNuovoStudente;
    private javax.swing.JTextField textFieldCognomeStudente;
    private javax.swing.JTextField textFieldCognomeStudente1;
    private javax.swing.JTextField textFieldNomeStudente;
    private javax.swing.JTextField textFieldNomeStudente1;
    // End of variables declaration//GEN-END:variables
}
