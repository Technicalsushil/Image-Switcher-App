package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher sw;
    Button prev,nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw=findViewById(R.id.sw);
        prev=findViewById(R.id.prev);
        nxt=findViewById(R.id.nxt);

        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView img=new ImageView(getApplicationContext());
                img.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return img;
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sw.setImageResource(R.drawable.addidas);
            }
        });
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sw.setImageResource(R.drawable.cock);
            }
        });
    }
}