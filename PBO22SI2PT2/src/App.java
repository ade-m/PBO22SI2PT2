import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Mahasiswa> mahasiswa = 
                new ArrayList<Mahasiswa>();
    public static void main(String[] args) throws Exception {

        init();
       //cetakDataMahasiswa();
        int pilihan =2;
        switch(pilihan){
            case 1:// input data
                inputDataMhs();
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

        mahasiswa.remove(alfredo);
        mahasiswa.remove(1);


    }
}
