import java.util.ArrayList;

public class App {
    public static ArrayList<Mahasiswa> mahasiswa = 
                new ArrayList<Mahasiswa>();
    public static void main(String[] args) throws Exception {

        init();
        cetakDataMahasiswa();
    }
    public static void cetakDataMahasiswa(){
        for (Mahasiswa mahasiswa2 : mahasiswa) {
            System.out.println(mahasiswa2);
        }
    }
    public static void init(){
        Mahasiswa cindy = new Mahasiswa("Cindy Chuwardi", 
        "030812121",
        "Jl. xxx no xx kota Medan",
        "Sistem Informasi");
        Mahasiswa owen = new Mahasiswa("Owen F.", 
        "030812121",
        "Jl. xxx no xx kota Medan",
        "Sistem Informasi");
        Mahasiswa nicholas = new Mahasiswa("Nicholas", 
        "030812121",
        "Jl. xxx no xx kota Medan",
        "Sistem Informasi");
        Mahasiswa alfredo = new Mahasiswa("Alfredo", 
        "030812121",
        "Jl. xxx no xx kota Medan",
        "Sistem Informasi");

        mahasiswa.add(alfredo);
        mahasiswa.add(nicholas);
        mahasiswa.add(new Mahasiswa("Cindy Chuwardi", 
        "030812121",
        "Jl. xxx no xx kota Medan",
        "Sistem Informasi"));


    }
}
