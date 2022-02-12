package dao.interfaccia;

import dto.Lezione;
import java.util.LinkedList;

public interface LezioneDAOInterfaccia {
    
    public boolean createLezione(Lezione lez);
    
    public Lezione retrieveLezioneByTitolo(String titoloLezione);
    
    public LinkedList<Lezione> retrieveAllLezione();
    
    public boolean updateLezione(Lezione lez);
    
    public boolean deleteLezione(Lezione lez);
    
}
