import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Mahasiswa> mahasiswa = 
                new ArrayList<Mahasiswa>();
    public static ArrayList<Dosen> dosen = 
                new ArrayList<Dosen>();
    public static void main(String[] args) throws Exception {

        init();
       //cetakDataMahasiswa();
        int pilihan =1;
        switch(pilihan){
            case 1:// input data
                //inputDataMhs();
                inputDataDosen();
                break;
            case 2:// delete data
                hapusData(0);
                break;
            default:
                System.out.println();
        }
        cetakDataMahasiswa();

    }
    public static void hapusData(int i){
        mahasiswa.remove(i);
    }
     public static void inputDataDosen(){
        Scanner input = new Scanner(System.in);
        String nama="",NIDN="", prodi="",nik="";
        System.out.print("Nama\t:");
        if(input.hasNextLine())
            nama = input.nextLine();
        System.out.print("NIDN\t:");
        if(input.hasNextLine())
            NIDN = input.nextLine();
        System.out.print("NIK Mahasiswa\t:");
        if(input.hasNextLine())
            nik = input.nextLine();
       
        dosen.add(new Dosen(NIDN, nama, mahasiswa));
        System.out.println(dosen.get(0));
        input.close();
        System.out.println();
    }
    public static void inputDataMhs(){
        Scanner input = new Scanner(System.in);
        String nama="",studentID="", prodi="",alamat="";
        System.out.print("Nama\t:");
        if(input.hasNextLine())
            nama = input.nextLine();
        System.out.print("StudentID\t:");
        if(input.hasNextLine())
            studentID = input.nextLine();
        System.out.print("Prodi\t:");
        if(input.hasNextLine())
            prodi = input.nextLine();
        System.out.print("Alamat\t:");
        if(input.hasNextLine())
            alamat = input.nextLine();
       
        mahasiswa.add(new Mahasiswa(nama, studentID, alamat, prodi));
        input.close();
        System.out.println();
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

        // mahasiswa.remove(alfredo);
        // mahasiswa.remove(1);


    }
}
