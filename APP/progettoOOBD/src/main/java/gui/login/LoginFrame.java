package gui.login;

import controller.Controller;
import eccezioni.gui.CampoVuotoException;
import eccezioni.gui.FormatoSbagliatoException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



public class LoginFrame extends javax.swing.JFrame {

    private Controller controller;
    private int mouseX;
    private int mouseY;
    
    public LoginFrame(Controller controller) {
        this.controller = controller;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipale = new javax.swing.JPanel();
        panelSuperiore = new javax.swing.JPanel();
        labelTitolo = new javax.swing.JLabel();
        labelMinimizza = new javax.swing.JLabel();
        labelChiudi = new javax.swing.JLabel();
        panelContenuti = new javax.swing.JPanel();
        labelUserName = new javax.swing.JLabel();
        textFieldUserName = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        labelIP = new javax.swing.JLabel();
        textFieldIP = new javax.swing.JTextField();
        labelPorta = new javax.swing.JLabel();
        textFieldPorta = new javax.swing.JTextField();
        labelDataBase = new javax.swing.JLabel();
        textFieldDatabase = new javax.swing.JTextField();
        labelStatoConnessione = new javax.swing.JLabel();
        buttonConnettiti = new javax.swing.JButton();
        buttonAccediOperatore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione corsi di formazione - Connessione al DB");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(450, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(450, 700));

        panelPrincipale.setBackground(new java.awt.Color(255, 255, 255));

        panelSuperiore.setBackground(new java.awt.Color(153, 204, 255));
        panelSuperiore.setPreferredSize(new java.awt.Dimension(450, 34));
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

        labelTitolo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitolo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitolo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitolo.setText("Gestione corsi di formazione - Connessione al DB");

        labelMinimizza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMinimizza.setForeground(new java.awt.Color(255, 255, 255));
        labelMinimizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizza.setText("???");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(labelMinimizza, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelChiudi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperioreLayout.setVerticalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelChiudi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(labelMinimizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelContenuti.setBackground(new java.awt.Color(255, 255, 255));

        labelUserName.setBackground(new java.awt.Color(255, 255, 255));
        labelUserName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(153, 204, 255));
        labelUserName.setText("User Name");

        textFieldUserName.setBackground(new java.awt.Color(255, 255, 255));
        textFieldUserName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldUserName.setForeground(new java.awt.Color(0, 0, 0));
        textFieldUserName.setText("postgres");
        textFieldUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldUserName.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelPassword.setBackground(new java.awt.Color(255, 255, 255));
        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(153, 204, 255));
        labelPassword.setText("Password");

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.setText("admin");
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        passwordField.setEchoChar('*');
        passwordField.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelIP.setBackground(new java.awt.Color(255, 255, 255));
        labelIP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelIP.setForeground(new java.awt.Color(153, 204, 255));
        labelIP.setText("IP");

        textFieldIP.setBackground(new java.awt.Color(255, 255, 255));
        textFieldIP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldIP.setForeground(new java.awt.Color(0, 0, 0));
        textFieldIP.setText("localhost");
        textFieldIP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldIP.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelPorta.setBackground(new java.awt.Color(255, 255, 255));
        labelPorta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelPorta.setForeground(new java.awt.Color(153, 204, 255));
        labelPorta.setText("Porta");

        textFieldPorta.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPorta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldPorta.setForeground(new java.awt.Color(0, 0, 0));
        textFieldPorta.setText("5432");
        textFieldPorta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldPorta.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelDataBase.setBackground(new java.awt.Color(255, 255, 255));
        labelDataBase.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDataBase.setForeground(new java.awt.Color(153, 204, 255));
        labelDataBase.setText("Database");

        textFieldDatabase.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDatabase.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDatabase.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDatabase.setText("corsi_di_formazione");
        textFieldDatabase.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDatabase.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelStatoConnessione.setBackground(new java.awt.Color(255, 255, 255));
        labelStatoConnessione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelStatoConnessione.setForeground(new java.awt.Color(204, 0, 0));
        labelStatoConnessione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatoConnessione.setText("Stato: non connesso");

        buttonConnettiti.setBackground(new java.awt.Color(153, 204, 255));
        buttonConnettiti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonConnettiti.setForeground(new java.awt.Color(255, 255, 255));
        buttonConnettiti.setText("Connettiti al Database");
        buttonConnettiti.setBorder(null);
        buttonConnettiti.setBorderPainted(false);
        buttonConnettiti.setFocusPainted(false);
        buttonConnettiti.setMaximumSize(new java.awt.Dimension(277, 42));
        buttonConnettiti.setOpaque(true);
        buttonConnettiti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConnettitiActionPerformed(evt);
            }
        });

        buttonAccediOperatore.setBackground(new java.awt.Color(153, 204, 255));
        buttonAccediOperatore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonAccediOperatore.setForeground(new java.awt.Color(255, 255, 255));
        buttonAccediOperatore.setText("Accedi come operatore");
        buttonAccediOperatore.setBorder(null);
        buttonAccediOperatore.setBorderPainted(false);
        buttonAccediOperatore.setEnabled(false);
        buttonAccediOperatore.setFocusPainted(false);
        buttonAccediOperatore.setMaximumSize(new java.awt.Dimension(277, 42));
        buttonAccediOperatore.setOpaque(true);
        buttonAccediOperatore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccediOperatoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenutiLayout = new javax.swing.GroupLayout(panelContenuti);
        panelContenuti.setLayout(panelContenutiLayout);
        panelContenutiLayout.setHorizontalGroup(
            panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenutiLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(labelDataBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldPorta)
                    .addComponent(labelPorta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldIP, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField)
                            .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldUserName)
                            .addComponent(labelUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                    .addComponent(buttonConnettiti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAccediOperatore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelStatoConnessione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelContenutiLayout.setVerticalGroup(
            panelContenutiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenutiLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(labelUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPorta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDataBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(labelStatoConnessione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonConnettiti, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAccediOperatore, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipaleLayout = new javax.swing.GroupLayout(panelPrincipale);
        panelPrincipale.setLayout(panelPrincipaleLayout);
        panelPrincipaleLayout.setHorizontalGroup(
            panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperiore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipaleLayout.setVerticalGroup(
            panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipaleLayout.createSequentialGroup()
                .addComponent(panelSuperiore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void panelSuperioreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperioreMousePressed
        if (getExtendedState() == NORMAL) {
            mouseX = evt.getX();
            mouseY = evt.getY();
        }
    }//GEN-LAST:event_panelSuperioreMousePressed

    private void panelSuperioreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperioreMouseDragged
        if (getExtendedState() == NORMAL) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            setLocation(x - mouseX, y - mouseY);
        }
    }//GEN-LAST:event_panelSuperioreMouseDragged

    private void buttonConnettitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConnettitiActionPerformed
        try {
            controllaCampi();
            controller.avviaConnessione(textFieldUserName.getText(), passwordField.getText(), textFieldIP.getText(), textFieldPorta.getText(), textFieldDatabase.getText());
        }
        catch (CampoVuotoException | FormatoSbagliatoException e) {
            mostraEccezione(e.getMessage());
        }
        
    }//GEN-LAST:event_buttonConnettitiActionPerformed

    public void controllaCampi() throws CampoVuotoException, FormatoSbagliatoException {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9_]");
        Matcher matcher = pattern.matcher(textFieldDatabase.getText());
        
        if( matcher.find() || Pattern.matches("[0-9]+", textFieldDatabase.getText()) ) {
            throw new FormatoSbagliatoException("Database", "non solo numerico, senza caratteri speciali o spazi vuoti");
        }
        
        if(textFieldDatabase.getText().isBlank() || textFieldPorta.getText().isBlank() || textFieldUserName.getText().isBlank()) {
            throw new CampoVuotoException();
        }
    }
    
    private void buttonAccediOperatoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAccediOperatoreActionPerformed
        controller.accessoOperatore();
    }//GEN-LAST:event_buttonAccediOperatoreActionPerformed

    private void labelChiudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseClicked
        controller.terminaEsecuzione();
    }//GEN-LAST:event_labelChiudiMouseClicked

    private void labelChiudiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseEntered
        labelChiudi.setForeground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_labelChiudiMouseEntered

    private void labelChiudiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseExited
        labelChiudi.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelChiudiMouseExited

    private void labelMinimizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizzaMouseClicked

    private void labelMinimizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseEntered
        labelMinimizza.setForeground(new java.awt.Color(255, 204, 0));
    }//GEN-LAST:event_labelMinimizzaMouseEntered

    private void labelMinimizzaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseExited
        labelMinimizza.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelMinimizzaMouseExited

    public void confermaConnessioneStabilita() {
        labelStatoConnessione.setForeground(new java.awt.Color(0, 204, 0));
        labelStatoConnessione.setText("Stato: connesso");    
        buttonAccediOperatore.setEnabled(true);
    }
    
    public void confermaConnessioneNonStabilita() {
        labelStatoConnessione.setForeground(new java.awt.Color(204, 0, 0));
        labelStatoConnessione.setText("Stato: non connesso");    
        buttonAccediOperatore.setEnabled(false);
    }
    
    public boolean confermaCreazioneDB() {
        return JOptionPane.showConfirmDialog(this, "DB selezionato non esistente, si desidera crearlo?", "Attenzione", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
    
    public void mostraEccezione(String messaggioEccezione) {
        JOptionPane.showMessageDialog(this, messaggioEccezione, "Errore", JOptionPane.ERROR_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAccediOperatore;
    private javax.swing.JButton buttonConnettiti;
    private javax.swing.JLabel labelChiudi;
    private javax.swing.JLabel labelDataBase;
    private javax.swing.JLabel labelIP;
    private javax.swing.JLabel labelMinimizza;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPorta;
    private javax.swing.JLabel labelStatoConnessione;
    private javax.swing.JLabel labelTitolo;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JPanel panelContenuti;
    private javax.swing.JPanel panelPrincipale;
    private javax.swing.JPanel panelSuperiore;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldDatabase;
    private javax.swing.JTextField textFieldIP;
    private javax.swing.JTextField textFieldPorta;
    private javax.swing.JTextField textFieldUserName;
    // End of variables declaration//GEN-END:variables

}
