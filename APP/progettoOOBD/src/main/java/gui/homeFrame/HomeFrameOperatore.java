package gui.homeFrame;

import controller.Controller;
import gui.homeFrame.panels.areeTematiche.PanelAreeTematicheHome;
import gui.homeFrame.panels.corsi.PanelCorsiHome;
import gui.homeFrame.panels.homePage.PanelHomePage;
import gui.homeFrame.panels.lezioni.PanelLezioniHome;
import gui.homeFrame.panels.studenti.PanelNuovoStudente;
import gui.homeFrame.panels.studenti.PanelStudentiHome;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class HomeFrameOperatore extends javax.swing.JFrame {
    
    private Controller controller;
    private int mouseX;
    private int mouseY;
    private JLabel labelSelezionata;
    
    private PanelHomePage panelHomePage;
    
    private PanelStudentiHome panelStudentiHome;
    private PanelNuovoStudente panelNuovoStudente;
    
    private PanelAreeTematicheHome panelAreeTematicheHome;
    
    private PanelCorsiHome panelCorsiHome;
    
    private PanelLezioniHome panelLezioniHome;
    
    public HomeFrameOperatore(Controller controller) {
        setController(controller);
        initComponents();
        creaPanels();
    }
    
    
    
    private void setController(Controller controller) {
        this.controller = controller;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTotale = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        labelMenuHomePage = new javax.swing.JLabel();
        labelMenuStudenti = new javax.swing.JLabel();
        labelMenuAreeTematiche = new javax.swing.JLabel();
        labelMenuCorsi = new javax.swing.JLabel();
        labelMenuLezioni = new javax.swing.JLabel();
        panelSuperiore = new javax.swing.JPanel();
        labelTitolo = new javax.swing.JLabel();
        labelMinimizza = new javax.swing.JLabel();
        labelRidimensiona = new javax.swing.JLabel();
        labelChiudi = new javax.swing.JLabel();
        panelContenuti = new javax.swing.JPanel();
        panelStudenti = new javax.swing.JPanel();
        panelAreeTematiche = new javax.swing.JPanel();
        panelCorsi = new javax.swing.JPanel();
        panelLezioni = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione Corsi di Formazione");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));

        panelTotale.setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(106, 141, 177));
        panelMenu.setForeground(new java.awt.Color(204, 204, 204));

        labelMenuHomePage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuHomePage.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuHomePage.setText("  Home Page");
        labelMenuHomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuHomePageMouseClicked(evt);
            }
        });

        labelMenuStudenti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuStudenti.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuStudenti.setText("  Studenti");
        labelMenuStudenti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuStudenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuStudentiMouseClicked(evt);
            }
        });

        labelMenuAreeTematiche.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuAreeTematiche.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuAreeTematiche.setText("  Aree Tematiche");
        labelMenuAreeTematiche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuAreeTematiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuAreeTematicheMouseClicked(evt);
            }
        });

        labelMenuCorsi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuCorsi.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuCorsi.setText("  Corsi");
        labelMenuCorsi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuCorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuCorsiMouseClicked(evt);
            }
        });

        labelMenuLezioni.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuLezioni.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuLezioni.setText("  Lezioni");
        labelMenuLezioni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuLezioni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuLezioniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMenuAreeTematiche, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(labelMenuStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenuHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenuCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenuLezioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelMenuHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(labelMenuStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMenuAreeTematiche, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMenuCorsi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMenuLezioni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSuperiore.setBackground(new java.awt.Color(153, 204, 255));
        panelSuperiore.setPreferredSize(new java.awt.Dimension(1000, 34));
        panelSuperiore.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperioreMouseDragged(evt);
            }
        });
        panelSuperiore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperioreMousePressed(evt);
            }
        });

        labelTitolo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitolo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitolo.setText("Gestione corsi di formazione");

        labelMinimizza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMinimizza.setForeground(new java.awt.Color(255, 255, 255));
        labelMinimizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizza.setText("–");
        labelMinimizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizzaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMinimizzaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMinimizzaMouseExited(evt);
            }
        });

        labelRidimensiona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRidimensiona.setForeground(new java.awt.Color(255, 255, 255));
        labelRidimensiona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRidimensiona.setText("◱");
        labelRidimensiona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRidimensionaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRidimensionaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRidimensionaMouseExited(evt);
            }
        });

        labelChiudi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelChiudi.setForeground(new java.awt.Color(255, 255, 255));
        labelChiudi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelChiudi.setText("X");
        labelChiudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelChiudiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelChiudiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelChiudiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSuperioreLayout = new javax.swing.GroupLayout(panelSuperiore);
        panelSuperiore.setLayout(panelSuperioreLayout);
        panelSuperioreLayout.setHorizontalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperioreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMinimizza, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRidimensiona, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelChiudi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperioreLayout.setVerticalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinimizza, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(labelRidimensiona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelChiudi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelContenuti.setBackground(new java.awt.Color(255, 255, 255));
        panelContenuti.setLayout(new java.awt.CardLayout());

        panelStudenti.setBackground(new java.awt.Color(255, 255, 255));
        panelStudenti.setLayout(new java.awt.CardLayout());
        panelContenuti.add(panelStudenti, "cardStudenti");

        panelAreeTematiche.setBackground(new java.awt.Color(255, 255, 255));
        panelAreeTematiche.setLayout(new java.awt.CardLayout());
        panelContenuti.add(panelAreeTematiche, "cardAreeTematiche");

        panelCorsi.setBackground(new java.awt.Color(255, 255, 255));
        panelCorsi.setLayout(new java.awt.CardLayout());
        panelContenuti.add(panelCorsi, "cardCorsi");

        panelLezioni.setBackground(new java.awt.Color(255, 255, 255));
        panelLezioni.setLayout(new java.awt.CardLayout());
        panelContenuti.add(panelLezioni, "cardLezioni");

        javax.swing.GroupLayout panelTotaleLayout = new javax.swing.GroupLayout(panelTotale);
        panelTotale.setLayout(panelTotaleLayout);
        panelTotaleLayout.setHorizontalGroup(
            panelTotaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperiore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTotaleLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTotaleLayout.setVerticalGroup(
            panelTotaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotaleLayout.createSequentialGroup()
                .addComponent(panelSuperiore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelTotaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void creaPanels() {
        panelHomePage = new PanelHomePage(controller, this);
        panelContenuti.add(panelHomePage, "cardHomePage");
        
        panelStudentiHome = new PanelStudentiHome(controller, this);
        panelStudenti.add(panelStudentiHome, "cardStudentiHome");
        
        panelNuovoStudente = new PanelNuovoStudente(controller, this);
        panelStudenti.add(panelNuovoStudente, "cardNuovoStudente");
        
        panelAreeTematicheHome = new PanelAreeTematicheHome(controller, this);
        panelAreeTematiche.add(panelAreeTematicheHome, "cardAreeTematicheHome");
        
        panelCorsiHome = new PanelCorsiHome(controller, this);
        panelCorsi.add(panelCorsiHome, "cardPanelCorsiHome");
        
        panelLezioniHome = new PanelLezioniHome(controller, this);
        panelLezioni.add(panelLezioniHome, "cardPanelLezioniHome");
    }
    
    public void mostraCardHomePage() {
        controller.informazioniHomePage();
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardHomePage");
    }
    
    public void mostraCardStudenti() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardStudenti");
    }
    
    public void mostraCardStudentiHome() {
        CardLayout card = (CardLayout) panelStudenti.getLayout();
        card.show(panelStudenti, "cardStudentiHome");
    }
    
    public void mostraCardNuovoStudente() {
        CardLayout card = (CardLayout) panelStudenti.getLayout();
        card.show(panelStudenti, "cardNuovoStudente");
    }
    
    public void mostraCardAreeTematiche() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardAreeTematiche");
    }
    
    public void mostraCardCorsi() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardCorsi");
    }
    
    public void mostraCardLezioni() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardLezioni");
    }
    
    
    
    @Override
    public void setVisible(boolean b) {
        if(b) {
            setLabelSelezionata(labelMenuHomePage);
            mostraCardHomePage();
        }
        super.setVisible(b);
    }
    
    
    
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
    
    
    
    private void labelMinimizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizzaMouseClicked

    private void labelMinimizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseEntered
        // TODO add your handling code here:
        labelMinimizza.setForeground(new java.awt.Color(255, 204, 0));
    }//GEN-LAST:event_labelMinimizzaMouseEntered

    private void labelMinimizzaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseExited
        // TODO add your handling code here:
        labelMinimizza.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelMinimizzaMouseExited

    private void labelRidimensionaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRidimensionaMouseClicked
        // TODO add your handling code here:
        if (getExtendedState() == MAXIMIZED_BOTH) {
            setExtendedState(JFrame.NORMAL);
        }
        else {
            setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_labelRidimensionaMouseClicked

    private void labelRidimensionaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRidimensionaMouseEntered
        // TODO add your handling code here:
        labelRidimensiona.setForeground(new java.awt.Color(3, 172, 3));
    }//GEN-LAST:event_labelRidimensionaMouseEntered

    private void labelRidimensionaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRidimensionaMouseExited
        // TODO add your handling code here:
        labelRidimensiona.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelRidimensionaMouseExited

    private void labelChiudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseClicked
        // TODO add your handling code here:
        controller.terminaEsecuzione();
    }//GEN-LAST:event_labelChiudiMouseClicked

    private void labelChiudiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseEntered
        // TODO add your handling code here:
        labelChiudi.setForeground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_labelChiudiMouseEntered

    private void labelChiudiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseExited
        // TODO add your handling code here:
        labelChiudi.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelChiudiMouseExited
    
    
    
    private void evidenziaLabel(JLabel label) {
        label.setText(label.getText().replace("  ", "| "));
        label.setFont(new Font("Segoe UI", 1, 24));
        label.setForeground(new Color(255, 255, 255));
    }
    
    private void deselezionaLabel(JLabel label) {
        label.setText(label.getText().replace("| ", "  "));
        label.setFont(new Font("Segoe UI", 1, 24));
        label.setForeground(new Color(204, 204, 204));
    }
    
    private void setLabelSelezionata(JLabel nuovaLabelSelezionata) {
        evidenziaLabel(nuovaLabelSelezionata);
        labelSelezionata = nuovaLabelSelezionata;
    }
            
    private void aggiornaLabelSelezionata(JLabel nuovaLabelSelezionata) {
        deselezionaLabel(labelSelezionata);
        setLabelSelezionata(nuovaLabelSelezionata);
    }    
    
    private void labelMenuStudentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuStudentiMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuStudenti);
        mostraCardStudenti();
    }//GEN-LAST:event_labelMenuStudentiMouseClicked

    private void labelMenuHomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuHomePageMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuHomePage);
        mostraCardHomePage();
    }//GEN-LAST:event_labelMenuHomePageMouseClicked

    private void labelMenuCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuCorsiMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuCorsi);
        mostraCardCorsi();
    }//GEN-LAST:event_labelMenuCorsiMouseClicked

    private void labelMenuLezioniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuLezioniMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuLezioni);
        mostraCardLezioni();
    }//GEN-LAST:event_labelMenuLezioniMouseClicked

    private void labelMenuAreeTematicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuAreeTematicheMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuAreeTematiche);
        mostraCardAreeTematiche();
    }//GEN-LAST:event_labelMenuAreeTematicheMouseClicked
    
    public void mostraEccezione(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelChiudi;
    private javax.swing.JLabel labelMenuAreeTematiche;
    private javax.swing.JLabel labelMenuCorsi;
    private javax.swing.JLabel labelMenuHomePage;
    private javax.swing.JLabel labelMenuLezioni;
    private javax.swing.JLabel labelMenuStudenti;
    private javax.swing.JLabel labelMinimizza;
    private javax.swing.JLabel labelRidimensiona;
    private javax.swing.JLabel labelTitolo;
    private javax.swing.JPanel panelAreeTematiche;
    private javax.swing.JPanel panelContenuti;
    private javax.swing.JPanel panelCorsi;
    private javax.swing.JPanel panelLezioni;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelStudenti;
    private javax.swing.JPanel panelSuperiore;
    private javax.swing.JPanel panelTotale;
    // End of variables declaration//GEN-END:variables
}
