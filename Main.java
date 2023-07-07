
public class Main {

    
    public static void main(String[] args) {
    Karyawan karyawan = new Karyawan();
    karyawan.karyawan("227064516049", "Bimo Restu Putro", "Laki-laki");
    karyawan.absnKerja();
    karyawan.hitungGaji(30);
    System.out.println("NIP : "+karyawan.NIP);
    System.out.println("Nama : "+karyawan.nama);
    System.out.println("JenisKelamin : "+karyawan.jenisKelamin);
    System.out.println("Gaji Karyawan : " + karyawan.totalGaji);
    System.out.println("\n");
   
    Dosen dosen = new Dosen();
    dosen.karyawan("227053416009", "Shafira Kayla Azhari", "Perempuan");
    dosen.jumlah_sks = 24;
    dosen.upah_per_sks = 10000;
    dosen.jumlahHari = 30;
    dosen.absnKerja();
    dosen.hitungGaji();
    System.out.println("NIP : "+dosen.NIP);
    System.out.println("Nama : "+dosen.nama);
    System.out.println("JenisKelamin : "+dosen.jenisKelamin);
    System.out.println("Gaji Dosen    : " + dosen.totalGaji);
    System.out.println("\n");

    Staff staff = new Staff();
    staff.karyawan("227064516014", "Aditya Widianto", "Laki-laki");
    staff.absnKerja();
    staff.hitungGaji(30);
    System.out.println("NIP : "+staff.NIP);
    System.out.println("Nama : "+staff.nama);
    System.out.println("JenisKelamin : "+staff.jenisKelamin);
    System.out.println("Gaji Staff    : " + staff.totalGaji);
    System.out.println("\n");
    
    }
    
}
