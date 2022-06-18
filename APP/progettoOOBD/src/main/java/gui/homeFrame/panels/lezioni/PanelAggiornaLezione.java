package gui.homeFrame.panels.lezioni;

import controller.Controller;
import eccezioni.gui.CampoVuotoException;
import eccezioni.gui.FormatoSbagliatoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;
import java.awt.Color;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PanelAggiornaLezione extends PanelGenerico {
    
    public PanelAggiornaLezione(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
        nascondiColonnaOggetto(tableLezioneSelezionata);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAggiornaLezione = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelAggiornaLezione = new javax.swing.JLabel();
        labelLezioneSelezionata = new javax.swing.JLabel();
        scrollPaneTableLezioneSelezionata = new javax.swing.JScrollPane();
        tableLezioneSelezionata = new javax.swing.JTable();
        labelTitolo = new javax.swing.JLabel();
        labelDescrizione = new javax.swing.JLabel();
        textFieldTitolo = new javax.swing.JTextField();
        textFieldDescrizione = new javax.swing.JTextField();
        labelDurata = new javax.swing.JLabel();
        textFieldDurata = new javax.swing.JTextField();
        labelDataOraInizio = new javax.swing.JLabel();
        spinnerDataOraInizio = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        buttonAggiornaLezione.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaLezione.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAggiornaLezione.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaLezione.setText("Aggiorna lezione");
        buttonAggiornaLezione.setToolTipText("");
        buttonAggiornaLezione.setBorder(null);
        buttonAggiornaLezione.setBorderPainted(false);
        buttonAggiornaLezione.setFocusPainted(false);
        buttonAggiornaLezione.setOpaque(true);
        buttonAggiornaLezione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaLezioneActionPerformed(evt);
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

        labelAggiornaLezione.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAggiornaLezione.setForeground(new java.awt.Color(153, 204, 255));
        labelAggiornaLezione.setText("Aggiorna lezione");

        labelLezioneSelezionata.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelLezioneSelezionata.setForeground(new java.awt.Color(153, 204, 255));
        labelLezioneSelezionata.setText("Lezione selezionata");

        tableLezioneSelezionata.setBackground(new java.awt.Color(255, 255, 255));
        tableLezioneSelezionata.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableLezioneSelezionata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Titolo", "Descrizione", "Data inizio", "Durata (HH:MM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tableLezioneSelezionata.setGridColor(new java.awt.Color(0, 0, 0));
        tableLezioneSelezionata.setRowHeight(40);
        tableLezioneSelezionata.setRowSelectionAllowed(false);
        tableLezioneSelezionata.setShowGrid(true);
        tableLezioneSelezionata.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableLezioneSelezionata.setViewportView(tableLezioneSelezionata);

        labelTitolo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitolo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitolo.setForeground(new java.awt.Color(153, 204, 255));
        labelTitolo.setText("Titolo");

        labelDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        labelDescrizione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDescrizione.setForeground(new java.awt.Color(153, 204, 255));
        labelDescrizione.setText("Descrizione");

        textFieldTitolo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldTitolo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldTitolo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldTitolo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldTitolo.setSelectionColor(new java.awt.Color(51, 153, 255));

        textFieldDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescrizione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDescrizione.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDescrizione.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDescrizione.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelDurata.setBackground(new java.awt.Color(255, 255, 255));
        labelDurata.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDurata.setForeground(new java.awt.Color(153, 204, 255));
        labelDurata.setText("Durata");

        textFieldDurata.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDurata.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDurata.setForeground(Color.BLACK);
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

        labelDataOraInizio.setBackground(new java.awt.Color(255, 255, 255));
        labelDataOraInizio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDataOraInizio.setForeground(new java.awt.Color(153, 204, 255));
        labelDataOraInizio.setText("Data e ora inizio");

        spinnerDataOraInizio.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        spinnerDataOraInizio.setModel(new javax.swing.SpinnerDateModel());
        spinnerDataOraInizio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        spinnerDataOraInizio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerDataOraInizio.setEditor(new javax.swing.JSpinner.DateEditor(spinnerDataOraInizio, "yyyy-MM-dd HH:mm"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDurata, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldTitolo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldDurata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDataOraInizio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldDescrizione)
                            .addComponent(spinnerDataOraInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelAggiornaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelLezioneSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPaneTableLezioneSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(buttonAggiornaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelAggiornaLezione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(labelLezioneSelezionata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneTableLezioneSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAggiornaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAggiornaLezioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaLezioneActionPerformed
        try {
            controllaCampi();
            getController().aggiornaLezione(ottieniPrimoOggetto(tableLezioneSelezionata),
                                            textFieldTitolo.getText(),
                                            textFieldDescrizione.getText(),
                                            textFieldDurata.getText(),
                                            spinnerDataOraInizio.getValue());
            getHomeFrame().mostraPanelLezioni();
        }
        catch(CampoVuotoException | FormatoSbagliatoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaLezioneActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelLezioni();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void textFieldDurataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldDurataFocusGained
        if(textFieldDurata.getText().equals("HH:MM")) {
            textFieldDurata.setForeground(Color.BLACK);
            textFieldDurata.setText("");
        }
    }//GEN-LAST:event_textFieldDurataFocusGained

    private void textFieldDurataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldDurataFocusLost
        if(textFieldDurata.getText().isBlank()) {
            textFieldDurata.setForeground(Color.GRAY);
            textFieldDurata.setText("HH:MM");
        }
    }//GEN-LAST:event_textFieldDurataFocusLost
    
    public void inserisciLezioneSelezionata(Object[] lezioneSelezionata) {
        inserisciRigaInJTable(tableLezioneSelezionata, lezioneSelezionata);
    }
    
    public void setTitolo(String nome) {
        textFieldTitolo.setText(nome);
    }
    
    public void setDescrizione(String descrizione) {
        textFieldDescrizione.setText(descrizione);
    }
    
    public void setDurata(String durata) {
        textFieldDurata.setText(durata);
    }
    
    public void setDataOraInizio(Date x) {
        spinnerDataOraInizio.setValue(x);
    }
    
    private void controllaCampi() throws CampoVuotoException, FormatoSbagliatoException {
        if (textFieldTitolo.getText().isBlank() ||
            textFieldDescrizione.getText().isBlank() ||
            textFieldDurata.getText().isBlank() ||
            textFieldDurata.getText().equals("HH:MM")) {
            throw new CampoVuotoException();
        }
        
        Pattern pattern = Pattern.compile("[0-9][0-9]:[0-5][0-9]");
        Matcher matcher = pattern.matcher(textFieldDurata.getText());
        if(!matcher.find()) {
            throw new FormatoSbagliatoException("Durata", "HH:MM");
        }
    }
    
    public void svuotaCampi() {
        textFieldTitolo.setText("");
        textFieldDescrizione.setText("");
        textFieldDurata.setText("HH:MM");
        svuotaTable(tableLezioneSelezionata);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaLezione;
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelAggiornaLezione;
    private javax.swing.JLabel labelDataOraInizio;
    private javax.swing.JLabel labelDescrizione;
    private javax.swing.JLabel labelDurata;
    private javax.swing.JLabel labelLezioneSelezionata;
    private javax.swing.JLabel labelTitolo;
    private javax.swing.JScrollPane scrollPaneTableLezioneSelezionata;
    private javax.swing.JSpinner spinnerDataOraInizio;
    private javax.swing.JTable tableLezioneSelezionata;
    private javax.swing.JTextField textFieldDescrizione;
    private javax.swing.JTextField textFieldDurata;
    private javax.swing.JTextField textFieldTitolo;
    // End of variables declaration//GEN-END:variables

}
