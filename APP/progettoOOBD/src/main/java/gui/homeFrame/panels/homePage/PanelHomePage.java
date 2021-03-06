package gui.homeFrame.panels.homePage;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelHomePage extends PanelGenerico {

    public PanelHomePage(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHomePage = new javax.swing.JLabel();
        scrollPaneTextAreaInformazioniHomePage = new javax.swing.JScrollPane();
        textAreaInformazioniHomePage = new javax.swing.JTextArea();
        buttonEsciHomePage = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        labelHomePage.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelHomePage.setForeground(new java.awt.Color(153, 204, 255));
        labelHomePage.setText("Home Page");

        scrollPaneTextAreaInformazioniHomePage.setBorder(null);

        textAreaInformazioniHomePage.setEditable(false);
        textAreaInformazioniHomePage.setBackground(new java.awt.Color(255, 255, 255));
        textAreaInformazioniHomePage.setColumns(20);
        textAreaInformazioniHomePage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaInformazioniHomePage.setForeground(new java.awt.Color(0, 0, 0));
        textAreaInformazioniHomePage.setRows(5);
        textAreaInformazioniHomePage.setBorder(null);
        textAreaInformazioniHomePage.setMargin(new java.awt.Insets(0, 0, 0, 0));
        scrollPaneTextAreaInformazioniHomePage.setViewportView(textAreaInformazioniHomePage);

        buttonEsciHomePage.setBackground(new java.awt.Color(255, 51, 51));
        buttonEsciHomePage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEsciHomePage.setForeground(new java.awt.Color(255, 255, 255));
        buttonEsciHomePage.setText("Esci");
        buttonEsciHomePage.setBorder(null);
        buttonEsciHomePage.setBorderPainted(false);
        buttonEsciHomePage.setFocusPainted(false);
        buttonEsciHomePage.setOpaque(true);
        buttonEsciHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsciHomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(578, Short.MAX_VALUE)
                .addComponent(buttonEsciHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(scrollPaneTextAreaInformazioniHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelHomePage))
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(buttonEsciHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(labelHomePage)
                    .addGap(47, 47, 47)
                    .addComponent(scrollPaneTextAreaInformazioniHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void impostaInformazioniHomePage(int numeroStudenti, int numeroAreeTematiche, int numeroCorsi, int numeroLezioni){
        String informazioni = "Studenti registrati: " + numeroStudenti + System.lineSeparator() + System.lineSeparator() +
                              "Aree Tematiche registrate: " + numeroAreeTematiche + System.lineSeparator() + System.lineSeparator() +
                              "Corsi registrati: " + numeroCorsi + System.lineSeparator() + System.lineSeparator() +
                              "Lezioni registrate: " + numeroLezioni;
        textAreaInformazioniHomePage.setText(informazioni);
    }
    
    private void buttonEsciHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsciHomePageActionPerformed
        getController().esciDaOperatore();
    }//GEN-LAST:event_buttonEsciHomePageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEsciHomePage;
    private javax.swing.JLabel labelHomePage;
    private javax.swing.JScrollPane scrollPaneTextAreaInformazioniHomePage;
    private javax.swing.JTextArea textAreaInformazioniHomePage;
    // End of variables declaration//GEN-END:variables
}
