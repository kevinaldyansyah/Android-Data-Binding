package id.putraprima.androidformdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import id.putraprima.androidformdatabinding.databinding.ActivityMainBinding;
import id.putraprima.androidformdatabinding.models.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setJenisKelamin("Laki Laki");
        mahasiswa.setJurusan(3);
        binding.setMahasiswa(mahasiswa);
        binding.setLifecycleOwner(this);
    }
}