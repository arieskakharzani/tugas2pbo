public class App {
    public static void main(String[] args) throws Exception {
        //Polymorphic
        Elemen a = new Asdos ("Fairuzikun", 24, 1);
        a.cekJamSibuk();
        Elemen b = new Dosen ("Raja OP Damanik", 5);
        b.cekJamSibuk();
        Elemen c = new Asdos ("Angel-Chan", 21, 1);
        c.cekJamSibuk();
        Elemen d = new Mahasiswa ("Firman", 20);
        d.cekJamSibuk();
        Elemen e = new Mahasiswa ("Nid to pass this sem", 23);
        e.cekJamSibuk();
        Elemen f = new Dosen ("Nivotko", 3);
        f.cekJamSibuk();

        int total = a.getJamSibuk()+b.getJamSibuk()+c.getJamSibuk()+d.getJamSibuk()+e.getJamSibuk()+f.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + total);
    }
}
