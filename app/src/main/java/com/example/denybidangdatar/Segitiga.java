package com.example.denybidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends Fragment {

    private EditText txt_alas,txt_tinggi;
    private Button btn_Keliling,btn_Luas;
    private TextView keliling,luas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);
        txt_alas=v.findViewById(R.id.txt_alas);
        txt_tinggi=v.findViewById(R.id.txt_tinggi);
        btn_Keliling=v.findViewById(R.id.btn_Keliling);
        keliling=v.findViewById(R.id.keliling);
        btn_Luas=v.findViewById(R.id.btn_Luas);
        luas=v.findViewById(R.id.luas);

        btn_Keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_alas.setError("Data  tidak boleh kosong");
                    txt_alas.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txt_tinggi.setError("Data  tidak boleh kosong");
                    txt_tinggi.requestFocus();
                } else {
                    Double alas = Double.parseDouble(nilai1);
                    Double lebar = Double.parseDouble(nilai2);

                    Double hasilkeliling = 3* alas;
                    keliling.setText(String.format("%.2f",hasilkeliling));
                }
            }});

        btn_Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_alas.setError("Data  tidak boleh kosong");
                    txt_alas.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txt_tinggi.setError("Data  tidak boleh kosong");
                    txt_tinggi.requestFocus();
                } else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);

                    Double hasilluas = 0.5 * alas * tinggi;
                    luas.setText(String.format("%.2f",hasilluas));
                }
            }
        });

        return v;
    }
}