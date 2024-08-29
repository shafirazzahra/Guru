//Objek class
public class Guru {
    private int id;
    private String nama;
    private String mapel;
    private String alamat;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /*Constructor nama sama dengan nama Class */
    public Guru() {
        id = 0;
        nama = "";
        mapel = "";

    }
    //Constructor Parameter
    public Guru(int id, String nama, String mapel, String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;

    }

    //pethod
    public void print() {
        System.out.println("Ini Data dari Guru "+nama);
        System.out.println("ID: "+id);
        System.out.println("Mapel: "+mapel);
        System.out.println("Alamat: "+alamat);
    }
}
