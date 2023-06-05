public class App {
    public static void main(String[] args) throws Exception {
        init();
        Mahasiswa owen = new Mahasiswa();
        System.out.println(owen);
        owen = new Mahasiswa("Owen Felix", "Jl xx Medan");
        System.out.println(owen);
        Mahasiswa cindy = new Mahasiswa("Cindy C.", 
                    "030812121",
                    "Jl. xxx no xx kota Medan",
                    "Sistem Informasi");
        System.out.println(cindy);
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


    }
}
