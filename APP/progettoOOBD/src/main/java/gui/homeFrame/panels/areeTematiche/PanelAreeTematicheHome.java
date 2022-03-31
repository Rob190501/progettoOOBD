package gui.homeFrame.panels.areeTematiche;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelContenutiGenerico.PanelContenutiGenerico;
import javax.swing.table.DefaultTableModel;


public class PanelAreeTematicheHome extends PanelContenutiGenerico {

    //costruttore
    public PanelAreeTematicheHome(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        getController().setPanelAreeTematicheHome(this);
        initComponents();
        nascondiTutteColonneOggetto();
    }
    //fine costruttore

    
    //initComponents
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAreeTematiche = new javax.swing.JLabel();
        scrollPaneTableAreeTematiche = new javax.swing.JScrollPane();
        tableAreeTematiche = new javax.swing.JTable();
        scrollPaneTableCorsiDellArea = new javax.swing.JScrollPane();
        tableCorsiDellArea = new javax.swing.JTable();
        labelCorsiDellAreaSelezionata = new javax.swing.JLabel();
        buttonA = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));

        labelAreeTematiche.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAreeTematiche.setForeground(new java.awt.Color(153, 204, 255));
        labelAreeTematiche.setText("Aree Tematiche");

        tableAreeTematiche.setBackground(new java.awt.Color(255, 255, 255));
        tableAreeTematiche.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableAreeTematiche.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAreeTematiche.setGridColor(new java.awt.Color(0, 0, 0));
        tableAreeTematiche.setRowHeight(40);
        tableAreeTematiche.setShowGrid(true);
        tableAreeTematiche.getTableHeader().setReorderingAllowed(false);
        tableAreeTematiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAreeTematicheMouseClicked(evt);
            }
        });
        scrollPaneTableAreeTematiche.setViewportView(tableAreeTematiche);

        tableCorsiDellArea.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsiDellArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsiDellArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Nome", "Descrizione", "Tasso presenze minime", "Numero massimo iscritti"
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
        tableCorsiDellArea.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsiDellArea.setRowHeight(40);
        tableCorsiDellArea.setShowGrid(true);
        tableCorsiDellArea.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiDellArea.setViewportView(tableCorsiDellArea);

        labelCorsiDellAreaSelezionata.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsiDellAreaSelezionata.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiDellAreaSelezionata.setText("Corsi dell'area selezionata");

        buttonA.setBackground(new java.awt.Color(153, 204, 255));
        buttonA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonA.setForeground(new java.awt.Color(255, 255, 255));
        buttonA.setText("A");
        buttonA.setBorder(null);
        buttonA.setBorderPainted(false);
        buttonA.setFocusPainted(false);
        buttonA.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCorsiDellAreaSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAreeTematiche, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPaneTableAreeTematiche, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                            .addComponent(scrollPaneTableCorsiDellArea, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAreeTematiche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableAreeTematiche, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelCorsiDellAreaSelezionata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableCorsiDellArea, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
    //fine initComponents
    
    private void tableAreeTematicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAreeTematicheMouseClicked
        // TODO add your handling code here:
        Object areaSelezionata = tableAreeTematiche.getModel().getValueAt(tableAreeTematiche.getSelectedRow(), 0);
        svuotaTable(tableCorsiDellArea);
        getController().inserisciCorsiDellAreaInJTable(areaSelezionata);
    }//GEN-LAST:event_tableAreeTematicheMouseClicked
    
    
    public void nascondiTutteColonneOggetto() {
        nascondiColonnaOggetto(tableAreeTematiche);
        nascondiColonnaOggetto(tableCorsiDellArea);
    }
    
    public void svuotaTutteTable() {
        svuotaTable(tableAreeTematiche);
        svuotaTable(tableCorsiDellArea);
    }
    
    public void inserisciRigaInTableAreeTematiche(Object[] row) {
        DefaultTableModel modelTableAreeTematiche = (DefaultTableModel) tableAreeTematiche.getModel();
        modelTableAreeTematiche.addRow(row);
    }
    
    public void inserisciRigaInTableCorsiDellArea(Object[] row) {
        DefaultTableModel modelTableCorsiDellArea = (DefaultTableModel) tableCorsiDellArea.getModel();
        modelTableCorsiDellArea.addRow(row);
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonA;
    private javax.swing.JLabel labelAreeTematiche;
    private javax.swing.JLabel labelCorsiDellAreaSelezionata;
    private javax.swing.JScrollPane scrollPaneTableAreeTematiche;
    private javax.swing.JScrollPane scrollPaneTableCorsiDellArea;
    private javax.swing.JTable tableAreeTematiche;
    private javax.swing.JTable tableCorsiDellArea;
    // End of variables declaration//GEN-END:variables
}
