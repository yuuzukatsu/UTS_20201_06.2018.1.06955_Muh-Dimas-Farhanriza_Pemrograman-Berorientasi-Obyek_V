package MonitoringCaseGangguan;

public class PelangganEntity {
    private int IdPelanggan,Kontak;
    private String NamaPelanggan,Alamat;
    
    public PelangganEntity(int IdPelanggan, String NamaPelanggan, int Kontak, String Alamat){
        this.IdPelanggan=IdPelanggan;
        this.NamaPelanggan=NamaPelanggan;
        this.Kontak=Kontak;
        this.Alamat=Alamat;
    }
    int GetIdPelanggan(){
        return this.IdPelanggan;
    }
    String GetNamaPelanggan(){
        return this.NamaPelanggan;
    }
    int GetKontak(){
        return this.Kontak;
    }
    String GetAlamat(){
        return this.Alamat;
    }
 }

