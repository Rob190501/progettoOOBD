package gui.homeFrame.panels.studenti;

import controller.Controller;
import eccezioni.gui.CampoVuotoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelAggiornaStudente extends PanelGenerico {
    
    public PanelAggiornaStudente(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
        nascondiColonnaOggetto(tableStudenteSelezionato);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNome = new javax.swing.JTextField();
        textFieldCognome = new javax.swing.JTextField();
        buttonAggiornaStudente = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelAggiornaStudente = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCognome = new javax.swing.JLabel();
        labelStudenteSelezionato = new javax.swing.JLabel();
        scrollPaneTableStudenteSelezionato = new javax.swing.JScrollPane();
        tableStudenteSelezionato = new javax.swing.JTable();

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

        buttonAggiornaStudente.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaStudente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAggiornaStudente.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaStudente.setText("Aggiorna studente");
        buttonAggiornaStudente.setBorder(null);
        buttonAggiornaStudente.setBorderPainted(false);
        buttonAggiornaStudente.setFocusPainted(false);
        buttonAggiornaStudente.setOpaque(true);
        buttonAggiornaStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaStudenteActionPerformed(evt);
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

        labelAggiornaStudente.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAggiornaStudente.setForeground(new java.awt.Color(153, 204, 255));
        labelAggiornaStudente.setText("Aggiorna studente");

        labelNome.setBackground(new java.awt.Color(255, 255, 255));
        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(153, 204, 255));
        labelNome.setText("Nome");

        labelCognome.setBackground(new java.awt.Color(255, 255, 255));
        labelCognome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCognome.setForeground(new java.awt.Color(153, 204, 255));
        labelCognome.setText("Cognome");

        labelStudenteSelezionato.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelStudenteSelezionato.setForeground(new java.awt.Color(153, 204, 255));
        labelStudenteSelezionato.setText("Studente selezionato");

        tableStudenteSelezionato.setBackground(new java.awt.Color(255, 255, 255));
        tableStudenteSelezionato.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableStudenteSelezionato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Matricola", "Nome", "Cognome"
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
        tableStudenteSelezionato.setGridColor(new java.awt.Color(0, 0, 0));
        tableStudenteSelezionato.setRowHeight(40);
        tableStudenteSelezionato.setRowSelectionAllowed(false);
        tableStudenteSelezionato.setShowGrid(true);
        tableStudenteSelezionato.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableStudenteSelezionato.setViewportView(tableStudenteSelezionato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelAggiornaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(188, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelCognome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(buttonAggiornaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldCognome)
                            .addComponent(textFieldNome))))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneTableStudenteSelezionato))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAggiornaStudente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(labelStudenteSelezionato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNome)
                .addGap(18, 18, 18)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(labelCognome)
                .addGap(18, 18, 18)
                .addComponent(textFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAggiornaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAggiornaStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaStudenteActionPerformed
        try {
            controllaCampi();
            getController().aggiornaStudente(ottieniPrimoOggetto(tableStudenteSelezionato),
                                             textFieldNome.getText(),
                                             textFieldCognome.getText());
            getHomeFrame().mostraPanelStudenti();
        }
        catch(CampoVuotoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaStudenteActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelStudenti();
    }//GEN-LAST:event_buttonIndietroActionPerformed
    
    public void inserisciStudenteSelezionato(Object[] studenteSelezionato) {
        inserisciRigaInJTable(tableStudenteSelezionato, studenteSelezionato);
    }
    
    public void setNome(String nome) {
        textFieldNome.setText(nome);
    }
    
    public void setCognome(String cognome) {
        textFieldCognome.setText(cognome);
    }
    
    private void controllaCampi() throws CampoVuotoException {
        if (textFieldNome.getText().isBlank() || textFieldCognome.getText().isBlank()) {
            throw new CampoVuotoException();
        }
    }
    
    public void svuotaCampi() {
        textFieldNome.setText("");
        textFieldCognome.setText("");
        svuotaTable(tableStudenteSelezionato);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaStudente;
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelAggiornaStudente;
    private javax.swing.JLabel labelCognome;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelStudenteSelezionato;
    private javax.swing.JScrollPane scrollPaneTableStudenteSelezionato;
    private javax.swing.JTable tableStudenteSelezionato;
    private javax.swing.JTextField textFieldCognome;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

}
