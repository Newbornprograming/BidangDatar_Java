package com.example.denybidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Persegi extends Fragment {
    private Button btn_Keliling,btn_Luas;
    private EditText txt_panjang;
    private TextView keliling,luas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);

        btn_Luas = v.findViewById(R.id.btn_Luas);
        btn_Keliling = v.findViewById(R.id.btn_Keliling);
        txt_panjang= v.findViewById(R.id.txt_panjang);
       keliling= v.findViewById(R.id.keliling);
       luas= v.findViewById(R.id.luas);

        btn_Keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_panjang.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_panjang.setError("Data  tidak boleh kosong");
                    txt_panjang.requestFocus();
                } else {
                    Integer panjang = Integer.parseInt(nilai1);

                    Integer hasilkeliling = 4*panjang;
                    keliling.setText(String.valueOf(hasilkeliling));
                }
            }});

        btn_Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_panjang.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_panjang.setError("Data  tidak boleh kosong");
                    txt_panjang.requestFocus();
                }  else {
                    Integer panjang = Integer.parseInt(nilai1);

                    Integer hasilluas = panjang * panjang;
                    luas.setText(String.valueOf(hasilluas));
                }
            }});


        return v;
    }
}