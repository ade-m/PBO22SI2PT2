import java.util.ArrayList;

public class Dosen {
    private String NIDN;
    private String nama;
    private ArrayList<Mahasiswa> mahasiswa= 
        new ArrayList<Mahasiswa>();
    
    public Dosen() {
    }

    public Dosen(String NIDN, String nama, ArrayList<Mahasiswa> mahasiswa) {
        this.NIDN = NIDN;
        this.nama = nama;
        this.mahasiswa = mahasiswa;
    }
    public void addMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa.add(mahasiswa);
    }
    public String getNIDN() {
        return this.NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Mahasiswa> getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNIDN() + "'" +
            "|" + getNama() + "'" +
            "|" + getMahasiswa() + "'" +
            "";
    }
    

}
