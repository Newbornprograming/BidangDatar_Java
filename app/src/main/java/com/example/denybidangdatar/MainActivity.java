package com.example.denybidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragmentLingkaran(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Lingkaran() ).commit();
    }

    public void fragmentSegitiga(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Segitiga()  ).commit();
    }

    public void fragmentPersegi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Persegi() ).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Persegi() ).commit();
    }

}