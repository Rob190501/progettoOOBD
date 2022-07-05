package gui.homeFrame.panels.corsi;

import controller.Controller;
import eccezioni.gui.CampoVuotoException;
import eccezioni.gui.FormatoSbagliatoException;
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

        textFieldNome = new javax.swing.JTextField();
        buttonRegistraCorso = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelNuovoCorso = new javax.swing.JLabel();
        labelNomeCorso = new javax.swing.JLabel();
        labelTassoPresenze = new javax.swing.JLabel();
        labelDescrizione = new javax.swing.JLabel();
        textFieldDescrizione = new javax.swing.JTextField();
        labelNumeroMassimoIscritti = new javax.swing.JLabel();
        spinnerNumeroMassimoIscritti = new javax.swing.JSpinner();
        spinnerTassoPresenze = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        textFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNome.setSelectionColor(new java.awt.Color(51, 153, 255));

        buttonRegistraCorso.setBackground(new java.awt.Color(153, 204, 255));
        buttonRegistraCorso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegistraCorso.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistraCorso.setText("Registra corso");
        buttonRegistraCorso.setBorder(null);
        buttonRegistraCorso.setBorderPainted(false);
        buttonRegistraCorso.setFocusPainted(false);
        buttonRegistraCorso.setOpaque(true);
        buttonRegistraCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistraCorsoActionPerformed(evt);
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

        spinnerNumeroMassimoIscritti.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        spinnerNumeroMassimoIscritti.setModel(new javax.swing.SpinnerNumberModel());
        spinnerNumeroMassimoIscritti.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        spinnerNumeroMassimoIscritti.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerNumeroMassimoIscritti.setEditor(new javax.swing.JSpinner.NumberEditor(spinnerNumeroMassimoIscritti, ""));

        spinnerTassoPresenze.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        spinnerTassoPresenze.setModel(new javax.swing.SpinnerNumberModel());
        spinnerTassoPresenze.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        spinnerTassoPresenze.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerTassoPresenze.setEditor(new javax.swing.JSpinner.NumberEditor(spinnerTassoPresenze, ""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelNomeCorso, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(labelTassoPresenze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldNome)
                        .addComponent(labelNuovoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spinnerTassoPresenze, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNumeroMassimoIscritti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(spinnerNumeroMassimoIscritti, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(buttonRegistraCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelTassoPresenze)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerNumeroMassimoIscritti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerTassoPresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescrizione)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelNumeroMassimoIscritti)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistraCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistraCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraCorsoActionPerformed
        try {
            controllaCampi();
            getController().nuovoCorso(textFieldNome.getText(),
                                       textFieldDescrizione.getText(),
                                       (int) spinnerTassoPresenze.getValue(),
                                       (int) spinnerNumeroMassimoIscritti.getValue());
            getHomeFrame().mostraPanelCorsi();
        }
        catch(CampoVuotoException | FormatoSbagliatoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRegistraCorsoActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelCorsi();
    }//GEN-LAST:event_buttonIndietroActionPerformed
    
    public void svuotaCampi() {
        textFieldNome.setText("");
        textFieldDescrizione.setText("");
        spinnerTassoPresenze.setValue(0);
        spinnerNumeroMassimoIscritti.setValue(0);
    }

    private void controllaCampi() throws CampoVuotoException, FormatoSbagliatoException {
        if (textFieldNome.getText().isBlank() || textFieldDescrizione.getText().isBlank()) {
            throw new CampoVuotoException();
        }
        if( ((int)spinnerTassoPresenze.getValue())<0 || ((int)spinnerTassoPresenze.getValue())>100 ) {
            throw new FormatoSbagliatoException("spinner tasso presenze", "un numero >= 0 e <= 100");
        }
        if( ((int)spinnerNumeroMassimoIscritti.getValue())<0 ) {
            throw new FormatoSbagliatoException("spinner numero massimo iscritti", "un numero >= 0");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonRegistraCorso;
    private javax.swing.JLabel labelDescrizione;
    private javax.swing.JLabel labelNomeCorso;
    private javax.swing.JLabel labelNumeroMassimoIscritti;
    private javax.swing.JLabel labelNuovoCorso;
    private javax.swing.JLabel labelTassoPresenze;
    private javax.swing.JSpinner spinnerNumeroMassimoIscritti;
    private javax.swing.JSpinner spinnerTassoPresenze;
    private javax.swing.JTextField textFieldDescrizione;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

}
