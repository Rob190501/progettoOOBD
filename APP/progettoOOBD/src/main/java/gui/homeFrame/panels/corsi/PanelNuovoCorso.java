package gui.homeFrame.panels.corsi;

import controller.Controller;
import eccezioni.elementiGui.CampoVuotoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;
import java.util.Date;

public class PanelNuovoCorso extends PanelGenerico {
    
    public PanelNuovoCorso(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNomeCorso = new javax.swing.JTextField();
        textFieldTassoPresenze = new javax.swing.JTextField();
        buttonRegistraStudente = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelNuovoCorso = new javax.swing.JLabel();
        labelNomeCorso = new javax.swing.JLabel();
        labelTassoPresenze = new javax.swing.JLabel();
        labelDescrizione = new javax.swing.JLabel();
        textFieldDescrizione = new javax.swing.JTextField();
        labelNumeroMassimoIscritti = new javax.swing.JLabel();
        textFieldNumeroMassimoIscritti = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        textFieldNomeCorso.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNomeCorso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNomeCorso.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNomeCorso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNomeCorso.setSelectionColor(new java.awt.Color(51, 153, 255));

        textFieldTassoPresenze.setBackground(new java.awt.Color(255, 255, 255));
        textFieldTassoPresenze.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldTassoPresenze.setForeground(new java.awt.Color(0, 0, 0));
        textFieldTassoPresenze.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldTassoPresenze.setSelectionColor(new java.awt.Color(51, 153, 255));

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

        labelNuovoCorso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNuovoCorso.setForeground(new java.awt.Color(153, 204, 255));
        labelNuovoCorso.setText("Nuovo corso");

        labelNomeCorso.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeCorso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNomeCorso.setForeground(new java.awt.Color(153, 204, 255));
        labelNomeCorso.setText("Nome corso");

        labelTassoPresenze.setBackground(new java.awt.Color(255, 255, 255));
        labelTassoPresenze.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTassoPresenze.setForeground(new java.awt.Color(153, 204, 255));
        labelTassoPresenze.setText("Tasso presenze minime");

        labelDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        labelDescrizione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDescrizione.setForeground(new java.awt.Color(153, 204, 255));
        labelDescrizione.setText("Descrizione");

        textFieldDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescrizione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDescrizione.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDescrizione.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDescrizione.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelNumeroMassimoIscritti.setBackground(new java.awt.Color(255, 255, 255));
        labelNumeroMassimoIscritti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNumeroMassimoIscritti.setForeground(new java.awt.Color(153, 204, 255));
        labelNumeroMassimoIscritti.setText("Numero massimo iscritti");

        textFieldNumeroMassimoIscritti.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNumeroMassimoIscritti.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNumeroMassimoIscritti.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNumeroMassimoIscritti.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNumeroMassimoIscritti.setSelectionColor(new java.awt.Color(51, 153, 255));

        jSpinner1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel());
        jSpinner1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1, ""));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNomeCorso, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelTassoPresenze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldTassoPresenze)
                            .addComponent(textFieldNomeCorso)
                            .addComponent(labelNuovoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNumeroMassimoIscritti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNumeroMassimoIscritti)
                            .addComponent(textFieldDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelNuovoCorso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomeCorso)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNomeCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelTassoPresenze)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldTassoPresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescrizione)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelNumeroMassimoIscritti)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNumeroMassimoIscritti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistraStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void buttonRegistraStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraStudenteActionPerformed
        // TODO add your handling code here:
        /*try {
            if (verificaCampiVuoti()) {
                throw new CampoVuotoException();
            }
            getController().nuovoCorso( textFieldNomeCorso.getText(),
                                        textFieldDescrizione.getText(),
                                        Integer.parseInt(textFieldTassoPresenze.getText()),
                                        Integer.parseInt(textFieldNumeroMassimoIscritti.getText()) );
            svuotaCampi();
            getHomeFrame().mostraCardCorsi();
        }
        catch(CampoVuotoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
        catch(NumberFormatException e) {
            getHomeFrame().mostraEccezione(e.getLocalizedMessage());
        }*/
        int x = (int) jSpinner1.getValue();
        //Date y = (Date) jSpinner1.getValue();
        System.out.println(x+1);
        //System.out.println(Integer.parseInt(textFieldNomeCorso.getText())+1);
    }//GEN-LAST:event_buttonRegistraStudenteActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        // TODO add your handling code here:
        svuotaCampi();
        getHomeFrame().mostraCardCorsi();
    }//GEN-LAST:event_buttonIndietroActionPerformed
    
    private void svuotaCampi() {
        textFieldNomeCorso.setText("");
        textFieldTassoPresenze.setText("");
    }

    private boolean verificaCampiVuoti() {
        return textFieldNomeCorso.getText().equals("") ||
               textFieldDescrizione.getText().equals("") ||
               textFieldTassoPresenze.getText().equals("") ||
               textFieldNumeroMassimoIscritti.getText().equals("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonRegistraStudente;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelDescrizione;
    private javax.swing.JLabel labelNomeCorso;
    private javax.swing.JLabel labelNumeroMassimoIscritti;
    private javax.swing.JLabel labelNuovoCorso;
    private javax.swing.JLabel labelTassoPresenze;
    private javax.swing.JTextField textFieldDescrizione;
    private javax.swing.JTextField textFieldNomeCorso;
    private javax.swing.JTextField textFieldNumeroMassimoIscritti;
    private javax.swing.JTextField textFieldTassoPresenze;
    // End of variables declaration//GEN-END:variables
}
