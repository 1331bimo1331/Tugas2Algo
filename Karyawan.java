
public class Karyawan {
  String NIP,nama,jenisKelamin;
  int totalGaji,jumlahHari;
  
  void karyawan(String NIP, String nama, String jenisKelamin) {
    this.NIP = NIP;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
  }

  void absnKerja() {
    this.jumlahHari++;
  }

  void hitungGaji() {
    this.totalGaji = this.jumlahHari * 50000;
  }

  void hitungGaji(int jumlah_hari) {
    this.totalGaji = jumlah_hari * 50000;
  }
}

class Dosen extends Karyawan {
  String golongan;
  int jumlah_sks,upah_per_sks;
 

  void hitungGaji() {
    this.totalGaji = this.upah_per_sks * this.jumlah_sks * this.jumlahHari;
  }
}

class Staff extends Karyawan {
    
}