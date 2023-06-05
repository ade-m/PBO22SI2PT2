public class Mahasiswa {
    /* nama, studentID, alamat, prodi */
    private String nama;
    private String studentID;
    private String alamat;
    private String prodi;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String studentID, String alamat, String prodi) {
        this.nama = nama;
        this.studentID = studentID;
        this.alamat = alamat;
        this.prodi = prodi;
    }

    public Mahasiswa(String nama,  String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return "{" +
            " nama='" + getNama() + "'" +
            ", studentID='" + getStudentID() + "'" +
            ", alamat='" + getAlamat() + "'" +
            ", prodi='" + getProdi() + "'" +
            "}";
    }


}
