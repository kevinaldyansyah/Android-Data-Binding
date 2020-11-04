package id.putraprima.androiddatabinding.models;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int image;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public Mahasiswa(String nama, String nim, int image) {
        this.nama = nama;
        this.nim = nim;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
