package MonitoringCaseGangguan;

public class HelpdeskEntity {
    private int IdHelpdesk, Kontak;
    private String NamaHelpdesk;
    
    public HelpdeskEntity(int IdHelpdesk, String NamaHelpdesk, int Kontak){
        this.IdHelpdesk=IdHelpdesk;
        this.NamaHelpdesk=NamaHelpdesk;
        this.Kontak=Kontak;
        
    }
    int GetIdHelpdesk(){
        return this.IdHelpdesk;
    }
    String GetNamaHelpdesk(){
        return this.NamaHelpdesk;
    }
    int GetKontak(){
        return this.Kontak;
    }
 }

