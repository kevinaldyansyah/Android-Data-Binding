package id.putraprima.androiddatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.widget.TextView;

import id.putraprima.androiddatabinding.databinding.ActivityMainBinding;
import id.putraprima.androiddatabinding.models.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Mahasiswa mahasiswa = new Mahasiswa("Putra Prima Arhandi","0410630078",R.drawable.profile);
        binding.setMahasiswa(mahasiswa);
    }

}