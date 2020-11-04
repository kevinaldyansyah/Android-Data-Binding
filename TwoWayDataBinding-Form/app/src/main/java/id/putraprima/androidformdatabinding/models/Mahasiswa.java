package id.putraprima.androidformdatabinding.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import id.putraprima.androidformdatabinding.BR;

public class Mahasiswa extends BaseObservable {
    private String nama, nim, jenisKelamin;
    private int jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String jenisKelamin, int jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.jurusan = jurusan;
    }

    @Bindable
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        notifyPropertyChanged(BR.nama);
    }

    @Bindable
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
        notifyPropertyChanged(BR.nim);
    }

    @Bindable
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        notifyPropertyChanged(BR.jenisKelamin);
    }

    @Bindable
    public int getJurusan() {
        return jurusan;
    }

    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
        notifyPropertyChanged(BR.jurusan);
    }
}
