public class Dosen extends Elemen {
    private int jumlahHariKerja;
    //public int jamSibuk = jumlahHariKerja *8;
    public Dosen (String nama, int jumlahHariKerja){
        super(nama);
        setJumlahHariKerja (jumlahHariKerja);
    }
    public int getJamSibuk(){
        return jumlahHariKerja * 8;
    }
    public void cekJamSibuk(){
        System.out.println(super.getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }
    public void setJumlahHariKerja(int newJumlahHariKerja){
        if(newJumlahHariKerja >= 0){
            jumlahHariKerja = newJumlahHariKerja;
        }
    }

}
