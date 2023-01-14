package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
        private ImageView imageView;
        private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String spotName = bundle.getString("name");
            shorDetails(spotName);
        }
    }

    void shorDetails(String spotName){
        if(spotName.equals("saintmartin")){
            imageView.setImageResource(R.drawable.saint);
            textView.setText(R.string.saint_info);

        }

        if(spotName.equals("rangamati")){
            imageView.setImageResource(R.drawable.ranga);
            textView.setText(R.string.ranga_info);

        }

        if(spotName.equals("kuakata")){
            imageView.setImageResource(R.drawable.kuakata);
            textView.setText(R.string.kua_info);

        }
    }
}