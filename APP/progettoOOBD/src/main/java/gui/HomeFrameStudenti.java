package gui;

import controller.Controller;
import javax.swing.JFrame;
import javax.swing.UIManager;



public class HomeFrameStudenti extends javax.swing.JFrame {

    private Controller controller;
    private int mouseX;
    private int mouseY;
    
    /**
     * Creates new form Home
     */
    public HomeFrameStudenti(Controller controller) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e) {
        // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        
        this.controller = controller;
        
        initComponents();
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipale = new javax.swing.JPanel();
        panelLaterale = new javax.swing.JPanel();
        panelSuperiore = new javax.swing.JPanel();
        buttonChiudi = new javax.swing.JButton();
        buttonRiduciAIcona = new javax.swing.JButton();
        buttonSchermoIntero = new javax.swing.JButton();
        panelContenuti = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));

        panelPrincipale.setBackground(new java.awt.Color(255, 255, 255));

        panelLaterale.setBackground(new java.awt.Color(0, 102, 255));
        panelLaterale.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelLateraleLayout = new javax.swing.GroupLayout(panelLaterale);
        panelLaterale.setLayout(panelLateraleLayout);
        panelLateraleLayout.setHorizontalGroup(
            panelLateraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        panelLateraleLayout.setVerticalGroup(
            panelLateraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        panelSuperiore.setBackground(new java.awt.Color(0, 0, 204));
        panelSuperiore.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperioreMouseDragged(evt);
            }
        });
        panelSuperiore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSuperioreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperioreMousePressed(evt);
            }
        });

        buttonChiudi.setBackground(new java.awt.Color(204, 0, 0));
        buttonChiudi.setForeground(new java.awt.Color(0, 0, 0));
        buttonChiudi.setText("X");
        buttonChiudi.setFocusPainted(false);
        buttonChiudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonChiudiMouseClicked(evt);
            }
        });

        buttonRiduciAIcona.setBackground(new java.awt.Color(255, 204, 0));
        buttonRiduciAIcona.setForeground(new java.awt.Color(0, 0, 0));
        buttonRiduciAIcona.setText("-");
        buttonRiduciAIcona.setFocusPainted(false);
        buttonRiduciAIcona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRiduciAIconaMouseClicked(evt);
            }
        });

        buttonSchermoIntero.setBackground(new java.awt.Color(0, 153, 0));
        buttonSchermoIntero.setForeground(new java.awt.Color(0, 0, 0));
        buttonSchermoIntero.setFocusPainted(false);
        buttonSchermoIntero.setLabel("❐");
        buttonSchermoIntero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSchermoInteroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSuperioreLayout = new javax.swing.GroupLayout(panelSuperiore);
        panelSuperiore.setLayout(panelSuperioreLayout);
        panelSuperioreLayout.setHorizontalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperioreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRiduciAIcona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSchermoIntero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonChiudi)
                .addContainerGap())
        );
        panelSuperioreLayout.setVerticalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperioreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonChiudi)
                    .addComponent(buttonRiduciAIcona)
                    .addComponent(buttonSchermoIntero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenuti.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelContenutiLayout = new javax.swing.GroupLayout(panelContenuti);
        panelContenuti.setLayout(panelContenutiLayout);
        panelContenutiLayout.setHorizontalGroup(
            panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        panelContenutiLayout.setVerticalGroup(
            panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipaleLayout = new javax.swing.GroupLayout(panelPrincipale);
        panelPrincipale.setLayout(panelPrincipaleLayout);
        panelPrincipaleLayout.setHorizontalGroup(
            panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperiore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipaleLayout.createSequentialGroup()
                .addComponent(panelLaterale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipaleLayout.setVerticalGroup(
            panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipaleLayout.createSequentialGroup()
                .addComponent(panelSuperiore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLaterale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonChiudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonChiudiMouseClicked
        // TODO add your handling code here:
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_buttonChiudiMouseClicked

    private void buttonRiduciAIconaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRiduciAIconaMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
    }//GEN-LAST:event_buttonRiduciAIconaMouseClicked

    private void panelSuperioreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperioreMousePressed
        // TODO add your handling code here:
        if (getExtendedState() == NORMAL) {
            mouseX = evt.getX();
            mouseY = evt.getY();
        }
    }//GEN-LAST:event_panelSuperioreMousePressed

    private void panelSuperioreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperioreMouseDragged
        // TODO add your handling code here:
        if (getExtendedState() == NORMAL) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
        
            setLocation(x - mouseX, y - mouseY);
        }
    }//GEN-LAST:event_panelSuperioreMouseDragged

    private void buttonSchermoInteroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSchermoInteroMouseClicked
        // TODO add your handling code here:
        if (getExtendedState() == MAXIMIZED_BOTH) {
            setExtendedState(JFrame.NORMAL);
        }
        else {
            setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_buttonSchermoInteroMouseClicked

    private void panelSuperioreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperioreMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            if (getExtendedState() == MAXIMIZED_BOTH) {
                setExtendedState(JFrame.NORMAL);
            }
            else {
                setExtendedState(MAXIMIZED_BOTH);
            }
        }
    }//GEN-LAST:event_panelSuperioreMouseClicked
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChiudi;
    private javax.swing.JButton buttonRiduciAIcona;
    private javax.swing.JButton buttonSchermoIntero;
    private javax.swing.JPanel panelContenuti;
    private javax.swing.JPanel panelLaterale;
    private javax.swing.JPanel panelPrincipale;
    private javax.swing.JPanel panelSuperiore;
    // End of variables declaration//GEN-END:variables
}
