package com.example.tatasurya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_mars, imageView_mercury,
            imageView_moon, imageView_earth, imageView_neptunus, imageView_saturn, imageView_uranous,
            imageView_venus ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab(){
        imageView_mars.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent b = new
                    Intent(MainActivity.this,TebakActivity.class);
                b.putExtra("nama_icon","mars"); startActivity(b);
            }
        });

        imageView_mercury.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent c = new
                    Intent(MainActivity.this,TebakActivity.class);
                c.putExtra("nama_icon","mercury"); startActivity(c);
            }
        });

        imageView_moon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent d = new
                    Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("nama_icon","moon"); startActivity(d);
            }
        });

        imageView_earth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent a = new
                    Intent(MainActivity.this,TebakActivity.class);
                a.putExtra("nama_icon","earth"); startActivity(a);
            }
        });

        imageView_neptunus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent e = new
                    Intent(MainActivity.this,TebakActivity.class);
                e.putExtra("nama_icon","neptunus"); startActivity(e);
            }
        });

        imageView_saturn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent al = new
                    Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_icon","saturn"); startActivity(al);
            }
        });
        imageView_uranous.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent al = new
                    Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_icon","uranous"); startActivity(al);
            }
        });
        imageView_venus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent al = new
                    Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_icon","venus"); startActivity(al);
            }
        });
    }
    private void setInisialisasi() {
        imageView_mars= (ImageView)findViewById(R.id.imageView_mars);
        imageView_mercury = (ImageView)findViewById(R.id.imageView_mercury);
        imageView_moon = (ImageView)findViewById(R.id.imageView_moon);
        imageView_earth= (ImageView)findViewById(R.id.imageView_earth);
        imageView_neptunus= (ImageView)findViewById(R.id.imageView_neptunus);
        imageView_saturn = (ImageView)findViewById(R.id.imageView_saturn);
        imageView_uranous = (ImageView)findViewById(R.id.imageView_uranous);
        imageView_venus = (ImageView)findViewById(R.id.imageView_venus);
    }

}