package id.putraprima.androidformdatabinding.util;

import androidx.databinding.InverseMethod;

import id.putraprima.androidformdatabinding.R;

public class BindingUtil {

    @InverseMethod("idToSelectedButton")
    public static int selectedButtonToId(String jenisKelamin) {
        int selectedButtonId = -1;
        if (jenisKelamin == null) {
            return selectedButtonId;
        }
        switch (jenisKelamin) {
            case "Laki Laki": {
                selectedButtonId = R.id.lakiLaki;
                break;
            }
            case "Perempuan": {
                selectedButtonId = R.id.perempuan;
                break;
            }
        }
        return selectedButtonId;
    }

    public static String idToSelectedButton(int selectedButtonId) {
        String jenisKelamin = null;
        switch (selectedButtonId) {
            case R.id.lakiLaki: {
                jenisKelamin = "Laki Laki";
                break;
            }
            case R.id.perempuan: {
                jenisKelamin = "Perempuan";
                break;
            }
        }
        return jenisKelamin;
    }
}
