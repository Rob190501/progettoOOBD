package gui.homeFrame.panels.panelGenerico;

import controller.Controller;
import eccezioni.elementiGui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public abstract class PanelGenerico extends javax.swing.JPanel {

    private Controller controller;
    private HomeFrameOperatore homeFrame;

    public PanelGenerico(Controller controller, HomeFrameOperatore homeFrame) {
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
    
    public Object ottieniPrimoOggetto(JTable table) {
        return ((DefaultTableModel) table.getModel()).getValueAt(0, 0);
    }
    
    public Object ottieniOggettoSelezionato(JTable table) {
        return ((DefaultTableModel) table.getModel()).getValueAt(table.getSelectedRow(), 0);
    }
    
    public void svuotaTable(JTable table) {
        ((DefaultTableModel) table.getModel()).setRowCount(0);
    }
    
    public void controllaRigaSelezionata(JTable table, String nomeTable) throws NessunaRigaSelezionataException {
        if(table.getSelectedRow() == -1) {
            throw new NessunaRigaSelezionataException(nomeTable);
        }
    }
    
    public void inserisciRigaInJTable(JTable table, Object[] row) {
        ((DefaultTableModel) table.getModel()).addRow(row);
    }
    
    public void rimuoviRigaSelezionataDaJTable(JTable table) {
        ((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
    }
    
    public void sostituisciRigaSelezionata(JTable table, Object[] row) {
        int riga = table.getSelectedRow();
        ((DefaultTableModel) table.getModel()).removeRow(riga);
        ((DefaultTableModel) table.getModel()).insertRow(riga, row);
    }
    
}
