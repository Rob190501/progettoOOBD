package gui.homeFrame.panels.lezioni;

import controller.Controller;
import eccezioni.elementiGui.CampoVuotoException;
import eccezioni.elementiGui.FormatoSbagliatoException;
import eccezioni.elementiGui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PanelNuovaLezione extends PanelGenerico {
    
    public PanelNuovaLezione(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldTitolo = new javax.swing.JTextField();
        buttonRegistraLezione = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelNuovaLezione = new javax.swing.JLabel();
        labelTitolo = new javax.swing.JLabel();
        labelDurata = new javax.swing.JLabel();
        labelDescrizione = new javax.swing.JLabel();
        textFieldDescrizione = new javax.swing.JTextField();
        labelDataOraInizio = new javax.swing.JLabel();
        scrollPaneTableCorsi = new javax.swing.JScrollPane();
        tableCorsi = new javax.swing.JTable();
        labelCorsoDellaLezione = new javax.swing.JLabel();
        textFieldDurata = new javax.swing.JTextField();
        spinnerDataOraInizio = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        textFieldTitolo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldTitolo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldTitolo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldTitolo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldTitolo.setSelectionColor(new java.awt.Color(51, 153, 255));

        buttonRegistraLezione.setBackground(new java.awt.Color(153, 204, 255));
        buttonRegistraLezione.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegistraLezione.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistraLezione.setText("Registra Lezione");
        buttonRegistraLezione.setBorder(null);
        buttonRegistraLezione.setBorderPainted(false);
        buttonRegistraLezione.setFocusPainted(false);
        buttonRegistraLezione.setOpaque(true);
        buttonRegistraLezione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistraLezioneActionPerformed(evt);
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

        labelNuovaLezione.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNuovaLezione.setForeground(new java.awt.Color(153, 204, 255));
        labelNuovaLezione.setText("Nuova Lezione");
        labelNuovaLezione.setToolTipText("");

        labelTitolo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitolo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitolo.setForeground(new java.awt.Color(153, 204, 255));
        labelTitolo.setText("Titolo");

        labelDurata.setBackground(new java.awt.Color(255, 255, 255));
        labelDurata.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDurata.setForeground(new java.awt.Color(153, 204, 255));
        labelDurata.setText("Durata");

        labelDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        labelDescrizione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDescrizione.setForeground(new java.awt.Color(153, 204, 255));
        labelDescrizione.setText("Descrizione");

        textFieldDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescrizione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDescrizione.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDescrizione.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDescrizione.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelDataOraInizio.setBackground(new java.awt.Color(255, 255, 255));
        labelDataOraInizio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDataOraInizio.setForeground(new java.awt.Color(153, 204, 255));
        labelDataOraInizio.setText("Data e ora inizio");

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

        labelCorsoDellaLezione.setBackground(new java.awt.Color(255, 255, 255));
        labelCorsoDellaLezione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCorsoDellaLezione.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsoDellaLezione.setText("Corso della lezione");

        textFieldDurata.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDurata.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDurata.setForeground(Color.GRAY);
        textFieldDurata.setText("HH:MM");
        textFieldDurata.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDurata.setSelectionColor(new java.awt.Color(51, 153, 255));
        textFieldDurata.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldDurataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldDurataFocusLost(evt);
            }
        });

        spinnerDataOraInizio.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        spinnerDataOraInizio.setModel(new javax.swing.SpinnerDateModel());
        spinnerDataOraInizio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        spinnerDataOraInizio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerDataOraInizio.setEditor(new javax.swing.JSpinner.DateEditor(spinnerDataOraInizio, "yyyy-MM-dd HH:mm"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrollPaneTableCorsi)
                    .addComponent(labelCorsoDellaLezione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDurata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldTitolo)
                            .addComponent(labelNuovaLezione, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldDurata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDataOraInizio, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(textFieldDescrizione)
                            .addComponent(spinnerDataOraInizio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(buttonRegistraLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelNuovaLezione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescrizione)
                    .addComponent(labelTitolo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDurata)
                    .addComponent(labelDataOraInizio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerDataOraInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelCorsoDellaLezione)
                .addGap(18, 18, 18)
                .addComponent(scrollPaneTableCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistraLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistraLezioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraLezioneActionPerformed
        try {
            controllaCampi();
            getController().nuovaLezione(textFieldTitolo.getText(),
                                         textFieldDescrizione.getText(),
                                         textFieldDurata.getText(),
                                         spinnerDataOraInizio.getValue(),
                                         ottieniOggettoSelezionato(tableCorsi));
            svuotaCampi();
            getHomeFrame().mostraCardLezioni();
        }
        catch(CampoVuotoException | NessunaRigaSelezionataException | FormatoSbagliatoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRegistraLezioneActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        svuotaCampi();
        getHomeFrame().mostraCardLezioni();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void textFieldDurataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldDurataFocusGained
        if(textFieldDurata.getText().equals("HH:MM")) {
            textFieldDurata.setForeground(Color.BLACK);
            textFieldDurata.setText("");
        }
    }//GEN-LAST:event_textFieldDurataFocusGained

    private void textFieldDurataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldDurataFocusLost
        if(textFieldDurata.getText().equals("")) {
            textFieldDurata.setForeground(Color.GRAY);
            textFieldDurata.setText("HH:MM");
        }
    }//GEN-LAST:event_textFieldDurataFocusLost
    
    public void svuotaTutteTable() {
        svuotaTable(tableCorsi);
    }
    
    public void inserisciInTableCorsi(Object[] riga) {
        inserisciRigaInJTable(tableCorsi, riga);
    }
    
    private void svuotaCampi() {
        textFieldTitolo.setText("");
        textFieldDescrizione.setText("");
        textFieldDurata.setForeground(Color.GRAY);
        textFieldDurata.setText("HH:MM");
    }

    private void controllaCampi() throws NessunaRigaSelezionataException, CampoVuotoException, FormatoSbagliatoException  {
        controllaRigaSelezionata(tableCorsi, "corsi");
        
        if ( textFieldTitolo.getText().equals("") ||
             textFieldDescrizione.getText().equals("") ||
             textFieldDurata.getText().equals("") ||
             textFieldDurata.getText().equals("HH:MM") ) {
            throw new CampoVuotoException();
        }
        
        Pattern pattern = Pattern.compile("[0-9][0-9]:[0-5][0-9]");
        Matcher matcher = pattern.matcher(textFieldDurata.getText());
        if(!matcher.find()) {
            throw new FormatoSbagliatoException("Durata", "HH:MM");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonRegistraLezione;
    private javax.swing.JLabel labelCorsoDellaLezione;
    private javax.swing.JLabel labelDataOraInizio;
    private javax.swing.JLabel labelDescrizione;
    private javax.swing.JLabel labelDurata;
    private javax.swing.JLabel labelNuovaLezione;
    private javax.swing.JLabel labelTitolo;
    private javax.swing.JScrollPane scrollPaneTableCorsi;
    private javax.swing.JSpinner spinnerDataOraInizio;
    private javax.swing.JTable tableCorsi;
    private javax.swing.JTextField textFieldDescrizione;
    private javax.swing.JTextField textFieldDurata;
    private javax.swing.JTextField textFieldTitolo;
    // End of variables declaration//GEN-END:variables

}
