package com.example.practiceapp;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button saintButton,rangaButton,kuaButton;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        saintButton = findViewById(R.id.saintBtn);
        rangaButton = findViewById(R.id.rangaBtn);
        kuaButton =   findViewById(R.id.kuaBtn);

        saintButton.setOnClickListener(this);
        rangaButton.setOnClickListener(this);
        kuaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.saintBtn){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","saintmartin");
            startActivity(intent);
        }

        if(view.getId()==R.id.rangaBtn){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","rangamati");
            startActivity(intent);
        }

        if(view.getId()==R.id.kuaBtn){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","kuakata");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle(R.string.messeage_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}