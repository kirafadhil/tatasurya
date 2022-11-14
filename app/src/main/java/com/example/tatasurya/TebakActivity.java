package com.example.tatasurya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {

    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;
    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebakan);

        setInitalisasi();
        cekIntent();
        onClickJos();
    }

    private void onClickJos() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if
                (editText_jawabb.getText().toString().equals(jawaban)){
                    Toast.makeText(TebakActivity.this,
                            "Jawaban anda benar !",Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(TebakActivity.this,"Jawaban anda salah ",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() { Intent cek = getIntent(); String nama_icon =
            cek.getStringExtra("nama_icon");

        if (nama_icon.equals("mars")){

            imageView_tebak.setImageResource(R.drawable.mars); jawaban = "mars";

        } else if (nama_icon.equals("mercury")){

            imageView_tebak.setImageResource(R.drawable.mercury); jawaban = "mercury";
        } else if (nama_icon.equals("moon")){

            imageView_tebak.setImageResource(R.drawable.moon); jawaban = "moon";
        } else if (nama_icon.equals("earth")){

            imageView_tebak.setImageResource(R.drawable.earth); jawaban = "earth";
        } else if (nama_icon.equals("neptunus")){

            imageView_tebak.setImageResource(R.drawable.neptunus); jawaban = "neptunus";
        } else if (nama_icon.equals("saturn")){

            imageView_tebak.setImageResource(R.drawable.saturn); jawaban = "saturn";
        } else if (nama_icon.equals("uranous")){

            imageView_tebak.setImageResource(R.drawable.uranous); jawaban = "uranous";
        } else if (nama_icon.equals("venus")){

            imageView_tebak.setImageResource(R.drawable.venus); jawaban = "venus";
        } else {

        }

    }

    private void setInitalisasi() {
        imageView_tebak = (ImageView)findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText)findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);
    }


}
