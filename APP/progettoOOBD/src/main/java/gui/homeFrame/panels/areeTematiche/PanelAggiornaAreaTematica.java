package gui.homeFrame.panels.areeTematiche;

import controller.Controller;
import eccezioni.elementiGui.CampoVuotoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelAggiornaAreaTematica extends PanelGenerico {
    
    public PanelAggiornaAreaTematica(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
        nascondiColonnaOggetto(tableAreaTematicaSelezionata);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNome = new javax.swing.JTextField();
        textFieldDescrizione = new javax.swing.JTextField();
        buttonAggiornaAreaTematica = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelAggiornaAreaTematica = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDescrizione = new javax.swing.JLabel();
        labelAreaTematicaSelezionata = new javax.swing.JLabel();
        scrollPaneTableAreaTematicaSelezionata = new javax.swing.JScrollPane();
        tableAreaTematicaSelezionata = new javax.swing.JTable();

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

        buttonAggiornaAreaTematica.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAggiornaAreaTematica.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaAreaTematica.setText("Aggiorna area tematica");
        buttonAggiornaAreaTematica.setBorder(null);
        buttonAggiornaAreaTematica.setBorderPainted(false);
        buttonAggiornaAreaTematica.setFocusPainted(false);
        buttonAggiornaAreaTematica.setOpaque(true);
        buttonAggiornaAreaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaAreaTematicaActionPerformed(evt);
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

        labelAggiornaAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAggiornaAreaTematica.setForeground(new java.awt.Color(153, 204, 255));
        labelAggiornaAreaTematica.setText("Aggiorna Area Tematica");

        labelNome.setBackground(new java.awt.Color(255, 255, 255));
        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(153, 204, 255));
        labelNome.setText("Nome");

        labelDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        labelDescrizione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDescrizione.setForeground(new java.awt.Color(153, 204, 255));
        labelDescrizione.setText("Descrizione");

        labelAreaTematicaSelezionata.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelAreaTematicaSelezionata.setForeground(new java.awt.Color(153, 204, 255));
        labelAreaTematicaSelezionata.setText("Area Tematica selezionata");

        tableAreaTematicaSelezionata.setBackground(new java.awt.Color(255, 255, 255));
        tableAreaTematicaSelezionata.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableAreaTematicaSelezionata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Nome", "Descrizione"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAreaTematicaSelezionata.setGridColor(new java.awt.Color(0, 0, 0));
        tableAreaTematicaSelezionata.setRowHeight(40);
        tableAreaTematicaSelezionata.setRowSelectionAllowed(false);
        tableAreaTematicaSelezionata.setShowGrid(true);
        tableAreaTematicaSelezionata.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableAreaTematicaSelezionata.setViewportView(tableAreaTematicaSelezionata);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(labelDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(buttonAggiornaAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldDescrizione)
                    .addComponent(textFieldNome))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAreaTematicaSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneTableAreaTematicaSelezionata))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelAggiornaAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAggiornaAreaTematica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(labelAreaTematicaSelezionata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableAreaTematicaSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNome)
                .addGap(18, 18, 18)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(labelDescrizione)
                .addGap(18, 18, 18)
                .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAggiornaAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAggiornaAreaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaAreaTematicaActionPerformed
        try {
            controllaCampi();
            /*getController().aggiornaStudente(ottieniPrimoOggetto(tableStudenteSelezionato),
                                             textFieldNome.getText(),
                                             textFieldCognome.getText());
            svuotaCampi();
            getHomeFrame().mostraCardStudenti();*/
        }
        catch(CampoVuotoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaAreaTematicaActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        svuotaCampi();
        getHomeFrame().mostraCardStudenti();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    public void svuotaTutteTable() {
        svuotaTable(tableAreaTematicaSelezionata);
    }
    
    public void inserisciStudenteSelezionato(Object[] studenteSelezionato) {
        inserisciRigaInJTable(tableAreaTematicaSelezionata, studenteSelezionato);
    }
    
    public void setNome(String nome) {
        textFieldNome.setText(nome);
    }
    
    public void setCognome(String cognome) {
        textFieldDescrizione.setText(cognome);
    }
    
    private void controllaCampi() throws CampoVuotoException {
        if (textFieldNome.getText().equals("") || textFieldDescrizione.getText().equals("")) {
            throw new CampoVuotoException();
        }
    }
    
    private void svuotaCampi() {
        textFieldNome.setText("");
        textFieldDescrizione.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaAreaTematica;
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelAggiornaAreaTematica;
    private javax.swing.JLabel labelAreaTematicaSelezionata;
    private javax.swing.JLabel labelDescrizione;
    private javax.swing.JLabel labelNome;
    private javax.swing.JScrollPane scrollPaneTableAreaTematicaSelezionata;
    private javax.swing.JTable tableAreaTematicaSelezionata;
    private javax.swing.JTextField textFieldDescrizione;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

}
