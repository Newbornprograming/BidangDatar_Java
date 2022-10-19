package com.example.denybidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends Fragment {
    private Button btn_Luas,btn_Keliling;
    private TextView luas,keliling;
    private EditText txt_jari;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);

        btn_Luas=v.findViewById(R.id.btn_Luas);
        btn_Keliling=v.findViewById(R.id.btn_Keliling);
        luas=v.findViewById(R.id.luas);
        keliling=v.findViewById(R.id.keliling);
        txt_jari=v.findViewById(R.id.txt_jari);

        btn_Keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_jari.getText().toString();
                if(nilai.isEmpty()){
                    txt_jari.setError("Data tidak boleh kosong");
                    txt_jari.requestFocus();
                }else {
                    Double jari = Double.parseDouble(nilai);
                    Double hasilkeliling = 3.14 * (2 * jari);
                    keliling.setText(String.format("%.2f",hasilkeliling));
                }
            }
        });
        btn_Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_jari.getText().toString();
                if(nilai.isEmpty()){
                    txt_jari.setError("Data tidak boleh kosong");
                    txt_jari.requestFocus();
                }else {
                    Double jari = Double.parseDouble(nilai);
                    Double hasilluas = 3.14 * (jari*jari);
                    luas.setText(String.format("%.2f",hasilluas));
                }
            }
        });
        return v;
    }
}