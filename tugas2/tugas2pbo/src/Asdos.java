public class Asdos extends Mahasiswa {
    private int jamNgasdos;
    //public int jamSibuk = jamNgasdos + super.getJamSibuk();
    public Asdos (String nama, int sks, int jamNgasdos){
        super(nama, sks);
        setJamNgasdos (jamNgasdos);
    }
    public int getJamSibuk(){
        return jamNgasdos + super.getJamSibuk();
    }
    public void cekJamSibuk(){
        System.out.println(super.getNama() + " adalah asdos dengan jam sibuk " + getJamSibuk());
    }
    public void setJamNgasdos (int newJamNgasdos){
        if(newJamNgasdos >= 0){
            jamNgasdos = newJamNgasdos;
        }
    }
}
