package gui.homeFrame.panels.panelContenutiGenerico;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class PanelContenutiGenerico extends javax.swing.JPanel {

    private Controller controller;
    private HomeFrameOperatore homeFrame;

    public PanelContenutiGenerico(Controller controller, HomeFrameOperatore homeFrame) {
        setController(controller);
        setHomeFrame(homeFrame);
    }
    
    public Controller getController() {
        return controller;
    }

    public HomeFrameOperatore getHomeFrame() {
        return homeFrame;
    }
    
    private void setController(Controller controller) {
        this.controller = controller;
    }            
    
    private void setHomeFrame(HomeFrameOperatore homeFrame) {
        this.homeFrame = homeFrame;
    }
    
    public void nascondiColonnaOggetto(JTable table) {
        if(table.getColumnName(0).equals("Oggetto")) {
            table.removeColumn(table.getColumnModel().getColumn(0));
        }
    }
    
    public Object ottieniOggettoSelezionato(JTable table) {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        return modelTable.getValueAt(table.getSelectedRow(), 0);
    }
    
    public void svuotaTable(JTable table) {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        modelTable.setRowCount(0);
    }
    
    public void inserisciRigaInTable(JTable table, Object[] row) {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        modelTable.addRow(row);
    }
    
    public void rimuoviRigaDaTable(JTable table) {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        modelTable.removeRow(table.getSelectedRow());
    }
    
    
}
