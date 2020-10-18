package com.example.decisions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Filter;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;

public class FilterScreen extends AppCompatActivity {

    private Chip chipR, chipG, chipPG, chipPG13;
    private ArrayList<String> selectedChipData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_screen);

        Button btn_backmain = (Button) findViewById(R.id.btn_backmain);

        btn_backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(FilterScreen.this, SecondScreen.class);
                startActivity(intent2);
            }
        });

        Button btn_filter = (Button) findViewById(R.id.btn_filter);

        btn_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(FilterScreen.this, ServerScreen.class);
                startActivity(intent3);


                //TO-DO


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
}
