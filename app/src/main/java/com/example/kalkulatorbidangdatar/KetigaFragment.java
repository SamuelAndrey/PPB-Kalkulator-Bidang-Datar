package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KetigaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_jari_jari;
    private TextView hasilLuas, hasilKeliling;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_jari_jari = v.findViewById(R.id.txt_jari_jari);
        hasilLuas = v.findViewById(R.id.hasil_luas);
        hasilKeliling = v.findViewById(R.id.hasil_keliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = txt_jari_jari.getText().toString();
                if (nilai.isEmpty()) {
                    txt_jari_jari.setError("Data Tidak Boleh Kosong");
                    txt_jari_jari.requestFocus();
                } else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = Math.PI * (jari * jari);
                    Double keliling =  Math.PI * (jari + jari);
                    hasilLuas.setText("Luas Lingkaran : "  + String.format("%.2f", luas));
                    hasilKeliling.setText("Keliling Lingkaran : " + String.format("%.2f", keliling));
                }
            }
        });
        return v;
    }
}