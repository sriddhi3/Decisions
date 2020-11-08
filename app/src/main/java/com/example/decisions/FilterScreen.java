package com.example.decisions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.widget.Filter;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;
import java.util.Random;

public class FilterScreen extends AppCompatActivity {

    private Chip chipR, chipG, chipPG, chipPG13;
    private ArrayList<String> selectedChipData;
    public static TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_screen);

        Button button3 = (Button) findViewById(R.id.button3);
        Button btn_backmain = (Button) findViewById(R.id.btn_backmain);
        textView3 = findViewById(R.id.textView3);


        btn_backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(FilterScreen.this, GenreScreen.class);
                startActivity(intent2);
            }
        });

        Button btn_filter = findViewById(R.id.btn_filter);

        btn_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(FilterScreen.this, SecondScreen.class);
                startActivity(intent3);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3.setText(getRandomString(6));
            }
        });




        chipR = findViewById(R.id.chipR);
        chipG = findViewById(R.id.chipG);
        chipPG = findViewById(R.id.chipPG);
        chipPG13 = findViewById(R.id.chipPG13);

        selectedChipData = new ArrayList<>();

        CompoundButton.OnCheckedChangeListener checkedChangedListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    selectedChipData.add(compoundButton.getText().toString());
                } else {
                    selectedChipData.remove(compoundButton.getText().toString());
                }
            }
        };

        chipR.setOnCheckedChangeListener(checkedChangedListener);
        chipPG.setOnCheckedChangeListener(checkedChangedListener);
        chipG.setOnCheckedChangeListener(checkedChangedListener);
        chipPG13.setOnCheckedChangeListener(checkedChangedListener);

    }

    public String getRandomString(int i) {
        final String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();
        while  (i>0) {
            Random rand = new Random();
            result.append(character.charAt(rand.nextInt(character.length())));
            i--;
        }
        return result.toString();

    }
}
