package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show=findViewById(R.id.button_show);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(v,"Show a Toast",Snackbar.LENGTH_LONG);
                snackbar.setBackgroundTint(getResources().getColor(R.color.black));
                snackbar.setTextColor(getResources().getColor(R.color.white));
                snackbar.setAction("Show", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "This is a Toast", Toast.LENGTH_SHORT).show();
                    }
                });

                snackbar.setActionTextColor(getResources().getColor(R.color.colorAccent));

                snackbar.show();
            }
        });
    }
}
